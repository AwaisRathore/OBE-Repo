/**
 */
package ObeModel.impl;

import ObeModel.Activity;
import ObeModel.ObeModelPackage;
import ObeModel.Results;
import ObeModel.Student;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Results</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ObeModel.impl.ResultsImpl#getObtainedMarks <em>Obtained Marks</em>}</li>
 *   <li>{@link ObeModel.impl.ResultsImpl#getStudent <em>Student</em>}</li>
 *   <li>{@link ObeModel.impl.ResultsImpl#getActivity <em>Activity</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ResultsImpl extends MinimalEObjectImpl.Container implements Results {
	/**
	 * The default value of the '{@link #getObtainedMarks() <em>Obtained Marks</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getObtainedMarks()
	 * @generated
	 * @ordered
	 */
	protected static final double OBTAINED_MARKS_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getObtainedMarks() <em>Obtained Marks</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getObtainedMarks()
	 * @generated
	 * @ordered
	 */
	protected double obtainedMarks = OBTAINED_MARKS_EDEFAULT;

	/**
	 * The cached value of the '{@link #getStudent() <em>Student</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStudent()
	 * @generated
	 * @ordered
	 */
	protected Student student;

	/**
	 * The cached value of the '{@link #getActivity() <em>Activity</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActivity()
	 * @generated
	 * @ordered
	 */
	protected Activity activity;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ResultsImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ObeModelPackage.Literals.RESULTS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getObtainedMarks() {
		return obtainedMarks;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setObtainedMarks(double newObtainedMarks) {
		double oldObtainedMarks = obtainedMarks;
		obtainedMarks = newObtainedMarks;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ObeModelPackage.RESULTS__OBTAINED_MARKS,
					oldObtainedMarks, obtainedMarks));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Student getStudent() {
		if (student != null && student.eIsProxy()) {
			InternalEObject oldStudent = (InternalEObject) student;
			student = (Student) eResolveProxy(oldStudent);
			if (student != oldStudent) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ObeModelPackage.RESULTS__STUDENT,
							oldStudent, student));
			}
		}
		return student;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Student basicGetStudent() {
		return student;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetStudent(Student newStudent, NotificationChain msgs) {
		Student oldStudent = student;
		student = newStudent;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					ObeModelPackage.RESULTS__STUDENT, oldStudent, newStudent);
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
	public void setStudent(Student newStudent) {
		if (newStudent != student) {
			NotificationChain msgs = null;
			if (student != null)
				msgs = ((InternalEObject) student).eInverseRemove(this, ObeModelPackage.STUDENT__RESULTS, Student.class,
						msgs);
			if (newStudent != null)
				msgs = ((InternalEObject) newStudent).eInverseAdd(this, ObeModelPackage.STUDENT__RESULTS, Student.class,
						msgs);
			msgs = basicSetStudent(newStudent, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ObeModelPackage.RESULTS__STUDENT, newStudent,
					newStudent));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Activity getActivity() {
		if (activity != null && activity.eIsProxy()) {
			InternalEObject oldActivity = (InternalEObject) activity;
			activity = (Activity) eResolveProxy(oldActivity);
			if (activity != oldActivity) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ObeModelPackage.RESULTS__ACTIVITY,
							oldActivity, activity));
			}
		}
		return activity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Activity basicGetActivity() {
		return activity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetActivity(Activity newActivity, NotificationChain msgs) {
		Activity oldActivity = activity;
		activity = newActivity;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					ObeModelPackage.RESULTS__ACTIVITY, oldActivity, newActivity);
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
	public void setActivity(Activity newActivity) {
		if (newActivity != activity) {
			NotificationChain msgs = null;
			if (activity != null)
				msgs = ((InternalEObject) activity).eInverseRemove(this, ObeModelPackage.ACTIVITY__RESULTS,
						Activity.class, msgs);
			if (newActivity != null)
				msgs = ((InternalEObject) newActivity).eInverseAdd(this, ObeModelPackage.ACTIVITY__RESULTS,
						Activity.class, msgs);
			msgs = basicSetActivity(newActivity, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ObeModelPackage.RESULTS__ACTIVITY, newActivity,
					newActivity));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case ObeModelPackage.RESULTS__STUDENT:
			if (student != null)
				msgs = ((InternalEObject) student).eInverseRemove(this, ObeModelPackage.STUDENT__RESULTS, Student.class,
						msgs);
			return basicSetStudent((Student) otherEnd, msgs);
		case ObeModelPackage.RESULTS__ACTIVITY:
			if (activity != null)
				msgs = ((InternalEObject) activity).eInverseRemove(this, ObeModelPackage.ACTIVITY__RESULTS,
						Activity.class, msgs);
			return basicSetActivity((Activity) otherEnd, msgs);
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
		case ObeModelPackage.RESULTS__STUDENT:
			return basicSetStudent(null, msgs);
		case ObeModelPackage.RESULTS__ACTIVITY:
			return basicSetActivity(null, msgs);
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
		case ObeModelPackage.RESULTS__OBTAINED_MARKS:
			return getObtainedMarks();
		case ObeModelPackage.RESULTS__STUDENT:
			if (resolve)
				return getStudent();
			return basicGetStudent();
		case ObeModelPackage.RESULTS__ACTIVITY:
			if (resolve)
				return getActivity();
			return basicGetActivity();
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
		case ObeModelPackage.RESULTS__OBTAINED_MARKS:
			setObtainedMarks((Double) newValue);
			return;
		case ObeModelPackage.RESULTS__STUDENT:
			setStudent((Student) newValue);
			return;
		case ObeModelPackage.RESULTS__ACTIVITY:
			setActivity((Activity) newValue);
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
		case ObeModelPackage.RESULTS__OBTAINED_MARKS:
			setObtainedMarks(OBTAINED_MARKS_EDEFAULT);
			return;
		case ObeModelPackage.RESULTS__STUDENT:
			setStudent((Student) null);
			return;
		case ObeModelPackage.RESULTS__ACTIVITY:
			setActivity((Activity) null);
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
		case ObeModelPackage.RESULTS__OBTAINED_MARKS:
			return obtainedMarks != OBTAINED_MARKS_EDEFAULT;
		case ObeModelPackage.RESULTS__STUDENT:
			return student != null;
		case ObeModelPackage.RESULTS__ACTIVITY:
			return activity != null;
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
		result.append(" (obtainedMarks: ");
		result.append(obtainedMarks);
		result.append(')');
		return result.toString();
	}

} //ResultsImpl
