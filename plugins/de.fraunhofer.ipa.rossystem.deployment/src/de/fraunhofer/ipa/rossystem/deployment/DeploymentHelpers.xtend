package de.fraunhofer.ipa.rossystem.deployment

import de.fraunhofer.ipa.rossystem.generator.GeneratorHelpers

enum DeploymentPlatform {
    K8s,
    DockerCompose
}

class DeplopymentCommonInfo {
	Integer rosDomainID
	def setRosDomainID(Integer rosDomainID, Integer rosVersion){
		if (rosVersion == 2)
			this.rosDomainID = rosDomainID
		else
			this.rosDomainID = null
	}
	def get_rosDomainID(){
		return this.rosDomainID
	}
}

class DeploymentHelpers extends GeneratorHelpers {
	
	def set_deployment_file_name(String sys_name, DeploymentPlatform platform, String ext){
		var prefix = String.format("%s-%s", platform.toString(), sys_name).toLowerCase.replaceAll("[^0-9a-zA-Z]", "-")
		return String.format("%s.%s", prefix, ext)
	}
	def set_start_command(String sys_name, String stack_name, Integer rosVersion){
		if (rosVersion === 1){
			return String.format("roslaunch %s_%s %s.launch", sys_name.toLowerCase, stack_name.toLowerCase, stack_name.toLowerCase)
		}
		if (rosVersion === 2){
			return String.format("ros2 launch %s_%s %s.launch.py", sys_name.toLowerCase, stack_name.toLowerCase, stack_name.toLowerCase)
		}
	}
	
	def set_start_command(String sys_name, Integer rosVersion){
		if (rosVersion === 1){
			return String.format("roslaunch %s %s.launch", sys_name.toLowerCase, sys_name.toLowerCase)
		}
		if (rosVersion === 2){
			return String.format("ros2 launch %s %s.launch.py", sys_name.toLowerCase, sys_name.toLowerCase)
		}
	}

}