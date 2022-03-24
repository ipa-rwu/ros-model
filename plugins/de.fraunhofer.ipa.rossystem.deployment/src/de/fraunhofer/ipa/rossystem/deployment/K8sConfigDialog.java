package de.fraunhofer.ipa.rossystem.deployment;

import org.eclipse.jface.dialogs.IMessageProvider;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.events.SelectionListener;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Text;

import rossystem.RosSystem;

public class K8sConfigDialog extends DelpoymentCommonConfigDialog {
	private static RosSystem rossystem;

	private Text bridgeNameText;
	private Button[] checkUseMacvlanBox = new Button[1];
    private Button[] setDploymentTypeBox = new Button[2];
    private Button[] checkConnectWebsBox = new Button[1];

    private String bridgeName;
    private Boolean ifConnectWeb;
    private Boolean ifUseMacvlan;
    private DeploymentType deploymentType;

	private static int sizeDeploymentPlatform = DeploymentPlatform.values().length;
    private static int mixColum = sizeDeploymentPlatform +1;

	public K8sConfigDialog(Shell parentShell,
			ROSDistro rosDistro,
			Integer rosVersion,
			RosSystem sys) {
		super(parentShell, rosDistro, rosVersion);
		rossystem = sys;
	}

    @Override
    public void create() {
        super.create();
        setTitle("Configure for K8s");
        setMessage("This is a TitleAreaDialog", IMessageProvider.INFORMATION);
    }

    @Override
    protected Control createDialogArea(Composite parent) {
        Composite area = (Composite) super.createDialogArea(parent);
        Composite container = new Composite(area, SWT.NONE);
        container.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true));
        GridLayout layout = new GridLayout(mixColum, false);
        container.setLayout(layout);

        setRosDomainID(container, mixColum);
        createUseMacvlan(container);
        createDeploymentType(container);
        createConnectWeb(container);
        chooseDevicePorts(container, rossystem, mixColum);

        return area;
    }



    private void createConnectWeb(Composite container) {
    	checkConnectWebsBox[0] = new Button(container, SWT.CHECK);
    	checkConnectWebsBox[0].setSelection(false);
    	checkConnectWebsBox[0].setText("Connect to Web Server");
    	checkConnectWebsBox[0].pack();
    	checkConnectWebsBox[0].setLayoutData(new GridData(SWT.FILL,
				SWT.FILL, true, false, mixColum, 1));

//        Label lbtBridgeName = new Label(container, SWT.NONE);
//        lbtBridgeName.setText("Bridge Interface Name:");
    }

    private void createUseMacvlan(Composite container) {
    	checkUseMacvlanBox[0] = new Button(container, SWT.CHECK);
    	checkUseMacvlanBox[0].setSelection(false);
    	checkUseMacvlanBox[0].setText("Use macvlan");
//    	checkUseMacvlanBox[0].setLocation(50,200);
    	checkUseMacvlanBox[0].pack();

        Label lbtBridgeName = new Label(container, SWT.NONE);
        lbtBridgeName.setText("Bridge Interface Name:");

        GridData databridgeName = new GridData();
        databridgeName.grabExcessHorizontalSpace = true;
        databridgeName.horizontalAlignment = GridData.HORIZONTAL_ALIGN_BEGINNING;

        bridgeNameText = new Text(container, SWT.BORDER);
        bridgeNameText.setLayoutData(databridgeName);
        bridgeNameText.setEnabled(false);

        checkUseMacvlanBox[0].addSelectionListener(new SelectionListener() {
            public void widgetSelected(SelectionEvent event) {
            	if (checkUseMacvlanBox[0].getSelection()) {
            		bridgeNameText.setEnabled(true);
            	}
            	else {
            		bridgeNameText.setEnabled(false);
            	}
                System.out.println("Open");
            }
            public void widgetDefaultSelected(SelectionEvent event)
            {
            }
      });
    }

    private void createDeploymentType(Composite container) {
        Label lbtLastName = new Label(container, SWT.NONE);
        lbtLastName.setText("Select Deployment Type");

        setDploymentTypeBox[0] = new Button(container, SWT.CHECK);
        setDploymentTypeBox[0].setSelection(true);
        setDploymentTypeBox[0].setText(String.format("Use %s", DeploymentType.Deployment.toString()));
        setDploymentTypeBox[0].pack();
        setDploymentTypeBox[0].setEnabled(true);

        setDploymentTypeBox[1] = new Button(container, SWT.CHECK);
        setDploymentTypeBox[1].setSelection(false);
        setDploymentTypeBox[1].setText(String.format("Use %s", DeploymentType.StatefulSet.toString()));
        setDploymentTypeBox[1].pack();
        setDploymentTypeBox[1].setEnabled(false);

        setDploymentTypeBox[0].addSelectionListener(new SelectionListener() {
            public void widgetSelected(SelectionEvent event) {
            	if (setDploymentTypeBox[0].getSelection()) {
            		setDploymentTypeBox[0].setEnabled(true);
            		setDploymentTypeBox[1].setEnabled(false);
            		setDploymentTypeBox[1].setSelection(false);
            	}
            	else {
            		setDploymentTypeBox[0].setEnabled(false);
            		setDploymentTypeBox[1].setEnabled(true);
            		setDploymentTypeBox[1].setSelection(true);
            		setDploymentTypeBox[0].setSelection(false);
            	}
                System.out.println("0");
            }
            public void widgetDefaultSelected(SelectionEvent event)
            {
            }
      });

        setDploymentTypeBox[1].addSelectionListener(new SelectionListener() {
            public void widgetSelected(SelectionEvent event) {
            	if (setDploymentTypeBox[1].getSelection()) {
            		setDploymentTypeBox[1].setEnabled(true);
            		setDploymentTypeBox[0].setEnabled(false);
            		setDploymentTypeBox[0].setSelection(false);
            	}
            	else {
            		setDploymentTypeBox[1].setEnabled(false);
            		setDploymentTypeBox[0].setEnabled(true);
            		setDploymentTypeBox[0].setSelection(true);
            		setDploymentTypeBox[1].setSelection(false);
            	}
                System.out.println("1");
            }
            public void widgetDefaultSelected(SelectionEvent event)
            {
            }
      });
    }

    @Override
    protected boolean isResizable() {
        return true;
    }

    // save content of the Text fields because they get disposed
    // as soon as the Dialog closes
    private void saveInput() {

        ifUseMacvlan = checkUseMacvlanBox[0].getSelection();
        if (ifUseMacvlan) {
        	bridgeName = bridgeNameText.getText();
        }
        else {
        	bridgeName = "";
        }

        ifConnectWeb = checkConnectWebsBox[0].getSelection();
        if (setDploymentTypeBox[0].getSelection()) {
        	deploymentType = DeploymentType.Deployment;
        }
        else {
        	deploymentType = DeploymentType.StatefulSet;
        }
    }

    @Override
    protected void okPressed() {
        saveInput();
        super.okPressed();
    }

    public String getBridgeName() {
    	return bridgeName;
    }

	public Boolean getIfMacVlan(){
		return ifUseMacvlan;
    }

	public Boolean getIfConnectWeb() {
		return ifConnectWeb;
	}

	public DeploymentType getDeploymentType() {
		return deploymentType;
	}
}
