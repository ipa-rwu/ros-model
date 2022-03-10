package de.fraunhofer.ipa.rossystem.deployment

import rossystem.RosSystem
import de.fraunhofer.ipa.rossystem.deployment.DeploymentHelpers

class GitActionCompiler {
	
	DeploymentHelpers generator_helper = new DeploymentHelpers()
 
 def default_part(String layer, String context_path, String needed_layer, String tag)'''
«layer»:
  runs-on: ubuntu-latest
  «IF needed_layer !== null»
  needs: «needed_layer»
  «ENDIF»
  steps:
    -
      name: Checkout
      uses: actions/checkout@v2
    - name: Log in to Docker Hub
      uses: docker/login-action@v1
      with:
        username: ${{ secrets.DOCKER_USERNAME }}
        password: ${{ secrets.DOCKER_PASSWORD }}
    -
      name: Set up QEMU
      uses: docker/setup-qemu-action@v1
    -
      name: Set up Docker Buildx
      uses: docker/setup-buildx-action@v1
      with:
        driver-opts: network=host
    -
      name: Cache Docker layers
      uses: actions/cache@v2
      with:
        path: /tmp/.buildx-cache
        key: ${{ runner.os }}-buildx-${{ github.sha }}
        restore-keys: |
          ${{ runner.os }}-buildx-
    -
      name: Get Branch
      id: extract_branch
      run: echo ::set-output name=branch::$(echo ${GITHUB_REF#refs/heads/} | sed 's/[^a-zA-Z0-9-]/_/g')
    -
      name: Docker meta
      id: docker_meta
      uses: docker/metadata-action@v3
      with:
        images: ${{ secrets.DOCKER_USERNAME }}/${{ github.job }}
        tags: |
          «tag»
    -
      name: Build and Push Docker Image
      uses: docker/build-push-action@v2
      with:
        context: «context_path»
        push: true
        tags: ${{ steps.docker_meta.outputs.tags }}
        labels: ${{ steps.docker_meta.outputs.labels }}
        build-args: |
          SUFFIX=:${{ steps.extract_branch.outputs.branch }}
          BUILDER_SUFFIX=:${{ env.BUILDER_SUFFIX }}
          PREFIX=${{ env.PREFIX }}
        cache-from: type=local,src=/tmp/.buildx-cache
        cache-to: type=local,dest=/tmp/.buildx-cache-new,mode=max
    -
      name: Move cache
      run: |
        rm -rf /tmp/.buildx-cache
        mv /tmp/.buildx-cache-new /tmp/.buildx-cache
 '''

def build_layer()'''
	«default_part("builder", "./builder", null, "type=raw,value=${{ env.BUILDER_SUFFIX }}")» 
'''

def extra_layer(String sys_name, String ros_distro, String image_version)
'''
	«default_part(generator_helper.set_extra_image_name(generator_helper.set_image_name(sys_name, ros_distro)), 
					generator_helper.set_extra_folder_path(generator_helper.set_system_folder_name(sys_name, ros_distro)), 
					null, 
					String.format("type=raw,value=${{ steps.extract_branch.outputs.branch }}\ntype=raw,value=%s", image_version)
	)»

'''
 def extra_layer(String sys_name, String stack_name, String ros_distro, String image_version)
'''
	«default_part(generator_helper.set_extra_image_name(generator_helper.set_image_name(sys_name, stack_name, ros_distro)), 
					generator_helper.set_extra_folder_path(generator_helper.set_stack_folder_name(sys_name, stack_name, ros_distro)),
					null, 
					String.format("type=raw,value=${{ steps.extract_branch.outputs.branch }}\ntype=raw,value=%s", image_version)
	)»

''' 
 def system_layer(String sys_name, Boolean need_extra, String ros_distro, String image_version)'''
	«IF need_extra» 
	«default_part(generator_helper.set_image_name(sys_name, ros_distro),
					generator_helper.set_system_folder_name(sys_name, ros_distro),
					generator_helper.set_extra_image_name(generator_helper.set_image_name(sys_name, ros_distro)), 
					String.format("type=raw,value=${{ steps.extract_branch.outputs.branch }}\ntype=raw,value=%s", image_version))»
	«ELSE»
	«default_part(generator_helper.set_image_name(sys_name, ros_distro),
					generator_helper.set_system_folder_name(sys_name, ros_distro),
					null, 
					String.format("type=raw,value=${{ steps.extract_branch.outputs.branch }}\ntype=raw,value=%s", image_version))»
	«ENDIF»
''' 	
 
 def stack_layer(String sys_name, String stack_name, String ros_distro, String image_version, Boolean need_extra)'''
	«IF need_extra» 
	«default_part(generator_helper.set_image_name(sys_name, stack_name, ros_distro),
					generator_helper.set_stack_folder_name(sys_name, stack_name, ros_distro),
					generator_helper.set_extra_image_name(generator_helper.set_image_name(sys_name, stack_name, ros_distro)),
					String.format("type=raw,value=${{ steps.extract_branch.outputs.branch }}\ntype=raw,value=%s", image_version))»
	«ELSE»
	«default_part(generator_helper.set_image_name(sys_name, stack_name, ros_distro),
					generator_helper.set_stack_folder_name(sys_name, stack_name, ros_distro),
					null, 
					String.format("type=raw,value=${{ steps.extract_branch.outputs.branch }}\ntype=raw,value=%s", image_version))»
	«ENDIF»

''' 	

def compile_toGitAction(RosSystem system, DeploymentInfo deploymentInfo) '''«generator_helper.init_pkg()»
name: «generator_helper.get_uniqe_name(system.name.toLowerCase, deploymentInfo.get_ros_distro())»
on:
  push:
    paths:
      - '«generator_helper.set_system_folder_name(system.name.toLowerCase, deploymentInfo.get_ros_distro())»/**'
env:
  PREFIX: "${{ secrets.DOCKER_USERNAME }}/"
  SUFFIX: ""
«««  Todo: get distro from model
  BUILDER_SUFFIX: ros«deploymentInfo.get_ros_version()»
jobs:
  «IF system.getComponentStack().isEmpty()»
  «IF !generator_helper.listOfRepos(system).isEmpty()»
  «extra_layer(system.name.toLowerCase, deploymentInfo.get_ros_distro(),deploymentInfo.get_image_version())»
  «system_layer(system.name.toLowerCase, true, deploymentInfo.get_ros_distro(), deploymentInfo.get_image_version())»
	«ELSE»
  «system_layer(system.name.toLowerCase, false, deploymentInfo.get_ros_distro(), deploymentInfo.get_image_version())»
«ENDIF»
«ELSE»«FOR stack : system.getComponentStack()»«IF !generator_helper.listOfRepos(stack).isEmpty()»
  «extra_layer(system.name.toLowerCase, stack.name.toLowerCase, deploymentInfo.get_ros_distro(), deploymentInfo.get_image_version())»
  «stack_layer(system.name.toLowerCase, stack.name.toLowerCase, deploymentInfo.get_ros_distro(), deploymentInfo.get_image_version(), true)»
 «ELSE»
  «stack_layer(system.name.toLowerCase, stack.name.toLowerCase, deploymentInfo.get_ros_distro(), deploymentInfo.get_image_version(), false)»
«ENDIF»
 «ENDFOR»
«ENDIF»
'''
}
