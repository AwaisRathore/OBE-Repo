/**
 */
package ObeModel;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Vision</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ObeModel.Vision#getVisionStatement <em>Vision Statement</em>}</li>
 * </ul>
 *
 * @see ObeModel.ObeModelPackage#getVision()
 * @model
 * @generated
 */
public interface Vision extends EObject {
	/**
	 * Returns the value of the '<em><b>Vision Statement</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Vision Statement</em>' attribute.
	 * @see #setVisionStatement(String)
	 * @see ObeModel.ObeModelPackage#getVision_VisionStatement()
	 * @model
	 * @generated
	 */
	String getVisionStatement();

	/**
	 * Sets the value of the '{@link ObeModel.Vision#getVisionStatement <em>Vision Statement</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Vision Statement</em>' attribute.
	 * @see #getVisionStatement()
	 * @generated
	 */
	void setVisionStatement(String value);

} // Vision
