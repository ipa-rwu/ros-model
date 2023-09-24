/**
 */
package system.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import system.LaunchFile;
import system.RossystemPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Launch File</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link system.impl.LaunchFileImpl#getName <em>Name</em>}</li>
 *   <li>{@link system.impl.LaunchFileImpl#getFromGitRepo <em>From Git Repo</em>}</li>
 * </ul>
 *
 * @generated
 */
public class LaunchFileImpl extends MinimalEObjectImpl.Container implements LaunchFile {
    /**
     * The default value of the '{@link #getName() <em>Name</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getName()
     * @generated
     * @ordered
     */
    protected static final String NAME_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getName()
     * @generated
     * @ordered
     */
    protected String name = NAME_EDEFAULT;

    /**
     * The default value of the '{@link #getFromGitRepo() <em>From Git Repo</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getFromGitRepo()
     * @generated
     * @ordered
     */
    protected static final String FROM_GIT_REPO_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getFromGitRepo() <em>From Git Repo</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getFromGitRepo()
     * @generated
     * @ordered
     */
    protected String fromGitRepo = FROM_GIT_REPO_EDEFAULT;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected LaunchFileImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return RossystemPackage.Literals.LAUNCH_FILE;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String getName() {
        return name;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setName(String newName) {
        String oldName = name;
        name = newName;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, RossystemPackage.LAUNCH_FILE__NAME, oldName, name));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String getFromGitRepo() {
        return fromGitRepo;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setFromGitRepo(String newFromGitRepo) {
        String oldFromGitRepo = fromGitRepo;
        fromGitRepo = newFromGitRepo;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, RossystemPackage.LAUNCH_FILE__FROM_GIT_REPO, oldFromGitRepo, fromGitRepo));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object eGet(int featureID, boolean resolve, boolean coreType) {
        switch (featureID) {
            case RossystemPackage.LAUNCH_FILE__NAME:
                return getName();
            case RossystemPackage.LAUNCH_FILE__FROM_GIT_REPO:
                return getFromGitRepo();
        }
        return super.eGet(featureID, resolve, coreType);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void eSet(int featureID, Object newValue) {
        switch (featureID) {
            case RossystemPackage.LAUNCH_FILE__NAME:
                setName((String)newValue);
                return;
            case RossystemPackage.LAUNCH_FILE__FROM_GIT_REPO:
                setFromGitRepo((String)newValue);
                return;
        }
        super.eSet(featureID, newValue);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void eUnset(int featureID) {
        switch (featureID) {
            case RossystemPackage.LAUNCH_FILE__NAME:
                setName(NAME_EDEFAULT);
                return;
            case RossystemPackage.LAUNCH_FILE__FROM_GIT_REPO:
                setFromGitRepo(FROM_GIT_REPO_EDEFAULT);
                return;
        }
        super.eUnset(featureID);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean eIsSet(int featureID) {
        switch (featureID) {
            case RossystemPackage.LAUNCH_FILE__NAME:
                return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
            case RossystemPackage.LAUNCH_FILE__FROM_GIT_REPO:
                return FROM_GIT_REPO_EDEFAULT == null ? fromGitRepo != null : !FROM_GIT_REPO_EDEFAULT.equals(fromGitRepo);
        }
        return super.eIsSet(featureID);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String toString() {
        if (eIsProxy()) return super.toString();

        StringBuilder result = new StringBuilder(super.toString());
        result.append(" (name: ");
        result.append(name);
        result.append(", fromGitRepo: ");
        result.append(fromGitRepo);
        result.append(')');
        return result.toString();
    }

} //LaunchFileImpl
