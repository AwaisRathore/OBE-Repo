/**
 */
package ObeModel;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Assesment</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ObeModel.Assesment#getName <em>Name</em>}</li>
 *   <li>{@link ObeModel.Assesment#getAssesmentType <em>Assesment Type</em>}</li>
 *   <li>{@link ObeModel.Assesment#getActivityType <em>Activity Type</em>}</li>
 *   <li>{@link ObeModel.Assesment#getRespondantName <em>Respondant Name</em>}</li>
 *   <li>{@link ObeModel.Assesment#getMarks <em>Marks</em>}</li>
 * </ul>
 *
 * @see ObeModel.ObeModelPackage#getAssesment()
 * @model
 * @generated
 */
public interface Assesment extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see ObeModel.ObeModelPackage#getAssesment_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link ObeModel.Assesment#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Assesment Type</b></em>' attribute.
	 * The default value is <code>"Indirect"</code>.
	 * The literals are from the enumeration {@link ObeModel.AssesmentType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Assesment Type</em>' attribute.
	 * @see ObeModel.AssesmentType
	 * @see #setAssesmentType(AssesmentType)
	 * @see ObeModel.ObeModelPackage#getAssesment_AssesmentType()
	 * @model default="Indirect"
	 * @generated
	 */
	AssesmentType getAssesmentType();

	/**
	 * Sets the value of the '{@link ObeModel.Assesment#getAssesmentType <em>Assesment Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Assesment Type</em>' attribute.
	 * @see ObeModel.AssesmentType
	 * @see #getAssesmentType()
	 * @generated
	 */
	void setAssesmentType(AssesmentType value);

	/**
	 * Returns the value of the '<em><b>Activity Type</b></em>' attribute.
	 * The literals are from the enumeration {@link ObeModel.ActivityType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Activity Type</em>' attribute.
	 * @see ObeModel.ActivityType
	 * @see #setActivityType(ActivityType)
	 * @see ObeModel.ObeModelPackage#getAssesment_ActivityType()
	 * @model
	 * @generated
	 */
	ActivityType getActivityType();

	/**
	 * Sets the value of the '{@link ObeModel.Assesment#getActivityType <em>Activity Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Activity Type</em>' attribute.
	 * @see ObeModel.ActivityType
	 * @see #getActivityType()
	 * @generated
	 */
	void setActivityType(ActivityType value);

	/**
	 * Returns the value of the '<em><b>Respondant Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Respondant Name</em>' attribute.
	 * @see #setRespondantName(String)
	 * @see ObeModel.ObeModelPackage#getAssesment_RespondantName()
	 * @model
	 * @generated
	 */
	String getRespondantName();

	/**
	 * Sets the value of the '{@link ObeModel.Assesment#getRespondantName <em>Respondant Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Respondant Name</em>' attribute.
	 * @see #getRespondantName()
	 * @generated
	 */
	void setRespondantName(String value);

	/**
	 * Returns the value of the '<em><b>Marks</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Marks</em>' attribute.
	 * @see #setMarks(double)
	 * @see ObeModel.ObeModelPackage#getAssesment_Marks()
	 * @model
	 * @generated
	 */
	double getMarks();

	/**
	 * Sets the value of the '{@link ObeModel.Assesment#getMarks <em>Marks</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Marks</em>' attribute.
	 * @see #getMarks()
	 * @generated
	 */
	void setMarks(double value);

} // Assesment
