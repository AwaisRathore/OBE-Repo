/**
 */
package ObeModel.impl;

import ObeModel.Assesment;
import ObeModel.Mission;
import ObeModel.ObeModelPackage;
import ObeModel.PEO;
import ObeModel.Plo;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>PEO</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ObeModel.impl.PEOImpl#getPEOStatement <em>PEO Statement</em>}</li>
 *   <li>{@link ObeModel.impl.PEOImpl#getThreshold <em>Threshold</em>}</li>
 *   <li>{@link ObeModel.impl.PEOImpl#getMission <em>Mission</em>}</li>
 *   <li>{@link ObeModel.impl.PEOImpl#getPlos <em>Plos</em>}</li>
 *   <li>{@link ObeModel.impl.PEOImpl#getTitle <em>Title</em>}</li>
 *   <li>{@link ObeModel.impl.PEOImpl#getAssesment <em>Assesment</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PEOImpl extends MinimalEObjectImpl.Container implements PEO {
	/**
	 * The default value of the '{@link #getPEOStatement() <em>PEO Statement</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPEOStatement()
	 * @generated
	 * @ordered
	 */
	protected static final String PEO_STATEMENT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPEOStatement() <em>PEO Statement</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPEOStatement()
	 * @generated
	 * @ordered
	 */
	protected String peoStatement = PEO_STATEMENT_EDEFAULT;

	/**
	 * The default value of the '{@link #getThreshold() <em>Threshold</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getThreshold()
	 * @generated
	 * @ordered
	 */
	protected static final int THRESHOLD_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getThreshold() <em>Threshold</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getThreshold()
	 * @generated
	 * @ordered
	 */
	protected int threshold = THRESHOLD_EDEFAULT;

	/**
	 * The cached value of the '{@link #getMission() <em>Mission</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMission()
	 * @generated
	 * @ordered
	 */
	protected Mission mission;

	/**
	 * The cached value of the '{@link #getPlos() <em>Plos</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPlos()
	 * @generated
	 * @ordered
	 */
	protected EList<Plo> plos;

	/**
	 * The default value of the '{@link #getTitle() <em>Title</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTitle()
	 * @generated
	 * @ordered
	 */
	protected static final String TITLE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTitle() <em>Title</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTitle()
	 * @generated
	 * @ordered
	 */
	protected String title = TITLE_EDEFAULT;

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
	protected PEOImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ObeModelPackage.Literals.PEO;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPEOStatement() {
		return peoStatement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPEOStatement(String newPEOStatement) {
		String oldPEOStatement = peoStatement;
		peoStatement = newPEOStatement;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ObeModelPackage.PEO__PEO_STATEMENT, oldPEOStatement,
					peoStatement));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getThreshold() {
		return threshold;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setThreshold(int newThreshold) {
		int oldThreshold = threshold;
		threshold = newThreshold;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ObeModelPackage.PEO__THRESHOLD, oldThreshold,
					threshold));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Mission getMission() {
		if (mission != null && mission.eIsProxy()) {
			InternalEObject oldMission = (InternalEObject) mission;
			mission = (Mission) eResolveProxy(oldMission);
			if (mission != oldMission) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ObeModelPackage.PEO__MISSION, oldMission,
							mission));
			}
		}
		return mission;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Mission basicGetMission() {
		return mission;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMission(Mission newMission) {
		Mission oldMission = mission;
		mission = newMission;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ObeModelPackage.PEO__MISSION, oldMission, mission));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Plo> getPlos() {
		if (plos == null) {
			plos = new EObjectWithInverseResolvingEList<Plo>(Plo.class, this, ObeModelPackage.PEO__PLOS,
					ObeModelPackage.PLO__PEO);
		}
		return plos;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTitle() {
		return title;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTitle(String newTitle) {
		String oldTitle = title;
		title = newTitle;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ObeModelPackage.PEO__TITLE, oldTitle, title));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ObeModelPackage.PEO__ASSESMENT,
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
			eNotify(new ENotificationImpl(this, Notification.SET, ObeModelPackage.PEO__ASSESMENT, oldAssesment,
					assesment));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case ObeModelPackage.PEO__PLOS:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getPlos()).basicAdd(otherEnd, msgs);
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
		case ObeModelPackage.PEO__PLOS:
			return ((InternalEList<?>) getPlos()).basicRemove(otherEnd, msgs);
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
		case ObeModelPackage.PEO__PEO_STATEMENT:
			return getPEOStatement();
		case ObeModelPackage.PEO__THRESHOLD:
			return getThreshold();
		case ObeModelPackage.PEO__MISSION:
			if (resolve)
				return getMission();
			return basicGetMission();
		case ObeModelPackage.PEO__PLOS:
			return getPlos();
		case ObeModelPackage.PEO__TITLE:
			return getTitle();
		case ObeModelPackage.PEO__ASSESMENT:
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
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case ObeModelPackage.PEO__PEO_STATEMENT:
			setPEOStatement((String) newValue);
			return;
		case ObeModelPackage.PEO__THRESHOLD:
			setThreshold((Integer) newValue);
			return;
		case ObeModelPackage.PEO__MISSION:
			setMission((Mission) newValue);
			return;
		case ObeModelPackage.PEO__PLOS:
			getPlos().clear();
			getPlos().addAll((Collection<? extends Plo>) newValue);
			return;
		case ObeModelPackage.PEO__TITLE:
			setTitle((String) newValue);
			return;
		case ObeModelPackage.PEO__ASSESMENT:
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
		case ObeModelPackage.PEO__PEO_STATEMENT:
			setPEOStatement(PEO_STATEMENT_EDEFAULT);
			return;
		case ObeModelPackage.PEO__THRESHOLD:
			setThreshold(THRESHOLD_EDEFAULT);
			return;
		case ObeModelPackage.PEO__MISSION:
			setMission((Mission) null);
			return;
		case ObeModelPackage.PEO__PLOS:
			getPlos().clear();
			return;
		case ObeModelPackage.PEO__TITLE:
			setTitle(TITLE_EDEFAULT);
			return;
		case ObeModelPackage.PEO__ASSESMENT:
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
		case ObeModelPackage.PEO__PEO_STATEMENT:
			return PEO_STATEMENT_EDEFAULT == null ? peoStatement != null : !PEO_STATEMENT_EDEFAULT.equals(peoStatement);
		case ObeModelPackage.PEO__THRESHOLD:
			return threshold != THRESHOLD_EDEFAULT;
		case ObeModelPackage.PEO__MISSION:
			return mission != null;
		case ObeModelPackage.PEO__PLOS:
			return plos != null && !plos.isEmpty();
		case ObeModelPackage.PEO__TITLE:
			return TITLE_EDEFAULT == null ? title != null : !TITLE_EDEFAULT.equals(title);
		case ObeModelPackage.PEO__ASSESMENT:
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
		result.append(" (PEOStatement: ");
		result.append(peoStatement);
		result.append(", threshold: ");
		result.append(threshold);
		result.append(", Title: ");
		result.append(title);
		result.append(')');
		return result.toString();
	}

} //PEOImpl
