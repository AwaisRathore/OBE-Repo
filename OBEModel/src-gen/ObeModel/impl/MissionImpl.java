/**
 */
package ObeModel.impl;

import ObeModel.Assesment;
import ObeModel.Institute;
import ObeModel.Mission;
import ObeModel.ObeModelPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Mission</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ObeModel.impl.MissionImpl#getMissionStatement <em>Mission Statement</em>}</li>
 *   <li>{@link ObeModel.impl.MissionImpl#getInstitute <em>Institute</em>}</li>
 *   <li>{@link ObeModel.impl.MissionImpl#getAssesment <em>Assesment</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MissionImpl extends MinimalEObjectImpl.Container implements Mission {
	/**
	 * The default value of the '{@link #getMissionStatement() <em>Mission Statement</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMissionStatement()
	 * @generated
	 * @ordered
	 */
	protected static final String MISSION_STATEMENT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMissionStatement() <em>Mission Statement</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMissionStatement()
	 * @generated
	 * @ordered
	 */
	protected String missionStatement = MISSION_STATEMENT_EDEFAULT;

	/**
	 * The cached value of the '{@link #getInstitute() <em>Institute</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInstitute()
	 * @generated
	 * @ordered
	 */
	protected Institute institute;

	/**
	 * The cached value of the '{@link #getAssesment() <em>Assesment</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAssesment()
	 * @generated
	 * @ordered
	 */
	protected Assesment assesment;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MissionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ObeModelPackage.Literals.MISSION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getMissionStatement() {
		return missionStatement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMissionStatement(String newMissionStatement) {
		String oldMissionStatement = missionStatement;
		missionStatement = newMissionStatement;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ObeModelPackage.MISSION__MISSION_STATEMENT,
					oldMissionStatement, missionStatement));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Institute getInstitute() {
		if (institute != null && institute.eIsProxy()) {
			InternalEObject oldInstitute = (InternalEObject) institute;
			institute = (Institute) eResolveProxy(oldInstitute);
			if (institute != oldInstitute) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ObeModelPackage.MISSION__INSTITUTE,
							oldInstitute, institute));
			}
		}
		return institute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Institute basicGetInstitute() {
		return institute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetInstitute(Institute newInstitute, NotificationChain msgs) {
		Institute oldInstitute = institute;
		institute = newInstitute;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					ObeModelPackage.MISSION__INSTITUTE, oldInstitute, newInstitute);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInstitute(Institute newInstitute) {
		if (newInstitute != institute) {
			NotificationChain msgs = null;
			if (institute != null)
				msgs = ((InternalEObject) institute).eInverseRemove(this, ObeModelPackage.INSTITUTE__ASSOCIATEDMISSION,
						Institute.class, msgs);
			if (newInstitute != null)
				msgs = ((InternalEObject) newInstitute).eInverseAdd(this, ObeModelPackage.INSTITUTE__ASSOCIATEDMISSION,
						Institute.class, msgs);
			msgs = basicSetInstitute(newInstitute, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ObeModelPackage.MISSION__INSTITUTE, newInstitute,
					newInstitute));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Assesment getAssesment() {
		if (assesment != null && assesment.eIsProxy()) {
			InternalEObject oldAssesment = (InternalEObject) assesment;
			assesment = (Assesment) eResolveProxy(oldAssesment);
			if (assesment != oldAssesment) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ObeModelPackage.MISSION__ASSESMENT,
							oldAssesment, assesment));
			}
		}
		return assesment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Assesment basicGetAssesment() {
		return assesment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAssesment(Assesment newAssesment) {
		Assesment oldAssesment = assesment;
		assesment = newAssesment;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ObeModelPackage.MISSION__ASSESMENT, oldAssesment,
					assesment));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case ObeModelPackage.MISSION__INSTITUTE:
			if (institute != null)
				msgs = ((InternalEObject) institute).eInverseRemove(this, ObeModelPackage.INSTITUTE__ASSOCIATEDMISSION,
						Institute.class, msgs);
			return basicSetInstitute((Institute) otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case ObeModelPackage.MISSION__INSTITUTE:
			return basicSetInstitute(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case ObeModelPackage.MISSION__MISSION_STATEMENT:
			return getMissionStatement();
		case ObeModelPackage.MISSION__INSTITUTE:
			if (resolve)
				return getInstitute();
			return basicGetInstitute();
		case ObeModelPackage.MISSION__ASSESMENT:
			if (resolve)
				return getAssesment();
			return basicGetAssesment();
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
		case ObeModelPackage.MISSION__MISSION_STATEMENT:
			setMissionStatement((String) newValue);
			return;
		case ObeModelPackage.MISSION__INSTITUTE:
			setInstitute((Institute) newValue);
			return;
		case ObeModelPackage.MISSION__ASSESMENT:
			setAssesment((Assesment) newValue);
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
		case ObeModelPackage.MISSION__MISSION_STATEMENT:
			setMissionStatement(MISSION_STATEMENT_EDEFAULT);
			return;
		case ObeModelPackage.MISSION__INSTITUTE:
			setInstitute((Institute) null);
			return;
		case ObeModelPackage.MISSION__ASSESMENT:
			setAssesment((Assesment) null);
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
		case ObeModelPackage.MISSION__MISSION_STATEMENT:
			return MISSION_STATEMENT_EDEFAULT == null ? missionStatement != null
					: !MISSION_STATEMENT_EDEFAULT.equals(missionStatement);
		case ObeModelPackage.MISSION__INSTITUTE:
			return institute != null;
		case ObeModelPackage.MISSION__ASSESMENT:
			return assesment != null;
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
		result.append(" (MissionStatement: ");
		result.append(missionStatement);
		result.append(')');
		return result.toString();
	}

} //MissionImpl
