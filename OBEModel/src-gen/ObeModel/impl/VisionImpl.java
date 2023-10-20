/**
 */
package ObeModel.impl;

import ObeModel.ObeModelPackage;
import ObeModel.Vision;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Vision</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ObeModel.impl.VisionImpl#getVisionStatement <em>Vision Statement</em>}</li>
 * </ul>
 *
 * @generated
 */
public class VisionImpl extends MinimalEObjectImpl.Container implements Vision {
	/**
	 * The default value of the '{@link #getVisionStatement() <em>Vision Statement</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVisionStatement()
	 * @generated
	 * @ordered
	 */
	protected static final String VISION_STATEMENT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getVisionStatement() <em>Vision Statement</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVisionStatement()
	 * @generated
	 * @ordered
	 */
	protected String visionStatement = VISION_STATEMENT_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected VisionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ObeModelPackage.Literals.VISION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getVisionStatement() {
		return visionStatement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVisionStatement(String newVisionStatement) {
		String oldVisionStatement = visionStatement;
		visionStatement = newVisionStatement;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ObeModelPackage.VISION__VISION_STATEMENT,
					oldVisionStatement, visionStatement));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case ObeModelPackage.VISION__VISION_STATEMENT:
			return getVisionStatement();
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
		case ObeModelPackage.VISION__VISION_STATEMENT:
			setVisionStatement((String) newValue);
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
		case ObeModelPackage.VISION__VISION_STATEMENT:
			setVisionStatement(VISION_STATEMENT_EDEFAULT);
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
		case ObeModelPackage.VISION__VISION_STATEMENT:
			return VISION_STATEMENT_EDEFAULT == null ? visionStatement != null
					: !VISION_STATEMENT_EDEFAULT.equals(visionStatement);
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
		if (eIsProxy())
			return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (VisionStatement: ");
		result.append(visionStatement);
		result.append(')');
		return result.toString();
	}

} //VisionImpl
