package de.fraunhofer.ipa.rossystem.deployment;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

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

	        String distro = imageParamConfig.getRosDistro();

	        // set export port
        	Map<String, Map<RosParameter, String>> sys_param_port = set_ports_from_parameters(imageParamConfig, system);
        	generator.get_port_list(sys_param_port);

			generator.doGenerate(r, fsa, new GeneratorContext());
	      }
	    }
	    return null;
	  }

	  private static String[] getNames(Class<? extends Enum<?>> e) {
		    return Arrays.stream(e.getEnumConstants()).map(Enum::name).toArray(String[]::new);
		}

	private ImageParamConfigDialog configImageDialog(Shell shell, RosSystem system) {
		ImageParamConfigDialog dialog = new ImageParamConfigDialog(shell, system);
		dialog.open();
		return dialog;
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
