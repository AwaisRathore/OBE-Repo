/**
 */
package ObeModel;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Courses</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ObeModel.Courses#getName <em>Name</em>}</li>
 *   <li>{@link ObeModel.Courses#getLearningoutcomes <em>Learningoutcomes</em>}</li>
 *   <li>{@link ObeModel.Courses#getActivities <em>Activities</em>}</li>
 * </ul>
 *
 * @see ObeModel.ObeModelPackage#getCourses()
 * @model
 * @generated
 */
public interface Courses extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see ObeModel.ObeModelPackage#getCourses_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link ObeModel.Courses#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Learningoutcomes</b></em>' reference list.
	 * The list contents are of type {@link ObeModel.CLO}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Learningoutcomes</em>' reference list.
	 * @see ObeModel.ObeModelPackage#getCourses_Learningoutcomes()
	 * @model required="true"
	 * @generated
	 */
	EList<CLO> getLearningoutcomes();

	/**
	 * Returns the value of the '<em><b>Activities</b></em>' reference list.
	 * The list contents are of type {@link ObeModel.Activity}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Activities</em>' reference list.
	 * @see ObeModel.ObeModelPackage#getCourses_Activities()
	 * @model required="true"
	 * @generated
	 */
	EList<Activity> getActivities();

} // Courses
