package de.fraunhofer.ipa.rossystem.deployment

import de.fraunhofer.ipa.rossystem.generator.GeneratorHelpers
import java.util.Map
import java.util.List
import java.util.Arrays
import java.util.ArrayList
import java.util.stream.Stream
import java.util.stream.Collectors

enum DeploymentPlatform {
    K8s,
    DockerCompose
}

class DeplopymentCommonInfo {
	Integer rosDomainID
	Map<String, List<String>> virtualPorts
	
	def setRosDomainID(Integer rosDomainID, Integer rosVersion){
		if (rosVersion == 2)
			this.rosDomainID = rosDomainID
		else
			this.rosDomainID = null
	}
	def getRosDomainID(){
		return this.rosDomainID
	}
	def addPort(String key, String port){
		val portList = this.virtualPorts.get(key)
		if (portList.isEmpty){
			this.virtualPorts.put(key, Arrays.asList(port))
		}else {
			portList.add(port)
			this.virtualPorts.put(key, portList)
		}
	}
	
	def addPorts(String key, List<String> ports){
		val portList = this.virtualPorts.get(key)
		if (portList.isEmpty){
			this.virtualPorts.put(key, ports)
		}else {
			val newList = Stream.concat(portList.stream(), ports.stream()).collect(Collectors.toList());
			this.virtualPorts.put(key, newList)
		}
	}
	
	def setPorts(Map<String, List<String>> portMap){
		this.virtualPorts = portMap
	}
	def getPorts(){
		return this.virtualPorts
	}
	def printPorts(){
		for (Map.Entry<String, List<String>> entry : this.virtualPorts.entrySet()) {
   			 System.out.println(entry.getKey() + ":" + entry.getValue().toString());
		}
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