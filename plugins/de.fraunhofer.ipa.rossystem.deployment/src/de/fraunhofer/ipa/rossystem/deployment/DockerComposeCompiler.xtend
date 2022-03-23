package de.fraunhofer.ipa.rossystem.deployment

import rossystem.RosSystem
import java.util.Map
import java.util.List

class DockerComposeCompiler {

 ContainerImageHelpers generator_helper = new ContainerImageHelpers()

def create_devices(List<String> ports)'''
«IF ports.size() > 0»
devices:
«FOR p: ports»
«"  "»- "«p»:«p»"
«ENDFOR»
«ENDIF»
'''
 def compile_toDockerCompose(RosSystem system, ImageInfo imageInfo, Map<String, List<String>> device_map) '''«generator_helper.init_pkg()»
«IF imageInfo.get_ros_version() == 1»
version: "3.3"
networks:
  ros:
    driver: bridge
services:
  ros-master:
    image: ros:«imageInfo.get_ros_distro()»-ros-core
    command: stdbuf -o L roscore
    networks:
      - ros

«IF system.getComponentStack().isEmpty()»
«"  "»«generator_helper.get_uniqe_name(system.name.toLowerCase, imageInfo.get_ros_distro())»:
    image: "«generator_helper.get_uniqe_name(system.name.toLowerCase, imageInfo.get_ros_distro())»:latest"
    depends_on:
      - ros-master
    environment:
      - "ROS_MASTER_URI=http://ros-master:11311"
      - "ROS_HOSTNAME=«generator_helper.get_uniqe_name(system.name.toLowerCase, imageInfo.get_ros_distro())»"
    networks:
      - ros
    «create_devices(device_map.get(system.name))»
    command: stdbuf -o L roslaunch «system.name.toLowerCase» «system.name.toLowerCase».launch --wait
«ELSE»
«FOR stack:system.componentStack»
«"  "»«generator_helper.get_uniqe_name(system.name.toLowerCase, imageInfo.get_ros_distro())»_«stack.name.toLowerCase»:
    image: "«generator_helper.get_uniqe_name(system.name.toLowerCase, imageInfo.get_ros_distro())»_«stack.name.toLowerCase»:latest"
    depends_on:
      - ros-master
    environment:
      - "ROS_MASTER_URI=http://ros-master:11311"
      - "ROS_HOSTNAME=«generator_helper.get_uniqe_name(system.name.toLowerCase, imageInfo.get_ros_distro())»_«stack.name.toLowerCase»"
    networks:
      - ros
    «create_devices(device_map.get(stack.name))»
    command: stdbuf -o L roslaunch «system.name.toLowerCase»_«stack.name.toLowerCase» «stack.name.toLowerCase».launch --wait

«ENDFOR»
«ENDIF»
«ELSE»
version: "3.3"
services:
«IF system.getComponentStack().isEmpty()»
«"  "»«generator_helper.get_uniqe_name(system.name.toLowerCase, imageInfo.get_ros_distro())»:
    image: "«generator_helper.get_uniqe_name(system.name.toLowerCase, imageInfo.get_ros_distro())»:latest"
    «create_devices(device_map.get(system.name))»
    command: stdbuf -o L ros2 launch «system.name.toLowerCase» «system.name.toLowerCase».launch.py
«ELSE»
«FOR stack:system.componentStack»
«"  "»«generator_helper.get_uniqe_name(system.name.toLowerCase, imageInfo.get_ros_distro())»_«stack.name.toLowerCase»:
    image: "«generator_helper.get_uniqe_name(system.name.toLowerCase, imageInfo.get_ros_distro())»_«stack.name.toLowerCase»:latest"
    «create_devices(device_map.get(stack.name))»
    command: stdbuf -o L ros2 launch «system.name.toLowerCase»_«stack.name.toLowerCase» «stack.name.toLowerCase».launch.py

«ENDFOR»
«ENDIF»
«ENDIF»
'''
}
