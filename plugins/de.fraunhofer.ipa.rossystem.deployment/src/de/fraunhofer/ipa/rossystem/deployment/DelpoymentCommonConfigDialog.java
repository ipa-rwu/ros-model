package de.fraunhofer.ipa.rossystem.deployment;

import java.util.ArrayList;
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
import org.eclipse.swt.events.ModifyEvent;
import org.eclipse.swt.events.ModifyListener;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.events.SelectionListener;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
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

public class DelpoymentCommonConfigDialog extends TitleAreaDialog {
	private GenerationHandlerHelper generationHelper = new GenerationHandlerHelper();
	
	private Integer selcetedRosVersion;
	private ROSDistro selcetedRosDistro;
	private Integer rosDomainID = 0;
	private Map<RosParameter, String> param_portvalue_map;
	
	private Text rosDomainIDText;
    
    public DelpoymentCommonConfigDialog(Shell parentShell, ROSDistro rosDistro, Integer rosVersion) {
        super(parentShell);
		selcetedRosDistro = rosDistro;
		selcetedRosVersion = rosVersion;
    }
    
    @Override
    public void create() {
        super.create();
        setTitle("This is my first custom dialog");
        setMessage("This is a TitleAreaDialog", IMessageProvider.INFORMATION);
    }

    @Override
    protected Control createDialogArea(Composite parent) {
        Composite area = (Composite) super.createDialogArea(parent);
        Composite container = new Composite(area, SWT.NONE);
        container.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true));
        GridLayout layout = new GridLayout(2, false);
        container.setLayout(layout);
				
        return area;
    }
    
	protected void setRosDomainID(Composite container, int mixColum) {
		if (selcetedRosVersion == 1) {
			Label lbtBridgeName = new Label(container, SWT.NONE);
			lbtBridgeName.setLayoutData(new GridData(GridData.HORIZONTAL_ALIGN_BEGINNING, 
					SWT.CENTER, true, false, mixColum, 1));
	        lbtBridgeName.setText(String.format("Selected ROS Distro is %s", selcetedRosDistro));
		} else if (selcetedRosVersion == 2) {
			Label lbtBridgeName = new Label(container, SWT.NONE);
			lbtBridgeName.setLayoutData(new GridData(GridData.HORIZONTAL_ALIGN_BEGINNING, 
					SWT.CENTER, true, false, 1, 1));
	        lbtBridgeName.setText(String.format("Selected ROS Distro is %s", selcetedRosDistro));
	        Label lbtBridgeName1 = new Label(container, SWT.NONE);
	        lbtBridgeName1.setText("Set ROS Domain ID:");
			lbtBridgeName1.setLayoutData(new GridData(GridData.HORIZONTAL_ALIGN_BEGINNING, 
					SWT.CENTER, true, false, 1, 1));

	        rosDomainIDText = new Text(container, SWT.BORDER);
	        rosDomainIDText.setLayoutData(new GridData(GridData.HORIZONTAL_ALIGN_BEGINNING, 
	        											SWT.CENTER, true, false, mixColum -2, 1));
	        
	        ModifyListener listener = new ModifyListener() {

				@Override
				public void modifyText(ModifyEvent event) {
					try {
						Integer.valueOf(rosDomainIDText.getText());
						}
					catch (NumberFormatException e) {
						String value = "ROS Domain ID must be Number";
						  MessageDialog error_dialog = new MessageDialog(container.getShell(), "ERROR", null,
								  	value, MessageDialog.ERROR, new String[] { "Cancel" }, 0);
						  error_dialog.open();
					}
				}
        	};
        	rosDomainIDText.addModifyListener(listener);
        }
	}

    // choose device port
    public void chooseDevicePorts(Composite container, 
    	RosSystem system,
    	int mixColum
    ) {
    	EList<ComponentInterface> roscomponents = new BasicEList<ComponentInterface>();
    	EList<ComponentStack> stacks = system.getComponentStack();
    	String componetName = system.getName();
    	if (stacks.size() == 0) {
			  roscomponents = system.getRosComponent();
			  listParamFromComponent(roscomponents, componetName, container, mixColum);

		  }else {
			  for (ComponentStack stack: stacks) {
				  componetName = stack.getName();
				  roscomponents = stack.getRosComponent();
				  listParamFromComponent(roscomponents, componetName, container, mixColum);
			  }
		  }

	}

	private void listParamFromComponent(EList<ComponentInterface> roscomponents, 
		String componetName, 
		Composite container,
		int mixColum
	) {
		Label lbtRosDistroCombo= new Label(container, SWT.NONE);
		lbtRosDistroCombo.setText(String.format("%s: Select parameters for setting ports", componetName));
		lbtRosDistroCombo.setLayoutData(new GridData(SWT.LEAD, SWT.CENTER, false, false, 1, 1));
		Combo paramCombo = new Combo(container, SWT.READ_ONLY | SWT.BORDER);
		paramCombo.setLayoutData(new GridData(SWT.LEAD, SWT.CENTER, false, false, mixColum -1, 1));

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
												SWT.FILL, true, false, mixColum, 1));
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

    // save content of the Text fields because they get disposed
    // as soon as the Dialog closes
    private void saveInput() {
        try {
        	String domaintxt = rosDomainIDText.getText();
            if (domaintxt != null && !domaintxt.trim().isEmpty())
            	rosDomainID = Integer.valueOf(domaintxt);
        }catch (NullPointerException e) {
			// TODO: handle exception
		}
    }
    
    @Override
    protected void okPressed() {
        saveInput();
        super.okPressed();
    }
    
	public Integer getRosDomainID() {
		return rosDomainID;
	}
	
	public Map<RosParameter, String> getPortMap() {
		return param_portvalue_map;
	}
	
}