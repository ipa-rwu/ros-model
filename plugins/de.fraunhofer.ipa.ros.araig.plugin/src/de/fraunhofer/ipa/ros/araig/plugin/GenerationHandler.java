package de.fraunhofer.ipa.ros.araig.plugin;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.security.KeyException;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.commands.IHandler;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.jface.dialogs.InputDialog;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.LabelProvider;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.FileDialog;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.dialogs.ElementListSelectionDialog;
import org.eclipse.ui.dialogs.ElementTreeSelectionDialog;
import org.eclipse.ui.handlers.HandlerUtil;
import org.eclipse.ui.model.BaseWorkbenchContentProvider;
import org.eclipse.ui.model.WorkbenchLabelProvider;
import org.eclipse.xtext.builder.EclipseResourceFileSystemAccess2;
import org.eclipse.xtext.generator.GeneratorContext;
import org.eclipse.xtext.generator.IOutputConfigurationProvider;
import org.eclipse.xtext.generator.OutputConfiguration;
import org.eclipse.xtext.resource.IResourceDescriptions;
import org.eclipse.xtext.ui.resource.IResourceSetProvider;

import com.google.inject.Inject;
import com.google.inject.Provider;
import com.google.gson.Gson;

import componentInterface.ComponentInterface;
import componentInterface.RosPublisher;
import de.fraunhofer.ipa.ros.araig.plugin.generator.CalculatorPyCodeGenerator;
import de.fraunhofer.ipa.ros.araig.plugin.generator.CustomOutputProvider;
import ros.Artifact;
import ros.Node;
import ros.Package;
import ros.PackageSet;
import ros.Publisher;
import ros.Subscriber;
import ros.TopicSpec;
import ros.impl.ArtifactImpl;
import ros.impl.NodeImpl;
import ros.impl.PackageImpl;
import ros.impl.PackageSetImpl;
import ros.impl.PublisherImpl;
import ros.impl.SubscriberImpl;
import ros.impl.TopicSpecImpl;
import rossystem.RosSystem;

class Port {
	public String topic = "";
	public String msg_type  = "";
}
class TestCase {
	   public String name = "";
	   public String description = "";
	   public List<Port> subscribers = new ArrayList<Port>();
	   public List<Port> publishers = new ArrayList<Port>();
	   public List<Port> action_sever = new ArrayList<Port>();
	}

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

	@SuppressWarnings("null")
	@Override
	public Object execute(ExecutionEvent event) throws ExecutionException {
		ISelection selection = HandlerUtil.getCurrentSelection(event);
		if (selection instanceof IStructuredSelection) {
			IStructuredSelection structuredSelection = (IStructuredSelection) selection;
			Object firstElement = structuredSelection.getFirstElement();
			if (firstElement instanceof IFile) {
			IFile file = (IFile) firstElement;
			IProject project = file.getProject();

			URI uri = URI.createPlatformResourceURI(file.getFullPath().toString(), true);
			ResourceSet rs = resourceSetProvider.get(project);
			Resource r = rs.getResource(uri, true);
				
			Display display = Display.getDefault();
			Shell shell = display.getActiveShell();

			RosSystem rossystem = (RosSystem)r.getContents().get(0);
			EList<ComponentInterface> roscomponents = rossystem.getRosComponent();
			List<EObject> RosInterfaces = new ArrayList<EObject>();
			for (int i=0; i<roscomponents.size(); i++) {
				List<EObject>  NewRosInterfaces = getInterfaces(roscomponents.get(i));
				for (int j= 0;j<NewRosInterfaces.size();j++) {
					RosInterfaces.add(NewRosInterfaces.get(j));
				}
			}
					        
			// Step 1: select test manifest
//			FileDialog dialog = new FileDialog(shell, SWT.OPEN);
//			dialog.setFilterExtensions(new String [] {"*.json"});
//			dialog.setFilterPath(null);
//			String manifest_path = dialog.open();
			
//			FileDialog dlg = new FileDialog(shell,  SWT.OPEN  );
//			dlg.setText("Open");
//			dlg.setFilterExtensions(new String[] { "*.json" } );
//			String path = dlg.open();
//			
			//			String manifest_path = selectTestManifest(file.getFullPath().toString(), shell, project);
//			List<TestCase> testcases = parseManifest(manifest_path);
			
			// Step 2: select test case
//			String test_name = select_test_model(testcases, shell, project);
//			
//			TestCase testcase = findTestCase(testcases, test_name);
//			System.out.println(testcase.name);
//			System.out.println(testcase.publishers);
			
			// Step 2: select publishers from the robot system to be subscribed
			ElementListSelectionDialog dialogSelect = new ElementListSelectionDialog(shell, new LabelProvider());
		
			String[] ListofInterfaces = new String[RosInterfaces.size()];
			for (int i=0; i<RosInterfaces.size(); i++) {
				ListofInterfaces[i]=(getViewMenuInterfaceName(RosInterfaces.get(i)));
			}
			dialogSelect.setElements(ListofInterfaces);
			dialogSelect.setTitle("Select the ROS interfaces to subscribe");
			dialogSelect.setMessage("!!! This features requires that the option: Project -> Build Automatilly is enable !!!");
			dialogSelect.setMultipleSelection(true);
			dialogSelect.open();
			List<Subscriber> CalculatorSubscribers = new ArrayList<Subscriber>();

			Object[] SelectedPublishersFromSystem = dialogSelect.getResult();
			for (Object result_: SelectedPublishersFromSystem) {
				for (EObject ResultInterface: RosInterfaces) {
					if((getViewMenuInterfaceName(ResultInterface)).equals(result_.toString())) {
						EObject SelectedInterface = ResultInterface;
						if (SelectedInterface.getClass().toString().contains("componentInterface.impl.RosPublisherImpl")) {
							Subscriber sub = new SubscriberImpl();
							sub.setName(((RosPublisher) SelectedInterface).getName());
							sub.setMessage(((RosPublisher)SelectedInterface).getPublisher().getMessage());
							CalculatorSubscribers.add(sub);
						}
			}}}
			
			String RelativePathTogenerationFolder = "src-gen/calculators/";
			String RelativePathToCalculatorModel = RelativePathTogenerationFolder+ "tmp" +".ros";
			IFile CalculatorModelFile = project.getFile(RelativePathToCalculatorModel);
			
			// prepare the Xtext generation environment
			CalculatorPyCodeGenerator generator = new CalculatorPyCodeGenerator();
			final EclipseResourceFileSystemAccess2 fsa = fileAccessProvider.get();
			fsa.setProject(project);
			fsa.setOutputConfigurations(getOutputConfigurationsAsMap(new CustomOutputProvider()));
			fsa.setMonitor(new NullProgressMonitor());
			GeneratorContext generatorContext = new GeneratorContext();
			if (!project.getFolder(RelativePathTogenerationFolder).exists()) {
				generator.createXtextGenerationFolder(fsa, generatorContext);
			}

			ResourceSet rs_result = new ResourceSetImpl();
			URI model_result_uri= URI.createPlatformResourceURI(CalculatorModelFile.getFullPath().toString(),true);
			Resource model_result= rs_result.createResource(model_result_uri);

			// Call the python code generator
			ResourceSet rs2 = resourceSetProvider.get(project);
			Resource r2 = rs2.getResource(model_result_uri, true);
			generator.doGenerate(r2, fsa, generatorContext);
		}}
		return null;
	}

	private List<EObject> getInterfaces(ComponentInterface componentInterface_model) {
		List<EObject> ROSInterfaces = new ArrayList<EObject>();
		for (RosPublisher RosPub: componentInterface_model.getRospublisher()) {
			ROSInterfaces.add(RosPub);
		}
		return ROSInterfaces;
	}
	
	private String getInterfaceName(EObject RosInterface) {
		String name = RosInterface.toString().substring(RosInterface.toString().indexOf("name:")+6,RosInterface.toString().indexOf(","));
		return name;
	}
	private String getViewMenuInterfaceName(EObject RosInterface) {
		String name = "["+RosInterface.toString().substring(RosInterface.toString().indexOf("impl.Ros")+8,RosInterface.toString().indexOf("Impl@"))+"]  "+
				getInterfaceName(RosInterface);
		return name;
	}

	private void  save_model(Resource model_result, PackageSet CalculatorModelResult) {
		model_result.getContents().add(CalculatorModelResult);
		try {
			model_result.save(null);
			model_result.load(null);
		} catch (IOException e1) {
			e1.printStackTrace();
		}
	}
	
	
	private String selectTestManifest(String current_path, Shell shell, IProject project) {
		FileDialog dialog = new FileDialog(shell, SWT.OPEN);
		dialog.setFilterExtensions(new String [] {"*.json"});
		dialog.setFilterPath(null);
		String manifest_path = dialog.open();
		return manifest_path;
	}
	
	private TestCase findTestCase(List<TestCase> testcases, String test_name) {
		for (TestCase test : testcases) {
			if (test.name == test_name) {
				return test;
			}
		}
		return null;
	}

	private String select_test_model(List<TestCase> test_cases, Shell shell, IProject project) {
		List<String> msgs = new ArrayList<String>();
		test_cases.forEach(test_case -> msgs.add(String.join(": ", test_case.name, test_case.description))
		);
	    ElementListSelectionDialog dialog = new ElementListSelectionDialog(shell, new LabelProvider());
	    dialog.setElements(msgs.toArray());
	    dialog.setTitle("Select a test type");
	    dialog.setMultipleSelection(false);
	    dialog.open();
	    String res = dialog.getFirstResult().toString();
	    return res.split(":")[0];
	}
	
	private static List<TestCase> parseManifest(String manifest_path) {
		List<TestCase> tmp_list = new ArrayList<TestCase>();
		Gson gson = new Gson();
		
		try {
			FileReader reader;
			reader = new FileReader(manifest_path);
			
			TestCase staff = gson.fromJson(reader, TestCase.class);
			System.out.println(staff);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        
//        for (Object test_name : manifest.keySet())
//        {
//        	tmp_list.add(parseTestCaseObject(test_name.toString(), (JSONObject) manifest.get(test_name.toString())));
//        }
        
        return tmp_list;
	}
	
//    private static TestCase parseTestCaseObject(String name, JSONObject test_case) 
//    {
//    	TestCase tmp = new TestCase();
//    	tmp.name = name;
//    	tmp.description = (String) test_case.get("description");
//		tmp.publishers = parsePorts((JSONArray) test_case.get("publishers") );
//		tmp.subscribers = parsePorts((JSONArray) test_case.get("subscribers") );
//		tmp.action_sever = parsePorts((JSONArray) test_case.get("subscribers") );
//		return tmp;
//    }
    
//    private static List<Port> parsePorts(JSONArray array) {
//
//        List<Port> list = new ArrayList<Port>();
//
//        for (Object item : array) {
//        	JSONArray port_raw = (JSONArray) item;
//            Port port = new Port();
//            port.topic = (String) port_raw.get(0);
//            port.msg_type = (String) port_raw.get(1);
//            list.add(port);
//        }
//        return list;
//    }
//    
	@Override
	  public boolean isEnabled() {
		return true;
	  }
	}
