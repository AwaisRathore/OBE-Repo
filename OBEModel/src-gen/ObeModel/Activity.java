/**
 */
package ObeModel;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Activity</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ObeModel.Activity#getName <em>Name</em>}</li>
 *   <li>{@link ObeModel.Activity#getTotalMarks <em>Total Marks</em>}</li>
 *   <li>{@link ObeModel.Activity#getAssesmentType <em>Assesment Type</em>}</li>
 *   <li>{@link ObeModel.Activity#getActivityType <em>Activity Type</em>}</li>
 *   <li>{@link ObeModel.Activity#getClo <em>Clo</em>}</li>
 *   <li>{@link ObeModel.Activity#getResults <em>Results</em>}</li>
 *   <li>{@link ObeModel.Activity#getActivityWeight <em>Activity Weight</em>}</li>
 * </ul>
 *
 * @see ObeModel.ObeModelPackage#getActivity()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='OnlyDirectAssesmentCanHaveCLO'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot OnlyDirectAssesmentCanHaveCLO='\n\t\t  if self.AssesmentType = AssesmentType::Direct then\n\t\t    self.clo-&gt;notEmpty() and self.clo-&gt;size() = 1\n\t\t  else\n\t\t    self.clo-&gt;isEmpty()\n\t\t  endif'"
 * @generated
 */
public interface Activity extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see ObeModel.ObeModelPackage#getActivity_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link ObeModel.Activity#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Total Marks</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Total Marks</em>' attribute.
	 * @see #setTotalMarks(int)
	 * @see ObeModel.ObeModelPackage#getActivity_TotalMarks()
	 * @model required="true"
	 * @generated
	 */
	int getTotalMarks();

	/**
	 * Sets the value of the '{@link ObeModel.Activity#getTotalMarks <em>Total Marks</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Total Marks</em>' attribute.
	 * @see #getTotalMarks()
	 * @generated
	 */
	void setTotalMarks(int value);

	/**
	 * Returns the value of the '<em><b>Assesment Type</b></em>' attribute.
	 * The literals are from the enumeration {@link ObeModel.AssesmentType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Assesment Type</em>' attribute.
	 * @see ObeModel.AssesmentType
	 * @see #setAssesmentType(AssesmentType)
	 * @see ObeModel.ObeModelPackage#getActivity_AssesmentType()
	 * @model
	 * @generated
	 */
	AssesmentType getAssesmentType();

	/**
	 * Sets the value of the '{@link ObeModel.Activity#getAssesmentType <em>Assesment Type</em>}' attribute.
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
	 * @see ObeModel.ObeModelPackage#getActivity_ActivityType()
	 * @model
	 * @generated
	 */
	ActivityType getActivityType();

	/**
	 * Sets the value of the '{@link ObeModel.Activity#getActivityType <em>Activity Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Activity Type</em>' attribute.
	 * @see ObeModel.ActivityType
	 * @see #getActivityType()
	 * @generated
	 */
	void setActivityType(ActivityType value);

	/**
	 * Returns the value of the '<em><b>Clo</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link ObeModel.CLO#getActivity <em>Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Clo</em>' reference.
	 * @see #setClo(CLO)
	 * @see ObeModel.ObeModelPackage#getActivity_Clo()
	 * @see ObeModel.CLO#getActivity
	 * @model opposite="activity"
	 * @generated
	 */
	CLO getClo();

	/**
	 * Sets the value of the '{@link ObeModel.Activity#getClo <em>Clo</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Clo</em>' reference.
	 * @see #getClo()
	 * @generated
	 */
	void setClo(CLO value);

	/**
	 * Returns the value of the '<em><b>Results</b></em>' reference list.
	 * The list contents are of type {@link ObeModel.Results}.
	 * It is bidirectional and its opposite is '{@link ObeModel.Results#getActivity <em>Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Results</em>' reference list.
	 * @see ObeModel.ObeModelPackage#getActivity_Results()
	 * @see ObeModel.Results#getActivity
	 * @model opposite="activity"
	 * @generated
	 */
	EList<Results> getResults();

	/**
	 * Returns the value of the '<em><b>Activity Weight</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Activity Weight</em>' attribute.
	 * @see #setActivityWeight(double)
	 * @see ObeModel.ObeModelPackage#getActivity_ActivityWeight()
	 * @model required="true"
	 * @generated
	 */
	double getActivityWeight();

	/**
	 * Sets the value of the '{@link ObeModel.Activity#getActivityWeight <em>Activity Weight</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Activity Weight</em>' attribute.
	 * @see #getActivityWeight()
	 * @generated
	 */
	void setActivityWeight(double value);

} // Activity
