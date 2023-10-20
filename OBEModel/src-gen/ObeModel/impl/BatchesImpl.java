/**
 */
package ObeModel.impl;

import ObeModel.Batches;
import ObeModel.ObeModelPackage;
import ObeModel.Student;

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
 * An implementation of the model object '<em><b>Batches</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ObeModel.impl.BatchesImpl#getName <em>Name</em>}</li>
 *   <li>{@link ObeModel.impl.BatchesImpl#getIndvThreshold <em>Indv Threshold</em>}</li>
 *   <li>{@link ObeModel.impl.BatchesImpl#getChortLevelThreshold <em>Chort Level Threshold</em>}</li>
 *   <li>{@link ObeModel.impl.BatchesImpl#getStudents <em>Students</em>}</li>
 * </ul>
 *
 * @generated
 */
public class BatchesImpl extends MinimalEObjectImpl.Container implements Batches {
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
	 * The default value of the '{@link #getIndvThreshold() <em>Indv Threshold</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIndvThreshold()
	 * @generated
	 * @ordered
	 */
	protected static final int INDV_THRESHOLD_EDEFAULT = 50;

	/**
	 * The cached value of the '{@link #getIndvThreshold() <em>Indv Threshold</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIndvThreshold()
	 * @generated
	 * @ordered
	 */
	protected int indvThreshold = INDV_THRESHOLD_EDEFAULT;

	/**
	 * The default value of the '{@link #getChortLevelThreshold() <em>Chort Level Threshold</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getChortLevelThreshold()
	 * @generated
	 * @ordered
	 */
	protected static final int CHORT_LEVEL_THRESHOLD_EDEFAULT = 60;

	/**
	 * The cached value of the '{@link #getChortLevelThreshold() <em>Chort Level Threshold</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getChortLevelThreshold()
	 * @generated
	 * @ordered
	 */
	protected int chortLevelThreshold = CHORT_LEVEL_THRESHOLD_EDEFAULT;

	/**
	 * The cached value of the '{@link #getStudents() <em>Students</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStudents()
	 * @generated
	 * @ordered
	 */
	protected EList<Student> students;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BatchesImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ObeModelPackage.Literals.BATCHES;
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
			eNotify(new ENotificationImpl(this, Notification.SET, ObeModelPackage.BATCHES__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getIndvThreshold() {
		return indvThreshold;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIndvThreshold(int newIndvThreshold) {
		int oldIndvThreshold = indvThreshold;
		indvThreshold = newIndvThreshold;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ObeModelPackage.BATCHES__INDV_THRESHOLD,
					oldIndvThreshold, indvThreshold));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getChortLevelThreshold() {
		return chortLevelThreshold;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setChortLevelThreshold(int newChortLevelThreshold) {
		int oldChortLevelThreshold = chortLevelThreshold;
		chortLevelThreshold = newChortLevelThreshold;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ObeModelPackage.BATCHES__CHORT_LEVEL_THRESHOLD,
					oldChortLevelThreshold, chortLevelThreshold));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Student> getStudents() {
		if (students == null) {
			students = new EObjectWithInverseResolvingEList<Student>(Student.class, this,
					ObeModelPackage.BATCHES__STUDENTS, ObeModelPackage.STUDENT__BATCHE);
		}
		return students;
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
		case ObeModelPackage.BATCHES__STUDENTS:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getStudents()).basicAdd(otherEnd, msgs);
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
		case ObeModelPackage.BATCHES__STUDENTS:
			return ((InternalEList<?>) getStudents()).basicRemove(otherEnd, msgs);
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
		case ObeModelPackage.BATCHES__NAME:
			return getName();
		case ObeModelPackage.BATCHES__INDV_THRESHOLD:
			return getIndvThreshold();
		case ObeModelPackage.BATCHES__CHORT_LEVEL_THRESHOLD:
			return getChortLevelThreshold();
		case ObeModelPackage.BATCHES__STUDENTS:
			return getStudents();
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
		case ObeModelPackage.BATCHES__NAME:
			setName((String) newValue);
			return;
		case ObeModelPackage.BATCHES__INDV_THRESHOLD:
			setIndvThreshold((Integer) newValue);
			return;
		case ObeModelPackage.BATCHES__CHORT_LEVEL_THRESHOLD:
			setChortLevelThreshold((Integer) newValue);
			return;
		case ObeModelPackage.BATCHES__STUDENTS:
			getStudents().clear();
			getStudents().addAll((Collection<? extends Student>) newValue);
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
		case ObeModelPackage.BATCHES__NAME:
			setName(NAME_EDEFAULT);
			return;
		case ObeModelPackage.BATCHES__INDV_THRESHOLD:
			setIndvThreshold(INDV_THRESHOLD_EDEFAULT);
			return;
		case ObeModelPackage.BATCHES__CHORT_LEVEL_THRESHOLD:
			setChortLevelThreshold(CHORT_LEVEL_THRESHOLD_EDEFAULT);
			return;
		case ObeModelPackage.BATCHES__STUDENTS:
			getStudents().clear();
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
		case ObeModelPackage.BATCHES__NAME:
			return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
		case ObeModelPackage.BATCHES__INDV_THRESHOLD:
			return indvThreshold != INDV_THRESHOLD_EDEFAULT;
		case ObeModelPackage.BATCHES__CHORT_LEVEL_THRESHOLD:
			return chortLevelThreshold != CHORT_LEVEL_THRESHOLD_EDEFAULT;
		case ObeModelPackage.BATCHES__STUDENTS:
			return students != null && !students.isEmpty();
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
		result.append(", IndvThreshold: ");
		result.append(indvThreshold);
		result.append(", ChortLevelThreshold: ");
		result.append(chortLevelThreshold);
		result.append(')');
		return result.toString();
	}

} //BatchesImpl
