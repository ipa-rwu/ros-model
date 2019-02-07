/**
 */
package componentInterface.presentation;


import java.io.ByteArrayInputStream;
import java.io.FileReader;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.MissingResourceException;
import java.util.StringTokenizer;
import java.util.Scanner;

import org.eclipse.core.resources.IContainer;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.IWorkspaceRoot;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.Path;
import org.eclipse.emf.common.CommonPlugin;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.XMLResource;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.edit.ui.provider.ExtendedImageRegistry;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.jface.wizard.Wizard;
import org.eclipse.jface.wizard.WizardPage;
import org.eclipse.jface.wizard.WizardSelectionPage;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.ModifyListener;
import org.eclipse.swt.events.ModifyEvent;
import org.eclipse.swt.events.KeyEvent;
import org.eclipse.swt.events.KeyListener;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.events.SelectionListener;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Combo;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.FileDialog;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Text;
import org.eclipse.ui.INewWizard;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.IWorkbenchPart;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.actions.WorkspaceModifyOperation;
import org.eclipse.ui.dialogs.WizardNewFileCreationPage;
import org.eclipse.ui.part.FileEditorInput;
import org.eclipse.ui.part.ISetSelectionTarget;

import componentInterface.ComponentInterface;
import componentInterface.ComponentInterfaceFactory;
import componentInterface.ComponentInterfacePackage;
import componentInterface.RosPublisher;
import componentInterface.RosServiceClient;
import componentInterface.RosServiceServer;
import componentInterface.RosSubscriber;
import componentInterface.impl.ComponentInterfaceImpl;
import componentInterface.impl.RosPublisherImpl;
import componentInterface.impl.RosServiceClientImpl;
import componentInterface.impl.RosServiceServerImpl;
import componentInterface.impl.RosSubscriberImpl;
import componentInterface.provider.ComponentInterfaceEditPlugin;
import ros.Artifact;
import ros.Node;
import ros.Package;
import ros.PackageSet;
import ros.Publisher;
import ros.ServiceClient;
import ros.ServiceServer;
import ros.Subscriber;

/**
 * This is a simple wizard for creating a new model file.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class ComponentInterfaceModelWizard extends Wizard implements INewWizard {
	/**
	 * The supported extensions for created files.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<String> FILE_EXTENSIONS =
		Collections.unmodifiableList(Arrays.asList(ComponentInterfaceEditorPlugin.INSTANCE.getString("_UI_ComponentInterfaceEditorFilenameExtensions").split("\\s*,\\s*")));

	/**
	 * A formatted list of supported file extensions, suitable for display.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String FORMATTED_FILE_EXTENSIONS =
		ComponentInterfaceEditorPlugin.INSTANCE.getString("_UI_ComponentInterfaceEditorFilenameExtensions").replaceAll("\\s*,\\s*", ", ");

	/**
	 * This caches an instance of the model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ComponentInterfacePackage componentInterfacePackage = ComponentInterfacePackage.eINSTANCE;

	/**
	 * This caches an instance of the model factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ComponentInterfaceFactory componentInterfaceFactory = componentInterfacePackage.getComponentInterfaceFactory();

	/**
	 * This is the file creation page.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ComponentInterfaceModelWizardNewFileCreationPage newFileCreationPage;
	/**
	 * This is the initial object creation page.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ComponentInterfaceModelWizardInitialObjectCreationPage initialObjectCreationPage;

	protected SelectinputFile getInputFileCreationPage;

	/**
	 * This is the initial object creation page.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	protected ComponentInterfaceModelWizardNamNSCreationPage getNameandNamespaceCreationPage;

	/**
	 * Remember the selection during initialization for populating the default container.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IStructuredSelection selection;

	/**
	 * Remember the workbench during initialization.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IWorkbench workbench;

	/**
	 * Caches the names of the types that can be created as the root object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected List<String> initialObjectNames;

	public FileDialog fDialog;
	public IProject project;


	public IFile modelFile;
	/**
	 * This just records the information.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void init(IWorkbench workbench, IStructuredSelection selection) {
		this.workbench = workbench;
		this.selection = selection;
		setWindowTitle(ComponentInterfaceEditorPlugin.INSTANCE.getString("_UI_Wizard_label"));
		setDefaultPageImageDescriptor(ExtendedImageRegistry.INSTANCE.getImageDescriptor(ComponentInterfaceEditorPlugin.INSTANCE.getImage("full/wizban/NewComponentInterface")));

	}

	/**
	 * Returns the names of the types that can be created as the root object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Collection<String> getInitialObjectNames() {
		if (initialObjectNames == null) {
			initialObjectNames = new ArrayList<String>();
			for (EClassifier eClassifier : componentInterfacePackage.getEClassifiers()) {
				if (eClassifier instanceof EClass) {
					EClass eClass = (EClass)eClassifier;
					if (!eClass.isAbstract()) {
						initialObjectNames.add(eClass.getName());
					}
				}
			}
			Collections.sort(initialObjectNames, CommonPlugin.INSTANCE.getComparator());
		}
		return initialObjectNames;
	}


	/**
	 * Create a new model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EObject createInitialModel() {
		System.out.println((EClass)componentInterfacePackage.getEClassifiers());
		EClass eClass = (EClass)componentInterfacePackage.getEClassifier(initialObjectCreationPage.getInitialObjectName());
		
		EObject rootObject = componentInterfaceFactory.create(eClass);
		
		return rootObject;
	}

	/**
	 * Do the work after everything is specified.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public boolean performFinish() {
		try {
			// Remember the file.
			//
			modelFile = getModelFile();
			final String modelName = newFileCreationPage.getFileName().replace(".componentinterface", "");
			final String ComponentName = getNameandNamespaceCreationPage.getComponentInterfaceName();
			final String ComponentNameSpace = getNameandNamespaceCreationPage.getComponentInterfaceNameSpace();
			final String Inputpath = getInputFileCreationPage.getPath();
			//TODO this only works if the selected file is in the same project as the new created file
			String RelativePath = Inputpath.replace(project.getLocation().toString(), project.getName());
			ResourceSet rs = new ResourceSetImpl();
			Resource resource = rs.getResource(URI.createPlatformResourceURI(RelativePath,true),true);			
			PackageSet packageSet_model = (PackageSet) resource.getContents().get(0);
			EList<Package> package_model= (EList<Package>) packageSet_model.getPackage();
			EList<Artifact> artifact = (EList<Artifact>) package_model.get(0).getArtifact();
			Node rosnode = (Node) artifact.get(0).getNode();
			
			EList <Publisher> pubs = (EList<Publisher>) rosnode.getPublisher();
			EList <Subscriber> subs = (EList<Subscriber>) rosnode.getSubscriber();
			EList <ServiceClient> scls = (EList<ServiceClient>) rosnode.getServiceclient();
			EList <ServiceServer> ssrs = (EList<ServiceServer>) rosnode.getServiceserver();


			// Do the work within an operation.
			//
			WorkspaceModifyOperation operation =
				new WorkspaceModifyOperation() {
					@Override
					protected void execute(IProgressMonitor progressMonitor) {
						try {
							ResourceSet rs_output = new ResourceSetImpl();
							URI fileURI = URI.createPlatformResourceURI(modelFile.getFullPath().toString(), true);
							Resource resource_output = rs_output.createResource(fileURI);
							ComponentInterface component = new ComponentInterfaceImpl();
							component.setName(ComponentName);
							component.setNameSpace(ComponentNameSpace);

							String NameSpaceInterfaces = "";
							if (!(ComponentNameSpace.length()==0))
								NameSpaceInterfaces = ComponentNameSpace + "/";
							for (Publisher pub:pubs) {
								RosPublisher rospub = new RosPublisherImpl();
								rospub.setName(NameSpaceInterfaces+pub.getName());
								rospub.setNs(ComponentNameSpace);
								rospub.setPublisher(pub);
								component.getRospublisher().add(rospub);
							}
							for (Subscriber sub:subs) {
								RosSubscriber rossub = new RosSubscriberImpl();
								rossub.setName(NameSpaceInterfaces+sub.getName());
								rossub.setNs(ComponentNameSpace);
								rossub.setSubscriber(sub);
								component.getRossubscriber().add(rossub);
							}
							for (ServiceClient scl:scls) {
								RosServiceClient rosscl = new RosServiceClientImpl();
								rosscl.setName(NameSpaceInterfaces+scl.getName());
								rosscl.setNs(ComponentNameSpace);
								rosscl.setSrvclient(scl);
								component.getRosserviceclient().add(rosscl);
							}
							for (ServiceServer ssr:ssrs) {
								RosServiceServer rosssr = new RosServiceServerImpl();
								rosssr.setName(NameSpaceInterfaces+ssr.getName());
								rosssr.setNs(ComponentNameSpace);
								rosssr.setSrvserver(ssr);
								component.getRosserviceserver().add(rosssr);
							}
							// Save the contents of the resource to the file system.
							//
							EObject rootObject = (EClass)componentInterfacePackage.getEClassifiers().get(0);
							resource_output.getContents().add(rootObject);
							resource_output.getContents().add(component);

						}
						catch (Exception exception) {
							ComponentInterfaceEditorPlugin.INSTANCE.log(exception);
						}
						finally {
							progressMonitor.done();
						}
					}
				};

			getContainer().run(false, false, operation);

			// Select the new file resource in the current view.
			//
			IWorkbenchWindow workbenchWindow = workbench.getActiveWorkbenchWindow();
			IWorkbenchPage page = workbenchWindow.getActivePage();
			final IWorkbenchPart activePart = page.getActivePart();
			if (activePart instanceof ISetSelectionTarget) {
				final ISelection targetSelection = new StructuredSelection(modelFile);
				getShell().getDisplay().asyncExec
					(new Runnable() {
						 public void run() {
							 ((ISetSelectionTarget)activePart).selectReveal(targetSelection);
						 }
					 });
			}

			// Open an editor on the new file.
			//
			
			try {
				page.openEditor(new FileEditorInput(modelFile), "componentInterface.presentation.ComponentInterfaceEditorID");
						//workbench.getEditorRegistry().getDefaultEditor(modelFile.getFullPath().toString()).getId());
			} catch (PartInitException exception) {
				MessageDialog.openError(workbenchWindow.getShell(),
						ComponentInterfaceEditorPlugin.INSTANCE.getString("_UI_OpenEditorError_label"), exception.getMessage());
				return false;
			}
			
			//LoadResourceAction loadResourceAction = new LoadResourceAction();
			//loadResourceAction.setActiveWorkbenchPart(activePart);
			//loadResourceAction.setActiveEditor(page.getActiveEditor());
			//loadResourceAction.run();
						
			return true;
		}
		catch (Exception exception) {
			ComponentInterfaceEditorPlugin.INSTANCE.log(exception);
			return false;
		}
	}


	/**
	 * This is the one page of the wizard.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public class ComponentInterfaceModelWizardNewFileCreationPage extends WizardNewFileCreationPage {
		/**
		 * Pass in the selection.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public ComponentInterfaceModelWizardNewFileCreationPage(String pageId, IStructuredSelection selection) {
			super(pageId, selection);
		}

		/**
		 * The framework calls this to see if the file is correct.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		@Override
		protected boolean validatePage() {
			if (super.validatePage()) {
				String extension = new Path(getFileName()).getFileExtension();
				if (extension == null || !FILE_EXTENSIONS.contains(extension)) {
					String key = FILE_EXTENSIONS.size() > 1 ? "_WARN_FilenameExtensions" : "_WARN_FilenameExtension";
					setErrorMessage(ComponentInterfaceEditorPlugin.INSTANCE.getString(key, new Object [] { FORMATTED_FILE_EXTENSIONS }));
					return false;
				}
				return true;
			}
			return false;
		}

		/**
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public IFile getModelFile() {
			return ResourcesPlugin.getWorkspace().getRoot().getFile(getContainerFullPath().append(getFileName()));
		}
	}



	/**
	 * This is the page where the type of object to create is selected.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public class ComponentInterfaceModelWizardInitialObjectCreationPage extends WizardPage {
		/**
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		protected Combo initialObjectField;

		/**
		 * @generated
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 */
		protected List<String> encodings;

		/**
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		protected Combo encodingField;

		/**
		 * Pass in the selection.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public ComponentInterfaceModelWizardInitialObjectCreationPage(String pageId) {
			super(pageId);
		}

		/**
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public void createControl(Composite parent) {
			Composite composite = new Composite(parent, SWT.NONE); {
				GridLayout layout = new GridLayout();
				layout.numColumns = 1;
				layout.verticalSpacing = 12;
				composite.setLayout(layout);

				GridData data = new GridData();
				data.verticalAlignment = GridData.FILL;
				data.grabExcessVerticalSpace = true;
				data.horizontalAlignment = GridData.FILL;
				composite.setLayoutData(data);
			}

			Label containerLabel = new Label(composite, SWT.LEFT);
			{
				containerLabel.setText(ComponentInterfaceEditorPlugin.INSTANCE.getString("_UI_ModelObject"));

				GridData data = new GridData();
				data.horizontalAlignment = GridData.FILL;
				containerLabel.setLayoutData(data);
			}

			initialObjectField = new Combo(composite, SWT.BORDER);
			{
				GridData data = new GridData();
				data.horizontalAlignment = GridData.FILL;
				data.grabExcessHorizontalSpace = true;
				initialObjectField.setLayoutData(data);
			}

			for (String objectName : getInitialObjectNames()) {
				initialObjectField.add(getLabel(objectName));
			}

			if (initialObjectField.getItemCount() == 1) {
				initialObjectField.select(0);
			}
			initialObjectField.addModifyListener(validator);

			Label encodingLabel = new Label(composite, SWT.LEFT);
			{
				encodingLabel.setText(ComponentInterfaceEditorPlugin.INSTANCE.getString("_UI_XMLEncoding"));

				GridData data = new GridData();
				data.horizontalAlignment = GridData.FILL;
				encodingLabel.setLayoutData(data);
			}
			encodingField = new Combo(composite, SWT.BORDER);
			{
				GridData data = new GridData();
				data.horizontalAlignment = GridData.FILL;
				data.grabExcessHorizontalSpace = true;
				encodingField.setLayoutData(data);
			}

			for (String encoding : getEncodings()) {
				encodingField.add(encoding);
			}

			encodingField.select(0);
			encodingField.addModifyListener(validator);

			setPageComplete(validatePage());
			setControl(composite);
		}

		/**
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		protected ModifyListener validator =
			new ModifyListener() {
				public void modifyText(ModifyEvent e) {
					setPageComplete(validatePage());
				}
			};

		/**
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		protected boolean validatePage() {
			return getInitialObjectName() != null && getEncodings().contains(encodingField.getText());
		}

		/**
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		@Override
		public void setVisible(boolean visible) {
			super.setVisible(visible);
			if (visible) {
				if (initialObjectField.getItemCount() == 1) {
					initialObjectField.clearSelection();
					encodingField.setFocus();
				}
				else {
					encodingField.clearSelection();
					initialObjectField.setFocus();
				}
			}
		}

		/**
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public String getInitialObjectName() {
			String label = initialObjectField.getText();

			for (String name : getInitialObjectNames()) {
				if (getLabel(name).equals(label)) {
					return name;
				}
			}
			return null;
		}

		/**
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public String getEncoding() {
			return encodingField.getText();
		}

		/**
		 * Returns the label for the specified type name.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		protected String getLabel(String typeName) {
			try {
				return ComponentInterfaceEditPlugin.INSTANCE.getString("_UI_" + typeName + "_type");
			}
			catch(MissingResourceException mre) {
				ComponentInterfaceEditorPlugin.INSTANCE.log(mre);
			}
			return typeName;
		}

		/**
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		protected Collection<String> getEncodings() {
			if (encodings == null) {
				encodings = new ArrayList<String>();
				for (StringTokenizer stringTokenizer = new StringTokenizer(ComponentInterfaceEditorPlugin.INSTANCE.getString("_UI_XMLEncodingChoices")); stringTokenizer.hasMoreTokens(); ) {
					encodings.add(stringTokenizer.nextToken());
				}
			}
			return encodings;
		}
	}



	public class ComponentInterfaceModelWizardNamNSCreationPage extends WizardPage {
	    private Text CIName;
	    private Text CINameSpace;
	    private Composite container;

		public ComponentInterfaceModelWizardNamNSCreationPage(String pageId) {
			super(pageId);
		}
	
	    @Override
	    public void createControl(Composite parent) {
	        container = new Composite(parent, SWT.NONE);
	        GridLayout layout = new GridLayout(2, false);
	        container.setLayout(layout);
	        layout.numColumns = 2;
	        Label label1 = new Label(container, SWT.NONE);
	        label1.setText("ComponentInterface name");
	        CIName = new Text(container, SWT.BORDER | SWT.SINGLE);
	        CIName.setText("");
	        CIName.addKeyListener(new KeyListener() {
	            public void keyPressed(KeyEvent e) {
	            }
	            public void keyReleased(KeyEvent e) {
	                if (!CIName.getText().isEmpty()) {
	                    setPageComplete(true);
	                }
	            }
	        });
	        Label label2 = new Label(container, SWT.NONE);
	        label2.setText("ComponentInterface namespace");
	        CINameSpace = new Text(container, SWT.BORDER | SWT.SINGLE);
	        CINameSpace.setText("");
	        CINameSpace.addKeyListener(new KeyListener() {
	            public void keyPressed(KeyEvent e) {
	            }
	            public void keyReleased(KeyEvent e) {
	                if (!CINameSpace.getText().isEmpty()) {
	                    setPageComplete(true);
	                }
	            }

	        });

	        GridData gd = new GridData(GridData.FILL_HORIZONTAL);
			gd.grabExcessHorizontalSpace = true;
			gd.horizontalAlignment = GridData.FILL;
	        CIName.setLayoutData(gd);
	        CINameSpace.setLayoutData(gd);
	        
	        // required to avoid an error in the system
	        setControl(container);
	        setPageComplete(false);
	    }

	    public String getComponentInterfaceName() {
	        return CIName.getText();
	    }
	    
	    public String getComponentInterfaceNameSpace() {
	        return CINameSpace.getText();
	    }

	}
	

	public class SelectinputFile extends WizardSelectionPage{

	    private Composite container;
	    private Text locationPathField;
		private Button browseButton;
		private String path;

		protected SelectinputFile(String pageId) {
			super(pageId);
		}

		@Override
		public void createControl(Composite parent) {
	        container = new Composite(parent, SWT.NONE);

			GridLayout layout = new GridLayout(2, false);
			container.setLayout(layout);
			
			locationPathField = new Text(container, SWT.BORDER | SWT.SINGLE);
			GridData gd = new GridData (GridData.FILL_HORIZONTAL);
			gd.grabExcessHorizontalSpace = true;
			gd.horizontalAlignment = GridData.FILL;
			locationPathField.setLayoutData(gd);
			browseButton = new Button(container, SWT.PUSH);
			browseButton.setText("Browse...");
			browseButton.addSelectionListener(new SelectionListener() {
				public void widgetDefaultSelected(SelectionEvent e) {
					
				}
	 
				public void widgetSelected(SelectionEvent e) {
					//TODO use a resourc dialog
					FileDialog dlg = new FileDialog(getShell(),  SWT.OPEN  );
					dlg.setText("Open");
					dlg.setFilterExtensions(new String[] { "*.ros" } );
					IWorkspaceRoot ws = ResourcesPlugin.getWorkspace().getRoot();
					modelFile = getModelFile();
					project = modelFile.getProject();
					String Workspace_path = ws.getProject(project.getName()).getLocation().toString();
					if (ws.getLocation().toString().length() > 10) {
						dlg.setFilterPath(ws.getLocation().toString());
					} else if (Workspace_path.toString().length() > 20){
						dlg.setFilterPath("../"+Workspace_path);
					}
					path = dlg.open();
					if (path == null) return;
					locationPathField.setText(path);
				}

			});
	        setControl(container);
	        setPageComplete(true);
	        

			}

		public String getPath() {
			return path;
		}

}


	/**
	 * The framework calls this to create the contents of the wizard.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
		@Override
	public void addPages() {
		// Create a page, set the title, and the initial model file name.
		//
		newFileCreationPage = new ComponentInterfaceModelWizardNewFileCreationPage("Whatever", selection);
		newFileCreationPage.setTitle(ComponentInterfaceEditorPlugin.INSTANCE.getString("_UI_ComponentInterfaceModelWizard_label"));
		newFileCreationPage.setDescription(ComponentInterfaceEditorPlugin.INSTANCE.getString("_UI_ComponentInterfaceModelWizard_description"));
		newFileCreationPage.setFileName(ComponentInterfaceEditorPlugin.INSTANCE.getString("_UI_ComponentInterfaceEditorFilenameDefaultBase") + "." + FILE_EXTENSIONS.get(0));
		addPage(newFileCreationPage);
		// Try and get the resource selection to determine a current directory for the file dialog.
		//
		if (selection != null && !selection.isEmpty()) {
			// Get the resource...
			//
			Object selectedElement = selection.iterator().next();
			if (selectedElement instanceof IResource) {
				// Get the resource parent, if its a file.
				//
				IResource selectedResource = (IResource)selectedElement;
				if (selectedResource.getType() == IResource.FILE) {
					selectedResource = selectedResource.getParent();
				}

				// This gives us a directory...
				//
				if (selectedResource instanceof IFolder || selectedResource instanceof IProject) {
					// Set this for the container.
					//
					newFileCreationPage.setContainerFullPath(selectedResource.getFullPath());

					// Make up a unique new name here.
					//
					String defaultModelBaseFilename = ComponentInterfaceEditorPlugin.INSTANCE.getString("_UI_ComponentInterfaceEditorFilenameDefaultBase");
					String defaultModelFilenameExtension = FILE_EXTENSIONS.get(0);
					String modelFilename = defaultModelBaseFilename + "." + defaultModelFilenameExtension;
					for (int i = 1; ((IContainer)selectedResource).findMember(modelFilename) != null; ++i) {
						modelFilename = defaultModelBaseFilename + i + "." + defaultModelFilenameExtension;
					}
					newFileCreationPage.setFileName(modelFilename);
				}
			}
		}
		
		getNameandNamespaceCreationPage = new ComponentInterfaceModelWizardNamNSCreationPage("Whatever3");
		getNameandNamespaceCreationPage.setTitle("Set Name and Namespace to the ComponentInterface");
		getNameandNamespaceCreationPage.setDescription("Set Name and Namespace to the ComponentInterface");
		addPage(getNameandNamespaceCreationPage);

		
		getInputFileCreationPage = new SelectinputFile("Whatever4");
		getInputFileCreationPage.setTitle("Select ROS model input");
		getInputFileCreationPage.setDescription("Select ROS model input");
		addPage(getInputFileCreationPage);
	}

	/**
	 * Get the file from the page.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IFile getModelFile() {
		return newFileCreationPage.getModelFile();
	}

}