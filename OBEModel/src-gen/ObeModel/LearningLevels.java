/**
 */
package ObeModel;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Learning Levels</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ObeModel.LearningLevels#getLevel <em>Level</em>}</li>
 *   <li>{@link ObeModel.LearningLevels#getDomain <em>Domain</em>}</li>
 *   <li>{@link ObeModel.LearningLevels#getClo <em>Clo</em>}</li>
 * </ul>
 *
 * @see ObeModel.ObeModelPackage#getLearningLevels()
 * @model
 * @generated
 */
public interface LearningLevels extends EObject {
	/**
	 * Returns the value of the '<em><b>Level</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Level</em>' attribute.
	 * @see #setLevel(String)
	 * @see ObeModel.ObeModelPackage#getLearningLevels_Level()
	 * @model
	 * @generated
	 */
	String getLevel();

	/**
	 * Sets the value of the '{@link ObeModel.LearningLevels#getLevel <em>Level</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Level</em>' attribute.
	 * @see #getLevel()
	 * @generated
	 */
	void setLevel(String value);

	/**
	 * Returns the value of the '<em><b>Domain</b></em>' attribute.
	 * The literals are from the enumeration {@link ObeModel.LearningDomain}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Domain</em>' attribute.
	 * @see ObeModel.LearningDomain
	 * @see #setDomain(LearningDomain)
	 * @see ObeModel.ObeModelPackage#getLearningLevels_Domain()
	 * @model
	 * @generated
	 */
	LearningDomain getDomain();

	/**
	 * Sets the value of the '{@link ObeModel.LearningLevels#getDomain <em>Domain</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Domain</em>' attribute.
	 * @see ObeModel.LearningDomain
	 * @see #getDomain()
	 * @generated
	 */
	void setDomain(LearningDomain value);

	/**
	 * Returns the value of the '<em><b>Clo</b></em>' reference list.
	 * The list contents are of type {@link ObeModel.CLO}.
	 * It is bidirectional and its opposite is '{@link ObeModel.CLO#getLearninglevels <em>Learninglevels</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Clo</em>' reference list.
	 * @see ObeModel.ObeModelPackage#getLearningLevels_Clo()
	 * @see ObeModel.CLO#getLearninglevels
	 * @model opposite="learninglevels"
	 * @generated
	 */
	EList<CLO> getClo();

} // LearningLevels
