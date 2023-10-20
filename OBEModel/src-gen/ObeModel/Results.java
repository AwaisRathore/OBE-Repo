/**
 */
package ObeModel;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Results</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ObeModel.Results#getObtainedMarks <em>Obtained Marks</em>}</li>
 *   <li>{@link ObeModel.Results#getStudent <em>Student</em>}</li>
 *   <li>{@link ObeModel.Results#getActivity <em>Activity</em>}</li>
 * </ul>
 *
 * @see ObeModel.ObeModelPackage#getResults()
 * @model
 * @generated
 */
public interface Results extends EObject {
	/**
	 * Returns the value of the '<em><b>Obtained Marks</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Obtained Marks</em>' attribute.
	 * @see #setObtainedMarks(double)
	 * @see ObeModel.ObeModelPackage#getResults_ObtainedMarks()
	 * @model required="true"
	 * @generated
	 */
	double getObtainedMarks();

	/**
	 * Sets the value of the '{@link ObeModel.Results#getObtainedMarks <em>Obtained Marks</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Obtained Marks</em>' attribute.
	 * @see #getObtainedMarks()
	 * @generated
	 */
	void setObtainedMarks(double value);

	/**
	 * Returns the value of the '<em><b>Student</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link ObeModel.Student#getResults <em>Results</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Student</em>' reference.
	 * @see #setStudent(Student)
	 * @see ObeModel.ObeModelPackage#getResults_Student()
	 * @see ObeModel.Student#getResults
	 * @model opposite="results" required="true"
	 * @generated
	 */
	Student getStudent();

	/**
	 * Sets the value of the '{@link ObeModel.Results#getStudent <em>Student</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Student</em>' reference.
	 * @see #getStudent()
	 * @generated
	 */
	void setStudent(Student value);

	/**
	 * Returns the value of the '<em><b>Activity</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link ObeModel.Activity#getResults <em>Results</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Activity</em>' reference.
	 * @see #setActivity(Activity)
	 * @see ObeModel.ObeModelPackage#getResults_Activity()
	 * @see ObeModel.Activity#getResults
	 * @model opposite="results" required="true"
	 * @generated
	 */
	Activity getActivity();

	/**
	 * Sets the value of the '{@link ObeModel.Results#getActivity <em>Activity</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Activity</em>' reference.
	 * @see #getActivity()
	 * @generated
	 */
	void setActivity(Activity value);

} // Results
