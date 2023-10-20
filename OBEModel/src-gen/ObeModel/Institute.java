/**
 */
package ObeModel;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Institute</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ObeModel.Institute#getName <em>Name</em>}</li>
 *   <li>{@link ObeModel.Institute#getInstituteLevel <em>Institute Level</em>}</li>
 *   <li>{@link ObeModel.Institute#getAssociatedvision <em>Associatedvision</em>}</li>
 *   <li>{@link ObeModel.Institute#getOfferprograms <em>Offerprograms</em>}</li>
 *   <li>{@link ObeModel.Institute#getParentInstitute <em>Parent Institute</em>}</li>
 *   <li>{@link ObeModel.Institute#getAssociatedmission <em>Associatedmission</em>}</li>
 * </ul>
 *
 * @see ObeModel.ObeModelPackage#getInstitute()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='parentInsitutionCheck VisionCanBeAssignedOnlyToInstitutionLevelUniversity OnlyDepartmentCanOfferPrograms'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot parentInsitutionCheck='\n\t\t  if self.InstituteLevel = InstituteLevel::University then\n\t\t    self.parentInstitute = null\n\t\t  else\n\t\t    if self.InstituteLevel = InstituteLevel::Department then\n\t\t      self.parentInstitute.InstituteLevel = InstituteLevel::Faculty\n\t\t    else\n\t\t       self.parentInstitute.InstituteLevel = InstituteLevel::University\n\t\t    endif\n\t\t  endif' VisionCanBeAssignedOnlyToInstitutionLevelUniversity='\n\t\t  if self.InstituteLevel = InstituteLevel::University then\n\t\t    self.associatedvision &lt;&gt; null\n\t\t  else\n\t\t    self.associatedvision = null\n\t\t  endif' OnlyDepartmentCanOfferPrograms='\n\t\t  if self.InstituteLevel = InstituteLevel::Department then\n\t\t    self.Offerprograms-&gt;notEmpty()\n\t\t  else\n\t\t    self.Offerprograms-&gt;isEmpty()\n\t\t  endif'"
 * @generated
 */
public interface Institute extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see ObeModel.ObeModelPackage#getInstitute_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link ObeModel.Institute#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Institute Level</b></em>' attribute.
	 * The default value is <code>"University"</code>.
	 * The literals are from the enumeration {@link ObeModel.InstituteLevel}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Institute Level</em>' attribute.
	 * @see ObeModel.InstituteLevel
	 * @see #setInstituteLevel(InstituteLevel)
	 * @see ObeModel.ObeModelPackage#getInstitute_InstituteLevel()
	 * @model default="University"
	 * @generated
	 */
	InstituteLevel getInstituteLevel();

	/**
	 * Sets the value of the '{@link ObeModel.Institute#getInstituteLevel <em>Institute Level</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Institute Level</em>' attribute.
	 * @see ObeModel.InstituteLevel
	 * @see #getInstituteLevel()
	 * @generated
	 */
	void setInstituteLevel(InstituteLevel value);

	/**
	 * Returns the value of the '<em><b>Associatedvision</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Associatedvision</em>' reference.
	 * @see #setAssociatedvision(Vision)
	 * @see ObeModel.ObeModelPackage#getInstitute_Associatedvision()
	 * @model
	 * @generated
	 */
	Vision getAssociatedvision();

	/**
	 * Sets the value of the '{@link ObeModel.Institute#getAssociatedvision <em>Associatedvision</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Associatedvision</em>' reference.
	 * @see #getAssociatedvision()
	 * @generated
	 */
	void setAssociatedvision(Vision value);

	/**
	 * Returns the value of the '<em><b>Offerprograms</b></em>' reference list.
	 * The list contents are of type {@link ObeModel.Program}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Offerprograms</em>' reference list.
	 * @see ObeModel.ObeModelPackage#getInstitute_Offerprograms()
	 * @model
	 * @generated
	 */
	EList<Program> getOfferprograms();

	/**
	 * Returns the value of the '<em><b>Parent Institute</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parent Institute</em>' reference.
	 * @see #setParentInstitute(Institute)
	 * @see ObeModel.ObeModelPackage#getInstitute_ParentInstitute()
	 * @model
	 * @generated
	 */
	Institute getParentInstitute();

	/**
	 * Sets the value of the '{@link ObeModel.Institute#getParentInstitute <em>Parent Institute</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parent Institute</em>' reference.
	 * @see #getParentInstitute()
	 * @generated
	 */
	void setParentInstitute(Institute value);

	/**
	 * Returns the value of the '<em><b>Associatedmission</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link ObeModel.Mission#getInstitute <em>Institute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Associatedmission</em>' reference.
	 * @see #setAssociatedmission(Mission)
	 * @see ObeModel.ObeModelPackage#getInstitute_Associatedmission()
	 * @see ObeModel.Mission#getInstitute
	 * @model opposite="institute"
	 * @generated
	 */
	Mission getAssociatedmission();

	/**
	 * Sets the value of the '{@link ObeModel.Institute#getAssociatedmission <em>Associatedmission</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Associatedmission</em>' reference.
	 * @see #getAssociatedmission()
	 * @generated
	 */
	void setAssociatedmission(Mission value);

} // Institute
