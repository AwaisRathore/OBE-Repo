/**
 */
package ObeModel.impl;

import ObeModel.Activity;
import ObeModel.Batches;
import ObeModel.CLO;
import ObeModel.Courses;
import ObeModel.Institute;
import ObeModel.LearningLevels;
import ObeModel.Mission;
import ObeModel.OBERootNode;
import ObeModel.ObeModelPackage;
import ObeModel.PEO;
import ObeModel.Plo;
import ObeModel.Program;
import ObeModel.Results;
import ObeModel.Student;
import ObeModel.Vision;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>OBE Root Node</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ObeModel.impl.OBERootNodeImpl#getInstitutes <em>Institutes</em>}</li>
 *   <li>{@link ObeModel.impl.OBERootNodeImpl#getVisions <em>Visions</em>}</li>
 *   <li>{@link ObeModel.impl.OBERootNodeImpl#getMissions <em>Missions</em>}</li>
 *   <li>{@link ObeModel.impl.OBERootNodeImpl#getPeos <em>Peos</em>}</li>
 *   <li>{@link ObeModel.impl.OBERootNodeImpl#getCourses <em>Courses</em>}</li>
 *   <li>{@link ObeModel.impl.OBERootNodeImpl#getBatches <em>Batches</em>}</li>
 *   <li>{@link ObeModel.impl.OBERootNodeImpl#getPrograms <em>Programs</em>}</li>
 *   <li>{@link ObeModel.impl.OBERootNodeImpl#getPlos <em>Plos</em>}</li>
 *   <li>{@link ObeModel.impl.OBERootNodeImpl#getStudents <em>Students</em>}</li>
 *   <li>{@link ObeModel.impl.OBERootNodeImpl#getActivitties <em>Activitties</em>}</li>
 *   <li>{@link ObeModel.impl.OBERootNodeImpl#getClos <em>Clos</em>}</li>
 *   <li>{@link ObeModel.impl.OBERootNodeImpl#getLearninglevels <em>Learninglevels</em>}</li>
 *   <li>{@link ObeModel.impl.OBERootNodeImpl#getResults <em>Results</em>}</li>
 * </ul>
 *
 * @generated
 */
public class OBERootNodeImpl extends MinimalEObjectImpl.Container implements OBERootNode {
	/**
	 * The cached value of the '{@link #getInstitutes() <em>Institutes</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInstitutes()
	 * @generated
	 * @ordered
	 */
	protected EList<Institute> institutes;

	/**
	 * The cached value of the '{@link #getVisions() <em>Visions</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVisions()
	 * @generated
	 * @ordered
	 */
	protected EList<Vision> visions;

	/**
	 * The cached value of the '{@link #getMissions() <em>Missions</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMissions()
	 * @generated
	 * @ordered
	 */
	protected EList<Mission> missions;

	/**
	 * The cached value of the '{@link #getPeos() <em>Peos</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPeos()
	 * @generated
	 * @ordered
	 */
	protected EList<PEO> peos;

	/**
	 * The cached value of the '{@link #getCourses() <em>Courses</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCourses()
	 * @generated
	 * @ordered
	 */
	protected EList<Courses> courses;

	/**
	 * The cached value of the '{@link #getBatches() <em>Batches</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBatches()
	 * @generated
	 * @ordered
	 */
	protected EList<Batches> batches;

	/**
	 * The cached value of the '{@link #getPrograms() <em>Programs</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrograms()
	 * @generated
	 * @ordered
	 */
	protected EList<Program> programs;

	/**
	 * The cached value of the '{@link #getPlos() <em>Plos</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPlos()
	 * @generated
	 * @ordered
	 */
	protected EList<Plo> plos;

	/**
	 * The cached value of the '{@link #getStudents() <em>Students</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStudents()
	 * @generated
	 * @ordered
	 */
	protected EList<Student> students;

	/**
	 * The cached value of the '{@link #getActivitties() <em>Activitties</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActivitties()
	 * @generated
	 * @ordered
	 */
	protected EList<Activity> activitties;

	/**
	 * The cached value of the '{@link #getClos() <em>Clos</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClos()
	 * @generated
	 * @ordered
	 */
	protected EList<CLO> clos;

	/**
	 * The cached value of the '{@link #getLearninglevels() <em>Learninglevels</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLearninglevels()
	 * @generated
	 * @ordered
	 */
	protected EList<LearningLevels> learninglevels;

	/**
	 * The cached value of the '{@link #getResults() <em>Results</em>}' containment reference list.
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
	protected OBERootNodeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ObeModelPackage.Literals.OBE_ROOT_NODE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Institute> getInstitutes() {
		if (institutes == null) {
			institutes = new EObjectContainmentEList<Institute>(Institute.class, this,
					ObeModelPackage.OBE_ROOT_NODE__INSTITUTES);
		}
		return institutes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Vision> getVisions() {
		if (visions == null) {
			visions = new EObjectContainmentEList<Vision>(Vision.class, this, ObeModelPackage.OBE_ROOT_NODE__VISIONS);
		}
		return visions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Mission> getMissions() {
		if (missions == null) {
			missions = new EObjectContainmentEList<Mission>(Mission.class, this,
					ObeModelPackage.OBE_ROOT_NODE__MISSIONS);
		}
		return missions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PEO> getPeos() {
		if (peos == null) {
			peos = new EObjectContainmentEList<PEO>(PEO.class, this, ObeModelPackage.OBE_ROOT_NODE__PEOS);
		}
		return peos;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Courses> getCourses() {
		if (courses == null) {
			courses = new EObjectContainmentEList<Courses>(Courses.class, this, ObeModelPackage.OBE_ROOT_NODE__COURSES);
		}
		return courses;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Batches> getBatches() {
		if (batches == null) {
			batches = new EObjectContainmentEList<Batches>(Batches.class, this, ObeModelPackage.OBE_ROOT_NODE__BATCHES);
		}
		return batches;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Program> getPrograms() {
		if (programs == null) {
			programs = new EObjectContainmentEList<Program>(Program.class, this,
					ObeModelPackage.OBE_ROOT_NODE__PROGRAMS);
		}
		return programs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Plo> getPlos() {
		if (plos == null) {
			plos = new EObjectContainmentEList<Plo>(Plo.class, this, ObeModelPackage.OBE_ROOT_NODE__PLOS);
		}
		return plos;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Student> getStudents() {
		if (students == null) {
			students = new EObjectContainmentEList<Student>(Student.class, this,
					ObeModelPackage.OBE_ROOT_NODE__STUDENTS);
		}
		return students;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Activity> getActivitties() {
		if (activitties == null) {
			activitties = new EObjectContainmentEList<Activity>(Activity.class, this,
					ObeModelPackage.OBE_ROOT_NODE__ACTIVITTIES);
		}
		return activitties;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CLO> getClos() {
		if (clos == null) {
			clos = new EObjectContainmentEList<CLO>(CLO.class, this, ObeModelPackage.OBE_ROOT_NODE__CLOS);
		}
		return clos;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<LearningLevels> getLearninglevels() {
		if (learninglevels == null) {
			learninglevels = new EObjectContainmentEList<LearningLevels>(LearningLevels.class, this,
					ObeModelPackage.OBE_ROOT_NODE__LEARNINGLEVELS);
		}
		return learninglevels;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Results> getResults() {
		if (results == null) {
			results = new EObjectContainmentEList<Results>(Results.class, this, ObeModelPackage.OBE_ROOT_NODE__RESULTS);
		}
		return results;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case ObeModelPackage.OBE_ROOT_NODE__INSTITUTES:
			return ((InternalEList<?>) getInstitutes()).basicRemove(otherEnd, msgs);
		case ObeModelPackage.OBE_ROOT_NODE__VISIONS:
			return ((InternalEList<?>) getVisions()).basicRemove(otherEnd, msgs);
		case ObeModelPackage.OBE_ROOT_NODE__MISSIONS:
			return ((InternalEList<?>) getMissions()).basicRemove(otherEnd, msgs);
		case ObeModelPackage.OBE_ROOT_NODE__PEOS:
			return ((InternalEList<?>) getPeos()).basicRemove(otherEnd, msgs);
		case ObeModelPackage.OBE_ROOT_NODE__COURSES:
			return ((InternalEList<?>) getCourses()).basicRemove(otherEnd, msgs);
		case ObeModelPackage.OBE_ROOT_NODE__BATCHES:
			return ((InternalEList<?>) getBatches()).basicRemove(otherEnd, msgs);
		case ObeModelPackage.OBE_ROOT_NODE__PROGRAMS:
			return ((InternalEList<?>) getPrograms()).basicRemove(otherEnd, msgs);
		case ObeModelPackage.OBE_ROOT_NODE__PLOS:
			return ((InternalEList<?>) getPlos()).basicRemove(otherEnd, msgs);
		case ObeModelPackage.OBE_ROOT_NODE__STUDENTS:
			return ((InternalEList<?>) getStudents()).basicRemove(otherEnd, msgs);
		case ObeModelPackage.OBE_ROOT_NODE__ACTIVITTIES:
			return ((InternalEList<?>) getActivitties()).basicRemove(otherEnd, msgs);
		case ObeModelPackage.OBE_ROOT_NODE__CLOS:
			return ((InternalEList<?>) getClos()).basicRemove(otherEnd, msgs);
		case ObeModelPackage.OBE_ROOT_NODE__LEARNINGLEVELS:
			return ((InternalEList<?>) getLearninglevels()).basicRemove(otherEnd, msgs);
		case ObeModelPackage.OBE_ROOT_NODE__RESULTS:
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
		case ObeModelPackage.OBE_ROOT_NODE__INSTITUTES:
			return getInstitutes();
		case ObeModelPackage.OBE_ROOT_NODE__VISIONS:
			return getVisions();
		case ObeModelPackage.OBE_ROOT_NODE__MISSIONS:
			return getMissions();
		case ObeModelPackage.OBE_ROOT_NODE__PEOS:
			return getPeos();
		case ObeModelPackage.OBE_ROOT_NODE__COURSES:
			return getCourses();
		case ObeModelPackage.OBE_ROOT_NODE__BATCHES:
			return getBatches();
		case ObeModelPackage.OBE_ROOT_NODE__PROGRAMS:
			return getPrograms();
		case ObeModelPackage.OBE_ROOT_NODE__PLOS:
			return getPlos();
		case ObeModelPackage.OBE_ROOT_NODE__STUDENTS:
			return getStudents();
		case ObeModelPackage.OBE_ROOT_NODE__ACTIVITTIES:
			return getActivitties();
		case ObeModelPackage.OBE_ROOT_NODE__CLOS:
			return getClos();
		case ObeModelPackage.OBE_ROOT_NODE__LEARNINGLEVELS:
			return getLearninglevels();
		case ObeModelPackage.OBE_ROOT_NODE__RESULTS:
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
		case ObeModelPackage.OBE_ROOT_NODE__INSTITUTES:
			getInstitutes().clear();
			getInstitutes().addAll((Collection<? extends Institute>) newValue);
			return;
		case ObeModelPackage.OBE_ROOT_NODE__VISIONS:
			getVisions().clear();
			getVisions().addAll((Collection<? extends Vision>) newValue);
			return;
		case ObeModelPackage.OBE_ROOT_NODE__MISSIONS:
			getMissions().clear();
			getMissions().addAll((Collection<? extends Mission>) newValue);
			return;
		case ObeModelPackage.OBE_ROOT_NODE__PEOS:
			getPeos().clear();
			getPeos().addAll((Collection<? extends PEO>) newValue);
			return;
		case ObeModelPackage.OBE_ROOT_NODE__COURSES:
			getCourses().clear();
			getCourses().addAll((Collection<? extends Courses>) newValue);
			return;
		case ObeModelPackage.OBE_ROOT_NODE__BATCHES:
			getBatches().clear();
			getBatches().addAll((Collection<? extends Batches>) newValue);
			return;
		case ObeModelPackage.OBE_ROOT_NODE__PROGRAMS:
			getPrograms().clear();
			getPrograms().addAll((Collection<? extends Program>) newValue);
			return;
		case ObeModelPackage.OBE_ROOT_NODE__PLOS:
			getPlos().clear();
			getPlos().addAll((Collection<? extends Plo>) newValue);
			return;
		case ObeModelPackage.OBE_ROOT_NODE__STUDENTS:
			getStudents().clear();
			getStudents().addAll((Collection<? extends Student>) newValue);
			return;
		case ObeModelPackage.OBE_ROOT_NODE__ACTIVITTIES:
			getActivitties().clear();
			getActivitties().addAll((Collection<? extends Activity>) newValue);
			return;
		case ObeModelPackage.OBE_ROOT_NODE__CLOS:
			getClos().clear();
			getClos().addAll((Collection<? extends CLO>) newValue);
			return;
		case ObeModelPackage.OBE_ROOT_NODE__LEARNINGLEVELS:
			getLearninglevels().clear();
			getLearninglevels().addAll((Collection<? extends LearningLevels>) newValue);
			return;
		case ObeModelPackage.OBE_ROOT_NODE__RESULTS:
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
		case ObeModelPackage.OBE_ROOT_NODE__INSTITUTES:
			getInstitutes().clear();
			return;
		case ObeModelPackage.OBE_ROOT_NODE__VISIONS:
			getVisions().clear();
			return;
		case ObeModelPackage.OBE_ROOT_NODE__MISSIONS:
			getMissions().clear();
			return;
		case ObeModelPackage.OBE_ROOT_NODE__PEOS:
			getPeos().clear();
			return;
		case ObeModelPackage.OBE_ROOT_NODE__COURSES:
			getCourses().clear();
			return;
		case ObeModelPackage.OBE_ROOT_NODE__BATCHES:
			getBatches().clear();
			return;
		case ObeModelPackage.OBE_ROOT_NODE__PROGRAMS:
			getPrograms().clear();
			return;
		case ObeModelPackage.OBE_ROOT_NODE__PLOS:
			getPlos().clear();
			return;
		case ObeModelPackage.OBE_ROOT_NODE__STUDENTS:
			getStudents().clear();
			return;
		case ObeModelPackage.OBE_ROOT_NODE__ACTIVITTIES:
			getActivitties().clear();
			return;
		case ObeModelPackage.OBE_ROOT_NODE__CLOS:
			getClos().clear();
			return;
		case ObeModelPackage.OBE_ROOT_NODE__LEARNINGLEVELS:
			getLearninglevels().clear();
			return;
		case ObeModelPackage.OBE_ROOT_NODE__RESULTS:
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
		case ObeModelPackage.OBE_ROOT_NODE__INSTITUTES:
			return institutes != null && !institutes.isEmpty();
		case ObeModelPackage.OBE_ROOT_NODE__VISIONS:
			return visions != null && !visions.isEmpty();
		case ObeModelPackage.OBE_ROOT_NODE__MISSIONS:
			return missions != null && !missions.isEmpty();
		case ObeModelPackage.OBE_ROOT_NODE__PEOS:
			return peos != null && !peos.isEmpty();
		case ObeModelPackage.OBE_ROOT_NODE__COURSES:
			return courses != null && !courses.isEmpty();
		case ObeModelPackage.OBE_ROOT_NODE__BATCHES:
			return batches != null && !batches.isEmpty();
		case ObeModelPackage.OBE_ROOT_NODE__PROGRAMS:
			return programs != null && !programs.isEmpty();
		case ObeModelPackage.OBE_ROOT_NODE__PLOS:
			return plos != null && !plos.isEmpty();
		case ObeModelPackage.OBE_ROOT_NODE__STUDENTS:
			return students != null && !students.isEmpty();
		case ObeModelPackage.OBE_ROOT_NODE__ACTIVITTIES:
			return activitties != null && !activitties.isEmpty();
		case ObeModelPackage.OBE_ROOT_NODE__CLOS:
			return clos != null && !clos.isEmpty();
		case ObeModelPackage.OBE_ROOT_NODE__LEARNINGLEVELS:
			return learninglevels != null && !learninglevels.isEmpty();
		case ObeModelPackage.OBE_ROOT_NODE__RESULTS:
			return results != null && !results.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //OBERootNodeImpl
