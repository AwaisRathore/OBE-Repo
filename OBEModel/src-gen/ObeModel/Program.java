/**
 */
package ObeModel;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Program</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ObeModel.Program#getName <em>Name</em>}</li>
 *   <li>{@link ObeModel.Program#getProgramobjectives <em>Programobjectives</em>}</li>
 *   <li>{@link ObeModel.Program#getProgramlearningoutcomes <em>Programlearningoutcomes</em>}</li>
 *   <li>{@link ObeModel.Program#getAssociatedbatches <em>Associatedbatches</em>}</li>
 *   <li>{@link ObeModel.Program#getOfferedcourses <em>Offeredcourses</em>}</li>
 * </ul>
 *
 * @see ObeModel.ObeModelPackage#getProgram()
 * @model
 * @generated
 */
public interface Program extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see ObeModel.ObeModelPackage#getProgram_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link ObeModel.Program#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Programobjectives</b></em>' reference list.
	 * The list contents are of type {@link ObeModel.PEO}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Programobjectives</em>' reference list.
	 * @see ObeModel.ObeModelPackage#getProgram_Programobjectives()
	 * @model required="true"
	 * @generated
	 */
	EList<PEO> getProgramobjectives();

	/**
	 * Returns the value of the '<em><b>Programlearningoutcomes</b></em>' reference list.
	 * The list contents are of type {@link ObeModel.Plo}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Programlearningoutcomes</em>' reference list.
	 * @see ObeModel.ObeModelPackage#getProgram_Programlearningoutcomes()
	 * @model required="true"
	 * @generated
	 */
	EList<Plo> getProgramlearningoutcomes();

	/**
	 * Returns the value of the '<em><b>Associatedbatches</b></em>' reference list.
	 * The list contents are of type {@link ObeModel.Batches}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Associatedbatches</em>' reference list.
	 * @see ObeModel.ObeModelPackage#getProgram_Associatedbatches()
	 * @model required="true"
	 * @generated
	 */
	EList<Batches> getAssociatedbatches();

	/**
	 * Returns the value of the '<em><b>Offeredcourses</b></em>' reference list.
	 * The list contents are of type {@link ObeModel.Courses}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Offeredcourses</em>' reference list.
	 * @see ObeModel.ObeModelPackage#getProgram_Offeredcourses()
	 * @model required="true"
	 * @generated
	 */
	EList<Courses> getOfferedcourses();

} // Program
