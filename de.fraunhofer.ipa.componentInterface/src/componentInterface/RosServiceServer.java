/**
 */
package componentInterface;

import org.eclipse.emf.ecore.EObject;

import ros.Namespace;
import ros.ServiceServer;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ros Service Server</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link componentInterface.RosServiceServer#getSrvRef <em>Srv Ref</em>}</li>
 *   <li>{@link componentInterface.RosServiceServer#getServiceName <em>Service Name</em>}</li>
 *   <li>{@link componentInterface.RosServiceServer#getNameSpace <em>Name Space</em>}</li>
 * </ul>
 *
 * @see componentInterface.ComponentInterfacePackage#getRosServiceServer()
 * @model
 * @generated
 */
public interface RosServiceServer extends EObject {
	/**
	 * Returns the value of the '<em><b>Srv Ref</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Srv Ref</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Srv Ref</em>' reference.
	 * @see #setSrvRef(ServiceServer)
	 * @see componentInterface.ComponentInterfacePackage#getRosServiceServer_SrvRef()
	 * @model
	 * @generated
	 */
	ServiceServer getSrvRef();

	/**
	 * Sets the value of the '{@link componentInterface.RosServiceServer#getSrvRef <em>Srv Ref</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Srv Ref</em>' reference.
	 * @see #getSrvRef()
	 * @generated
	 */
	void setSrvRef(ServiceServer value);

	/**
	 * Returns the value of the '<em><b>Service Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Service Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Service Name</em>' attribute.
	 * @see #setServiceName(String)
	 * @see componentInterface.ComponentInterfacePackage#getRosServiceServer_ServiceName()
	 * @model
	 * @generated
	 */
	String getServiceName();

	/**
	 * Sets the value of the '{@link componentInterface.RosServiceServer#getServiceName <em>Service Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Service Name</em>' attribute.
	 * @see #getServiceName()
	 * @generated
	 */
	void setServiceName(String value);

	/**
	 * Returns the value of the '<em><b>Name Space</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name Space</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name Space</em>' reference.
	 * @see #setNameSpace(Namespace)
	 * @see componentInterface.ComponentInterfacePackage#getRosServiceServer_NameSpace()
	 * @model
	 * @generated
	 */
	Namespace getNameSpace();

	/**
	 * Sets the value of the '{@link componentInterface.RosServiceServer#getNameSpace <em>Name Space</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name Space</em>' reference.
	 * @see #getNameSpace()
	 * @generated
	 */
	void setNameSpace(Namespace value);

} // RosServiceServer
