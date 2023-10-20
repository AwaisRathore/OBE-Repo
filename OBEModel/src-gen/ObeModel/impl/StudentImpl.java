/**
 */
package ObeModel.impl;

import ObeModel.Batches;
import ObeModel.Courses;
import ObeModel.ObeModelPackage;
import ObeModel.Results;
import ObeModel.Student;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Student</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ObeModel.impl.StudentImpl#getRollNumber <em>Roll Number</em>}</li>
 *   <li>{@link ObeModel.impl.StudentImpl#getName <em>Name</em>}</li>
 *   <li>{@link ObeModel.impl.StudentImpl#getBatche <em>Batche</em>}</li>
 *   <li>{@link ObeModel.impl.StudentImpl#getRegistercourse <em>Registercourse</em>}</li>
 *   <li>{@link ObeModel.impl.StudentImpl#getResults <em>Results</em>}</li>
 * </ul>
 *
 * @generated
 */
public class StudentImpl extends MinimalEObjectImpl.Container implements Student {
	/**
	 * The default value of the '{@link #getRollNumber() <em>Roll Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRollNumber()
	 * @generated
	 * @ordered
	 */
	protected static final String ROLL_NUMBER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRollNumber() <em>Roll Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRollNumber()
	 * @generated
	 * @ordered
	 */
	protected String rollNumber = ROLL_NUMBER_EDEFAULT;

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
	 * The cached value of the '{@link #getBatche() <em>Batche</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBatche()
	 * @generated
	 * @ordered
	 */
	protected Batches batche;

	/**
	 * The cached value of the '{@link #getRegistercourse() <em>Registercourse</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRegistercourse()
	 * @generated
	 * @ordered
	 */
	protected EList<Courses> registercourse;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StudentImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ObeModelPackage.Literals.STUDENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getRollNumber() {
		return rollNumber;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRollNumber(String newRollNumber) {
		String oldRollNumber = rollNumber;
		rollNumber = newRollNumber;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ObeModelPackage.STUDENT__ROLL_NUMBER, oldRollNumber,
					rollNumber));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ObeModelPackage.STUDENT__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Batches getBatche() {
		if (batche != null && batche.eIsProxy()) {
			InternalEObject oldBatche = (InternalEObject) batche;
			batche = (Batches) eResolveProxy(oldBatche);
			if (batche != oldBatche) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ObeModelPackage.STUDENT__BATCHE,
							oldBatche, batche));
			}
		}
		return batche;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Batches basicGetBatche() {
		return batche;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBatche(Batches newBatche, NotificationChain msgs) {
		Batches oldBatche = batche;
		batche = newBatche;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					ObeModelPackage.STUDENT__BATCHE, oldBatche, newBatche);
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
	public void setBatche(Batches newBatche) {
		if (newBatche != batche) {
			NotificationChain msgs = null;
			if (batche != null)
				msgs = ((InternalEObject) batche).eInverseRemove(this, ObeModelPackage.BATCHES__STUDENTS, Batches.class,
						msgs);
			if (newBatche != null)
				msgs = ((InternalEObject) newBatche).eInverseAdd(this, ObeModelPackage.BATCHES__STUDENTS, Batches.class,
						msgs);
			msgs = basicSetBatche(newBatche, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ObeModelPackage.STUDENT__BATCHE, newBatche,
					newBatche));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Courses> getRegistercourse() {
		if (registercourse == null) {
			registercourse = new EObjectResolvingEList<Courses>(Courses.class, this,
					ObeModelPackage.STUDENT__REGISTERCOURSE);
		}
		return registercourse;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Results> getResults() {
		if (results == null) {
			results = new EObjectWithInverseResolvingEList<Results>(Results.class, this,
					ObeModelPackage.STUDENT__RESULTS, ObeModelPackage.RESULTS__STUDENT);
		}
		return results;
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
		case ObeModelPackage.STUDENT__BATCHE:
			if (batche != null)
				msgs = ((InternalEObject) batche).eInverseRemove(this, ObeModelPackage.BATCHES__STUDENTS, Batches.class,
						msgs);
			return basicSetBatche((Batches) otherEnd, msgs);
		case ObeModelPackage.STUDENT__RESULTS:
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
		case ObeModelPackage.STUDENT__BATCHE:
			return basicSetBatche(null, msgs);
		case ObeModelPackage.STUDENT__RESULTS:
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
		case ObeModelPackage.STUDENT__ROLL_NUMBER:
			return getRollNumber();
		case ObeModelPackage.STUDENT__NAME:
			return getName();
		case ObeModelPackage.STUDENT__BATCHE:
			if (resolve)
				return getBatche();
			return basicGetBatche();
		case ObeModelPackage.STUDENT__REGISTERCOURSE:
			return getRegistercourse();
		case ObeModelPackage.STUDENT__RESULTS:
			return getResults();
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
		case ObeModelPackage.STUDENT__ROLL_NUMBER:
			setRollNumber((String) newValue);
			return;
		case ObeModelPackage.STUDENT__NAME:
			setName((String) newValue);
			return;
		case ObeModelPackage.STUDENT__BATCHE:
			setBatche((Batches) newValue);
			return;
		case ObeModelPackage.STUDENT__REGISTERCOURSE:
			getRegistercourse().clear();
			getRegistercourse().addAll((Collection<? extends Courses>) newValue);
			return;
		case ObeModelPackage.STUDENT__RESULTS:
			getResults().clear();
			getResults().addAll((Collection<? extends Results>) newValue);
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
		case ObeModelPackage.STUDENT__ROLL_NUMBER:
			setRollNumber(ROLL_NUMBER_EDEFAULT);
			return;
		case ObeModelPackage.STUDENT__NAME:
			setName(NAME_EDEFAULT);
			return;
		case ObeModelPackage.STUDENT__BATCHE:
			setBatche((Batches) null);
			return;
		case ObeModelPackage.STUDENT__REGISTERCOURSE:
			getRegistercourse().clear();
			return;
		case ObeModelPackage.STUDENT__RESULTS:
			getResults().clear();
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
		case ObeModelPackage.STUDENT__ROLL_NUMBER:
			return ROLL_NUMBER_EDEFAULT == null ? rollNumber != null : !ROLL_NUMBER_EDEFAULT.equals(rollNumber);
		case ObeModelPackage.STUDENT__NAME:
			return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
		case ObeModelPackage.STUDENT__BATCHE:
			return batche != null;
		case ObeModelPackage.STUDENT__REGISTERCOURSE:
			return registercourse != null && !registercourse.isEmpty();
		case ObeModelPackage.STUDENT__RESULTS:
			return results != null && !results.isEmpty();
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
		result.append(" (RollNumber: ");
		result.append(rollNumber);
		result.append(", Name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //StudentImpl
