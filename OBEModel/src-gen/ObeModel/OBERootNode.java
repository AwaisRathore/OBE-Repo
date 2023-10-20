/**
 */
package ObeModel;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>OBE Root Node</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ObeModel.OBERootNode#getInstitutes <em>Institutes</em>}</li>
 *   <li>{@link ObeModel.OBERootNode#getVisions <em>Visions</em>}</li>
 *   <li>{@link ObeModel.OBERootNode#getMissions <em>Missions</em>}</li>
 *   <li>{@link ObeModel.OBERootNode#getPeos <em>Peos</em>}</li>
 *   <li>{@link ObeModel.OBERootNode#getCourses <em>Courses</em>}</li>
 *   <li>{@link ObeModel.OBERootNode#getBatches <em>Batches</em>}</li>
 *   <li>{@link ObeModel.OBERootNode#getPrograms <em>Programs</em>}</li>
 *   <li>{@link ObeModel.OBERootNode#getPlos <em>Plos</em>}</li>
 *   <li>{@link ObeModel.OBERootNode#getStudents <em>Students</em>}</li>
 *   <li>{@link ObeModel.OBERootNode#getActivitties <em>Activitties</em>}</li>
 *   <li>{@link ObeModel.OBERootNode#getClos <em>Clos</em>}</li>
 *   <li>{@link ObeModel.OBERootNode#getLearninglevels <em>Learninglevels</em>}</li>
 *   <li>{@link ObeModel.OBERootNode#getResults <em>Results</em>}</li>
 * </ul>
 *
 * @see ObeModel.ObeModelPackage#getOBERootNode()
 * @model
 * @generated
 */
public interface OBERootNode extends EObject {
	/**
	 * Returns the value of the '<em><b>Institutes</b></em>' containment reference list.
	 * The list contents are of type {@link ObeModel.Institute}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Institutes</em>' containment reference list.
	 * @see ObeModel.ObeModelPackage#getOBERootNode_Institutes()
	 * @model containment="true"
	 * @generated
	 */
	EList<Institute> getInstitutes();

	/**
	 * Returns the value of the '<em><b>Visions</b></em>' containment reference list.
	 * The list contents are of type {@link ObeModel.Vision}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Visions</em>' containment reference list.
	 * @see ObeModel.ObeModelPackage#getOBERootNode_Visions()
	 * @model containment="true"
	 * @generated
	 */
	EList<Vision> getVisions();

	/**
	 * Returns the value of the '<em><b>Missions</b></em>' containment reference list.
	 * The list contents are of type {@link ObeModel.Mission}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Missions</em>' containment reference list.
	 * @see ObeModel.ObeModelPackage#getOBERootNode_Missions()
	 * @model containment="true"
	 * @generated
	 */
	EList<Mission> getMissions();

	/**
	 * Returns the value of the '<em><b>Peos</b></em>' containment reference list.
	 * The list contents are of type {@link ObeModel.PEO}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Peos</em>' containment reference list.
	 * @see ObeModel.ObeModelPackage#getOBERootNode_Peos()
	 * @model containment="true"
	 * @generated
	 */
	EList<PEO> getPeos();

	/**
	 * Returns the value of the '<em><b>Courses</b></em>' containment reference list.
	 * The list contents are of type {@link ObeModel.Courses}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Courses</em>' containment reference list.
	 * @see ObeModel.ObeModelPackage#getOBERootNode_Courses()
	 * @model containment="true"
	 * @generated
	 */
	EList<Courses> getCourses();

	/**
	 * Returns the value of the '<em><b>Batches</b></em>' containment reference list.
	 * The list contents are of type {@link ObeModel.Batches}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Batches</em>' containment reference list.
	 * @see ObeModel.ObeModelPackage#getOBERootNode_Batches()
	 * @model containment="true"
	 * @generated
	 */
	EList<Batches> getBatches();

	/**
	 * Returns the value of the '<em><b>Programs</b></em>' containment reference list.
	 * The list contents are of type {@link ObeModel.Program}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Programs</em>' containment reference list.
	 * @see ObeModel.ObeModelPackage#getOBERootNode_Programs()
	 * @model containment="true"
	 * @generated
	 */
	EList<Program> getPrograms();

	/**
	 * Returns the value of the '<em><b>Plos</b></em>' containment reference list.
	 * The list contents are of type {@link ObeModel.Plo}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Plos</em>' containment reference list.
	 * @see ObeModel.ObeModelPackage#getOBERootNode_Plos()
	 * @model containment="true"
	 * @generated
	 */
	EList<Plo> getPlos();

	/**
	 * Returns the value of the '<em><b>Students</b></em>' containment reference list.
	 * The list contents are of type {@link ObeModel.Student}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Students</em>' containment reference list.
	 * @see ObeModel.ObeModelPackage#getOBERootNode_Students()
	 * @model containment="true"
	 * @generated
	 */
	EList<Student> getStudents();

	/**
	 * Returns the value of the '<em><b>Activitties</b></em>' containment reference list.
	 * The list contents are of type {@link ObeModel.Activity}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Activitties</em>' containment reference list.
	 * @see ObeModel.ObeModelPackage#getOBERootNode_Activitties()
	 * @model containment="true"
	 * @generated
	 */
	EList<Activity> getActivitties();

	/**
	 * Returns the value of the '<em><b>Clos</b></em>' containment reference list.
	 * The list contents are of type {@link ObeModel.CLO}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Clos</em>' containment reference list.
	 * @see ObeModel.ObeModelPackage#getOBERootNode_Clos()
	 * @model containment="true"
	 * @generated
	 */
	EList<CLO> getClos();

	/**
	 * Returns the value of the '<em><b>Learninglevels</b></em>' containment reference list.
	 * The list contents are of type {@link ObeModel.LearningLevels}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Learninglevels</em>' containment reference list.
	 * @see ObeModel.ObeModelPackage#getOBERootNode_Learninglevels()
	 * @model containment="true"
	 * @generated
	 */
	EList<LearningLevels> getLearninglevels();

	/**
	 * Returns the value of the '<em><b>Results</b></em>' containment reference list.
	 * The list contents are of type {@link ObeModel.Results}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Results</em>' containment reference list.
	 * @see ObeModel.ObeModelPackage#getOBERootNode_Results()
	 * @model containment="true"
	 * @generated
	 */
	EList<Results> getResults();

} // OBERootNode
