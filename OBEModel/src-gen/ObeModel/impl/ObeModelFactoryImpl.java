/**
 */
package ObeModel.impl;

import ObeModel.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ObeModelFactoryImpl extends EFactoryImpl implements ObeModelFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ObeModelFactory init() {
		try {
			ObeModelFactory theObeModelFactory = (ObeModelFactory) EPackage.Registry.INSTANCE
					.getEFactory(ObeModelPackage.eNS_URI);
			if (theObeModelFactory != null) {
				return theObeModelFactory;
			}
		} catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new ObeModelFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ObeModelFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
		case ObeModelPackage.OBE_ROOT_NODE:
			return createOBERootNode();
		case ObeModelPackage.INSTITUTE:
			return createInstitute();
		case ObeModelPackage.VISION:
			return createVision();
		case ObeModelPackage.MISSION:
			return createMission();
		case ObeModelPackage.PROGRAM:
			return createProgram();
		case ObeModelPackage.PEO:
			return createPEO();
		case ObeModelPackage.PLO:
			return createPlo();
		case ObeModelPackage.COURSES:
			return createCourses();
		case ObeModelPackage.BATCHES:
			return createBatches();
		case ObeModelPackage.STUDENT:
			return createStudent();
		case ObeModelPackage.CLO:
			return createCLO();
		case ObeModelPackage.LEARNING_LEVELS:
			return createLearningLevels();
		case ObeModelPackage.ACTIVITY:
			return createActivity();
		case ObeModelPackage.RESULTS:
			return createResults();
		case ObeModelPackage.ASSESMENT:
			return createAssesment();
		default:
			throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
		case ObeModelPackage.LEARNING_DOMAIN:
			return createLearningDomainFromString(eDataType, initialValue);
		case ObeModelPackage.ACTIVITY_TYPE:
			return createActivityTypeFromString(eDataType, initialValue);
		case ObeModelPackage.ASSESMENT_TYPE:
			return createAssesmentTypeFromString(eDataType, initialValue);
		case ObeModelPackage.INSTITUTE_LEVEL:
			return createInstituteLevelFromString(eDataType, initialValue);
		default:
			throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
		case ObeModelPackage.LEARNING_DOMAIN:
			return convertLearningDomainToString(eDataType, instanceValue);
		case ObeModelPackage.ACTIVITY_TYPE:
			return convertActivityTypeToString(eDataType, instanceValue);
		case ObeModelPackage.ASSESMENT_TYPE:
			return convertAssesmentTypeToString(eDataType, instanceValue);
		case ObeModelPackage.INSTITUTE_LEVEL:
			return convertInstituteLevelToString(eDataType, instanceValue);
		default:
			throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OBERootNode createOBERootNode() {
		OBERootNodeImpl obeRootNode = new OBERootNodeImpl();
		return obeRootNode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Institute createInstitute() {
		InstituteImpl institute = new InstituteImpl();
		return institute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Vision createVision() {
		VisionImpl vision = new VisionImpl();
		return vision;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Mission createMission() {
		MissionImpl mission = new MissionImpl();
		return mission;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Program createProgram() {
		ProgramImpl program = new ProgramImpl();
		return program;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PEO createPEO() {
		PEOImpl peo = new PEOImpl();
		return peo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Plo createPlo() {
		PloImpl plo = new PloImpl();
		return plo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Courses createCourses() {
		CoursesImpl courses = new CoursesImpl();
		return courses;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Batches createBatches() {
		BatchesImpl batches = new BatchesImpl();
		return batches;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Student createStudent() {
		StudentImpl student = new StudentImpl();
		return student;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CLO createCLO() {
		CLOImpl clo = new CLOImpl();
		return clo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LearningLevels createLearningLevels() {
		LearningLevelsImpl learningLevels = new LearningLevelsImpl();
		return learningLevels;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Activity createActivity() {
		ActivityImpl activity = new ActivityImpl();
		return activity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Results createResults() {
		ResultsImpl results = new ResultsImpl();
		return results;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Assesment createAssesment() {
		AssesmentImpl assesment = new AssesmentImpl();
		return assesment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LearningDomain createLearningDomainFromString(EDataType eDataType, String initialValue) {
		LearningDomain result = LearningDomain.get(initialValue);
		if (result == null)
			throw new IllegalArgumentException(
					"The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertLearningDomainToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActivityType createActivityTypeFromString(EDataType eDataType, String initialValue) {
		ActivityType result = ActivityType.get(initialValue);
		if (result == null)
			throw new IllegalArgumentException(
					"The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertActivityTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AssesmentType createAssesmentTypeFromString(EDataType eDataType, String initialValue) {
		AssesmentType result = AssesmentType.get(initialValue);
		if (result == null)
			throw new IllegalArgumentException(
					"The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertAssesmentTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InstituteLevel createInstituteLevelFromString(EDataType eDataType, String initialValue) {
		InstituteLevel result = InstituteLevel.get(initialValue);
		if (result == null)
			throw new IllegalArgumentException(
					"The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertInstituteLevelToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ObeModelPackage getObeModelPackage() {
		return (ObeModelPackage) getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static ObeModelPackage getPackage() {
		return ObeModelPackage.eINSTANCE;
	}

} //ObeModelFactoryImpl
