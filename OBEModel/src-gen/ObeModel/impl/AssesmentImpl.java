/**
 */
package ObeModel.impl;

import ObeModel.ActivityType;
import ObeModel.Assesment;
import ObeModel.AssesmentType;
import ObeModel.ObeModelPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Assesment</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ObeModel.impl.AssesmentImpl#getName <em>Name</em>}</li>
 *   <li>{@link ObeModel.impl.AssesmentImpl#getAssesmentType <em>Assesment Type</em>}</li>
 *   <li>{@link ObeModel.impl.AssesmentImpl#getActivityType <em>Activity Type</em>}</li>
 *   <li>{@link ObeModel.impl.AssesmentImpl#getRespondantName <em>Respondant Name</em>}</li>
 *   <li>{@link ObeModel.impl.AssesmentImpl#getMarks <em>Marks</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AssesmentImpl extends MinimalEObjectImpl.Container implements Assesment {
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
	 * The default value of the '{@link #getAssesmentType() <em>Assesment Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAssesmentType()
	 * @generated
	 * @ordered
	 */
	protected static final AssesmentType ASSESMENT_TYPE_EDEFAULT = AssesmentType.INDIRECT;

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
	 * The default value of the '{@link #getRespondantName() <em>Respondant Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRespondantName()
	 * @generated
	 * @ordered
	 */
	protected static final String RESPONDANT_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRespondantName() <em>Respondant Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRespondantName()
	 * @generated
	 * @ordered
	 */
	protected String respondantName = RESPONDANT_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getMarks() <em>Marks</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMarks()
	 * @generated
	 * @ordered
	 */
	protected static final double MARKS_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getMarks() <em>Marks</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMarks()
	 * @generated
	 * @ordered
	 */
	protected double marks = MARKS_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AssesmentImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ObeModelPackage.Literals.ASSESMENT;
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
			eNotify(new ENotificationImpl(this, Notification.SET, ObeModelPackage.ASSESMENT__NAME, oldName, name));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ObeModelPackage.ASSESMENT__ASSESMENT_TYPE,
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
			eNotify(new ENotificationImpl(this, Notification.SET, ObeModelPackage.ASSESMENT__ACTIVITY_TYPE,
					oldActivityType, activityType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getRespondantName() {
		return respondantName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRespondantName(String newRespondantName) {
		String oldRespondantName = respondantName;
		respondantName = newRespondantName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ObeModelPackage.ASSESMENT__RESPONDANT_NAME,
					oldRespondantName, respondantName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getMarks() {
		return marks;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMarks(double newMarks) {
		double oldMarks = marks;
		marks = newMarks;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ObeModelPackage.ASSESMENT__MARKS, oldMarks, marks));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case ObeModelPackage.ASSESMENT__NAME:
			return getName();
		case ObeModelPackage.ASSESMENT__ASSESMENT_TYPE:
			return getAssesmentType();
		case ObeModelPackage.ASSESMENT__ACTIVITY_TYPE:
			return getActivityType();
		case ObeModelPackage.ASSESMENT__RESPONDANT_NAME:
			return getRespondantName();
		case ObeModelPackage.ASSESMENT__MARKS:
			return getMarks();
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
		case ObeModelPackage.ASSESMENT__NAME:
			setName((String) newValue);
			return;
		case ObeModelPackage.ASSESMENT__ASSESMENT_TYPE:
			setAssesmentType((AssesmentType) newValue);
			return;
		case ObeModelPackage.ASSESMENT__ACTIVITY_TYPE:
			setActivityType((ActivityType) newValue);
			return;
		case ObeModelPackage.ASSESMENT__RESPONDANT_NAME:
			setRespondantName((String) newValue);
			return;
		case ObeModelPackage.ASSESMENT__MARKS:
			setMarks((Double) newValue);
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
		case ObeModelPackage.ASSESMENT__NAME:
			setName(NAME_EDEFAULT);
			return;
		case ObeModelPackage.ASSESMENT__ASSESMENT_TYPE:
			setAssesmentType(ASSESMENT_TYPE_EDEFAULT);
			return;
		case ObeModelPackage.ASSESMENT__ACTIVITY_TYPE:
			setActivityType(ACTIVITY_TYPE_EDEFAULT);
			return;
		case ObeModelPackage.ASSESMENT__RESPONDANT_NAME:
			setRespondantName(RESPONDANT_NAME_EDEFAULT);
			return;
		case ObeModelPackage.ASSESMENT__MARKS:
			setMarks(MARKS_EDEFAULT);
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
		case ObeModelPackage.ASSESMENT__NAME:
			return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
		case ObeModelPackage.ASSESMENT__ASSESMENT_TYPE:
			return assesmentType != ASSESMENT_TYPE_EDEFAULT;
		case ObeModelPackage.ASSESMENT__ACTIVITY_TYPE:
			return activityType != ACTIVITY_TYPE_EDEFAULT;
		case ObeModelPackage.ASSESMENT__RESPONDANT_NAME:
			return RESPONDANT_NAME_EDEFAULT == null ? respondantName != null
					: !RESPONDANT_NAME_EDEFAULT.equals(respondantName);
		case ObeModelPackage.ASSESMENT__MARKS:
			return marks != MARKS_EDEFAULT;
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
		result.append(" (name: ");
		result.append(name);
		result.append(", AssesmentType: ");
		result.append(assesmentType);
		result.append(", ActivityType: ");
		result.append(activityType);
		result.append(", RespondantName: ");
		result.append(respondantName);
		result.append(", Marks: ");
		result.append(marks);
		result.append(')');
		return result.toString();
	}

} //AssesmentImpl
