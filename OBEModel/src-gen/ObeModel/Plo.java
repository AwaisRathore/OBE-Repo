/**
 */
package ObeModel;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Plo</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ObeModel.Plo#getTitle <em>Title</em>}</li>
 *   <li>{@link ObeModel.Plo#getClosMapping <em>Clos Mapping</em>}</li>
 *   <li>{@link ObeModel.Plo#getPeo <em>Peo</em>}</li>
 * </ul>
 *
 * @see ObeModel.ObeModelPackage#getPlo()
 * @model
 * @generated
 */
public interface Plo extends EObject {
	/**
	 * Returns the value of the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Title</em>' attribute.
	 * @see #setTitle(String)
	 * @see ObeModel.ObeModelPackage#getPlo_Title()
	 * @model
	 * @generated
	 */
	String getTitle();

	/**
	 * Sets the value of the '{@link ObeModel.Plo#getTitle <em>Title</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Title</em>' attribute.
	 * @see #getTitle()
	 * @generated
	 */
	void setTitle(String value);

	/**
	 * Returns the value of the '<em><b>Clos Mapping</b></em>' reference list.
	 * The list contents are of type {@link ObeModel.CLO}.
	 * It is bidirectional and its opposite is '{@link ObeModel.CLO#getMaptoplo <em>Maptoplo</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Clos Mapping</em>' reference list.
	 * @see ObeModel.ObeModelPackage#getPlo_ClosMapping()
	 * @see ObeModel.CLO#getMaptoplo
	 * @model opposite="maptoplo"
	 * @generated
	 */
	EList<CLO> getClosMapping();

	/**
	 * Returns the value of the '<em><b>Peo</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link ObeModel.PEO#getPlos <em>Plos</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Peo</em>' reference.
	 * @see #setPeo(PEO)
	 * @see ObeModel.ObeModelPackage#getPlo_Peo()
	 * @see ObeModel.PEO#getPlos
	 * @model opposite="plos" required="true"
	 * @generated
	 */
	PEO getPeo();

	/**
	 * Sets the value of the '{@link ObeModel.Plo#getPeo <em>Peo</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Peo</em>' reference.
	 * @see #getPeo()
	 * @generated
	 */
	void setPeo(PEO value);

} // Plo
