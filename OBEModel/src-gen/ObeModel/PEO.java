/**
 */
package ObeModel;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>PEO</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ObeModel.PEO#getPEOStatement <em>PEO Statement</em>}</li>
 *   <li>{@link ObeModel.PEO#getThreshold <em>Threshold</em>}</li>
 *   <li>{@link ObeModel.PEO#getMission <em>Mission</em>}</li>
 *   <li>{@link ObeModel.PEO#getPlos <em>Plos</em>}</li>
 *   <li>{@link ObeModel.PEO#getTitle <em>Title</em>}</li>
 *   <li>{@link ObeModel.PEO#getAssesment <em>Assesment</em>}</li>
 * </ul>
 *
 * @see ObeModel.ObeModelPackage#getPEO()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='PEOCanBeMappedToOnlyMissionInstanceofDepartment'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot PEOCanBeMappedToOnlyMissionInstanceofDepartment='\n  \t\tself.mission.institute.InstituteLevel = InstituteLevel::Department'"
 * @generated
 */
public interface PEO extends EObject {
	/**
	 * Returns the value of the '<em><b>PEO Statement</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>PEO Statement</em>' attribute.
	 * @see #setPEOStatement(String)
	 * @see ObeModel.ObeModelPackage#getPEO_PEOStatement()
	 * @model
	 * @generated
	 */
	String getPEOStatement();

	/**
	 * Sets the value of the '{@link ObeModel.PEO#getPEOStatement <em>PEO Statement</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>PEO Statement</em>' attribute.
	 * @see #getPEOStatement()
	 * @generated
	 */
	void setPEOStatement(String value);

	/**
	 * Returns the value of the '<em><b>Threshold</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Threshold</em>' attribute.
	 * @see #setThreshold(int)
	 * @see ObeModel.ObeModelPackage#getPEO_Threshold()
	 * @model required="true"
	 * @generated
	 */
	int getThreshold();

	/**
	 * Sets the value of the '{@link ObeModel.PEO#getThreshold <em>Threshold</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Threshold</em>' attribute.
	 * @see #getThreshold()
	 * @generated
	 */
	void setThreshold(int value);

	/**
	 * Returns the value of the '<em><b>Mission</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mission</em>' reference.
	 * @see #setMission(Mission)
	 * @see ObeModel.ObeModelPackage#getPEO_Mission()
	 * @model required="true"
	 * @generated
	 */
	Mission getMission();

	/**
	 * Sets the value of the '{@link ObeModel.PEO#getMission <em>Mission</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mission</em>' reference.
	 * @see #getMission()
	 * @generated
	 */
	void setMission(Mission value);

	/**
	 * Returns the value of the '<em><b>Plos</b></em>' reference list.
	 * The list contents are of type {@link ObeModel.Plo}.
	 * It is bidirectional and its opposite is '{@link ObeModel.Plo#getPeo <em>Peo</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Plos</em>' reference list.
	 * @see ObeModel.ObeModelPackage#getPEO_Plos()
	 * @see ObeModel.Plo#getPeo
	 * @model opposite="peo" required="true"
	 * @generated
	 */
	EList<Plo> getPlos();

	/**
	 * Returns the value of the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Title</em>' attribute.
	 * @see #setTitle(String)
	 * @see ObeModel.ObeModelPackage#getPEO_Title()
	 * @model
	 * @generated
	 */
	String getTitle();

	/**
	 * Sets the value of the '{@link ObeModel.PEO#getTitle <em>Title</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Title</em>' attribute.
	 * @see #getTitle()
	 * @generated
	 */
	void setTitle(String value);

	/**
	 * Returns the value of the '<em><b>Assesment</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Assesment</em>' reference.
	 * @see #setAssesment(Assesment)
	 * @see ObeModel.ObeModelPackage#getPEO_Assesment()
	 * @model
	 * @generated
	 */
	Assesment getAssesment();

	/**
	 * Sets the value of the '{@link ObeModel.PEO#getAssesment <em>Assesment</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Assesment</em>' reference.
	 * @see #getAssesment()
	 * @generated
	 */
	void setAssesment(Assesment value);

} // PEO
