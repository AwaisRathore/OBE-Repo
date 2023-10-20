/**
 */
package ObeModel.impl;

import ObeModel.Activity;
import ObeModel.CLO;
import ObeModel.Courses;
import ObeModel.ObeModelPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Courses</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ObeModel.impl.CoursesImpl#getName <em>Name</em>}</li>
 *   <li>{@link ObeModel.impl.CoursesImpl#getLearningoutcomes <em>Learningoutcomes</em>}</li>
 *   <li>{@link ObeModel.impl.CoursesImpl#getActivities <em>Activities</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CoursesImpl extends MinimalEObjectImpl.Container implements Courses {
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
	 * The cached value of the '{@link #getLearningoutcomes() <em>Learningoutcomes</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLearningoutcomes()
	 * @generated
	 * @ordered
	 */
	protected EList<CLO> learningoutcomes;

	/**
	 * The cached value of the '{@link #getActivities() <em>Activities</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActivities()
	 * @generated
	 * @ordered
	 */
	protected EList<Activity> activities;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CoursesImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ObeModelPackage.Literals.COURSES;
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
			eNotify(new ENotificationImpl(this, Notification.SET, ObeModelPackage.COURSES__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CLO> getLearningoutcomes() {
		if (learningoutcomes == null) {
			learningoutcomes = new EObjectResolvingEList<CLO>(CLO.class, this,
					ObeModelPackage.COURSES__LEARNINGOUTCOMES);
		}
		return learningoutcomes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Activity> getActivities() {
		if (activities == null) {
			activities = new EObjectResolvingEList<Activity>(Activity.class, this, ObeModelPackage.COURSES__ACTIVITIES);
		}
		return activities;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case ObeModelPackage.COURSES__NAME:
			return getName();
		case ObeModelPackage.COURSES__LEARNINGOUTCOMES:
			return getLearningoutcomes();
		case ObeModelPackage.COURSES__ACTIVITIES:
			return getActivities();
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
		case ObeModelPackage.COURSES__NAME:
			setName((String) newValue);
			return;
		case ObeModelPackage.COURSES__LEARNINGOUTCOMES:
			getLearningoutcomes().clear();
			getLearningoutcomes().addAll((Collection<? extends CLO>) newValue);
			return;
		case ObeModelPackage.COURSES__ACTIVITIES:
			getActivities().clear();
			getActivities().addAll((Collection<? extends Activity>) newValue);
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
		case ObeModelPackage.COURSES__NAME:
			setName(NAME_EDEFAULT);
			return;
		case ObeModelPackage.COURSES__LEARNINGOUTCOMES:
			getLearningoutcomes().clear();
			return;
		case ObeModelPackage.COURSES__ACTIVITIES:
			getActivities().clear();
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
		case ObeModelPackage.COURSES__NAME:
			return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
		case ObeModelPackage.COURSES__LEARNINGOUTCOMES:
			return learningoutcomes != null && !learningoutcomes.isEmpty();
		case ObeModelPackage.COURSES__ACTIVITIES:
			return activities != null && !activities.isEmpty();
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
		result.append(')');
		return result.toString();
	}

} //CoursesImpl
