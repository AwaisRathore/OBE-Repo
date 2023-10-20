/**
 */
package ObeModel.impl;

import ObeModel.Activity;
import ObeModel.ActivityType;
import ObeModel.Assesment;
import ObeModel.AssesmentType;
import ObeModel.Batches;
import ObeModel.Courses;
import ObeModel.Institute;
import ObeModel.InstituteLevel;
import ObeModel.LearningDomain;
import ObeModel.LearningLevels;
import ObeModel.Mission;
import ObeModel.OBERootNode;
import ObeModel.ObeModelFactory;
import ObeModel.ObeModelPackage;
import ObeModel.Plo;
import ObeModel.Program;
import ObeModel.Results;
import ObeModel.Student;
import ObeModel.Vision;
import ObeModel.util.ObeModelValidator;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EValidator;
import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ObeModelPackageImpl extends EPackageImpl implements ObeModelPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass obeRootNodeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass instituteEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass visionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass missionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass programEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass peoEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ploEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass coursesEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass batchesEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass studentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass cloEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass learningLevelsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass activityEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass resultsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass assesmentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum learningDomainEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum activityTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum assesmentTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum instituteLevelEEnum = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see ObeModel.ObeModelPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private ObeModelPackageImpl() {
		super(eNS_URI, ObeModelFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 *
	 * <p>This method is used to initialize {@link ObeModelPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static ObeModelPackage init() {
		if (isInited)
			return (ObeModelPackage) EPackage.Registry.INSTANCE.getEPackage(ObeModelPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredObeModelPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		ObeModelPackageImpl theObeModelPackage = registeredObeModelPackage instanceof ObeModelPackageImpl
				? (ObeModelPackageImpl) registeredObeModelPackage
				: new ObeModelPackageImpl();

		isInited = true;

		// Create package meta-data objects
		theObeModelPackage.createPackageContents();

		// Initialize created meta-data
		theObeModelPackage.initializePackageContents();

		// Register package validator
		EValidator.Registry.INSTANCE.put(theObeModelPackage, new EValidator.Descriptor() {
			public EValidator getEValidator() {
				return ObeModelValidator.INSTANCE;
			}
		});

		// Mark meta-data to indicate it can't be changed
		theObeModelPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(ObeModelPackage.eNS_URI, theObeModelPackage);
		return theObeModelPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOBERootNode() {
		return obeRootNodeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOBERootNode_Institutes() {
		return (EReference) obeRootNodeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOBERootNode_Visions() {
		return (EReference) obeRootNodeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOBERootNode_Missions() {
		return (EReference) obeRootNodeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOBERootNode_Peos() {
		return (EReference) obeRootNodeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOBERootNode_Courses() {
		return (EReference) obeRootNodeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOBERootNode_Batches() {
		return (EReference) obeRootNodeEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOBERootNode_Programs() {
		return (EReference) obeRootNodeEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOBERootNode_Plos() {
		return (EReference) obeRootNodeEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOBERootNode_Students() {
		return (EReference) obeRootNodeEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOBERootNode_Activitties() {
		return (EReference) obeRootNodeEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOBERootNode_Clos() {
		return (EReference) obeRootNodeEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOBERootNode_Learninglevels() {
		return (EReference) obeRootNodeEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOBERootNode_Results() {
		return (EReference) obeRootNodeEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInstitute() {
		return instituteEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getInstitute_Name() {
		return (EAttribute) instituteEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getInstitute_InstituteLevel() {
		return (EAttribute) instituteEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInstitute_Associatedvision() {
		return (EReference) instituteEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInstitute_Offerprograms() {
		return (EReference) instituteEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInstitute_ParentInstitute() {
		return (EReference) instituteEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInstitute_Associatedmission() {
		return (EReference) instituteEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getVision() {
		return visionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVision_VisionStatement() {
		return (EAttribute) visionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMission() {
		return missionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMission_MissionStatement() {
		return (EAttribute) missionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMission_Institute() {
		return (EReference) missionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMission_Assesment() {
		return (EReference) missionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getProgram() {
		return programEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getProgram_Name() {
		return (EAttribute) programEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProgram_Programobjectives() {
		return (EReference) programEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProgram_Programlearningoutcomes() {
		return (EReference) programEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProgram_Associatedbatches() {
		return (EReference) programEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProgram_Offeredcourses() {
		return (EReference) programEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPEO() {
		return peoEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPEO_PEOStatement() {
		return (EAttribute) peoEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPEO_Threshold() {
		return (EAttribute) peoEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPEO_Mission() {
		return (EReference) peoEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPEO_Plos() {
		return (EReference) peoEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPEO_Title() {
		return (EAttribute) peoEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPEO_Assesment() {
		return (EReference) peoEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPlo() {
		return ploEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPlo_Title() {
		return (EAttribute) ploEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPlo_ClosMapping() {
		return (EReference) ploEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPlo_Peo() {
		return (EReference) ploEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCourses() {
		return coursesEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCourses_Name() {
		return (EAttribute) coursesEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCourses_Learningoutcomes() {
		return (EReference) coursesEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCourses_Activities() {
		return (EReference) coursesEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBatches() {
		return batchesEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBatches_Name() {
		return (EAttribute) batchesEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBatches_IndvThreshold() {
		return (EAttribute) batchesEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBatches_ChortLevelThreshold() {
		return (EAttribute) batchesEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBatches_Students() {
		return (EReference) batchesEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStudent() {
		return studentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStudent_RollNumber() {
		return (EAttribute) studentEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStudent_Name() {
		return (EAttribute) studentEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStudent_Batche() {
		return (EReference) studentEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStudent_Registercourse() {
		return (EReference) studentEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStudent_Results() {
		return (EReference) studentEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCLO() {
		return cloEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCLO_Statement() {
		return (EAttribute) cloEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCLO_Learninglevels() {
		return (EReference) cloEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCLO_Activity() {
		return (EReference) cloEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCLO_Maptoplo() {
		return (EReference) cloEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLearningLevels() {
		return learningLevelsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLearningLevels_Level() {
		return (EAttribute) learningLevelsEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLearningLevels_Domain() {
		return (EAttribute) learningLevelsEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLearningLevels_Clo() {
		return (EReference) learningLevelsEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getActivity() {
		return activityEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getActivity_Name() {
		return (EAttribute) activityEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getActivity_TotalMarks() {
		return (EAttribute) activityEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getActivity_AssesmentType() {
		return (EAttribute) activityEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getActivity_ActivityType() {
		return (EAttribute) activityEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getActivity_Clo() {
		return (EReference) activityEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getActivity_Results() {
		return (EReference) activityEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getActivity_ActivityWeight() {
		return (EAttribute) activityEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getResults() {
		return resultsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getResults_ObtainedMarks() {
		return (EAttribute) resultsEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getResults_Student() {
		return (EReference) resultsEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getResults_Activity() {
		return (EReference) resultsEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAssesment() {
		return assesmentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAssesment_Name() {
		return (EAttribute) assesmentEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAssesment_AssesmentType() {
		return (EAttribute) assesmentEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAssesment_ActivityType() {
		return (EAttribute) assesmentEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAssesment_RespondantName() {
		return (EAttribute) assesmentEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAssesment_Marks() {
		return (EAttribute) assesmentEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getLearningDomain() {
		return learningDomainEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getActivityType() {
		return activityTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getAssesmentType() {
		return assesmentTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getInstituteLevel() {
		return instituteLevelEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ObeModelFactory getObeModelFactory() {
		return (ObeModelFactory) getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated)
			return;
		isCreated = true;

		// Create classes and their features
		obeRootNodeEClass = createEClass(OBE_ROOT_NODE);
		createEReference(obeRootNodeEClass, OBE_ROOT_NODE__INSTITUTES);
		createEReference(obeRootNodeEClass, OBE_ROOT_NODE__VISIONS);
		createEReference(obeRootNodeEClass, OBE_ROOT_NODE__MISSIONS);
		createEReference(obeRootNodeEClass, OBE_ROOT_NODE__PEOS);
		createEReference(obeRootNodeEClass, OBE_ROOT_NODE__COURSES);
		createEReference(obeRootNodeEClass, OBE_ROOT_NODE__BATCHES);
		createEReference(obeRootNodeEClass, OBE_ROOT_NODE__PROGRAMS);
		createEReference(obeRootNodeEClass, OBE_ROOT_NODE__PLOS);
		createEReference(obeRootNodeEClass, OBE_ROOT_NODE__STUDENTS);
		createEReference(obeRootNodeEClass, OBE_ROOT_NODE__ACTIVITTIES);
		createEReference(obeRootNodeEClass, OBE_ROOT_NODE__CLOS);
		createEReference(obeRootNodeEClass, OBE_ROOT_NODE__LEARNINGLEVELS);
		createEReference(obeRootNodeEClass, OBE_ROOT_NODE__RESULTS);

		instituteEClass = createEClass(INSTITUTE);
		createEAttribute(instituteEClass, INSTITUTE__NAME);
		createEAttribute(instituteEClass, INSTITUTE__INSTITUTE_LEVEL);
		createEReference(instituteEClass, INSTITUTE__ASSOCIATEDVISION);
		createEReference(instituteEClass, INSTITUTE__OFFERPROGRAMS);
		createEReference(instituteEClass, INSTITUTE__PARENT_INSTITUTE);
		createEReference(instituteEClass, INSTITUTE__ASSOCIATEDMISSION);

		visionEClass = createEClass(VISION);
		createEAttribute(visionEClass, VISION__VISION_STATEMENT);

		missionEClass = createEClass(MISSION);
		createEAttribute(missionEClass, MISSION__MISSION_STATEMENT);
		createEReference(missionEClass, MISSION__INSTITUTE);
		createEReference(missionEClass, MISSION__ASSESMENT);

		programEClass = createEClass(PROGRAM);
		createEAttribute(programEClass, PROGRAM__NAME);
		createEReference(programEClass, PROGRAM__PROGRAMOBJECTIVES);
		createEReference(programEClass, PROGRAM__PROGRAMLEARNINGOUTCOMES);
		createEReference(programEClass, PROGRAM__ASSOCIATEDBATCHES);
		createEReference(programEClass, PROGRAM__OFFEREDCOURSES);

		peoEClass = createEClass(PEO);
		createEAttribute(peoEClass, PEO__PEO_STATEMENT);
		createEAttribute(peoEClass, PEO__THRESHOLD);
		createEReference(peoEClass, PEO__MISSION);
		createEReference(peoEClass, PEO__PLOS);
		createEAttribute(peoEClass, PEO__TITLE);
		createEReference(peoEClass, PEO__ASSESMENT);

		ploEClass = createEClass(PLO);
		createEAttribute(ploEClass, PLO__TITLE);
		createEReference(ploEClass, PLO__CLOS_MAPPING);
		createEReference(ploEClass, PLO__PEO);

		coursesEClass = createEClass(COURSES);
		createEAttribute(coursesEClass, COURSES__NAME);
		createEReference(coursesEClass, COURSES__LEARNINGOUTCOMES);
		createEReference(coursesEClass, COURSES__ACTIVITIES);

		batchesEClass = createEClass(BATCHES);
		createEAttribute(batchesEClass, BATCHES__NAME);
		createEAttribute(batchesEClass, BATCHES__INDV_THRESHOLD);
		createEAttribute(batchesEClass, BATCHES__CHORT_LEVEL_THRESHOLD);
		createEReference(batchesEClass, BATCHES__STUDENTS);

		studentEClass = createEClass(STUDENT);
		createEAttribute(studentEClass, STUDENT__ROLL_NUMBER);
		createEAttribute(studentEClass, STUDENT__NAME);
		createEReference(studentEClass, STUDENT__BATCHE);
		createEReference(studentEClass, STUDENT__REGISTERCOURSE);
		createEReference(studentEClass, STUDENT__RESULTS);

		cloEClass = createEClass(CLO);
		createEAttribute(cloEClass, CLO__STATEMENT);
		createEReference(cloEClass, CLO__LEARNINGLEVELS);
		createEReference(cloEClass, CLO__ACTIVITY);
		createEReference(cloEClass, CLO__MAPTOPLO);

		learningLevelsEClass = createEClass(LEARNING_LEVELS);
		createEAttribute(learningLevelsEClass, LEARNING_LEVELS__LEVEL);
		createEAttribute(learningLevelsEClass, LEARNING_LEVELS__DOMAIN);
		createEReference(learningLevelsEClass, LEARNING_LEVELS__CLO);

		activityEClass = createEClass(ACTIVITY);
		createEAttribute(activityEClass, ACTIVITY__NAME);
		createEAttribute(activityEClass, ACTIVITY__TOTAL_MARKS);
		createEAttribute(activityEClass, ACTIVITY__ASSESMENT_TYPE);
		createEAttribute(activityEClass, ACTIVITY__ACTIVITY_TYPE);
		createEReference(activityEClass, ACTIVITY__CLO);
		createEReference(activityEClass, ACTIVITY__RESULTS);
		createEAttribute(activityEClass, ACTIVITY__ACTIVITY_WEIGHT);

		resultsEClass = createEClass(RESULTS);
		createEAttribute(resultsEClass, RESULTS__OBTAINED_MARKS);
		createEReference(resultsEClass, RESULTS__STUDENT);
		createEReference(resultsEClass, RESULTS__ACTIVITY);

		assesmentEClass = createEClass(ASSESMENT);
		createEAttribute(assesmentEClass, ASSESMENT__NAME);
		createEAttribute(assesmentEClass, ASSESMENT__ASSESMENT_TYPE);
		createEAttribute(assesmentEClass, ASSESMENT__ACTIVITY_TYPE);
		createEAttribute(assesmentEClass, ASSESMENT__RESPONDANT_NAME);
		createEAttribute(assesmentEClass, ASSESMENT__MARKS);

		// Create enums
		learningDomainEEnum = createEEnum(LEARNING_DOMAIN);
		activityTypeEEnum = createEEnum(ACTIVITY_TYPE);
		assesmentTypeEEnum = createEEnum(ASSESMENT_TYPE);
		instituteLevelEEnum = createEEnum(INSTITUTE_LEVEL);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized)
			return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes

		// Initialize classes, features, and operations; add parameters
		initEClass(obeRootNodeEClass, OBERootNode.class, "OBERootNode", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getOBERootNode_Institutes(), this.getInstitute(), null, "institutes", null, 0, -1,
				OBERootNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getOBERootNode_Visions(), this.getVision(), null, "visions", null, 0, -1, OBERootNode.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getOBERootNode_Missions(), this.getMission(), null, "missions", null, 0, -1, OBERootNode.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getOBERootNode_Peos(), this.getPEO(), null, "peos", null, 0, -1, OBERootNode.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getOBERootNode_Courses(), this.getCourses(), null, "courses", null, 0, -1, OBERootNode.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getOBERootNode_Batches(), this.getBatches(), null, "batches", null, 0, -1, OBERootNode.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getOBERootNode_Programs(), this.getProgram(), null, "programs", null, 0, -1, OBERootNode.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getOBERootNode_Plos(), this.getPlo(), null, "plos", null, 0, -1, OBERootNode.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getOBERootNode_Students(), this.getStudent(), null, "students", null, 0, -1, OBERootNode.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getOBERootNode_Activitties(), this.getActivity(), null, "activitties", null, 0, -1,
				OBERootNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getOBERootNode_Clos(), this.getCLO(), null, "clos", null, 0, -1, OBERootNode.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getOBERootNode_Learninglevels(), this.getLearningLevels(), null, "learninglevels", null, 0, -1,
				OBERootNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getOBERootNode_Results(), this.getResults(), null, "results", null, 0, -1, OBERootNode.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(instituteEClass, Institute.class, "Institute", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getInstitute_Name(), ecorePackage.getEString(), "Name", null, 0, 1, Institute.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getInstitute_InstituteLevel(), this.getInstituteLevel(), "InstituteLevel", "University", 0, 1,
				Institute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEReference(getInstitute_Associatedvision(), this.getVision(), null, "associatedvision", null, 0, 1,
				Institute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getInstitute_Offerprograms(), this.getProgram(), null, "Offerprograms", null, 0, -1,
				Institute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getInstitute_ParentInstitute(), this.getInstitute(), null, "parentInstitute", null, 0, 1,
				Institute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getInstitute_Associatedmission(), this.getMission(), this.getMission_Institute(),
				"associatedmission", null, 0, 1, Institute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(visionEClass, Vision.class, "Vision", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getVision_VisionStatement(), ecorePackage.getEString(), "VisionStatement", null, 0, 1,
				Vision.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);

		initEClass(missionEClass, Mission.class, "Mission", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getMission_MissionStatement(), ecorePackage.getEString(), "MissionStatement", null, 0, 1,
				Mission.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEReference(getMission_Institute(), this.getInstitute(), this.getInstitute_Associatedmission(), "institute",
				null, 0, 1, Mission.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
				IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMission_Assesment(), this.getAssesment(), null, "assesment", null, 0, 1, Mission.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(programEClass, Program.class, "Program", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getProgram_Name(), ecorePackage.getEString(), "name", null, 0, 1, Program.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getProgram_Programobjectives(), this.getPEO(), null, "programobjectives", null, 1, -1,
				Program.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getProgram_Programlearningoutcomes(), this.getPlo(), null, "programlearningoutcomes", null, 1,
				-1, Program.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getProgram_Associatedbatches(), this.getBatches(), null, "associatedbatches", null, 1, -1,
				Program.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getProgram_Offeredcourses(), this.getCourses(), null, "offeredcourses", null, 1, -1,
				Program.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(peoEClass, ObeModel.PEO.class, "PEO", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPEO_PEOStatement(), ecorePackage.getEString(), "PEOStatement", null, 0, 1, ObeModel.PEO.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPEO_Threshold(), ecorePackage.getEInt(), "threshold", null, 1, 1, ObeModel.PEO.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPEO_Mission(), this.getMission(), null, "mission", null, 1, 1, ObeModel.PEO.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPEO_Plos(), this.getPlo(), this.getPlo_Peo(), "plos", null, 1, -1, ObeModel.PEO.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPEO_Title(), ecorePackage.getEString(), "Title", null, 0, 1, ObeModel.PEO.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPEO_Assesment(), this.getAssesment(), null, "assesment", null, 0, 1, ObeModel.PEO.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(ploEClass, Plo.class, "Plo", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPlo_Title(), ecorePackage.getEString(), "Title", null, 0, 1, Plo.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPlo_ClosMapping(), this.getCLO(), this.getCLO_Maptoplo(), "closMapping", null, 0, -1,
				Plo.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPlo_Peo(), this.getPEO(), this.getPEO_Plos(), "peo", null, 1, 1, Plo.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);

		initEClass(coursesEClass, Courses.class, "Courses", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCourses_Name(), ecorePackage.getEString(), "Name", null, 0, 1, Courses.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCourses_Learningoutcomes(), this.getCLO(), null, "learningoutcomes", null, 1, -1,
				Courses.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCourses_Activities(), this.getActivity(), null, "activities", null, 1, -1, Courses.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(batchesEClass, Batches.class, "Batches", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getBatches_Name(), ecorePackage.getEString(), "Name", null, 0, 1, Batches.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBatches_IndvThreshold(), ecorePackage.getEInt(), "IndvThreshold", "50", 1, 1, Batches.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBatches_ChortLevelThreshold(), ecorePackage.getEInt(), "ChortLevelThreshold", "60", 1, 1,
				Batches.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEReference(getBatches_Students(), this.getStudent(), this.getStudent_Batche(), "students", null, 1, -1,
				Batches.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(studentEClass, Student.class, "Student", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getStudent_RollNumber(), ecorePackage.getEString(), "RollNumber", null, 1, 1, Student.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getStudent_Name(), ecorePackage.getEString(), "Name", null, 0, 1, Student.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getStudent_Batche(), this.getBatches(), this.getBatches_Students(), "batche", null, 1, 1,
				Student.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getStudent_Registercourse(), this.getCourses(), null, "registercourse", null, 0, -1,
				Student.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getStudent_Results(), this.getResults(), this.getResults_Student(), "results", null, 0, -1,
				Student.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(cloEClass, ObeModel.CLO.class, "CLO", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCLO_Statement(), ecorePackage.getEString(), "Statement", null, 0, 1, ObeModel.CLO.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCLO_Learninglevels(), this.getLearningLevels(), this.getLearningLevels_Clo(),
				"learninglevels", null, 1, 1, ObeModel.CLO.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCLO_Activity(), this.getActivity(), this.getActivity_Clo(), "activity", null, 1, -1,
				ObeModel.CLO.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCLO_Maptoplo(), this.getPlo(), this.getPlo_ClosMapping(), "maptoplo", null, 1, 1,
				ObeModel.CLO.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(learningLevelsEClass, LearningLevels.class, "LearningLevels", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getLearningLevels_Level(), ecorePackage.getEString(), "Level", null, 0, 1, LearningLevels.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLearningLevels_Domain(), this.getLearningDomain(), "domain", null, 0, 1, LearningLevels.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getLearningLevels_Clo(), this.getCLO(), this.getCLO_Learninglevels(), "clo", null, 0, -1,
				LearningLevels.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(activityEClass, Activity.class, "Activity", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getActivity_Name(), ecorePackage.getEString(), "Name", null, 0, 1, Activity.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getActivity_TotalMarks(), ecorePackage.getEInt(), "totalMarks", null, 1, 1, Activity.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getActivity_AssesmentType(), this.getAssesmentType(), "AssesmentType", null, 0, 1,
				Activity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getActivity_ActivityType(), this.getActivityType(), "ActivityType", null, 0, 1, Activity.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getActivity_Clo(), this.getCLO(), this.getCLO_Activity(), "clo", null, 0, 1, Activity.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getActivity_Results(), this.getResults(), this.getResults_Activity(), "results", null, 0, -1,
				Activity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getActivity_ActivityWeight(), ecorePackage.getEDouble(), "activityWeight", null, 1, 1,
				Activity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);

		initEClass(resultsEClass, Results.class, "Results", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getResults_ObtainedMarks(), ecorePackage.getEDouble(), "obtainedMarks", null, 1, 1,
				Results.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEReference(getResults_Student(), this.getStudent(), this.getStudent_Results(), "student", null, 1, 1,
				Results.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getResults_Activity(), this.getActivity(), this.getActivity_Results(), "activity", null, 1, 1,
				Results.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(assesmentEClass, Assesment.class, "Assesment", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAssesment_Name(), ecorePackage.getEString(), "name", null, 0, 1, Assesment.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAssesment_AssesmentType(), this.getAssesmentType(), "AssesmentType", "Indirect", 0, 1,
				Assesment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getAssesment_ActivityType(), this.getActivityType(), "ActivityType", null, 0, 1, Assesment.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAssesment_RespondantName(), ecorePackage.getEString(), "RespondantName", null, 0, 1,
				Assesment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getAssesment_Marks(), ecorePackage.getEDouble(), "Marks", null, 0, 1, Assesment.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(learningDomainEEnum, LearningDomain.class, "LearningDomain");
		addEEnumLiteral(learningDomainEEnum, LearningDomain.COGNITIVE);
		addEEnumLiteral(learningDomainEEnum, LearningDomain.AFFECTIVE);
		addEEnumLiteral(learningDomainEEnum, LearningDomain.PHYSCOMOTOR);

		initEEnum(activityTypeEEnum, ActivityType.class, "ActivityType");
		addEEnumLiteral(activityTypeEEnum, ActivityType.QUIZ);
		addEEnumLiteral(activityTypeEEnum, ActivityType.ASSIGNMENT);
		addEEnumLiteral(activityTypeEEnum, ActivityType.MID);
		addEEnumLiteral(activityTypeEEnum, ActivityType.FINALS);
		addEEnumLiteral(activityTypeEEnum, ActivityType.LAB);
		addEEnumLiteral(activityTypeEEnum, ActivityType.SURVEYS);

		initEEnum(assesmentTypeEEnum, AssesmentType.class, "AssesmentType");
		addEEnumLiteral(assesmentTypeEEnum, AssesmentType.DIRECT);
		addEEnumLiteral(assesmentTypeEEnum, AssesmentType.INDIRECT);

		initEEnum(instituteLevelEEnum, InstituteLevel.class, "InstituteLevel");
		addEEnumLiteral(instituteLevelEEnum, InstituteLevel.UNIVERSITY);
		addEEnumLiteral(instituteLevelEEnum, InstituteLevel.FACULTY);
		addEEnumLiteral(instituteLevelEEnum, InstituteLevel.DEPARTMENT);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// http://www.eclipse.org/OCL/Import
		createImportAnnotations();
		// http://www.eclipse.org/emf/2002/Ecore
		createEcoreAnnotations();
		// http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot
		createPivotAnnotations();
	}

	/**
	 * Initializes the annotations for <b>http://www.eclipse.org/OCL/Import</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createImportAnnotations() {
		String source = "http://www.eclipse.org/OCL/Import";
		addAnnotation(this, source, new String[] { "ecore", "http://www.eclipse.org/emf/2002/Ecore" });
	}

	/**
	 * Initializes the annotations for <b>http://www.eclipse.org/emf/2002/Ecore</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createEcoreAnnotations() {
		String source = "http://www.eclipse.org/emf/2002/Ecore";
		addAnnotation(this, source,
				new String[] { "invocationDelegates", "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
						"settingDelegates", "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot", "validationDelegates",
						"http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot" });
		addAnnotation(instituteEClass, source, new String[] { "constraints",
				"parentInsitutionCheck VisionCanBeAssignedOnlyToInstitutionLevelUniversity OnlyDepartmentCanOfferPrograms" });
		addAnnotation(peoEClass, source,
				new String[] { "constraints", "PEOCanBeMappedToOnlyMissionInstanceofDepartment" });
		addAnnotation(activityEClass, source, new String[] { "constraints", "OnlyDirectAssesmentCanHaveCLO" });
	}

	/**
	 * Initializes the annotations for <b>http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createPivotAnnotations() {
		String source = "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot";
		addAnnotation(instituteEClass, source, new String[] { "parentInsitutionCheck",
				"\n\t\t  if self.InstituteLevel = InstituteLevel::University then\n\t\t    self.parentInstitute = null\n\t\t  else\n\t\t    if self.InstituteLevel = InstituteLevel::Department then\n\t\t      self.parentInstitute.InstituteLevel = InstituteLevel::Faculty\n\t\t    else\n\t\t       self.parentInstitute.InstituteLevel = InstituteLevel::University\n\t\t    endif\n\t\t  endif",
				"VisionCanBeAssignedOnlyToInstitutionLevelUniversity",
				"\n\t\t  if self.InstituteLevel = InstituteLevel::University then\n\t\t    self.associatedvision <> null\n\t\t  else\n\t\t    self.associatedvision = null\n\t\t  endif",
				"OnlyDepartmentCanOfferPrograms",
				"\n\t\t  if self.InstituteLevel = InstituteLevel::Department then\n\t\t    self.Offerprograms->notEmpty()\n\t\t  else\n\t\t    self.Offerprograms->isEmpty()\n\t\t  endif" });
		addAnnotation(peoEClass, source, new String[] { "PEOCanBeMappedToOnlyMissionInstanceofDepartment",
				"\n  \t\tself.mission.institute.InstituteLevel = InstituteLevel::Department" });
		addAnnotation(activityEClass, source, new String[] { "OnlyDirectAssesmentCanHaveCLO",
				"\n\t\t  if self.AssesmentType = AssesmentType::Direct then\n\t\t    self.clo->notEmpty() and self.clo->size() = 1\n\t\t  else\n\t\t    self.clo->isEmpty()\n\t\t  endif" });
	}

} //ObeModelPackageImpl
