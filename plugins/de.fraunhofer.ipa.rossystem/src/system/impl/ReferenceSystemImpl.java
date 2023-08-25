/**
 */
package system.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import system.ReferenceSystem;
import system.RossystemPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Reference System</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link system.impl.ReferenceSystemImpl#getRef <em>Ref</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ReferenceSystemImpl extends ComponentImpl implements ReferenceSystem {
    /**
     * The cached value of the '{@link #getRef() <em>Ref</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getRef()
     * @generated
     * @ordered
     */
    protected system.System ref;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected ReferenceSystemImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return RossystemPackage.Literals.REFERENCE_SYSTEM;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public system.System getRef() {
        if (ref != null && ref.eIsProxy()) {
            InternalEObject oldRef = (InternalEObject)ref;
            ref = (system.System)eResolveProxy(oldRef);
            if (ref != oldRef) {
                if (eNotificationRequired())
                    eNotify(new ENotificationImpl(this, Notification.RESOLVE, RossystemPackage.REFERENCE_SYSTEM__REF, oldRef, ref));
            }
        }
        return ref;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public system.System basicGetRef() {
        return ref;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setRef(system.System newRef) {
        system.System oldRef = ref;
        ref = newRef;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, RossystemPackage.REFERENCE_SYSTEM__REF, oldRef, ref));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object eGet(int featureID, boolean resolve, boolean coreType) {
        switch (featureID) {
            case RossystemPackage.REFERENCE_SYSTEM__REF:
                if (resolve) return getRef();
                return basicGetRef();
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
            case RossystemPackage.REFERENCE_SYSTEM__REF:
                setRef((system.System)newValue);
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
            case RossystemPackage.REFERENCE_SYSTEM__REF:
                setRef((system.System)null);
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
            case RossystemPackage.REFERENCE_SYSTEM__REF:
                return ref != null;
        }
        return super.eIsSet(featureID);
    }

} //ReferenceSystemImpl
