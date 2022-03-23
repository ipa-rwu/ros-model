package de.fraunhofer.ipa.rossystem.deployment

import componentInterface.ComponentInterface
import de.fraunhofer.ipa.rossystem.generator.GeneratorHelpers
import java.util.ArrayList
import java.util.HashSet
import java.util.List
import java.util.Set
import ros.Dependency
import ros.PackageDependency
import ros.impl.PackageImpl
import rossystem.ComponentStack
import rossystem.RosSystem

class ImageInfo {
	String rosDistro
	Integer rosVersion	
	String registryName
	String imageVersion

	def set_ros_distro(String distro) {
		this.rosDistro = distro
	}
	def set_ros_version(Integer version){
		this.rosVersion = version
	}
	def set_registry(String registryName){
		this.registryName = registryName
	}
	def set_image_version(String imageVersion){
		this.imageVersion = imageVersion
	}
	def get_ros_distro() {
		return this.rosDistro
	}
	def get_ros_version(){
		return this.rosVersion  
	}
	def get_registry(){
		return this.registryName  
	}
	def get_image_version(){
		return this.imageVersion
	}
	
	def print_info(){
		System.out.format("rosDistro: %s, rosVersion: %s, registryName: %s, imageVersion: %s", this.rosDistro, this.rosVersion, this.registryName, this.imageVersion)
	}
}

class ContainerImageHelpers extends GeneratorHelpers {
	List<ComponentInterface> ComponentsList
	PackageImpl component_package
	Set<String> Repos
	
 	def get_uniqe_name(String prefix, String ros_distro) {
	 	return prefix + "_" + ros_distro
	 }	
	
	def get_folder_name(String prefix, String ros_distro) {
	 	if(ros_distro=="foxy") {
	 		return prefix + "_ros2"
	 	}
	 	else{
	 		return prefix
	 	}
	 }

	 def Set<String> listOfRepos(Object subsystem) {
		new ArrayList()
		ComponentsList = new ArrayList<ComponentInterface>();
		if (subsystem.class.toString.contains("RosSystemImpl")){
			ComponentsList = (subsystem as RosSystem).rosComponent
		} else if (subsystem.class.toString.contains("ComponentStackImpl")) {
			ComponentsList = (subsystem as ComponentStack).rosComponent
		}

		Repos = new HashSet<String>();
		for (ComponentInterface component: ComponentsList){
			component_package = null;
			component_package = get_pkg(component);
			if (component_package !== null){
				if (component_package.fromGitRepo !== null){
					Repos.add(component_package.fromGitRepo);
				}
				if (!component_package.dependency.empty){
					for (Dependency depend: component_package.dependency){
						if ((depend as PackageDependency).package !== null){
							if ((depend as PackageDependency).package.fromGitRepo !== null){
								Repos.add((depend as PackageDependency).package.fromGitRepo);					
					}
				}
			}
		}}}
		return Repos;
	}
	
}
