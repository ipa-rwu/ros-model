package de.fraunhofer.ipa.rossystem.deployment;

import org.eclipse.jface.dialogs.IMessageProvider;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Text;

import rossystem.RosSystem;

public class DockerComposeConfigDialog extends DelpoymentCommonConfigDialog {
	private static RosSystem rossystem;
	
	private Text bridgeNameText;
	private Text rosDomainIDText;
    private Button[] checkUseMacvlanBox = new Button[1];
    private Button[] setDploymentTypeBox = new Button[2];
    private Button[] checkConnectWebsBox = new Button[1];
    
    private Boolean ifUseMacvlan;
    private static int sizeDeploymentPlatform = DeploymentPlatform.values().length;
    private static int mixColum = sizeDeploymentPlatform +1;
    
	public DockerComposeConfigDialog(Shell parentShell, 
			ROSDistro rosDistro, 
			Integer rosVersion,
			RosSystem sys) {
		super(parentShell, rosDistro, rosVersion);
		rossystem = sys;
	}

    @Override
    public void create() {
        super.create();
        setTitle("Configure for Docker Compose");
        setMessage("Configuration for Docker Compose", IMessageProvider.INFORMATION);
    }

    @Override
    protected Control createDialogArea(Composite parent) {
        Composite area = (Composite) super.createDialogArea(parent);
        Composite container = new Composite(area, SWT.NONE);
        container.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true));
        GridLayout layout = new GridLayout(mixColum, false);
        container.setLayout(layout);
        
        setRosDomainID(container, mixColum);
        chooseDevicePorts(container, rossystem, mixColum);

        return area;
    }

    @Override
    protected boolean isResizable() {
        return true;
    }

    // save content of the Text fields because they get disposed
    // as soon as the Dialog closes
    private void saveInput() {
//        try {
//        	String domaintxt = rosDomainIDText.getText();
//            if (domaintxt != null && !domaintxt.trim().isEmpty())
//				Integer.valueOf(domaintxt);
//        }catch (NullPointerException e) {
//			// TODO: handle exception
//		}
    }

    @Override
    protected void okPressed() {
        saveInput();
        super.okPressed();
    }	
}
