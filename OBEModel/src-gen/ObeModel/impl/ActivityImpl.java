/**
 */
package ObeModel.impl;

import ObeModel.Activity;
import ObeModel.ActivityType;
import ObeModel.AssesmentType;
import ObeModel.CLO;
import ObeModel.ObeModelPackage;

import ObeModel.Results;
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
 * An implementation of the model object '<em><b>Activity</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ObeModel.impl.ActivityImpl#getName <em>Name</em>}</li>
 *   <li>{@link ObeModel.impl.ActivityImpl#getTotalMarks <em>Total Marks</em>}</li>
 *   <li>{@link ObeModel.impl.ActivityImpl#getAssesmentType <em>Assesment Type</em>}</li>
 *   <li>{@link ObeModel.impl.ActivityImpl#getActivityType <em>Activity Type</em>}</li>
 *   <li>{@link ObeModel.impl.ActivityImpl#getClo <em>Clo</em>}</li>
 *   <li>{@link ObeModel.impl.ActivityImpl#getResults <em>Results</em>}</li>
 *   <li>{@link ObeModel.impl.ActivityImpl#getActivityWeight <em>Activity Weight</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ActivityImpl extends MinimalEObjectImpl.Container implements Activity {
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
	 * The default value of the '{@link #getTotalMarks() <em>Total Marks</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTotalMarks()
	 * @generated
	 * @ordered
	 */
	protected static final int TOTAL_MARKS_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getTotalMarks() <em>Total Marks</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTotalMarks()
	 * @generated
	 * @ordered
	 */
	protected int totalMarks = TOTAL_MARKS_EDEFAULT;

	/**
	 * The default value of the '{@link #getAssesmentType() <em>Assesment Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAssesmentType()
	 * @generated
	 * @ordered
	 */
	protected static final AssesmentType ASSESMENT_TYPE_EDEFAULT = AssesmentType.DIRECT;

	/**
	 * The cached value of the '{@link #getAssesmentType() <em>Assesment Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAssesmentType()
	 * @generated
	 * @ordered
	 */
	protected AssesmentType assesmentType = ASSESMENT_TYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #getActivityType() <em>Activity Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActivityType()
	 * @generated
	 * @ordered
	 */
	protected static final ActivityType ACTIVITY_TYPE_EDEFAULT = ActivityType.QUIZ;

	/**
	 * The cached value of the '{@link #getActivityType() <em>Activity Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActivityType()
	 * @generated
	 * @ordered
	 */
	protected ActivityType activityType = ACTIVITY_TYPE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getClo() <em>Clo</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClo()
	 * @generated
	 * @ordered
	 */
	protected CLO clo;

	/**
	 * The cached value of the '{@link #getResults() <em>Results</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResults()
	 * @generated
	 * @ordered
	 */
	protected EList<Results> results;

	/**
	 * The default value of the '{@link #getActivityWeight() <em>Activity Weight</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActivityWeight()
	 * @generated
	 * @ordered
	 */
	protected static final double ACTIVITY_WEIGHT_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getActivityWeight() <em>Activity Weight</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActivityWeight()
	 * @generated
	 * @ordered
	 */
	protected double activityWeight = ACTIVITY_WEIGHT_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ActivityImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ObeModelPackage.Literals.ACTIVITY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ObeModelPackage.ACTIVITY__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getTotalMarks() {
		return totalMarks;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTotalMarks(int newTotalMarks) {
		int oldTotalMarks = totalMarks;
		totalMarks = newTotalMarks;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ObeModelPackage.ACTIVITY__TOTAL_MARKS, oldTotalMarks,
					totalMarks));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AssesmentType getAssesmentType() {
		return assesmentType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAssesmentType(AssesmentType newAssesmentType) {
		AssesmentType oldAssesmentType = assesmentType;
		assesmentType = newAssesmentType == null ? ASSESMENT_TYPE_EDEFAULT : newAssesmentType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ObeModelPackage.ACTIVITY__ASSESMENT_TYPE,
					oldAssesmentType, assesmentType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActivityType getActivityType() {
		return activityType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setActivityType(ActivityType newActivityType) {
		ActivityType oldActivityType = activityType;
		activityType = newActivityType == null ? ACTIVITY_TYPE_EDEFAULT : newActivityType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ObeModelPackage.ACTIVITY__ACTIVITY_TYPE,
					oldActivityType, activityType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CLO getClo() {
		if (clo != null && clo.eIsProxy()) {
			InternalEObject oldClo = (InternalEObject) clo;
			clo = (CLO) eResolveProxy(oldClo);
			if (clo != oldClo) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ObeModelPackage.ACTIVITY__CLO, oldClo,
							clo));
			}
		}
		return clo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CLO basicGetClo() {
		return clo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetClo(CLO newClo, NotificationChain msgs) {
		CLO oldClo = clo;
		clo = newClo;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					ObeModelPackage.ACTIVITY__CLO, oldClo, newClo);
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
	public void setClo(CLO newClo) {
		if (newClo != clo) {
			NotificationChain msgs = null;
			if (clo != null)
				msgs = ((InternalEObject) clo).eInverseRemove(this, ObeModelPackage.CLO__ACTIVITY, CLO.class, msgs);
			if (newClo != null)
				msgs = ((InternalEObject) newClo).eInverseAdd(this, ObeModelPackage.CLO__ACTIVITY, CLO.class, msgs);
			msgs = basicSetClo(newClo, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ObeModelPackage.ACTIVITY__CLO, newClo, newClo));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Results> getResults() {
		if (results == null) {
			results = new EObjectWithInverseResolvingEList<Results>(Results.class, this,
					ObeModelPackage.ACTIVITY__RESULTS, ObeModelPackage.RESULTS__ACTIVITY);
		}
		return results;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getActivityWeight() {
		return activityWeight;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setActivityWeight(double newActivityWeight) {
		double oldActivityWeight = activityWeight;
		activityWeight = newActivityWeight;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ObeModelPackage.ACTIVITY__ACTIVITY_WEIGHT,
					oldActivityWeight, activityWeight));
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
		case ObeModelPackage.ACTIVITY__CLO:
			if (clo != null)
				msgs = ((InternalEObject) clo).eInverseRemove(this, ObeModelPackage.CLO__ACTIVITY, CLO.class, msgs);
			return basicSetClo((CLO) otherEnd, msgs);
		case ObeModelPackage.ACTIVITY__RESULTS:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getResults()).basicAdd(otherEnd, msgs);
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
		case ObeModelPackage.ACTIVITY__CLO:
			return basicSetClo(null, msgs);
		case ObeModelPackage.ACTIVITY__RESULTS:
			return ((InternalEList<?>) getResults()).basicRemove(otherEnd, msgs);
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
		case ObeModelPackage.ACTIVITY__NAME:
			return getName();
		case ObeModelPackage.ACTIVITY__TOTAL_MARKS:
			return getTotalMarks();
		case ObeModelPackage.ACTIVITY__ASSESMENT_TYPE:
			return getAssesmentType();
		case ObeModelPackage.ACTIVITY__ACTIVITY_TYPE:
			return getActivityType();
		case ObeModelPackage.ACTIVITY__CLO:
			if (resolve)
				return getClo();
			return basicGetClo();
		case ObeModelPackage.ACTIVITY__RESULTS:
			return getResults();
		case ObeModelPackage.ACTIVITY__ACTIVITY_WEIGHT:
			return getActivityWeight();
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
		case ObeModelPackage.ACTIVITY__NAME:
			setName((String) newValue);
			return;
		case ObeModelPackage.ACTIVITY__TOTAL_MARKS:
			setTotalMarks((Integer) newValue);
			return;
		case ObeModelPackage.ACTIVITY__ASSESMENT_TYPE:
			setAssesmentType((AssesmentType) newValue);
			return;
		case ObeModelPackage.ACTIVITY__ACTIVITY_TYPE:
			setActivityType((ActivityType) newValue);
			return;
		case ObeModelPackage.ACTIVITY__CLO:
			setClo((CLO) newValue);
			return;
		case ObeModelPackage.ACTIVITY__RESULTS:
			getResults().clear();
			getResults().addAll((Collection<? extends Results>) newValue);
			return;
		case ObeModelPackage.ACTIVITY__ACTIVITY_WEIGHT:
			setActivityWeight((Double) newValue);
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
		case ObeModelPackage.ACTIVITY__NAME:
			setName(NAME_EDEFAULT);
			return;
		case ObeModelPackage.ACTIVITY__TOTAL_MARKS:
			setTotalMarks(TOTAL_MARKS_EDEFAULT);
			return;
		case ObeModelPackage.ACTIVITY__ASSESMENT_TYPE:
			setAssesmentType(ASSESMENT_TYPE_EDEFAULT);
			return;
		case ObeModelPackage.ACTIVITY__ACTIVITY_TYPE:
			setActivityType(ACTIVITY_TYPE_EDEFAULT);
			return;
		case ObeModelPackage.ACTIVITY__CLO:
			setClo((CLO) null);
			return;
		case ObeModelPackage.ACTIVITY__RESULTS:
			getResults().clear();
			return;
		case ObeModelPackage.ACTIVITY__ACTIVITY_WEIGHT:
			setActivityWeight(ACTIVITY_WEIGHT_EDEFAULT);
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
		case ObeModelPackage.ACTIVITY__NAME:
			return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
		case ObeModelPackage.ACTIVITY__TOTAL_MARKS:
			return totalMarks != TOTAL_MARKS_EDEFAULT;
		case ObeModelPackage.ACTIVITY__ASSESMENT_TYPE:
			return assesmentType != ASSESMENT_TYPE_EDEFAULT;
		case ObeModelPackage.ACTIVITY__ACTIVITY_TYPE:
			return activityType != ACTIVITY_TYPE_EDEFAULT;
		case ObeModelPackage.ACTIVITY__CLO:
			return clo != null;
		case ObeModelPackage.ACTIVITY__RESULTS:
			return results != null && !results.isEmpty();
		case ObeModelPackage.ACTIVITY__ACTIVITY_WEIGHT:
			return activityWeight != ACTIVITY_WEIGHT_EDEFAULT;
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
		result.append(" (Name: ");
		result.append(name);
		result.append(", totalMarks: ");
		result.append(totalMarks);
		result.append(", AssesmentType: ");
		result.append(assesmentType);
		result.append(", ActivityType: ");
		result.append(activityType);
		result.append(", activityWeight: ");
		result.append(activityWeight);
		result.append(')');
		return result.toString();
	}

} //ActivityImpl
