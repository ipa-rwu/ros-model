package de.fraunhofer.ipa.rossystem.deployment

import componentInterface.ComponentInterface
import de.fraunhofer.ipa.rossystem.generator.GeneratorHelpers
import java.util.ArrayList
import java.util.Arrays
import java.util.HashSet
import java.util.List
import java.util.Set
import ros.Dependency
import ros.PackageDependency
import ros.impl.PackageImpl
import rossystem.ComponentStack
import rossystem.RosSystem

enum ROSDistro {
    melodic,
    noetic,
    foxy,
    galactic
}

class ImageInfo {
	ROSDistro rosDistro
	Integer rosVersion
	String registryName
	String imageVersion
	DeploymentPlatform[] platforms

	def ImageInfo(ROSDistro rosDistro,
					String registryName,
					String imageVersion,
					DeploymentPlatform[] platform){
		this.rosDistro = rosDistro
		this.rosVersion = set_ros_version(rosDistro)
		this.registryName = registryName
		this.imageVersion = imageVersion
		this.platforms = platform
	}

	def set_ros_distro(ROSDistro distro) {
		this.rosDistro = distro
	}
	def set_registry(String registryName){
		this.registryName = registryName
	}
	def set_image_version(String imageVersion){
		this.imageVersion = imageVersion
	}
	def set_platforms(DeploymentPlatform[] platform){
		this.platforms = platform
	}
	def set_ros_version(ROSDistro distro){
		this.rosVersion  = _getVersion(distro)
	}
	def get_ros_distro() {
		return this.rosDistro
	}
	def get_ros_version(){
		return this.rosVersion
	}

	private def _getVersion(ROSDistro distro){
		if (distro == ROSDistro.melodic || distro == ROSDistro.noetic)
			return 1
		if (distro == ROSDistro.foxy || distro == ROSDistro.galactic)
			return 2
	}

	def get_registry(){
		return this.registryName
	}
	def get_image_version(){
		return this.imageVersion
	}
	def get_platforms(){
		return this.platforms
	}
	def print_info(){
		System.out.format("rosDistro: %s, rosVersion: %s, registryName: %s, imageVersion: %s, platform: %s\n",
							this.rosDistro, this.rosVersion, this.registryName, this.imageVersion, Arrays.toString(this.platforms))
	}
	def update(ImageInfo new_ImageInfo){
		this.rosDistro = new_ImageInfo.rosDistro
		this.rosVersion = new_ImageInfo.rosVersion
		this.registryName = new_ImageInfo.registryName
		this.imageVersion = new_ImageInfo.imageVersion
		this.platforms = new_ImageInfo.platforms
	}
}

class ContainerImageHelpers extends GeneratorHelpers {
	List<ComponentInterface> ComponentsList
	PackageImpl component_package
	Set<String> Repos

 	def get_uniqe_name(String prefix, String ros_distro) {
	 	return prefix + "_" + ros_distro
	 }

	 def Set<String> listOfRepos(Object subsystem) {
		new ArrayList()
		ComponentsList = new ArrayList<ComponentInterface>();
		if (subsystem.class.toString.contains("RosSystemImpl")){
			ComponentsList = (subsystem as RosSystem).rosComponent
		} else if (subsystem.class.toString.contains("ComponentStackImpl")) {
			ComponentsList = (subsystem as ComponentStack).rosComponent
		} else if (subsystem.class.toString.contains("ArrayList")) {
			ComponentsList = subsystem as ArrayList<ComponentInterface>
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

	def set_image_name(String system_name, String ros_distro) {
		var image_name = String.format("%s_%s", system_name, ros_distro)
		
		return toSnake(image_name)
	}
	
	def toSnake(String name) {
		return name.toLowerCase.replaceAll("[^0-9a-zA-Z]", "_")
	}

	def set_extra_image_name(String image_name) {
		return String.format("extra_layer_%s", image_name)
	}

	def set_push_image_name( String registry, String image_name, String image_version) {
		if (registry !== null && !registry.trim().isEmpty())
			return String.format("%s/%s:%s", registry, image_name, image_version)
		else
			return String.format("%s:%s", image_name, image_version)
	}

	def set_image_name(String system_name, String stack_name, String ros_distro) {
		var image_name = String.format("%s_%s_%s", system_name, stack_name, ros_distro)
		return image_name
	}

	def set_extra_folder_path(String prefix) {
		return String.format("%s/%s",prefix, "extra_layer")
	 }


	def set_stack_folder_name(String system_name, String stack_name) {
		return String.format("%s_%s", system_name, stack_name)
	 }

	def set_stack_folder_name(String system_name, String stack_name, String ros_distro) {
		return String.format("%s/%s", set_system_folder_name(system_name, ros_distro), set_stack_folder_name(system_name, stack_name))
	 }

	def set_system_folder_name(String system_name, String ros_distro) {
	 	if(ros_distro=="foxy") {
	 		return system_name + "_ros2"
	 	}
	 	else{
	 		return system_name
	 	}
	 }

	def set_system_folder_name() {
		return "./"
	 }
}
