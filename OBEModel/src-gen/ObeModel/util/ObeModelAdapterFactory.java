/**
 */
package ObeModel.util;

import ObeModel.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see ObeModel.ObeModelPackage
 * @generated
 */
public class ObeModelAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static ObeModelPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ObeModelAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = ObeModelPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject) object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ObeModelSwitch<Adapter> modelSwitch = new ObeModelSwitch<Adapter>() {
		@Override
		public Adapter caseOBERootNode(OBERootNode object) {
			return createOBERootNodeAdapter();
		}

		@Override
		public Adapter caseInstitute(Institute object) {
			return createInstituteAdapter();
		}

		@Override
		public Adapter caseVision(Vision object) {
			return createVisionAdapter();
		}

		@Override
		public Adapter caseMission(Mission object) {
			return createMissionAdapter();
		}

		@Override
		public Adapter caseProgram(Program object) {
			return createProgramAdapter();
		}

		@Override
		public Adapter casePEO(PEO object) {
			return createPEOAdapter();
		}

		@Override
		public Adapter casePlo(Plo object) {
			return createPloAdapter();
		}

		@Override
		public Adapter caseCourses(Courses object) {
			return createCoursesAdapter();
		}

		@Override
		public Adapter caseBatches(Batches object) {
			return createBatchesAdapter();
		}

		@Override
		public Adapter caseStudent(Student object) {
			return createStudentAdapter();
		}

		@Override
		public Adapter caseCLO(CLO object) {
			return createCLOAdapter();
		}

		@Override
		public Adapter caseLearningLevels(LearningLevels object) {
			return createLearningLevelsAdapter();
		}

		@Override
		public Adapter caseActivity(Activity object) {
			return createActivityAdapter();
		}

		@Override
		public Adapter caseResults(Results object) {
			return createResultsAdapter();
		}

		@Override
		public Adapter caseAssesment(Assesment object) {
			return createAssesmentAdapter();
		}

		@Override
		public Adapter defaultCase(EObject object) {
			return createEObjectAdapter();
		}
	};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject) target);
	}

	/**
	 * Creates a new adapter for an object of class '{@link ObeModel.OBERootNode <em>OBE Root Node</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ObeModel.OBERootNode
	 * @generated
	 */
	public Adapter createOBERootNodeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ObeModel.Institute <em>Institute</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ObeModel.Institute
	 * @generated
	 */
	public Adapter createInstituteAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ObeModel.Vision <em>Vision</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ObeModel.Vision
	 * @generated
	 */
	public Adapter createVisionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ObeModel.Mission <em>Mission</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ObeModel.Mission
	 * @generated
	 */
	public Adapter createMissionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ObeModel.Program <em>Program</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ObeModel.Program
	 * @generated
	 */
	public Adapter createProgramAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ObeModel.PEO <em>PEO</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ObeModel.PEO
	 * @generated
	 */
	public Adapter createPEOAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ObeModel.Plo <em>Plo</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ObeModel.Plo
	 * @generated
	 */
	public Adapter createPloAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ObeModel.Courses <em>Courses</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ObeModel.Courses
	 * @generated
	 */
	public Adapter createCoursesAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ObeModel.Batches <em>Batches</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ObeModel.Batches
	 * @generated
	 */
	public Adapter createBatchesAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ObeModel.Student <em>Student</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ObeModel.Student
	 * @generated
	 */
	public Adapter createStudentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ObeModel.CLO <em>CLO</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ObeModel.CLO
	 * @generated
	 */
	public Adapter createCLOAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ObeModel.LearningLevels <em>Learning Levels</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ObeModel.LearningLevels
	 * @generated
	 */
	public Adapter createLearningLevelsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ObeModel.Activity <em>Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ObeModel.Activity
	 * @generated
	 */
	public Adapter createActivityAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ObeModel.Results <em>Results</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ObeModel.Results
	 * @generated
	 */
	public Adapter createResultsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ObeModel.Assesment <em>Assesment</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ObeModel.Assesment
	 * @generated
	 */
	public Adapter createAssesmentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //ObeModelAdapterFactory
