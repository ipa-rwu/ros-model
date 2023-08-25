/**
 */
package system;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Reference System</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link system.ReferenceSystem#getRef <em>Ref</em>}</li>
 * </ul>
 *
 * @see system.RossystemPackage#getReferenceSystem()
 * @model
 * @generated
 */
public interface ReferenceSystem extends Component {
    /**
     * Returns the value of the '<em><b>Ref</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Ref</em>' reference.
     * @see #setRef(system.System)
     * @see system.RossystemPackage#getReferenceSystem_Ref()
     * @model required="true"
     * @generated
     */
    system.System getRef();

    /**
     * Sets the value of the '{@link system.ReferenceSystem#getRef <em>Ref</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Ref</em>' reference.
     * @see #getRef()
     * @generated
     */
    void setRef(system.System value);

} // ReferenceSystem
