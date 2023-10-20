/**
 */
package ObeModel;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see ObeModel.ObeModelPackage
 * @generated
 */
public interface ObeModelFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ObeModelFactory eINSTANCE = ObeModel.impl.ObeModelFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>OBE Root Node</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>OBE Root Node</em>'.
	 * @generated
	 */
	OBERootNode createOBERootNode();

	/**
	 * Returns a new object of class '<em>Institute</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Institute</em>'.
	 * @generated
	 */
	Institute createInstitute();

	/**
	 * Returns a new object of class '<em>Vision</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Vision</em>'.
	 * @generated
	 */
	Vision createVision();

	/**
	 * Returns a new object of class '<em>Mission</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Mission</em>'.
	 * @generated
	 */
	Mission createMission();

	/**
	 * Returns a new object of class '<em>Program</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Program</em>'.
	 * @generated
	 */
	Program createProgram();

	/**
	 * Returns a new object of class '<em>PEO</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>PEO</em>'.
	 * @generated
	 */
	PEO createPEO();

	/**
	 * Returns a new object of class '<em>Plo</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Plo</em>'.
	 * @generated
	 */
	Plo createPlo();

	/**
	 * Returns a new object of class '<em>Courses</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Courses</em>'.
	 * @generated
	 */
	Courses createCourses();

	/**
	 * Returns a new object of class '<em>Batches</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Batches</em>'.
	 * @generated
	 */
	Batches createBatches();

	/**
	 * Returns a new object of class '<em>Student</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Student</em>'.
	 * @generated
	 */
	Student createStudent();

	/**
	 * Returns a new object of class '<em>CLO</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CLO</em>'.
	 * @generated
	 */
	CLO createCLO();

	/**
	 * Returns a new object of class '<em>Learning Levels</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Learning Levels</em>'.
	 * @generated
	 */
	LearningLevels createLearningLevels();

	/**
	 * Returns a new object of class '<em>Activity</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Activity</em>'.
	 * @generated
	 */
	Activity createActivity();

	/**
	 * Returns a new object of class '<em>Results</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Results</em>'.
	 * @generated
	 */
	Results createResults();

	/**
	 * Returns a new object of class '<em>Assesment</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Assesment</em>'.
	 * @generated
	 */
	Assesment createAssesment();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	ObeModelPackage getObeModelPackage();

} //ObeModelFactory
