package de.fraunhofer.ipa.rossystem.deployment

import java.util.Set
import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.xtext.generator.AbstractGenerator
import org.eclipse.xtext.generator.IFileSystemAccess2
import org.eclipse.xtext.generator.IGeneratorContext
import org.eclipse.xtext.generator.IOutputConfigurationProvider
import org.eclipse.xtext.generator.OutputConfiguration
import de.fraunhofer.ipa.rossystem.deployment.RosInstallCompiler
import de.fraunhofer.ipa.rossystem.deployment.DockerComposeCompiler
import de.fraunhofer.ipa.rossystem.deployment.DockerContainerCompiler
import de.fraunhofer.ipa.rossystem.deployment.GitActionCompiler
import de.fraunhofer.ipa.rossystem.deployment.DeploymentHelpers
import de.fraunhofer.ipa.rossystem.deployment.DeploymentInfo
import rossystem.RosSystem;
import java.util.HashMap
import java.util.Map
import java.util.List
import componentInterface.RosParameter
import java.util.ArrayList

class CustomOutputProvider implements IOutputConfigurationProvider {
	public final static String DEFAULT_OUTPUT = "DEFAULT_OUTPUT"

	override Set<OutputConfiguration> getOutputConfigurations() {
		var OutputConfiguration default_config = new OutputConfiguration(DEFAULT_OUTPUT)
		default_config.setDescription("DEFAULT_OUTPUT");
		default_config.setOutputDirectory("./src-gen/");
		default_config.setOverrideExistingResources(true);
		default_config.setCreateOutputDirectory(true);
		default_config.setCleanUpDerivedResources(true);
		default_config.setSetDerivedProperty(true);
		return newHashSet(default_config)
	}
}

/**
 * Generates code from your model files on save.
 *
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#code-generation
 */
class DeploymentArtifactsGenerator extends AbstractGenerator {

	DockerContainerCompiler docker_compiler = new DockerContainerCompiler()
	RosInstallCompiler rosintall_compiler = new RosInstallCompiler()
	DockerComposeCompiler dockercompose_compiler = new DockerComposeCompiler()
	GitActionCompiler gitaction_compiler = new GitActionCompiler()
	K8sDeploymentCompiler k8s_compiler = new K8sDeploymentCompiler()
	K8sDeploymentHelpers k8s_helper = new K8sDeploymentHelpers()
	K8sMetaInfo k8s_info = new K8sMetaInfo()
	
	DeploymentHelpers generator_helper = new DeploymentHelpers()	
	DeploymentInfo deploymentInfo = new DeploymentInfo()

	String system_folder_prefix

	Map<String, List<String>> device_map = new HashMap<String, List<String>>
		
	def set_deployment_info(String rosDistro,
							Integer rosVersion,
							String registryName,
							String imageVersion,
							Integer rosDomainID){
		deploymentInfo.set_image_version(imageVersion)
		deploymentInfo.set_ros_distro(rosDistro)
		deploymentInfo.set_ros_version(rosVersion)
		deploymentInfo.set_registry(registryName)
		deploymentInfo.set_rosDomainID(rosDomainID)
		return deploymentInfo
	}

	def update_deployment_info(DeploymentInfo new_deploymentInfo){
		deploymentInfo.update(new_deploymentInfo)
	}

	def set_k8s_config(Boolean ifUseMacvlan,
					Boolean ifConnectWeb,
					String bridgeName,
					DeploymentType deploymentType){
		k8s_info = new K8sMetaInfo(ifUseMacvlan, ifConnectWeb, bridgeName, deploymentType)	
	}		

	def set_k8s_config(K8sMetaInfo info){
		k8s_info = info
	}	
		
	def create_system_prefix(RosSystem system){
		//system name + _ros2 or system name		
		if (deploymentInfo.get_ros_version() == 2) {
			return system.getName().toLowerCase + "_ros2"
		}else{
			return system.getName().toLowerCase
		}
	}
	
	def get_port_list(Map<String, Map<RosParameter, String>> ports_map){
		for (key: ports_map.keySet()){
			val values = newArrayList()
			for (k: ports_map.get(key).keySet()){
				val v = ports_map.get(key).get(k)
				values.add(ports_map.get(key).get(k))
			}
			device_map.put(key, values);
		}
	}
	
	override void doGenerate(Resource resource, IFileSystemAccess2 fsa, IGeneratorContext context) {
		// ROS1 package
		device_map.keySet().forEach[String key|
	    	if (device_map.get(key).contains(null)) {
	    			throw new IllegalArgumentException("Values of some device ports are not defined.")
	        	}
		]
		for (system : resource.allContents.toIterable.filter(RosSystem)){
			system_folder_prefix = create_system_prefix(system)
			if (system.componentStack.size==0){
				fsa.generateFile(system_folder_prefix +"/Dockerfile",docker_compiler.compile_toDockerContainer(system, null, deploymentInfo))
 				fsa.generateFile(system_folder_prefix +"/extra_layer/" + system.getName().toLowerCase + ".rosinstall",rosintall_compiler.compile_toRosInstall(system,null))
				fsa.generateFile(system_folder_prefix +"/extra_layer/Dockerfile",docker_compiler.compile_toDockerImageExtraLayer(system, null,deploymentInfo))
			} else {
				for (stack : system.componentStack){
					val stack_folder_prefix = String.join("/", system_folder_prefix, system.name.toLowerCase+'_'+stack.name.toLowerCase)
					fsa.generateFile(String.join("/", stack_folder_prefix, "Dockerfile"),docker_compiler.compile_toDockerContainer(system, stack, deploymentInfo))
			 		fsa.generateFile(String.join("/", stack_folder_prefix, "extra_layer", stack.name.toLowerCase+".rosinstall"),rosintall_compiler.compile_toRosInstall(system,stack))
			 		fsa.generateFile(String.join("/", stack_folder_prefix, "extra_layer", "Dockerfile"),docker_compiler.compile_toDockerImageExtraLayer(system,stack, deploymentInfo))
				}
			}

			if (deploymentInfo.get_platforms.length !== 0){
				for (platform : deploymentInfo.get_platforms){
					if (platform == DeploymentPlatform.K8s){
						fsa.generateFile(String.join("/", system_folder_prefix, 
										String.format("%s-%s.yml", DeploymentPlatform.K8s.toString(), k8s_helper.convert_name_to_k8s(system.name))),
										k8s_compiler.compile_toK8s(system,
																deploymentInfo,
																k8s_info
										))
					}
					if (platform == DeploymentPlatform.DockerCompose){
						fsa.generateFile(String.join("/", system_folder_prefix, "docker-compose.yml"),
										dockercompose_compiler.compile_toDockerCompose(system, deploymentInfo, device_map)
						)
						
					}					
				}
			}
		}

		// git action workflow
 		for (system : resource.allContents.toIterable.filter(RosSystem)){
			fsa.generateFile(String.join("/", system_folder_prefix, generator_helper.get_uniqe_name(system.name.toLowerCase, deploymentInfo.get_ros_distro()) + "_workflow.yml"),
										gitaction_compiler.compile_toGitAction(system, deploymentInfo)
			)
			}
		}

}
