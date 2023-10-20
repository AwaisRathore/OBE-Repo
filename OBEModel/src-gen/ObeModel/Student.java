/**
 */
package ObeModel;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Student</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ObeModel.Student#getRollNumber <em>Roll Number</em>}</li>
 *   <li>{@link ObeModel.Student#getName <em>Name</em>}</li>
 *   <li>{@link ObeModel.Student#getBatche <em>Batche</em>}</li>
 *   <li>{@link ObeModel.Student#getRegistercourse <em>Registercourse</em>}</li>
 *   <li>{@link ObeModel.Student#getResults <em>Results</em>}</li>
 * </ul>
 *
 * @see ObeModel.ObeModelPackage#getStudent()
 * @model
 * @generated
 */
public interface Student extends EObject {
	/**
	 * Returns the value of the '<em><b>Roll Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Roll Number</em>' attribute.
	 * @see #setRollNumber(String)
	 * @see ObeModel.ObeModelPackage#getStudent_RollNumber()
	 * @model required="true"
	 * @generated
	 */
	String getRollNumber();

	/**
	 * Sets the value of the '{@link ObeModel.Student#getRollNumber <em>Roll Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Roll Number</em>' attribute.
	 * @see #getRollNumber()
	 * @generated
	 */
	void setRollNumber(String value);

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see ObeModel.ObeModelPackage#getStudent_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link ObeModel.Student#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Batche</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link ObeModel.Batches#getStudents <em>Students</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Batche</em>' reference.
	 * @see #setBatche(Batches)
	 * @see ObeModel.ObeModelPackage#getStudent_Batche()
	 * @see ObeModel.Batches#getStudents
	 * @model opposite="students" required="true"
	 * @generated
	 */
	Batches getBatche();

	/**
	 * Sets the value of the '{@link ObeModel.Student#getBatche <em>Batche</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Batche</em>' reference.
	 * @see #getBatche()
	 * @generated
	 */
	void setBatche(Batches value);

	/**
	 * Returns the value of the '<em><b>Registercourse</b></em>' reference list.
	 * The list contents are of type {@link ObeModel.Courses}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Registercourse</em>' reference list.
	 * @see ObeModel.ObeModelPackage#getStudent_Registercourse()
	 * @model
	 * @generated
	 */
	EList<Courses> getRegistercourse();

	/**
	 * Returns the value of the '<em><b>Results</b></em>' reference list.
	 * The list contents are of type {@link ObeModel.Results}.
	 * It is bidirectional and its opposite is '{@link ObeModel.Results#getStudent <em>Student</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Results</em>' reference list.
	 * @see ObeModel.ObeModelPackage#getStudent_Results()
	 * @see ObeModel.Results#getStudent
	 * @model opposite="student"
	 * @generated
	 */
	EList<Results> getResults();

} // Student
