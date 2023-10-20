/**
 */
package ObeModel;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Batches</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ObeModel.Batches#getName <em>Name</em>}</li>
 *   <li>{@link ObeModel.Batches#getIndvThreshold <em>Indv Threshold</em>}</li>
 *   <li>{@link ObeModel.Batches#getChortLevelThreshold <em>Chort Level Threshold</em>}</li>
 *   <li>{@link ObeModel.Batches#getStudents <em>Students</em>}</li>
 * </ul>
 *
 * @see ObeModel.ObeModelPackage#getBatches()
 * @model
 * @generated
 */
public interface Batches extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see ObeModel.ObeModelPackage#getBatches_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link ObeModel.Batches#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Indv Threshold</b></em>' attribute.
	 * The default value is <code>"50"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Indv Threshold</em>' attribute.
	 * @see #setIndvThreshold(int)
	 * @see ObeModel.ObeModelPackage#getBatches_IndvThreshold()
	 * @model default="50" required="true"
	 * @generated
	 */
	int getIndvThreshold();

	/**
	 * Sets the value of the '{@link ObeModel.Batches#getIndvThreshold <em>Indv Threshold</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Indv Threshold</em>' attribute.
	 * @see #getIndvThreshold()
	 * @generated
	 */
	void setIndvThreshold(int value);

	/**
	 * Returns the value of the '<em><b>Chort Level Threshold</b></em>' attribute.
	 * The default value is <code>"60"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Chort Level Threshold</em>' attribute.
	 * @see #setChortLevelThreshold(int)
	 * @see ObeModel.ObeModelPackage#getBatches_ChortLevelThreshold()
	 * @model default="60" required="true"
	 * @generated
	 */
	int getChortLevelThreshold();

	/**
	 * Sets the value of the '{@link ObeModel.Batches#getChortLevelThreshold <em>Chort Level Threshold</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Chort Level Threshold</em>' attribute.
	 * @see #getChortLevelThreshold()
	 * @generated
	 */
	void setChortLevelThreshold(int value);

	/**
	 * Returns the value of the '<em><b>Students</b></em>' reference list.
	 * The list contents are of type {@link ObeModel.Student}.
	 * It is bidirectional and its opposite is '{@link ObeModel.Student#getBatche <em>Batche</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Students</em>' reference list.
	 * @see ObeModel.ObeModelPackage#getBatches_Students()
	 * @see ObeModel.Student#getBatche
	 * @model opposite="batche" required="true"
	 * @generated
	 */
	EList<Student> getStudents();

} // Batches
