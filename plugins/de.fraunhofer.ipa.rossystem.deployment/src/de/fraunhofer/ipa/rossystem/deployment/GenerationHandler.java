package de.fraunhofer.ipa.rossystem.deployment;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Stream;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.commands.IHandler;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.handlers.HandlerUtil;
import org.eclipse.xtext.builder.EclipseResourceFileSystemAccess2;
import org.eclipse.xtext.generator.GeneratorContext;
import org.eclipse.xtext.generator.IOutputConfigurationProvider;
import org.eclipse.xtext.generator.OutputConfiguration;
import org.eclipse.xtext.resource.IResourceDescriptions;
import org.eclipse.xtext.ui.resource.IResourceSetProvider;

import com.google.inject.Inject;
import com.google.inject.Provider;

import componentInterface.RosParameter;
import rossystem.ComponentStack;
import rossystem.RosSystem;

public class GenerationHandler extends AbstractHandler implements IHandler {

	  @Inject
	  private Provider<EclipseResourceFileSystemAccess2> fileAccessProvider;

	  @Inject
	  IResourceDescriptions resourceDescriptions;

	  @Inject
	  IResourceSetProvider resourceSetProvider;

	static Map<String, OutputConfiguration> getOutputConfigurationsAsMap(IOutputConfigurationProvider provider) {
		Map<String, OutputConfiguration> outputs = new HashMap<String, OutputConfiguration>();
		for(OutputConfiguration c: provider.getOutputConfigurations()) {
			outputs.put(c.getName(), c);
		}
		return outputs;
	}

	  @Override
	  public Object execute(ExecutionEvent event) throws ExecutionException {

	    ISelection selection = HandlerUtil.getCurrentSelection(event);
	    if (selection instanceof IStructuredSelection) {
	      IStructuredSelection structuredSelection = (IStructuredSelection) selection;
	      Object firstElement = structuredSelection.getFirstElement();
	      if (firstElement instanceof IFile) {
	        IFile file = (IFile) firstElement;
	        IProject project = file.getProject();

	        final EclipseResourceFileSystemAccess2 fsa = fileAccessProvider.get();
	        fsa.setProject(project);
	        fsa.setOutputConfigurations(getOutputConfigurationsAsMap(new CustomOutputProvider()));
            fsa.setMonitor(new NullProgressMonitor());

	        URI uri = URI.createPlatformResourceURI(file.getFullPath().toString(), true);
	        ResourceSet rs = resourceSetProvider.get(project);
	        Resource r = rs.getResource(uri, true);
	        RosSystem system = (RosSystem)r.getContents().get(0);

	        Display display = Display.getDefault();
	        Shell shell = display.getActiveShell();

	        ImageParamConfigDialog imageParamConfig = configImageDialog(shell, system);
	        DeploymentArtifactsGenerator generator = new DeploymentArtifactsGenerator();

	        ROSDistro distro = imageParamConfig.getRosDistro();

	        // set export port
        	Map<String, Map<RosParameter, String>> sys_param_port = set_ports_from_parameters(imageParamConfig, system);
        	generator.get_port_list(sys_param_port);
        	generator.setMetaHardwareInfo(imageParamConfig.getProcessorArchitecture());

  	        ImageInfo imageInfo = generator.setImageInfo(distro,
  														imageParamConfig.getRegistryNmae(),
  														imageParamConfig.getImageVersion());

  	      	ArrayList<DeploymentPlatform> selectPlatforms = imageParamConfig.getSelectPlatforms();
  	      	imageInfo.set_platforms(Stream.of(selectPlatforms.toArray()).toArray(DeploymentPlatform[]::new));
  	      	imageInfo.print_info();
  	      	for (DeploymentPlatform p : selectPlatforms) {
	        	generator.updateImageInfo(imageInfo);
        		if (p.toString() == DeploymentPlatform.K8s.toString()){
	        		K8sMetaInfo k8s_config = configK8s(shell, distro, imageInfo.get_ros_version());
	        		k8s_config.print();
	        		generator.set_k8s_config(k8s_config);
        		}
  	      	}

			generator.doGenerate(r, fsa, new GeneratorContext());
	      }
	    }
	    return null;
	  }

	private ImageParamConfigDialog configImageDialog(Shell shell, RosSystem system) {
		ImageParamConfigDialog dialog = new ImageParamConfigDialog(shell, system);
		dialog.open();
		return dialog;
	}

	private K8sMetaInfo configK8s(Shell shell, ROSDistro distro, Integer version) {
		K8sConfigDialog dialog = new K8sConfigDialog(shell, distro, version);
		dialog.open();
		Boolean ifmacvlan = dialog.getIfMacVlan();
		Boolean ifConnectWeb = dialog.getIfConnectWeb();
		DeploymentType deploy_type = dialog.getDeploymentType();
		String bridgename = dialog.getBridgeName();
		K8sMetaInfo k8s_info = new K8sMetaInfo(ifmacvlan, ifConnectWeb, bridgename, deploy_type);
		k8s_info.setRosDomainID(dialog.getRosDomainID(), version);
		return k8s_info;
	}

	private Map<String, Map<RosParameter, String>> set_ports_from_parameters(ImageParamConfigDialog imageParamConfig, RosSystem system) {
  		  Map<String, Map<RosParameter, String>> sys_param_portvalue_map=new HashMap<>();
		  EList<ComponentStack> stacks = system.getComponentStack();
		  if (stacks.size() == 0) {
			  sys_param_portvalue_map.put(system.getName(), imageParamConfig.getPortMap());
		  }else {
			  for (ComponentStack stack: stacks) {
				  sys_param_portvalue_map.put(stack.getName(), imageParamConfig.getPortMap());
			  }
		  }

		  return sys_param_portvalue_map;
	  }

	  @Override
	  public boolean isEnabled() {
	    return true;
	  }
	}
