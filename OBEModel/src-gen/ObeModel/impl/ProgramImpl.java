/**
 */
package ObeModel.impl;

import ObeModel.Batches;
import ObeModel.Courses;
import ObeModel.ObeModelPackage;
import ObeModel.PEO;
import ObeModel.Plo;
import ObeModel.Program;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Program</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ObeModel.impl.ProgramImpl#getName <em>Name</em>}</li>
 *   <li>{@link ObeModel.impl.ProgramImpl#getProgramobjectives <em>Programobjectives</em>}</li>
 *   <li>{@link ObeModel.impl.ProgramImpl#getProgramlearningoutcomes <em>Programlearningoutcomes</em>}</li>
 *   <li>{@link ObeModel.impl.ProgramImpl#getAssociatedbatches <em>Associatedbatches</em>}</li>
 *   <li>{@link ObeModel.impl.ProgramImpl#getOfferedcourses <em>Offeredcourses</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ProgramImpl extends MinimalEObjectImpl.Container implements Program {
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
	 * The cached value of the '{@link #getProgramobjectives() <em>Programobjectives</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProgramobjectives()
	 * @generated
	 * @ordered
	 */
	protected EList<PEO> programobjectives;

	/**
	 * The cached value of the '{@link #getProgramlearningoutcomes() <em>Programlearningoutcomes</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProgramlearningoutcomes()
	 * @generated
	 * @ordered
	 */
	protected EList<Plo> programlearningoutcomes;

	/**
	 * The cached value of the '{@link #getAssociatedbatches() <em>Associatedbatches</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAssociatedbatches()
	 * @generated
	 * @ordered
	 */
	protected EList<Batches> associatedbatches;

	/**
	 * The cached value of the '{@link #getOfferedcourses() <em>Offeredcourses</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOfferedcourses()
	 * @generated
	 * @ordered
	 */
	protected EList<Courses> offeredcourses;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ProgramImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ObeModelPackage.Literals.PROGRAM;
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
			eNotify(new ENotificationImpl(this, Notification.SET, ObeModelPackage.PROGRAM__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PEO> getProgramobjectives() {
		if (programobjectives == null) {
			programobjectives = new EObjectResolvingEList<PEO>(PEO.class, this,
					ObeModelPackage.PROGRAM__PROGRAMOBJECTIVES);
		}
		return programobjectives;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Plo> getProgramlearningoutcomes() {
		if (programlearningoutcomes == null) {
			programlearningoutcomes = new EObjectResolvingEList<Plo>(Plo.class, this,
					ObeModelPackage.PROGRAM__PROGRAMLEARNINGOUTCOMES);
		}
		return programlearningoutcomes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Batches> getAssociatedbatches() {
		if (associatedbatches == null) {
			associatedbatches = new EObjectResolvingEList<Batches>(Batches.class, this,
					ObeModelPackage.PROGRAM__ASSOCIATEDBATCHES);
		}
		return associatedbatches;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Courses> getOfferedcourses() {
		if (offeredcourses == null) {
			offeredcourses = new EObjectResolvingEList<Courses>(Courses.class, this,
					ObeModelPackage.PROGRAM__OFFEREDCOURSES);
		}
		return offeredcourses;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case ObeModelPackage.PROGRAM__NAME:
			return getName();
		case ObeModelPackage.PROGRAM__PROGRAMOBJECTIVES:
			return getProgramobjectives();
		case ObeModelPackage.PROGRAM__PROGRAMLEARNINGOUTCOMES:
			return getProgramlearningoutcomes();
		case ObeModelPackage.PROGRAM__ASSOCIATEDBATCHES:
			return getAssociatedbatches();
		case ObeModelPackage.PROGRAM__OFFEREDCOURSES:
			return getOfferedcourses();
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
		case ObeModelPackage.PROGRAM__NAME:
			setName((String) newValue);
			return;
		case ObeModelPackage.PROGRAM__PROGRAMOBJECTIVES:
			getProgramobjectives().clear();
			getProgramobjectives().addAll((Collection<? extends PEO>) newValue);
			return;
		case ObeModelPackage.PROGRAM__PROGRAMLEARNINGOUTCOMES:
			getProgramlearningoutcomes().clear();
			getProgramlearningoutcomes().addAll((Collection<? extends Plo>) newValue);
			return;
		case ObeModelPackage.PROGRAM__ASSOCIATEDBATCHES:
			getAssociatedbatches().clear();
			getAssociatedbatches().addAll((Collection<? extends Batches>) newValue);
			return;
		case ObeModelPackage.PROGRAM__OFFEREDCOURSES:
			getOfferedcourses().clear();
			getOfferedcourses().addAll((Collection<? extends Courses>) newValue);
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
		case ObeModelPackage.PROGRAM__NAME:
			setName(NAME_EDEFAULT);
			return;
		case ObeModelPackage.PROGRAM__PROGRAMOBJECTIVES:
			getProgramobjectives().clear();
			return;
		case ObeModelPackage.PROGRAM__PROGRAMLEARNINGOUTCOMES:
			getProgramlearningoutcomes().clear();
			return;
		case ObeModelPackage.PROGRAM__ASSOCIATEDBATCHES:
			getAssociatedbatches().clear();
			return;
		case ObeModelPackage.PROGRAM__OFFEREDCOURSES:
			getOfferedcourses().clear();
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
		case ObeModelPackage.PROGRAM__NAME:
			return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
		case ObeModelPackage.PROGRAM__PROGRAMOBJECTIVES:
			return programobjectives != null && !programobjectives.isEmpty();
		case ObeModelPackage.PROGRAM__PROGRAMLEARNINGOUTCOMES:
			return programlearningoutcomes != null && !programlearningoutcomes.isEmpty();
		case ObeModelPackage.PROGRAM__ASSOCIATEDBATCHES:
			return associatedbatches != null && !associatedbatches.isEmpty();
		case ObeModelPackage.PROGRAM__OFFEREDCOURSES:
			return offeredcourses != null && !offeredcourses.isEmpty();
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
		result.append(')');
		return result.toString();
	}

} //ProgramImpl
