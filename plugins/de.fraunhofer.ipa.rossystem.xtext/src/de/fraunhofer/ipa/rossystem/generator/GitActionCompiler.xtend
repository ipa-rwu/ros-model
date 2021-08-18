package de.fraunhofer.ipa.rossystem.generator

import com.google.inject.Inject
import rossystem.RosSystem

class GitActionCompiler {
	@Inject extension GeneratorHelpers
 def default_part(String layer, String context_path, String needed_layer)'''
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
      name: Docker meta
      id: docker_meta
      uses: docker/metadata-action@v3
      with:
        images: ${{ secrets.DOCKER_USERNAME }}/${{ github.job }}
        tags: |
          type=ref,event=branch
          type=raw,value=latest
    -
      name: Build and Push Docker Image
      uses: docker/build-push-action@v2
      with:
        context: «context_path»
        push: true
        tags: ${{ steps.docker_meta.outputs.tags }}
        labels: ${{ steps.docker_meta.outputs.labels }}
        cache-from: type=local,src=/tmp/.buildx-cache
        cache-to: type=local,dest=/tmp/.buildx-cache-new,mode=max
    -
      name: Move cache
      run: |
        rm -rf /tmp/.buildx-cache
        mv /tmp/.buildx-cache-new /tmp/.buildx-cache 
 '''
 def build_layer()'''
«default_part("builder", "./builder", null)» 
'''
 def extra_layer(String name, String path)'''
«default_part("extra_layer_"+name, String.join("/", ".",path,"extra_layer"), "builder")»
''' 
 def system_layer(String sys_name, Boolean need_extra)'''
«IF need_extra» 
«default_part(sys_name, "./"+sys_name, "extra_layer_"+sys_name)»
«ELSE»
«default_part(sys_name, "./"+sys_name, null)»
«ENDIF»
''' 	
 def stack_layer(String sys_name, String stack_name, Boolean need_extra)'''
«IF need_extra» 
«default_part(sys_name+"_"+stack_name, String.join("/", ".",sys_name, sys_name+"_"+stack_name), "extra_layer_"+stack_name)»
«ELSE»
«default_part(sys_name+"_"+stack_name, String.join("/", ".",sys_name, sys_name+"_"+stack_name), null)»
«ENDIF»
''' 	
 def compile_toGitAction(RosSystem system) '''«init_pkg()»
name: «system.name.toLowerCase»
on: [push]
env:
  PREFIX: "${{ secrets.DOCKER_USERNAME }}/"
  SUFFIX: ""
jobs:
	«build_layer()»
«««	no stacks
«IF system.getComponentStack().isEmpty()»
««« check if extra_layer is needed
	«IF !system.listOfRepos.isEmpty()»
	«extra_layer(system.name.toLowerCase, system.name.toLowerCase)»
	««« system layer
«system_layer(system.name.toLowerCase, true)» 
	«ELSE»
	«system_layer(system.name.toLowerCase, false)» 
	«ENDIF»
««« stacks	
 «ELSE»
 «FOR stack : system.getComponentStack()»
  ««« check if extra_layer is needed
	«IF !stack.listOfRepos.isEmpty()»
  	«extra_layer(system.name.toLowerCase, stack.name.toLowerCase)»
  	«stack_layer(system.name.toLowerCase, stack.name.toLowerCase, true)»
  	«ENDIF»
	«stack_layer(system.name.toLowerCase, stack.name.toLowerCase, false)»
 «ENDFOR»
«ENDIF»           
'''
}