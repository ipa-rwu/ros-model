package de.fraunhofer.ipa.rossystem.deployment

import rossystem.RosSystem
import java.util.Map
import java.util.List

class DockerComposeHelpers extends DeploymentHelpers {
	 def set_deployment_file(String sys_name){
		return set_deployment_file_name(sys_name, DeploymentPlatform.DockerCompose, "yml")
	}
}

class DockerComposeCompiler {

 ContainerImageHelpers imageHelper = new ContainerImageHelpers()
 DockerComposeHelpers generator_helper = new DockerComposeHelpers()

def create_devices(List<String> ports)'''
«IF ports.size() > 0»
devices:
«FOR p: ports»
«"  "»- "«p»:«p»"
«ENDFOR»
«ENDIF»
'''

def build_args(String registry, String image_version)'''
«"      "»args:
«"        "»- PREFIX=«registry»/
«"        "»- SUFFIX=:«image_version»
'''

def extra_layer(String sys_name, String ros_distro, String registry, String image_version)'''
«"  "»«imageHelper.set_extra_image_name(imageHelper.set_image_name(sys_name, ros_distro))»:
    image: "«imageHelper.set_push_image_name(registry,
    												imageHelper.set_extra_image_name(imageHelper.set_image_name(sys_name, ros_distro)),
    												image_version
    												)»"
    build:
      context: «imageHelper.set_extra_folder_path(".")»
      dockerfile: Dockerfile
«build_args(registry, image_version)»
    profiles:
      - dependencies

'''

def network_name(String sys_name)'''
«sys_name.toLowerCase.replaceAll("[^a-zA-Z-0-9-]", "-")»-network'''

def network(String sys_name)'''
networks:
«"  "»«network_name(sys_name)»:
«"    "»external: false
«"    "»driver: "bridge"
'''

def extra_layer(String sys_name,
				String stack_name,
				String ros_distro,
				String registry,
				String image_version
)'''
«"  "»«imageHelper.set_extra_image_name(imageHelper.set_image_name(sys_name, stack_name, ros_distro))»:
    image: «imageHelper.set_push_image_name(registry,
    												imageHelper.set_extra_image_name(imageHelper.set_image_name(sys_name, stack_name, ros_distro)),
    												image_version
    												)»
    build:
      context: «imageHelper.set_extra_folder_path(imageHelper.set_stack_folder_name(sys_name, stack_name))»
      dockerfile: Dockerfile
«build_args(registry, image_version)»
    profiles:
      - dependencies

'''

def execute_layer(String image_name,
					String folder,
					String ros_distro,
					Integer ros_version,
					String registry,
					String image_version,
					Boolean if_need_extra
)'''
«"  "»«image_name»:
    image: «imageHelper.set_push_image_name(registry,
    												image_name,
    												image_version
    												)»
    build:
      context: «folder»
      dockerfile: Dockerfile
«build_args(registry, image_version)»
«IF ros_version===1»
«"    "»depends_on:
      - ros-master
«IF if_need_extra»
«"      "»- «imageHelper.set_extra_image_name(image_name)»
«ENDIF»
«ELSEIF ros_version===2»
«IF if_need_extra»
«"    "»depends_on:
«"      "»- «imageHelper.set_extra_image_name(image_name)»
«ENDIF»
«ENDIF»
    environment:
«IF ros_version===1»
«"      "»- ROS_MASTER_URI=http://ros-master:11311
«"      "»- ROS_HOSTNAME=«image_name»
«ELSEIF ros_version===2»
«"      "»- ROS_DOMAIN_ID=1
«ENDIF»
    profiles:
      - execute
'''

def system_layer(String sys_name,
					String ros_distro,
					Integer ros_version,
					String registry,
					String image_version,
					Map<String, List<String>> device_map,
					Boolean if_need_extra)'''
«execute_layer(imageHelper.set_image_name(sys_name, ros_distro),
				imageHelper.set_system_folder_name(),
				ros_distro,
				ros_version,
				registry,
				image_version,
				if_need_extra
)»
    networks:
      - «network_name(sys_name)»
    «create_devices(device_map.get(sys_name))»
«IF ros_version===1»
«"    "»command: stdbuf -o L «generator_helper.set_start_command(sys_name, ros_version)» --wait
«ELSEIF ros_version===2»
«"    "»command: stdbuf -o L «generator_helper.set_start_command(sys_name, ros_version)»
«ENDIF»

'''

def stack_layer(String sys_name,
					String stack_name,
					String ros_distro,
					Integer ros_version,
					String registry,
					String image_version,
					Map<String, List<String>> device_map,
					Boolean if_need_extra)'''
«execute_layer(imageHelper.set_image_name(sys_name, stack_name, ros_distro),
				imageHelper.set_stack_folder_name(sys_name, stack_name),
				ros_distro,
				ros_version,
				registry,
				image_version,
				if_need_extra
)»
    networks:
      - «network_name(sys_name)»
    «create_devices(device_map.get(stack_name))»
«IF ros_version===1»
«"    "»command: stdbuf -o L «generator_helper.set_start_command(sys_name, stack_name, ros_version)» --wait
«ELSEIF ros_version===2»
«"    "»command: stdbuf -o L «generator_helper.set_start_command(sys_name, stack_name, ros_version)»
«ENDIF»

'''

def compile_toDockerCompose(RosSystem system, ImageInfo imageInfo, Map<String, List<String>> device_map) '''«generator_helper.init_pkg()»
version: "3.3"
«network(system.name)»
services:
«IF imageInfo.get_ros_version() == 1»
«"  "»ros-master:
    image: ros:imageInfo.get_ros_distro()»-ros-core
    command: stdbuf -o L roscore
    networks:
      - «network_name(system.name)»
«ENDIF»
«IF system.getComponentStack().isEmpty()»
«IF !imageHelper.listOfRepos(system).isEmpty()»
«extra_layer(system.name,
				imageInfo.get_ros_distro.toString,
				imageInfo.get_registry,
				imageInfo.get_image_version)»
«ENDIF»
«system_layer(system.name,
				imageInfo.get_ros_distro.toString,
				imageInfo.get_ros_version,
				imageInfo.get_registry,
				imageInfo.get_image_version,
				device_map,
				!imageHelper.listOfRepos(system).isEmpty()
)»
«ELSE»
«FOR stack:system.componentStack»
«IF !imageHelper.listOfRepos(stack).isEmpty()»
«extra_layer(system.name,
				stack.name,
				imageInfo.get_ros_distro.toString,
				imageInfo.get_registry,
				imageInfo.get_image_version)»
«ENDIF»
«stack_layer(system.name,
				stack.name,
				imageInfo.get_ros_distro.toString,
				imageInfo.get_ros_version,
				imageInfo.get_registry,
				imageInfo.get_image_version,
				device_map,
				!imageHelper.listOfRepos(stack).isEmpty()
)»
«ENDFOR»
«ENDIF»
'''
}
