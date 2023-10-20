/**
 */
package ObeModel;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Mission</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ObeModel.Mission#getMissionStatement <em>Mission Statement</em>}</li>
 *   <li>{@link ObeModel.Mission#getInstitute <em>Institute</em>}</li>
 *   <li>{@link ObeModel.Mission#getAssesment <em>Assesment</em>}</li>
 * </ul>
 *
 * @see ObeModel.ObeModelPackage#getMission()
 * @model
 * @generated
 */
public interface Mission extends EObject {
	/**
	 * Returns the value of the '<em><b>Mission Statement</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mission Statement</em>' attribute.
	 * @see #setMissionStatement(String)
	 * @see ObeModel.ObeModelPackage#getMission_MissionStatement()
	 * @model
	 * @generated
	 */
	String getMissionStatement();

	/**
	 * Sets the value of the '{@link ObeModel.Mission#getMissionStatement <em>Mission Statement</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mission Statement</em>' attribute.
	 * @see #getMissionStatement()
	 * @generated
	 */
	void setMissionStatement(String value);

	/**
	 * Returns the value of the '<em><b>Institute</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link ObeModel.Institute#getAssociatedmission <em>Associatedmission</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Institute</em>' reference.
	 * @see #setInstitute(Institute)
	 * @see ObeModel.ObeModelPackage#getMission_Institute()
	 * @see ObeModel.Institute#getAssociatedmission
	 * @model opposite="associatedmission"
	 * @generated
	 */
	Institute getInstitute();

	/**
	 * Sets the value of the '{@link ObeModel.Mission#getInstitute <em>Institute</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Institute</em>' reference.
	 * @see #getInstitute()
	 * @generated
	 */
	void setInstitute(Institute value);

	/**
	 * Returns the value of the '<em><b>Assesment</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Assesment</em>' reference.
	 * @see #setAssesment(Assesment)
	 * @see ObeModel.ObeModelPackage#getMission_Assesment()
	 * @model
	 * @generated
	 */
	Assesment getAssesment();

	/**
	 * Sets the value of the '{@link ObeModel.Mission#getAssesment <em>Assesment</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Assesment</em>' reference.
	 * @see #getAssesment()
	 * @generated
	 */
	void setAssesment(Assesment value);

} // Mission
