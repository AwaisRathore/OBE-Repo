/**
 */
package ObeModel;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>CLO</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ObeModel.CLO#getStatement <em>Statement</em>}</li>
 *   <li>{@link ObeModel.CLO#getLearninglevels <em>Learninglevels</em>}</li>
 *   <li>{@link ObeModel.CLO#getActivity <em>Activity</em>}</li>
 *   <li>{@link ObeModel.CLO#getMaptoplo <em>Maptoplo</em>}</li>
 * </ul>
 *
 * @see ObeModel.ObeModelPackage#getCLO()
 * @model
 * @generated
 */
public interface CLO extends EObject {
	/**
	 * Returns the value of the '<em><b>Statement</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Statement</em>' attribute.
	 * @see #setStatement(String)
	 * @see ObeModel.ObeModelPackage#getCLO_Statement()
	 * @model
	 * @generated
	 */
	String getStatement();

	/**
	 * Sets the value of the '{@link ObeModel.CLO#getStatement <em>Statement</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Statement</em>' attribute.
	 * @see #getStatement()
	 * @generated
	 */
	void setStatement(String value);

	/**
	 * Returns the value of the '<em><b>Learninglevels</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link ObeModel.LearningLevels#getClo <em>Clo</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Learninglevels</em>' reference.
	 * @see #setLearninglevels(LearningLevels)
	 * @see ObeModel.ObeModelPackage#getCLO_Learninglevels()
	 * @see ObeModel.LearningLevels#getClo
	 * @model opposite="clo" required="true"
	 * @generated
	 */
	LearningLevels getLearninglevels();

	/**
	 * Sets the value of the '{@link ObeModel.CLO#getLearninglevels <em>Learninglevels</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Learninglevels</em>' reference.
	 * @see #getLearninglevels()
	 * @generated
	 */
	void setLearninglevels(LearningLevels value);

	/**
	 * Returns the value of the '<em><b>Activity</b></em>' reference list.
	 * The list contents are of type {@link ObeModel.Activity}.
	 * It is bidirectional and its opposite is '{@link ObeModel.Activity#getClo <em>Clo</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Activity</em>' reference list.
	 * @see ObeModel.ObeModelPackage#getCLO_Activity()
	 * @see ObeModel.Activity#getClo
	 * @model opposite="clo" required="true"
	 * @generated
	 */
	EList<Activity> getActivity();

	/**
	 * Returns the value of the '<em><b>Maptoplo</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link ObeModel.Plo#getClosMapping <em>Clos Mapping</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Maptoplo</em>' reference.
	 * @see #setMaptoplo(Plo)
	 * @see ObeModel.ObeModelPackage#getCLO_Maptoplo()
	 * @see ObeModel.Plo#getClosMapping
	 * @model opposite="closMapping" required="true"
	 * @generated
	 */
	Plo getMaptoplo();

	/**
	 * Sets the value of the '{@link ObeModel.CLO#getMaptoplo <em>Maptoplo</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Maptoplo</em>' reference.
	 * @see #getMaptoplo()
	 * @generated
	 */
	void setMaptoplo(Plo value);

} // CLO
