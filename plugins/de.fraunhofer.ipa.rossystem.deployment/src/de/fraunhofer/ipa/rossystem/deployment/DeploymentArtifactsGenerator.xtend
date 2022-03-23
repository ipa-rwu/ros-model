package de.fraunhofer.ipa.rossystem.deployment

import componentInterface.RosParameter
import java.util.HashMap
import java.util.List
import java.util.Map
import java.util.Set
import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.xtext.generator.AbstractGenerator
import org.eclipse.xtext.generator.IFileSystemAccess2
import org.eclipse.xtext.generator.IGeneratorContext
import org.eclipse.xtext.generator.IOutputConfigurationProvider
import org.eclipse.xtext.generator.OutputConfiguration
import rossystem.RosSystem

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
	DockerComposeHelpers compose_helper = new DockerComposeHelpers()
	GitActionCompiler gitaction_compiler = new GitActionCompiler()
	K8sDeploymentCompiler k8s_compiler = new K8sDeploymentCompiler()
	K8sDeploymentHelpers k8s_helper = new K8sDeploymentHelpers()
	K8sMetaInfo k8s_info = new K8sMetaInfo()

	ContainerImageHelpers generator_helper = new ContainerImageHelpers()
	ImageInfo ImageInfo = new ImageInfo()

	String system_folder_prefix

	Map<String, List<String>> device_map = new HashMap<String, List<String>>

	def setImageInfo(ROSDistro rosDistro,
							String registryName,
							String imageVersion){
		ImageInfo.set_image_version(imageVersion)
		ImageInfo.set_ros_distro(rosDistro)
		ImageInfo.set_ros_version(rosDistro)
		ImageInfo.set_registry(registryName)
		return ImageInfo
	}

	def updateImageInfo(ImageInfo new_ImageInfo){
		ImageInfo.update(new_ImageInfo)
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
		if (ImageInfo.get_ros_version() == 2) {
			return system.getName().toLowerCase + "_ros2"
		}else{
			return system.getName().toLowerCase
		}
	}

	def get_port_list(Map<String, Map<RosParameter, String>> ports_map){
		for (key: ports_map.keySet()){
			val values = newArrayList()
			for (k: ports_map.get(key).keySet()){
				values.add(ports_map.get(key).get(k))
			}
			device_map.put(key, values)
		}

	}

	override void doGenerate(Resource resource, IFileSystemAccess2 fsa, IGeneratorContext context) {
		device_map.keySet().forEach[String key|
	    	if (device_map.get(key).contains(null)) {
	    			throw new IllegalArgumentException("Values of some device ports are not defined.")
	        	}
		]
		for (system : resource.allContents.toIterable.filter(RosSystem)){
			system_folder_prefix = create_system_prefix(system)
			if (system.componentStack.size==0){
				fsa.generateFile(system_folder_prefix +"/Dockerfile",docker_compiler.compile_toDockerContainer(system, null, ImageInfo))
				fsa.generateFile(system_folder_prefix +"/extra_layer/" + system.getName().toLowerCase + ".rosinstall",rosintall_compiler.compile_toRosInstall(system))
				fsa.generateFile(system_folder_prefix +"/extra_layer/Dockerfile",docker_compiler.compile_toDockerImageExtraLayer(system, null,ImageInfo))
			} else {
				for (stack : system.componentStack){
					val stack_folder_prefix = String.join("/", system_folder_prefix, system.name.toLowerCase+'_'+stack.name.toLowerCase)
					fsa.generateFile(String.join("/", stack_folder_prefix, "Dockerfile"),docker_compiler.compile_toDockerContainer(system, stack, ImageInfo))
					fsa.generateFile(String.join("/", stack_folder_prefix, "extra_layer", stack.name.toLowerCase+".rosinstall"),rosintall_compiler.compile_toRosInstall(stack))
					fsa.generateFile(String.join("/", stack_folder_prefix, "extra_layer", "Dockerfile"),docker_compiler.compile_toDockerImageExtraLayer(system,stack, ImageInfo))
				}
			}

			if (ImageInfo.get_platforms.length !== 0){
				for (platform : ImageInfo.get_platforms){
					if (platform == DeploymentPlatform.K8s){
						fsa.generateFile(String.join("/", system_folder_prefix,
										k8s_helper.set_deployment_file(system.name)),
										k8s_compiler.compile_toK8s(system,
																ImageInfo,
																k8s_info
										))
					}
					if (platform == DeploymentPlatform.DockerCompose){
						fsa.generateFile(String.join("/", system_folder_prefix, compose_helper.set_deployment_file(system.name)),
										dockercompose_compiler.compile_toDockerCompose(system, ImageInfo, device_map)
						)

					}
				}
			}
		}

		// git action workflow
		for (system : resource.allContents.toIterable.filter(RosSystem)){
			fsa.generateFile(String.join("/", system_folder_prefix, generator_helper.get_uniqe_name(system.name.toLowerCase, ImageInfo.get_ros_distro().toString) + "_workflow.yml"),
										gitaction_compiler.compile_toGitAction(system, ImageInfo)
			)
			}
	}
}