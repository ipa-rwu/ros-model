/**
 */
package system;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Launch File</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link system.LaunchFile#getName <em>Name</em>}</li>
 *   <li>{@link system.LaunchFile#getFromGitRepo <em>From Git Repo</em>}</li>
 * </ul>
 *
 * @see system.RossystemPackage#getLaunchFile()
 * @model
 * @generated
 */
public interface LaunchFile extends EObject {
    /**
     * Returns the value of the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Name</em>' attribute.
     * @see #setName(String)
     * @see system.RossystemPackage#getLaunchFile_Name()
     * @model required="true"
     * @generated
     */
    String getName();

    /**
     * Sets the value of the '{@link system.LaunchFile#getName <em>Name</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Name</em>' attribute.
     * @see #getName()
     * @generated
     */
    void setName(String value);

    /**
     * Returns the value of the '<em><b>From Git Repo</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>From Git Repo</em>' attribute.
     * @see #setFromGitRepo(String)
     * @see system.RossystemPackage#getLaunchFile_FromGitRepo()
     * @model
     * @generated
     */
    String getFromGitRepo();

    /**
     * Sets the value of the '{@link system.LaunchFile#getFromGitRepo <em>From Git Repo</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>From Git Repo</em>' attribute.
     * @see #getFromGitRepo()
     * @generated
     */
    void setFromGitRepo(String value);

} // LaunchFile
