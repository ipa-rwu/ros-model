/**
 */
package rossystem;

import ros.Parameter;
import ros.ParameterValue;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ros Parameter</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link rossystem.RosParameter#getFrom <em>From</em>}</li>
 *   <li>{@link rossystem.RosParameter#getValue <em>Value</em>}</li>
 * </ul>
 *
 * @see rossystem.RossystemPackage#getRosParameter()
 * @model
 * @generated
 */
public interface RosParameter extends RosInterface {
	/**
	 * Returns the value of the '<em><b>From</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>From</em>' reference.
	 * @see #setFrom(Parameter)
	 * @see rossystem.RossystemPackage#getRosParameter_From()
	 * @model required="true"
	 * @generated
	 */
	Parameter getFrom();

	/**
	 * Sets the value of the '{@link rossystem.RosParameter#getFrom <em>From</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>From</em>' reference.
	 * @see #getFrom()
	 * @generated
	 */
	void setFrom(Parameter value);

	/**
	 * Returns the value of the '<em><b>Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' containment reference.
	 * @see #setValue(ParameterValue)
	 * @see rossystem.RossystemPackage#getRosParameter_Value()
	 * @model containment="true"
	 * @generated
	 */
	ParameterValue getValue();

	/**
	 * Sets the value of the '{@link rossystem.RosParameter#getValue <em>Value</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' containment reference.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(ParameterValue value);

} // RosParameter
