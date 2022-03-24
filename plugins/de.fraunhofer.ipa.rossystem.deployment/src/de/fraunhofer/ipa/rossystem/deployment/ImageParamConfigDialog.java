package de.fraunhofer.ipa.rossystem.deployment;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

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

public class ImageParamConfigDialog extends TitleAreaDialog {
	private static RosSystem rossystem;
	private GenerationHandlerHelper generationHelper = new GenerationHandlerHelper();

	private Map<Integer, ComponentInterface> indexComponentMap=new HashMap<Integer, ComponentInterface>();

	private static int sizeDeploymentPlatform = DeploymentPlatform.values().length;
	private static int  mixColum = sizeDeploymentPlatform+1;
	private Button[] setDeloymentPlatformBox = new Button[sizeDeploymentPlatform];
	int sizeComponents = indexComponentMap.keySet().size();
    private Combo rosDistroCombo;

    private ROSDistro rosDistro;
    private Integer rosVersion;
	private int rosDomainID;
	private Map<RosParameter, String> param_portvalue_map;
	private ArrayList<DeploymentPlatform> seletPlatforms = new ArrayList<DeploymentPlatform>();
	private Text registryText;
	private Text imageVersionText;
	private String registryName;
	private String imageVersion;
	private Combo processorArchitectureCombo;
	private ProcessorArchitecture processorArchitecture;

	public ImageParamConfigDialog(Shell parentShell, RosSystem sys) {
		super(parentShell);
		rossystem = sys;
		sizeComponents = indexComponentMap.keySet().size();
		System.out.println(String.format("Size: %s", sizeComponents));
		indexComponentMap.forEach((key, value) -> System.out.println(key + ":" + value));
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
        GridLayout layout = new GridLayout(mixColum, false);
        container.setLayout(layout);

        chooseRosDistro(container);
        chooseProcessorArchitecture(container);
        createRegistry(container);
        createImageVersion(container);
        chooseDeploymentPlatform(container);
	    new Label(container, SWT.NONE);

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

	// choose Processor Architecture
	private void chooseProcessorArchitecture(Composite container) {
		Label lbtRosDistroCombo= new Label(container, SWT.NONE);
		lbtRosDistroCombo.setText("Select Processor Architecture:");
		processorArchitectureCombo = new Combo(container, SWT.READ_ONLY | SWT.BORDER);

		processorArchitectureCombo.setLayoutData(new GridData(GridData.BEGINNING, SWT.CENTER, false, false, sizeDeploymentPlatform, 1));

    	String [] choices = Stream.of(ProcessorArchitecture.values()).map(ProcessorArchitecture::name).toArray(String[]::new);
    	processorArchitectureCombo.setItems(choices);
    	processorArchitectureCombo.select(Arrays.asList(choices).indexOf(ProcessorArchitecture.X86.toString()));
    }

	// define registry
	private void createRegistry(Composite container) {
		Label lbtRosDistroCombo= new Label(container, SWT.NONE);
		lbtRosDistroCombo.setText("Registry: ");
		registryText = new Text(container, SWT.BORDER);
		registryText.setLayoutData(new GridData(GridData.BEGINNING,
        											SWT.CENTER, true, false, mixColum -1, 1));
		registryText.setEnabled(true);
	}

	// define image version
	private void createImageVersion(Composite container) {
		Label lbtRosDistroCombo= new Label(container, SWT.NONE);
		lbtRosDistroCombo.setText("Image Version (default: latest):");
		imageVersionText = new Text(container, SWT.BORDER);
		imageVersionText.setLayoutData(new GridData(GridData.BEGINNING,
        											SWT.CENTER, true, false, mixColum -1, 1));
		imageVersionText.setEnabled(true);
		imageVersionText.setMessage("latest");
	}

	private void chooseRosDistro(Composite container) {
		Label lbtRosDistroCombo= new Label(container, SWT.NONE);
		lbtRosDistroCombo.setText("Select ROS Distro:");
    	rosDistroCombo = new Combo(container, SWT.READ_ONLY | SWT.BORDER);

    	rosDistroCombo.setLayoutData(new GridData(GridData.BEGINNING, SWT.CENTER, false, false, mixColum -1, 1));

    	String [] choices = Stream.of(ROSDistro.values()).map(ROSDistro::name).toArray(String[]::new);
    	rosDistroCombo.setItems(choices);
    	rosDistroCombo.select(Arrays.asList(choices).indexOf(ROSDistro.foxy.toString()));  // Select "1" by default
    }


    @Override
    protected boolean isResizable() {
        return true;
    }

    // save content of the Text fields because they get disposed
    // as soon as the Dialog closes
    private void saveInput() {
    	rosDistro = ROSDistro.valueOf(rosDistroCombo.getText());
    	seletPlatforms = getPlatforms();
    	registryName = registryText.getText();
    	if (imageVersion != null && !imageVersion.trim().isEmpty()) {
        	imageVersion = imageVersionText.getText();
    	}
    	else {
    		imageVersion = "latest";
    	}
    	processorArchitecture = ProcessorArchitecture.valueOf(processorArchitectureCombo.getText());
    }

    private ArrayList<DeploymentPlatform> getPlatforms() {
    	ArrayList<DeploymentPlatform> _seletPlatforms = new ArrayList<DeploymentPlatform>();
    	for(int i = 0; i < sizeDeploymentPlatform; i++) {
    		if (setDeloymentPlatformBox[i].getSelection()) {
    			_seletPlatforms.add(DeploymentPlatform.values()[i]);
    		}

    	}
		return _seletPlatforms;
	}

	@Override
    protected void okPressed() {
        saveInput();
        super.okPressed();
    }

    public ROSDistro getRosDistro() {
    	return rosDistro;
    }

	public Integer getRosDomainID() {
		return rosDomainID;
	}

	public Integer getRosVersion(ROSDistro distro) {
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

	public ProcessorArchitecture getProcessorArchitecture() {
		return processorArchitecture;
	}
}
