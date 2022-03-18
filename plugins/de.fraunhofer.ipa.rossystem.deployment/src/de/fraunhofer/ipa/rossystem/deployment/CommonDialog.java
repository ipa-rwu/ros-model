package de.fraunhofer.ipa.rossystem.deployment;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.jface.dialogs.IMessageProvider;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.dialogs.TitleAreaDialog;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.events.SelectionListener;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Combo;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Text;

import componentInterface.ComponentInterface;
import componentInterface.RosParameter;
import rossystem.ComponentStack;
import rossystem.RosSystem;

public class CommonDialog extends TitleAreaDialog {
	private RosSystem rossystem;
	private GenerationHandlerHelper generationHelper = new GenerationHandlerHelper();
	
	private Map<String, Integer> rosDistroMap = new HashMap<String, Integer>() {{
        put(ROSDistro.melodic.toString(), 1);
        put(ROSDistro.noetic.toString(), 1);
        put(ROSDistro.foxy.toString(), 2);
	}};
	
	private Text rosDomainIDText;
	private static int sizeDeploymentPlatform = DeploymentPlatform.values().length;
	private static int  colum = sizeDeploymentPlatform+1;
	private Button[] setDeloymentPlatformBox = new Button[sizeDeploymentPlatform];
    private Combo rosDistroCombo;
 
    private String rosDistro;
    private Integer rosVersion;
	private int rosDomainID;
	private Map<RosParameter, String> param_portvalue_map;
	private ArrayList<DeploymentPlatform> seletPlatforms = new ArrayList<DeploymentPlatform>(); 
	private Text registryText;
	private Text imageVersionText;
	private String registryName;
	private String imageVersion;
    
	public CommonDialog(Shell parentShell, RosSystem sys) {
		super(parentShell);
		rossystem = sys;
	}

    @Override
    public void create() {
        super.create();
        setTitle("Configure for deployment");
        setMessage("This is a TitleAreaDialog", IMessageProvider.INFORMATION);
    }

    @Override
    protected Control createDialogArea(Composite parent) {
        Composite area = (Composite) super.createDialogArea(parent);
        Composite container = new Composite(area, SWT.NONE);
        container.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true));
        GridLayout layout = new GridLayout(colum, false);
        container.setLayout(layout);

        chooseRosDistro(container);
        createRegistry(container);
        createImageVersion(container);
        chooseDevicePorts(container, rossystem);
        chooseDeploymentPlatform(container);

        return area;
    }
    
    // select deployment platform    
	private void chooseDeploymentPlatform(Composite container) {
		Label lbtRosDistroCombo= new Label(container, SWT.NONE);
		lbtRosDistroCombo.setText("Container orchestration");
		
		for(int i = 0; i < sizeDeploymentPlatform; i++) {
			setDeloymentPlatformBox[i] = new Button(container, SWT.CHECK);
			setDeloymentPlatformBox[i].setSelection(false);
			setDeloymentPlatformBox[i].setText(DeploymentPlatform.values()[i].toString());
			setDeloymentPlatformBox[i].pack();
			setDeloymentPlatformBox[i].setEnabled(true);			
		}
	}
	
	// define registry
	private void createRegistry(Composite container) {
		Label lbtRosDistroCombo= new Label(container, SWT.NONE);
		lbtRosDistroCombo.setText("Registry: ");
		registryText = new Text(container, SWT.BORDER);
		registryText.setLayoutData(new GridData(GridData.BEGINNING, 
        											SWT.CENTER, true, false, sizeDeploymentPlatform, 1));
		registryText.setEnabled(true);
	}
	
	// define image version 
	private void createImageVersion(Composite container) {
		Label lbtRosDistroCombo= new Label(container, SWT.NONE);
		lbtRosDistroCombo.setText("Image Version (default: latest):");
		imageVersionText = new Text(container, SWT.BORDER);
		imageVersionText.setLayoutData(new GridData(GridData.BEGINNING, 
        											SWT.CENTER, true, false, sizeDeploymentPlatform, 1));
		imageVersionText.setEnabled(true);
		imageVersionText.setMessage("latest");
	}
	
	private void chooseRosDistro(Composite container) { 
		Label lbtRosDistroCombo= new Label(container, SWT.NONE);
		lbtRosDistroCombo.setText("Select ROS Distro:");
    	rosDistroCombo = new Combo(container, SWT.READ_ONLY | SWT.BORDER);

    	rosDistroCombo.setLayoutData(new GridData(GridData.BEGINNING, SWT.CENTER, false, false, sizeDeploymentPlatform, 1));
	  	
    	String [] choices = rosDistroMap.keySet().toArray(new String[0]);
    	rosDistroCombo.setItems(choices);

    	rosDistroCombo.select(Arrays.asList(choices).indexOf(ROSDistro.foxy.toString()));  // Select "1" by default
    	
        Label lbtBridgeName = new Label(container, SWT.NONE);
        lbtBridgeName.setText("ROS Domain ID:");

        rosDomainIDText = new Text(container, SWT.BORDER);
        rosDomainIDText.setLayoutData(new GridData(GridData.HORIZONTAL_ALIGN_BEGINNING, 
        											SWT.CENTER, true, false, sizeDeploymentPlatform, 1));
        rosDomainIDText.setEnabled(true);
    	
    	rosDistroCombo.addSelectionListener(new SelectionListener() {
			public void widgetSelected(SelectionEvent event) {
				rosDistro = rosDistroCombo.getText();
            	rosVersion = rosDistroMap.get(rosDistroCombo.getText());   
            	if (rosVersion ==2) {
            		rosDomainIDText.setEnabled(true);
            		rosDomainIDText.setMessage("0");
            	}
            	else {
            		rosDomainIDText.setEnabled(false);
            	}
            }
            public void widgetDefaultSelected(SelectionEvent event)
            {  
            	rosDistro = rosDistroCombo.getText();
	        	rosVersion = rosDistroMap.get(rosDistroCombo.getText());
	        	if (rosVersion ==2) {
	        		rosDomainIDText.setEnabled(true);
	        		rosDomainIDText.setMessage("0");
	        	}
	        	else {
	        		rosDomainIDText.setEnabled(false);
	        	}                
            }
      });
    }
    
    // choose device port    
    private void chooseDevicePorts(Composite container, RosSystem system) {
    	EList<ComponentInterface> roscomponents = new BasicEList<ComponentInterface>();
    	EList<ComponentStack> stacks = system.getComponentStack();
    	String componetName = system.getName();
    	if (stacks.size() == 0) {
			  roscomponents = system.getRosComponent();
			  listParamFromComponent(roscomponents, componetName, container);

		  }else {
			  for (ComponentStack stack: stacks) {
				  componetName = stack.getName();
				  roscomponents = stack.getRosComponent();
				  listParamFromComponent(roscomponents, componetName, container);
			  }
		  }
		
	}

	private void listParamFromComponent(EList<ComponentInterface> roscomponents, String componetName, Composite container) {
		// TODO Auto-generated method stub
		Label lbtRosDistroCombo= new Label(container, SWT.NONE);
		lbtRosDistroCombo.setText(String.format("%s: Select parameters for setting ports", componetName));
		Combo paramCombo = new Combo(container, SWT.READ_ONLY | SWT.BORDER);
		paramCombo.setLayoutData(new GridData(SWT.LEAD, SWT.CENTER, false, false, sizeDeploymentPlatform, 1));
		
		List<String> param_names = new ArrayList<String>();
		param_portvalue_map=new HashMap<>();
		Map<String, String> temp_map=new HashMap<>();
		Map<String, RosParameter> param_name_map = new HashMap<String, RosParameter>();
		for (RosParameter param : generationHelper.get_all_ros_params(roscomponents)) {
			  param_names.add(param.getName());
			  param_name_map.put(param.getName(), param);
		}
		String [] choices = param_names.toArray(new String[0]);
		paramCombo.setItems(choices);
		
		Text paramResult = new Text(container, SWT.BORDER);
		paramResult.setLayoutData(new GridData(SWT.FILL, 
												SWT.FILL, true, false, colum, 1));
		paramResult.setEnabled(false);
		
		paramCombo.addSelectionListener(new SelectionListener() {
			public void widgetSelected(SelectionEvent event) {
				String param_name = paramCombo.getText();
				RosParameter tmp_value = param_name_map.get(param_name.toString());
				if(tmp_value != null) {
					  if(tmp_value.getValue() != null) {
						  String raw_value = tmp_value.getValue().toString().replace(" ", "");
						  String value = raw_value.substring(raw_value.lastIndexOf(":")+1, raw_value.lastIndexOf(")"));
						  MessageDialog dialog_check_port = new MessageDialog(container.getShell(), String.format("Check ports' values in %s", componetName), null,
								  String.format("The value of \"%s\" is \"%s\"", param_name.toString(), value), MessageDialog.INFORMATION, new String[] { "OK", "CANCEL" }, 0);
						  if (dialog_check_port.open() == MessageDialog.OK) {
							  param_portvalue_map.put(tmp_value, value);
							  temp_map.put(param_name.toString(), value);
							  							  
							  String msg = convertWithStream(temp_map);
							  paramResult.setMessage(msg);
						  }
					  }
					  else {
						  String value = "Deployment Artifacts couldn't be generated. The selected parameter ("+param_name.toString()+") doesn't have a value set, please define it on the rossystem file and try again.";
						  MessageDialog error_dialog = new MessageDialog(container.getShell(), "ERROR", null,
								  	value, MessageDialog.ERROR, new String[] { "Cancel" }, 0);
						  error_dialog.open();
					  }
				  }
			}
            public void widgetDefaultSelected(SelectionEvent event)
            {                    
            }
      });
	}

	protected String convertWithStream(Map<?, ?> map) {
		String mapAsString = map.keySet().stream()
			      .map(key -> key + ": " + map.get(key))
			      .collect(Collectors.joining("; "));
	    return mapAsString;
	}
    
    @Override
    protected boolean isResizable() {
        return true;
    }

    // save content of the Text fields because they get disposed
    // as soon as the Dialog closes
    private void saveInput() {
    	rosDistro = rosDistroCombo.getText();
    	rosVersion = rosDistroMap.get(rosDistro);
    	String domainIDString = rosDomainIDText.getText();
    	if (domainIDString != null && !domainIDString.trim().isEmpty()) {
    		rosDomainID = Integer.parseInt(rosDomainIDText.getText());
    	}
    	seletPlatforms = getPlatforms();
    	registryName = registryText.getText();
    	if (imageVersion != null && !imageVersion.trim().isEmpty()) {
        	imageVersion = imageVersionText.getText();
    	}
    	else {
    		imageVersion = "latest";
    	}

    }

    private ArrayList<DeploymentPlatform> getPlatforms() {
    	int index = 0;
    	ArrayList<DeploymentPlatform> _seletPlatforms = new ArrayList<DeploymentPlatform>();
    	for(int i = 0; i < sizeDeploymentPlatform; i++) {
    		if (setDeloymentPlatformBox[i].getSelection()) {
    			_seletPlatforms.add(DeploymentPlatform.values()[i]);
    			index ++;
    			System.out.print(String.format("size: %s, %s: %s, should be %s", sizeDeploymentPlatform, index, _seletPlatforms, DeploymentPlatform.values()[i]));
    		}
    		
    	}
		return _seletPlatforms;
	}

	@Override
    protected void okPressed() {
        saveInput();
        super.okPressed();
    }

    public String getRosDistro() {
    	return rosDistro;
    }
    
	public Map<RosParameter, String> getPortMap() {
		return param_portvalue_map;
	}

	public Integer getRosDomainID() {
		return rosDomainID;
	}

	public Integer getRosVersion(String distro) {
		return rosVersion;
	}
	
	public ArrayList<DeploymentPlatform> getSelectPlatforms() {
		return seletPlatforms;
	}

	public String getRegistryNmae() {
		return registryName;
	}

	public String getImageVersion() {
		return imageVersion;
	}
	
}