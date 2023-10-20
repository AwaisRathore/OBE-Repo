/**
 */
package ObeModel;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see ObeModel.ObeModelFactory
 * @model kind="package"
 *        annotation="http://www.eclipse.org/OCL/Import ecore='http://www.eclipse.org/emf/2002/Ecore'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore invocationDelegates='http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot' settingDelegates='http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot' validationDelegates='http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot'"
 * @generated
 */
public interface ObeModelPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "ObeModel";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.example.org/ObeModel";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "ObeModel";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ObeModelPackage eINSTANCE = ObeModel.impl.ObeModelPackageImpl.init();

	/**
	 * The meta object id for the '{@link ObeModel.impl.OBERootNodeImpl <em>OBE Root Node</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ObeModel.impl.OBERootNodeImpl
	 * @see ObeModel.impl.ObeModelPackageImpl#getOBERootNode()
	 * @generated
	 */
	int OBE_ROOT_NODE = 0;

	/**
	 * The feature id for the '<em><b>Institutes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBE_ROOT_NODE__INSTITUTES = 0;

	/**
	 * The feature id for the '<em><b>Visions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBE_ROOT_NODE__VISIONS = 1;

	/**
	 * The feature id for the '<em><b>Missions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBE_ROOT_NODE__MISSIONS = 2;

	/**
	 * The feature id for the '<em><b>Peos</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBE_ROOT_NODE__PEOS = 3;

	/**
	 * The feature id for the '<em><b>Courses</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBE_ROOT_NODE__COURSES = 4;

	/**
	 * The feature id for the '<em><b>Batches</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBE_ROOT_NODE__BATCHES = 5;

	/**
	 * The feature id for the '<em><b>Programs</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBE_ROOT_NODE__PROGRAMS = 6;

	/**
	 * The feature id for the '<em><b>Plos</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBE_ROOT_NODE__PLOS = 7;

	/**
	 * The feature id for the '<em><b>Students</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBE_ROOT_NODE__STUDENTS = 8;

	/**
	 * The feature id for the '<em><b>Activitties</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBE_ROOT_NODE__ACTIVITTIES = 9;

	/**
	 * The feature id for the '<em><b>Clos</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBE_ROOT_NODE__CLOS = 10;

	/**
	 * The feature id for the '<em><b>Learninglevels</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBE_ROOT_NODE__LEARNINGLEVELS = 11;

	/**
	 * The feature id for the '<em><b>Results</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBE_ROOT_NODE__RESULTS = 12;

	/**
	 * The number of structural features of the '<em>OBE Root Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBE_ROOT_NODE_FEATURE_COUNT = 13;

	/**
	 * The number of operations of the '<em>OBE Root Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBE_ROOT_NODE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link ObeModel.impl.InstituteImpl <em>Institute</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ObeModel.impl.InstituteImpl
	 * @see ObeModel.impl.ObeModelPackageImpl#getInstitute()
	 * @generated
	 */
	int INSTITUTE = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTITUTE__NAME = 0;

	/**
	 * The feature id for the '<em><b>Institute Level</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTITUTE__INSTITUTE_LEVEL = 1;

	/**
	 * The feature id for the '<em><b>Associatedvision</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTITUTE__ASSOCIATEDVISION = 2;

	/**
	 * The feature id for the '<em><b>Offerprograms</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTITUTE__OFFERPROGRAMS = 3;

	/**
	 * The feature id for the '<em><b>Parent Institute</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTITUTE__PARENT_INSTITUTE = 4;

	/**
	 * The feature id for the '<em><b>Associatedmission</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTITUTE__ASSOCIATEDMISSION = 5;

	/**
	 * The number of structural features of the '<em>Institute</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTITUTE_FEATURE_COUNT = 6;

	/**
	 * The number of operations of the '<em>Institute</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTITUTE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link ObeModel.impl.VisionImpl <em>Vision</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ObeModel.impl.VisionImpl
	 * @see ObeModel.impl.ObeModelPackageImpl#getVision()
	 * @generated
	 */
	int VISION = 2;

	/**
	 * The feature id for the '<em><b>Vision Statement</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VISION__VISION_STATEMENT = 0;

	/**
	 * The number of structural features of the '<em>Vision</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VISION_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Vision</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VISION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link ObeModel.impl.MissionImpl <em>Mission</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ObeModel.impl.MissionImpl
	 * @see ObeModel.impl.ObeModelPackageImpl#getMission()
	 * @generated
	 */
	int MISSION = 3;

	/**
	 * The feature id for the '<em><b>Mission Statement</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MISSION__MISSION_STATEMENT = 0;

	/**
	 * The feature id for the '<em><b>Institute</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MISSION__INSTITUTE = 1;

	/**
	 * The feature id for the '<em><b>Assesment</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MISSION__ASSESMENT = 2;

	/**
	 * The number of structural features of the '<em>Mission</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MISSION_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Mission</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MISSION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link ObeModel.impl.ProgramImpl <em>Program</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ObeModel.impl.ProgramImpl
	 * @see ObeModel.impl.ObeModelPackageImpl#getProgram()
	 * @generated
	 */
	int PROGRAM = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROGRAM__NAME = 0;

	/**
	 * The feature id for the '<em><b>Programobjectives</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROGRAM__PROGRAMOBJECTIVES = 1;

	/**
	 * The feature id for the '<em><b>Programlearningoutcomes</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROGRAM__PROGRAMLEARNINGOUTCOMES = 2;

	/**
	 * The feature id for the '<em><b>Associatedbatches</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROGRAM__ASSOCIATEDBATCHES = 3;

	/**
	 * The feature id for the '<em><b>Offeredcourses</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROGRAM__OFFEREDCOURSES = 4;

	/**
	 * The number of structural features of the '<em>Program</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROGRAM_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Program</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROGRAM_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link ObeModel.impl.PEOImpl <em>PEO</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ObeModel.impl.PEOImpl
	 * @see ObeModel.impl.ObeModelPackageImpl#getPEO()
	 * @generated
	 */
	int PEO = 5;

	/**
	 * The feature id for the '<em><b>PEO Statement</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PEO__PEO_STATEMENT = 0;

	/**
	 * The feature id for the '<em><b>Threshold</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PEO__THRESHOLD = 1;

	/**
	 * The feature id for the '<em><b>Mission</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PEO__MISSION = 2;

	/**
	 * The feature id for the '<em><b>Plos</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PEO__PLOS = 3;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PEO__TITLE = 4;

	/**
	 * The feature id for the '<em><b>Assesment</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PEO__ASSESMENT = 5;

	/**
	 * The number of structural features of the '<em>PEO</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PEO_FEATURE_COUNT = 6;

	/**
	 * The number of operations of the '<em>PEO</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PEO_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link ObeModel.impl.PloImpl <em>Plo</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ObeModel.impl.PloImpl
	 * @see ObeModel.impl.ObeModelPackageImpl#getPlo()
	 * @generated
	 */
	int PLO = 6;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLO__TITLE = 0;

	/**
	 * The feature id for the '<em><b>Clos Mapping</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLO__CLOS_MAPPING = 1;

	/**
	 * The feature id for the '<em><b>Peo</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLO__PEO = 2;

	/**
	 * The number of structural features of the '<em>Plo</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLO_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Plo</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLO_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link ObeModel.impl.CoursesImpl <em>Courses</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ObeModel.impl.CoursesImpl
	 * @see ObeModel.impl.ObeModelPackageImpl#getCourses()
	 * @generated
	 */
	int COURSES = 7;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COURSES__NAME = 0;

	/**
	 * The feature id for the '<em><b>Learningoutcomes</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COURSES__LEARNINGOUTCOMES = 1;

	/**
	 * The feature id for the '<em><b>Activities</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COURSES__ACTIVITIES = 2;

	/**
	 * The number of structural features of the '<em>Courses</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COURSES_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Courses</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COURSES_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link ObeModel.impl.BatchesImpl <em>Batches</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ObeModel.impl.BatchesImpl
	 * @see ObeModel.impl.ObeModelPackageImpl#getBatches()
	 * @generated
	 */
	int BATCHES = 8;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BATCHES__NAME = 0;

	/**
	 * The feature id for the '<em><b>Indv Threshold</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BATCHES__INDV_THRESHOLD = 1;

	/**
	 * The feature id for the '<em><b>Chort Level Threshold</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BATCHES__CHORT_LEVEL_THRESHOLD = 2;

	/**
	 * The feature id for the '<em><b>Students</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BATCHES__STUDENTS = 3;

	/**
	 * The number of structural features of the '<em>Batches</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BATCHES_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Batches</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BATCHES_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link ObeModel.impl.StudentImpl <em>Student</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ObeModel.impl.StudentImpl
	 * @see ObeModel.impl.ObeModelPackageImpl#getStudent()
	 * @generated
	 */
	int STUDENT = 9;

	/**
	 * The feature id for the '<em><b>Roll Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STUDENT__ROLL_NUMBER = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STUDENT__NAME = 1;

	/**
	 * The feature id for the '<em><b>Batche</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STUDENT__BATCHE = 2;

	/**
	 * The feature id for the '<em><b>Registercourse</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STUDENT__REGISTERCOURSE = 3;

	/**
	 * The feature id for the '<em><b>Results</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STUDENT__RESULTS = 4;

	/**
	 * The number of structural features of the '<em>Student</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STUDENT_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Student</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STUDENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link ObeModel.impl.CLOImpl <em>CLO</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ObeModel.impl.CLOImpl
	 * @see ObeModel.impl.ObeModelPackageImpl#getCLO()
	 * @generated
	 */
	int CLO = 10;

	/**
	 * The feature id for the '<em><b>Statement</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLO__STATEMENT = 0;

	/**
	 * The feature id for the '<em><b>Learninglevels</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLO__LEARNINGLEVELS = 1;

	/**
	 * The feature id for the '<em><b>Activity</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLO__ACTIVITY = 2;

	/**
	 * The feature id for the '<em><b>Maptoplo</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLO__MAPTOPLO = 3;

	/**
	 * The number of structural features of the '<em>CLO</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLO_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>CLO</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLO_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link ObeModel.impl.LearningLevelsImpl <em>Learning Levels</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ObeModel.impl.LearningLevelsImpl
	 * @see ObeModel.impl.ObeModelPackageImpl#getLearningLevels()
	 * @generated
	 */
	int LEARNING_LEVELS = 11;

	/**
	 * The feature id for the '<em><b>Level</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEARNING_LEVELS__LEVEL = 0;

	/**
	 * The feature id for the '<em><b>Domain</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEARNING_LEVELS__DOMAIN = 1;

	/**
	 * The feature id for the '<em><b>Clo</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEARNING_LEVELS__CLO = 2;

	/**
	 * The number of structural features of the '<em>Learning Levels</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEARNING_LEVELS_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Learning Levels</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEARNING_LEVELS_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link ObeModel.impl.ActivityImpl <em>Activity</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ObeModel.impl.ActivityImpl
	 * @see ObeModel.impl.ObeModelPackageImpl#getActivity()
	 * @generated
	 */
	int ACTIVITY = 12;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY__NAME = 0;

	/**
	 * The feature id for the '<em><b>Total Marks</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY__TOTAL_MARKS = 1;

	/**
	 * The feature id for the '<em><b>Assesment Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY__ASSESMENT_TYPE = 2;

	/**
	 * The feature id for the '<em><b>Activity Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY__ACTIVITY_TYPE = 3;

	/**
	 * The feature id for the '<em><b>Clo</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY__CLO = 4;

	/**
	 * The feature id for the '<em><b>Results</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY__RESULTS = 5;

	/**
	 * The feature id for the '<em><b>Activity Weight</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY__ACTIVITY_WEIGHT = 6;

	/**
	 * The number of structural features of the '<em>Activity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_FEATURE_COUNT = 7;

	/**
	 * The number of operations of the '<em>Activity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link ObeModel.impl.ResultsImpl <em>Results</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ObeModel.impl.ResultsImpl
	 * @see ObeModel.impl.ObeModelPackageImpl#getResults()
	 * @generated
	 */
	int RESULTS = 13;

	/**
	 * The feature id for the '<em><b>Obtained Marks</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESULTS__OBTAINED_MARKS = 0;

	/**
	 * The feature id for the '<em><b>Student</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESULTS__STUDENT = 1;

	/**
	 * The feature id for the '<em><b>Activity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESULTS__ACTIVITY = 2;

	/**
	 * The number of structural features of the '<em>Results</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESULTS_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Results</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESULTS_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link ObeModel.impl.AssesmentImpl <em>Assesment</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ObeModel.impl.AssesmentImpl
	 * @see ObeModel.impl.ObeModelPackageImpl#getAssesment()
	 * @generated
	 */
	int ASSESMENT = 14;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSESMENT__NAME = 0;

	/**
	 * The feature id for the '<em><b>Assesment Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSESMENT__ASSESMENT_TYPE = 1;

	/**
	 * The feature id for the '<em><b>Activity Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSESMENT__ACTIVITY_TYPE = 2;

	/**
	 * The feature id for the '<em><b>Respondant Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSESMENT__RESPONDANT_NAME = 3;

	/**
	 * The feature id for the '<em><b>Marks</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSESMENT__MARKS = 4;

	/**
	 * The number of structural features of the '<em>Assesment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSESMENT_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Assesment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSESMENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link ObeModel.LearningDomain <em>Learning Domain</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ObeModel.LearningDomain
	 * @see ObeModel.impl.ObeModelPackageImpl#getLearningDomain()
	 * @generated
	 */
	int LEARNING_DOMAIN = 15;

	/**
	 * The meta object id for the '{@link ObeModel.ActivityType <em>Activity Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ObeModel.ActivityType
	 * @see ObeModel.impl.ObeModelPackageImpl#getActivityType()
	 * @generated
	 */
	int ACTIVITY_TYPE = 16;

	/**
	 * The meta object id for the '{@link ObeModel.AssesmentType <em>Assesment Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ObeModel.AssesmentType
	 * @see ObeModel.impl.ObeModelPackageImpl#getAssesmentType()
	 * @generated
	 */
	int ASSESMENT_TYPE = 17;

	/**
	 * The meta object id for the '{@link ObeModel.InstituteLevel <em>Institute Level</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ObeModel.InstituteLevel
	 * @see ObeModel.impl.ObeModelPackageImpl#getInstituteLevel()
	 * @generated
	 */
	int INSTITUTE_LEVEL = 18;

	/**
	 * Returns the meta object for class '{@link ObeModel.OBERootNode <em>OBE Root Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>OBE Root Node</em>'.
	 * @see ObeModel.OBERootNode
	 * @generated
	 */
	EClass getOBERootNode();

	/**
	 * Returns the meta object for the containment reference list '{@link ObeModel.OBERootNode#getInstitutes <em>Institutes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Institutes</em>'.
	 * @see ObeModel.OBERootNode#getInstitutes()
	 * @see #getOBERootNode()
	 * @generated
	 */
	EReference getOBERootNode_Institutes();

	/**
	 * Returns the meta object for the containment reference list '{@link ObeModel.OBERootNode#getVisions <em>Visions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Visions</em>'.
	 * @see ObeModel.OBERootNode#getVisions()
	 * @see #getOBERootNode()
	 * @generated
	 */
	EReference getOBERootNode_Visions();

	/**
	 * Returns the meta object for the containment reference list '{@link ObeModel.OBERootNode#getMissions <em>Missions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Missions</em>'.
	 * @see ObeModel.OBERootNode#getMissions()
	 * @see #getOBERootNode()
	 * @generated
	 */
	EReference getOBERootNode_Missions();

	/**
	 * Returns the meta object for the containment reference list '{@link ObeModel.OBERootNode#getPeos <em>Peos</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Peos</em>'.
	 * @see ObeModel.OBERootNode#getPeos()
	 * @see #getOBERootNode()
	 * @generated
	 */
	EReference getOBERootNode_Peos();

	/**
	 * Returns the meta object for the containment reference list '{@link ObeModel.OBERootNode#getCourses <em>Courses</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Courses</em>'.
	 * @see ObeModel.OBERootNode#getCourses()
	 * @see #getOBERootNode()
	 * @generated
	 */
	EReference getOBERootNode_Courses();

	/**
	 * Returns the meta object for the containment reference list '{@link ObeModel.OBERootNode#getBatches <em>Batches</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Batches</em>'.
	 * @see ObeModel.OBERootNode#getBatches()
	 * @see #getOBERootNode()
	 * @generated
	 */
	EReference getOBERootNode_Batches();

	/**
	 * Returns the meta object for the containment reference list '{@link ObeModel.OBERootNode#getPrograms <em>Programs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Programs</em>'.
	 * @see ObeModel.OBERootNode#getPrograms()
	 * @see #getOBERootNode()
	 * @generated
	 */
	EReference getOBERootNode_Programs();

	/**
	 * Returns the meta object for the containment reference list '{@link ObeModel.OBERootNode#getPlos <em>Plos</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Plos</em>'.
	 * @see ObeModel.OBERootNode#getPlos()
	 * @see #getOBERootNode()
	 * @generated
	 */
	EReference getOBERootNode_Plos();

	/**
	 * Returns the meta object for the containment reference list '{@link ObeModel.OBERootNode#getStudents <em>Students</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Students</em>'.
	 * @see ObeModel.OBERootNode#getStudents()
	 * @see #getOBERootNode()
	 * @generated
	 */
	EReference getOBERootNode_Students();

	/**
	 * Returns the meta object for the containment reference list '{@link ObeModel.OBERootNode#getActivitties <em>Activitties</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Activitties</em>'.
	 * @see ObeModel.OBERootNode#getActivitties()
	 * @see #getOBERootNode()
	 * @generated
	 */
	EReference getOBERootNode_Activitties();

	/**
	 * Returns the meta object for the containment reference list '{@link ObeModel.OBERootNode#getClos <em>Clos</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Clos</em>'.
	 * @see ObeModel.OBERootNode#getClos()
	 * @see #getOBERootNode()
	 * @generated
	 */
	EReference getOBERootNode_Clos();

	/**
	 * Returns the meta object for the containment reference list '{@link ObeModel.OBERootNode#getLearninglevels <em>Learninglevels</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Learninglevels</em>'.
	 * @see ObeModel.OBERootNode#getLearninglevels()
	 * @see #getOBERootNode()
	 * @generated
	 */
	EReference getOBERootNode_Learninglevels();

	/**
	 * Returns the meta object for the containment reference list '{@link ObeModel.OBERootNode#getResults <em>Results</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Results</em>'.
	 * @see ObeModel.OBERootNode#getResults()
	 * @see #getOBERootNode()
	 * @generated
	 */
	EReference getOBERootNode_Results();

	/**
	 * Returns the meta object for class '{@link ObeModel.Institute <em>Institute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Institute</em>'.
	 * @see ObeModel.Institute
	 * @generated
	 */
	EClass getInstitute();

	/**
	 * Returns the meta object for the attribute '{@link ObeModel.Institute#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see ObeModel.Institute#getName()
	 * @see #getInstitute()
	 * @generated
	 */
	EAttribute getInstitute_Name();

	/**
	 * Returns the meta object for the attribute '{@link ObeModel.Institute#getInstituteLevel <em>Institute Level</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Institute Level</em>'.
	 * @see ObeModel.Institute#getInstituteLevel()
	 * @see #getInstitute()
	 * @generated
	 */
	EAttribute getInstitute_InstituteLevel();

	/**
	 * Returns the meta object for the reference '{@link ObeModel.Institute#getAssociatedvision <em>Associatedvision</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Associatedvision</em>'.
	 * @see ObeModel.Institute#getAssociatedvision()
	 * @see #getInstitute()
	 * @generated
	 */
	EReference getInstitute_Associatedvision();

	/**
	 * Returns the meta object for the reference list '{@link ObeModel.Institute#getOfferprograms <em>Offerprograms</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Offerprograms</em>'.
	 * @see ObeModel.Institute#getOfferprograms()
	 * @see #getInstitute()
	 * @generated
	 */
	EReference getInstitute_Offerprograms();

	/**
	 * Returns the meta object for the reference '{@link ObeModel.Institute#getParentInstitute <em>Parent Institute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Parent Institute</em>'.
	 * @see ObeModel.Institute#getParentInstitute()
	 * @see #getInstitute()
	 * @generated
	 */
	EReference getInstitute_ParentInstitute();

	/**
	 * Returns the meta object for the reference '{@link ObeModel.Institute#getAssociatedmission <em>Associatedmission</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Associatedmission</em>'.
	 * @see ObeModel.Institute#getAssociatedmission()
	 * @see #getInstitute()
	 * @generated
	 */
	EReference getInstitute_Associatedmission();

	/**
	 * Returns the meta object for class '{@link ObeModel.Vision <em>Vision</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Vision</em>'.
	 * @see ObeModel.Vision
	 * @generated
	 */
	EClass getVision();

	/**
	 * Returns the meta object for the attribute '{@link ObeModel.Vision#getVisionStatement <em>Vision Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Vision Statement</em>'.
	 * @see ObeModel.Vision#getVisionStatement()
	 * @see #getVision()
	 * @generated
	 */
	EAttribute getVision_VisionStatement();

	/**
	 * Returns the meta object for class '{@link ObeModel.Mission <em>Mission</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Mission</em>'.
	 * @see ObeModel.Mission
	 * @generated
	 */
	EClass getMission();

	/**
	 * Returns the meta object for the attribute '{@link ObeModel.Mission#getMissionStatement <em>Mission Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Mission Statement</em>'.
	 * @see ObeModel.Mission#getMissionStatement()
	 * @see #getMission()
	 * @generated
	 */
	EAttribute getMission_MissionStatement();

	/**
	 * Returns the meta object for the reference '{@link ObeModel.Mission#getInstitute <em>Institute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Institute</em>'.
	 * @see ObeModel.Mission#getInstitute()
	 * @see #getMission()
	 * @generated
	 */
	EReference getMission_Institute();

	/**
	 * Returns the meta object for the reference '{@link ObeModel.Mission#getAssesment <em>Assesment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Assesment</em>'.
	 * @see ObeModel.Mission#getAssesment()
	 * @see #getMission()
	 * @generated
	 */
	EReference getMission_Assesment();

	/**
	 * Returns the meta object for class '{@link ObeModel.Program <em>Program</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Program</em>'.
	 * @see ObeModel.Program
	 * @generated
	 */
	EClass getProgram();

	/**
	 * Returns the meta object for the attribute '{@link ObeModel.Program#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see ObeModel.Program#getName()
	 * @see #getProgram()
	 * @generated
	 */
	EAttribute getProgram_Name();

	/**
	 * Returns the meta object for the reference list '{@link ObeModel.Program#getProgramobjectives <em>Programobjectives</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Programobjectives</em>'.
	 * @see ObeModel.Program#getProgramobjectives()
	 * @see #getProgram()
	 * @generated
	 */
	EReference getProgram_Programobjectives();

	/**
	 * Returns the meta object for the reference list '{@link ObeModel.Program#getProgramlearningoutcomes <em>Programlearningoutcomes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Programlearningoutcomes</em>'.
	 * @see ObeModel.Program#getProgramlearningoutcomes()
	 * @see #getProgram()
	 * @generated
	 */
	EReference getProgram_Programlearningoutcomes();

	/**
	 * Returns the meta object for the reference list '{@link ObeModel.Program#getAssociatedbatches <em>Associatedbatches</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Associatedbatches</em>'.
	 * @see ObeModel.Program#getAssociatedbatches()
	 * @see #getProgram()
	 * @generated
	 */
	EReference getProgram_Associatedbatches();

	/**
	 * Returns the meta object for the reference list '{@link ObeModel.Program#getOfferedcourses <em>Offeredcourses</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Offeredcourses</em>'.
	 * @see ObeModel.Program#getOfferedcourses()
	 * @see #getProgram()
	 * @generated
	 */
	EReference getProgram_Offeredcourses();

	/**
	 * Returns the meta object for class '{@link ObeModel.PEO <em>PEO</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>PEO</em>'.
	 * @see ObeModel.PEO
	 * @generated
	 */
	EClass getPEO();

	/**
	 * Returns the meta object for the attribute '{@link ObeModel.PEO#getPEOStatement <em>PEO Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>PEO Statement</em>'.
	 * @see ObeModel.PEO#getPEOStatement()
	 * @see #getPEO()
	 * @generated
	 */
	EAttribute getPEO_PEOStatement();

	/**
	 * Returns the meta object for the attribute '{@link ObeModel.PEO#getThreshold <em>Threshold</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Threshold</em>'.
	 * @see ObeModel.PEO#getThreshold()
	 * @see #getPEO()
	 * @generated
	 */
	EAttribute getPEO_Threshold();

	/**
	 * Returns the meta object for the reference '{@link ObeModel.PEO#getMission <em>Mission</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Mission</em>'.
	 * @see ObeModel.PEO#getMission()
	 * @see #getPEO()
	 * @generated
	 */
	EReference getPEO_Mission();

	/**
	 * Returns the meta object for the reference list '{@link ObeModel.PEO#getPlos <em>Plos</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Plos</em>'.
	 * @see ObeModel.PEO#getPlos()
	 * @see #getPEO()
	 * @generated
	 */
	EReference getPEO_Plos();

	/**
	 * Returns the meta object for the attribute '{@link ObeModel.PEO#getTitle <em>Title</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Title</em>'.
	 * @see ObeModel.PEO#getTitle()
	 * @see #getPEO()
	 * @generated
	 */
	EAttribute getPEO_Title();

	/**
	 * Returns the meta object for the reference '{@link ObeModel.PEO#getAssesment <em>Assesment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Assesment</em>'.
	 * @see ObeModel.PEO#getAssesment()
	 * @see #getPEO()
	 * @generated
	 */
	EReference getPEO_Assesment();

	/**
	 * Returns the meta object for class '{@link ObeModel.Plo <em>Plo</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Plo</em>'.
	 * @see ObeModel.Plo
	 * @generated
	 */
	EClass getPlo();

	/**
	 * Returns the meta object for the attribute '{@link ObeModel.Plo#getTitle <em>Title</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Title</em>'.
	 * @see ObeModel.Plo#getTitle()
	 * @see #getPlo()
	 * @generated
	 */
	EAttribute getPlo_Title();

	/**
	 * Returns the meta object for the reference list '{@link ObeModel.Plo#getClosMapping <em>Clos Mapping</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Clos Mapping</em>'.
	 * @see ObeModel.Plo#getClosMapping()
	 * @see #getPlo()
	 * @generated
	 */
	EReference getPlo_ClosMapping();

	/**
	 * Returns the meta object for the reference '{@link ObeModel.Plo#getPeo <em>Peo</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Peo</em>'.
	 * @see ObeModel.Plo#getPeo()
	 * @see #getPlo()
	 * @generated
	 */
	EReference getPlo_Peo();

	/**
	 * Returns the meta object for class '{@link ObeModel.Courses <em>Courses</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Courses</em>'.
	 * @see ObeModel.Courses
	 * @generated
	 */
	EClass getCourses();

	/**
	 * Returns the meta object for the attribute '{@link ObeModel.Courses#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see ObeModel.Courses#getName()
	 * @see #getCourses()
	 * @generated
	 */
	EAttribute getCourses_Name();

	/**
	 * Returns the meta object for the reference list '{@link ObeModel.Courses#getLearningoutcomes <em>Learningoutcomes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Learningoutcomes</em>'.
	 * @see ObeModel.Courses#getLearningoutcomes()
	 * @see #getCourses()
	 * @generated
	 */
	EReference getCourses_Learningoutcomes();

	/**
	 * Returns the meta object for the reference list '{@link ObeModel.Courses#getActivities <em>Activities</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Activities</em>'.
	 * @see ObeModel.Courses#getActivities()
	 * @see #getCourses()
	 * @generated
	 */
	EReference getCourses_Activities();

	/**
	 * Returns the meta object for class '{@link ObeModel.Batches <em>Batches</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Batches</em>'.
	 * @see ObeModel.Batches
	 * @generated
	 */
	EClass getBatches();

	/**
	 * Returns the meta object for the attribute '{@link ObeModel.Batches#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see ObeModel.Batches#getName()
	 * @see #getBatches()
	 * @generated
	 */
	EAttribute getBatches_Name();

	/**
	 * Returns the meta object for the attribute '{@link ObeModel.Batches#getIndvThreshold <em>Indv Threshold</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Indv Threshold</em>'.
	 * @see ObeModel.Batches#getIndvThreshold()
	 * @see #getBatches()
	 * @generated
	 */
	EAttribute getBatches_IndvThreshold();

	/**
	 * Returns the meta object for the attribute '{@link ObeModel.Batches#getChortLevelThreshold <em>Chort Level Threshold</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Chort Level Threshold</em>'.
	 * @see ObeModel.Batches#getChortLevelThreshold()
	 * @see #getBatches()
	 * @generated
	 */
	EAttribute getBatches_ChortLevelThreshold();

	/**
	 * Returns the meta object for the reference list '{@link ObeModel.Batches#getStudents <em>Students</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Students</em>'.
	 * @see ObeModel.Batches#getStudents()
	 * @see #getBatches()
	 * @generated
	 */
	EReference getBatches_Students();

	/**
	 * Returns the meta object for class '{@link ObeModel.Student <em>Student</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Student</em>'.
	 * @see ObeModel.Student
	 * @generated
	 */
	EClass getStudent();

	/**
	 * Returns the meta object for the attribute '{@link ObeModel.Student#getRollNumber <em>Roll Number</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Roll Number</em>'.
	 * @see ObeModel.Student#getRollNumber()
	 * @see #getStudent()
	 * @generated
	 */
	EAttribute getStudent_RollNumber();

	/**
	 * Returns the meta object for the attribute '{@link ObeModel.Student#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see ObeModel.Student#getName()
	 * @see #getStudent()
	 * @generated
	 */
	EAttribute getStudent_Name();

	/**
	 * Returns the meta object for the reference '{@link ObeModel.Student#getBatche <em>Batche</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Batche</em>'.
	 * @see ObeModel.Student#getBatche()
	 * @see #getStudent()
	 * @generated
	 */
	EReference getStudent_Batche();

	/**
	 * Returns the meta object for the reference list '{@link ObeModel.Student#getRegistercourse <em>Registercourse</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Registercourse</em>'.
	 * @see ObeModel.Student#getRegistercourse()
	 * @see #getStudent()
	 * @generated
	 */
	EReference getStudent_Registercourse();

	/**
	 * Returns the meta object for the reference list '{@link ObeModel.Student#getResults <em>Results</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Results</em>'.
	 * @see ObeModel.Student#getResults()
	 * @see #getStudent()
	 * @generated
	 */
	EReference getStudent_Results();

	/**
	 * Returns the meta object for class '{@link ObeModel.CLO <em>CLO</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>CLO</em>'.
	 * @see ObeModel.CLO
	 * @generated
	 */
	EClass getCLO();

	/**
	 * Returns the meta object for the attribute '{@link ObeModel.CLO#getStatement <em>Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Statement</em>'.
	 * @see ObeModel.CLO#getStatement()
	 * @see #getCLO()
	 * @generated
	 */
	EAttribute getCLO_Statement();

	/**
	 * Returns the meta object for the reference '{@link ObeModel.CLO#getLearninglevels <em>Learninglevels</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Learninglevels</em>'.
	 * @see ObeModel.CLO#getLearninglevels()
	 * @see #getCLO()
	 * @generated
	 */
	EReference getCLO_Learninglevels();

	/**
	 * Returns the meta object for the reference list '{@link ObeModel.CLO#getActivity <em>Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Activity</em>'.
	 * @see ObeModel.CLO#getActivity()
	 * @see #getCLO()
	 * @generated
	 */
	EReference getCLO_Activity();

	/**
	 * Returns the meta object for the reference '{@link ObeModel.CLO#getMaptoplo <em>Maptoplo</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Maptoplo</em>'.
	 * @see ObeModel.CLO#getMaptoplo()
	 * @see #getCLO()
	 * @generated
	 */
	EReference getCLO_Maptoplo();

	/**
	 * Returns the meta object for class '{@link ObeModel.LearningLevels <em>Learning Levels</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Learning Levels</em>'.
	 * @see ObeModel.LearningLevels
	 * @generated
	 */
	EClass getLearningLevels();

	/**
	 * Returns the meta object for the attribute '{@link ObeModel.LearningLevels#getLevel <em>Level</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Level</em>'.
	 * @see ObeModel.LearningLevels#getLevel()
	 * @see #getLearningLevels()
	 * @generated
	 */
	EAttribute getLearningLevels_Level();

	/**
	 * Returns the meta object for the attribute '{@link ObeModel.LearningLevels#getDomain <em>Domain</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Domain</em>'.
	 * @see ObeModel.LearningLevels#getDomain()
	 * @see #getLearningLevels()
	 * @generated
	 */
	EAttribute getLearningLevels_Domain();

	/**
	 * Returns the meta object for the reference list '{@link ObeModel.LearningLevels#getClo <em>Clo</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Clo</em>'.
	 * @see ObeModel.LearningLevels#getClo()
	 * @see #getLearningLevels()
	 * @generated
	 */
	EReference getLearningLevels_Clo();

	/**
	 * Returns the meta object for class '{@link ObeModel.Activity <em>Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Activity</em>'.
	 * @see ObeModel.Activity
	 * @generated
	 */
	EClass getActivity();

	/**
	 * Returns the meta object for the attribute '{@link ObeModel.Activity#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see ObeModel.Activity#getName()
	 * @see #getActivity()
	 * @generated
	 */
	EAttribute getActivity_Name();

	/**
	 * Returns the meta object for the attribute '{@link ObeModel.Activity#getTotalMarks <em>Total Marks</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Total Marks</em>'.
	 * @see ObeModel.Activity#getTotalMarks()
	 * @see #getActivity()
	 * @generated
	 */
	EAttribute getActivity_TotalMarks();

	/**
	 * Returns the meta object for the attribute '{@link ObeModel.Activity#getAssesmentType <em>Assesment Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Assesment Type</em>'.
	 * @see ObeModel.Activity#getAssesmentType()
	 * @see #getActivity()
	 * @generated
	 */
	EAttribute getActivity_AssesmentType();

	/**
	 * Returns the meta object for the attribute '{@link ObeModel.Activity#getActivityType <em>Activity Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Activity Type</em>'.
	 * @see ObeModel.Activity#getActivityType()
	 * @see #getActivity()
	 * @generated
	 */
	EAttribute getActivity_ActivityType();

	/**
	 * Returns the meta object for the reference '{@link ObeModel.Activity#getClo <em>Clo</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Clo</em>'.
	 * @see ObeModel.Activity#getClo()
	 * @see #getActivity()
	 * @generated
	 */
	EReference getActivity_Clo();

	/**
	 * Returns the meta object for the reference list '{@link ObeModel.Activity#getResults <em>Results</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Results</em>'.
	 * @see ObeModel.Activity#getResults()
	 * @see #getActivity()
	 * @generated
	 */
	EReference getActivity_Results();

	/**
	 * Returns the meta object for the attribute '{@link ObeModel.Activity#getActivityWeight <em>Activity Weight</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Activity Weight</em>'.
	 * @see ObeModel.Activity#getActivityWeight()
	 * @see #getActivity()
	 * @generated
	 */
	EAttribute getActivity_ActivityWeight();

	/**
	 * Returns the meta object for class '{@link ObeModel.Results <em>Results</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Results</em>'.
	 * @see ObeModel.Results
	 * @generated
	 */
	EClass getResults();

	/**
	 * Returns the meta object for the attribute '{@link ObeModel.Results#getObtainedMarks <em>Obtained Marks</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Obtained Marks</em>'.
	 * @see ObeModel.Results#getObtainedMarks()
	 * @see #getResults()
	 * @generated
	 */
	EAttribute getResults_ObtainedMarks();

	/**
	 * Returns the meta object for the reference '{@link ObeModel.Results#getStudent <em>Student</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Student</em>'.
	 * @see ObeModel.Results#getStudent()
	 * @see #getResults()
	 * @generated
	 */
	EReference getResults_Student();

	/**
	 * Returns the meta object for the reference '{@link ObeModel.Results#getActivity <em>Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Activity</em>'.
	 * @see ObeModel.Results#getActivity()
	 * @see #getResults()
	 * @generated
	 */
	EReference getResults_Activity();

	/**
	 * Returns the meta object for class '{@link ObeModel.Assesment <em>Assesment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Assesment</em>'.
	 * @see ObeModel.Assesment
	 * @generated
	 */
	EClass getAssesment();

	/**
	 * Returns the meta object for the attribute '{@link ObeModel.Assesment#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see ObeModel.Assesment#getName()
	 * @see #getAssesment()
	 * @generated
	 */
	EAttribute getAssesment_Name();

	/**
	 * Returns the meta object for the attribute '{@link ObeModel.Assesment#getAssesmentType <em>Assesment Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Assesment Type</em>'.
	 * @see ObeModel.Assesment#getAssesmentType()
	 * @see #getAssesment()
	 * @generated
	 */
	EAttribute getAssesment_AssesmentType();

	/**
	 * Returns the meta object for the attribute '{@link ObeModel.Assesment#getActivityType <em>Activity Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Activity Type</em>'.
	 * @see ObeModel.Assesment#getActivityType()
	 * @see #getAssesment()
	 * @generated
	 */
	EAttribute getAssesment_ActivityType();

	/**
	 * Returns the meta object for the attribute '{@link ObeModel.Assesment#getRespondantName <em>Respondant Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Respondant Name</em>'.
	 * @see ObeModel.Assesment#getRespondantName()
	 * @see #getAssesment()
	 * @generated
	 */
	EAttribute getAssesment_RespondantName();

	/**
	 * Returns the meta object for the attribute '{@link ObeModel.Assesment#getMarks <em>Marks</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Marks</em>'.
	 * @see ObeModel.Assesment#getMarks()
	 * @see #getAssesment()
	 * @generated
	 */
	EAttribute getAssesment_Marks();

	/**
	 * Returns the meta object for enum '{@link ObeModel.LearningDomain <em>Learning Domain</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Learning Domain</em>'.
	 * @see ObeModel.LearningDomain
	 * @generated
	 */
	EEnum getLearningDomain();

	/**
	 * Returns the meta object for enum '{@link ObeModel.ActivityType <em>Activity Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Activity Type</em>'.
	 * @see ObeModel.ActivityType
	 * @generated
	 */
	EEnum getActivityType();

	/**
	 * Returns the meta object for enum '{@link ObeModel.AssesmentType <em>Assesment Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Assesment Type</em>'.
	 * @see ObeModel.AssesmentType
	 * @generated
	 */
	EEnum getAssesmentType();

	/**
	 * Returns the meta object for enum '{@link ObeModel.InstituteLevel <em>Institute Level</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Institute Level</em>'.
	 * @see ObeModel.InstituteLevel
	 * @generated
	 */
	EEnum getInstituteLevel();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	ObeModelFactory getObeModelFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link ObeModel.impl.OBERootNodeImpl <em>OBE Root Node</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ObeModel.impl.OBERootNodeImpl
		 * @see ObeModel.impl.ObeModelPackageImpl#getOBERootNode()
		 * @generated
		 */
		EClass OBE_ROOT_NODE = eINSTANCE.getOBERootNode();

		/**
		 * The meta object literal for the '<em><b>Institutes</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OBE_ROOT_NODE__INSTITUTES = eINSTANCE.getOBERootNode_Institutes();

		/**
		 * The meta object literal for the '<em><b>Visions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OBE_ROOT_NODE__VISIONS = eINSTANCE.getOBERootNode_Visions();

		/**
		 * The meta object literal for the '<em><b>Missions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OBE_ROOT_NODE__MISSIONS = eINSTANCE.getOBERootNode_Missions();

		/**
		 * The meta object literal for the '<em><b>Peos</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OBE_ROOT_NODE__PEOS = eINSTANCE.getOBERootNode_Peos();

		/**
		 * The meta object literal for the '<em><b>Courses</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OBE_ROOT_NODE__COURSES = eINSTANCE.getOBERootNode_Courses();

		/**
		 * The meta object literal for the '<em><b>Batches</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OBE_ROOT_NODE__BATCHES = eINSTANCE.getOBERootNode_Batches();

		/**
		 * The meta object literal for the '<em><b>Programs</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OBE_ROOT_NODE__PROGRAMS = eINSTANCE.getOBERootNode_Programs();

		/**
		 * The meta object literal for the '<em><b>Plos</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OBE_ROOT_NODE__PLOS = eINSTANCE.getOBERootNode_Plos();

		/**
		 * The meta object literal for the '<em><b>Students</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OBE_ROOT_NODE__STUDENTS = eINSTANCE.getOBERootNode_Students();

		/**
		 * The meta object literal for the '<em><b>Activitties</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OBE_ROOT_NODE__ACTIVITTIES = eINSTANCE.getOBERootNode_Activitties();

		/**
		 * The meta object literal for the '<em><b>Clos</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OBE_ROOT_NODE__CLOS = eINSTANCE.getOBERootNode_Clos();

		/**
		 * The meta object literal for the '<em><b>Learninglevels</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OBE_ROOT_NODE__LEARNINGLEVELS = eINSTANCE.getOBERootNode_Learninglevels();

		/**
		 * The meta object literal for the '<em><b>Results</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OBE_ROOT_NODE__RESULTS = eINSTANCE.getOBERootNode_Results();

		/**
		 * The meta object literal for the '{@link ObeModel.impl.InstituteImpl <em>Institute</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ObeModel.impl.InstituteImpl
		 * @see ObeModel.impl.ObeModelPackageImpl#getInstitute()
		 * @generated
		 */
		EClass INSTITUTE = eINSTANCE.getInstitute();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INSTITUTE__NAME = eINSTANCE.getInstitute_Name();

		/**
		 * The meta object literal for the '<em><b>Institute Level</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INSTITUTE__INSTITUTE_LEVEL = eINSTANCE.getInstitute_InstituteLevel();

		/**
		 * The meta object literal for the '<em><b>Associatedvision</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INSTITUTE__ASSOCIATEDVISION = eINSTANCE.getInstitute_Associatedvision();

		/**
		 * The meta object literal for the '<em><b>Offerprograms</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INSTITUTE__OFFERPROGRAMS = eINSTANCE.getInstitute_Offerprograms();

		/**
		 * The meta object literal for the '<em><b>Parent Institute</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INSTITUTE__PARENT_INSTITUTE = eINSTANCE.getInstitute_ParentInstitute();

		/**
		 * The meta object literal for the '<em><b>Associatedmission</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INSTITUTE__ASSOCIATEDMISSION = eINSTANCE.getInstitute_Associatedmission();

		/**
		 * The meta object literal for the '{@link ObeModel.impl.VisionImpl <em>Vision</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ObeModel.impl.VisionImpl
		 * @see ObeModel.impl.ObeModelPackageImpl#getVision()
		 * @generated
		 */
		EClass VISION = eINSTANCE.getVision();

		/**
		 * The meta object literal for the '<em><b>Vision Statement</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VISION__VISION_STATEMENT = eINSTANCE.getVision_VisionStatement();

		/**
		 * The meta object literal for the '{@link ObeModel.impl.MissionImpl <em>Mission</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ObeModel.impl.MissionImpl
		 * @see ObeModel.impl.ObeModelPackageImpl#getMission()
		 * @generated
		 */
		EClass MISSION = eINSTANCE.getMission();

		/**
		 * The meta object literal for the '<em><b>Mission Statement</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MISSION__MISSION_STATEMENT = eINSTANCE.getMission_MissionStatement();

		/**
		 * The meta object literal for the '<em><b>Institute</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MISSION__INSTITUTE = eINSTANCE.getMission_Institute();

		/**
		 * The meta object literal for the '<em><b>Assesment</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MISSION__ASSESMENT = eINSTANCE.getMission_Assesment();

		/**
		 * The meta object literal for the '{@link ObeModel.impl.ProgramImpl <em>Program</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ObeModel.impl.ProgramImpl
		 * @see ObeModel.impl.ObeModelPackageImpl#getProgram()
		 * @generated
		 */
		EClass PROGRAM = eINSTANCE.getProgram();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROGRAM__NAME = eINSTANCE.getProgram_Name();

		/**
		 * The meta object literal for the '<em><b>Programobjectives</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROGRAM__PROGRAMOBJECTIVES = eINSTANCE.getProgram_Programobjectives();

		/**
		 * The meta object literal for the '<em><b>Programlearningoutcomes</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROGRAM__PROGRAMLEARNINGOUTCOMES = eINSTANCE.getProgram_Programlearningoutcomes();

		/**
		 * The meta object literal for the '<em><b>Associatedbatches</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROGRAM__ASSOCIATEDBATCHES = eINSTANCE.getProgram_Associatedbatches();

		/**
		 * The meta object literal for the '<em><b>Offeredcourses</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROGRAM__OFFEREDCOURSES = eINSTANCE.getProgram_Offeredcourses();

		/**
		 * The meta object literal for the '{@link ObeModel.impl.PEOImpl <em>PEO</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ObeModel.impl.PEOImpl
		 * @see ObeModel.impl.ObeModelPackageImpl#getPEO()
		 * @generated
		 */
		EClass PEO = eINSTANCE.getPEO();

		/**
		 * The meta object literal for the '<em><b>PEO Statement</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PEO__PEO_STATEMENT = eINSTANCE.getPEO_PEOStatement();

		/**
		 * The meta object literal for the '<em><b>Threshold</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PEO__THRESHOLD = eINSTANCE.getPEO_Threshold();

		/**
		 * The meta object literal for the '<em><b>Mission</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PEO__MISSION = eINSTANCE.getPEO_Mission();

		/**
		 * The meta object literal for the '<em><b>Plos</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PEO__PLOS = eINSTANCE.getPEO_Plos();

		/**
		 * The meta object literal for the '<em><b>Title</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PEO__TITLE = eINSTANCE.getPEO_Title();

		/**
		 * The meta object literal for the '<em><b>Assesment</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PEO__ASSESMENT = eINSTANCE.getPEO_Assesment();

		/**
		 * The meta object literal for the '{@link ObeModel.impl.PloImpl <em>Plo</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ObeModel.impl.PloImpl
		 * @see ObeModel.impl.ObeModelPackageImpl#getPlo()
		 * @generated
		 */
		EClass PLO = eINSTANCE.getPlo();

		/**
		 * The meta object literal for the '<em><b>Title</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PLO__TITLE = eINSTANCE.getPlo_Title();

		/**
		 * The meta object literal for the '<em><b>Clos Mapping</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PLO__CLOS_MAPPING = eINSTANCE.getPlo_ClosMapping();

		/**
		 * The meta object literal for the '<em><b>Peo</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PLO__PEO = eINSTANCE.getPlo_Peo();

		/**
		 * The meta object literal for the '{@link ObeModel.impl.CoursesImpl <em>Courses</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ObeModel.impl.CoursesImpl
		 * @see ObeModel.impl.ObeModelPackageImpl#getCourses()
		 * @generated
		 */
		EClass COURSES = eINSTANCE.getCourses();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COURSES__NAME = eINSTANCE.getCourses_Name();

		/**
		 * The meta object literal for the '<em><b>Learningoutcomes</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COURSES__LEARNINGOUTCOMES = eINSTANCE.getCourses_Learningoutcomes();

		/**
		 * The meta object literal for the '<em><b>Activities</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COURSES__ACTIVITIES = eINSTANCE.getCourses_Activities();

		/**
		 * The meta object literal for the '{@link ObeModel.impl.BatchesImpl <em>Batches</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ObeModel.impl.BatchesImpl
		 * @see ObeModel.impl.ObeModelPackageImpl#getBatches()
		 * @generated
		 */
		EClass BATCHES = eINSTANCE.getBatches();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BATCHES__NAME = eINSTANCE.getBatches_Name();

		/**
		 * The meta object literal for the '<em><b>Indv Threshold</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BATCHES__INDV_THRESHOLD = eINSTANCE.getBatches_IndvThreshold();

		/**
		 * The meta object literal for the '<em><b>Chort Level Threshold</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BATCHES__CHORT_LEVEL_THRESHOLD = eINSTANCE.getBatches_ChortLevelThreshold();

		/**
		 * The meta object literal for the '<em><b>Students</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BATCHES__STUDENTS = eINSTANCE.getBatches_Students();

		/**
		 * The meta object literal for the '{@link ObeModel.impl.StudentImpl <em>Student</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ObeModel.impl.StudentImpl
		 * @see ObeModel.impl.ObeModelPackageImpl#getStudent()
		 * @generated
		 */
		EClass STUDENT = eINSTANCE.getStudent();

		/**
		 * The meta object literal for the '<em><b>Roll Number</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STUDENT__ROLL_NUMBER = eINSTANCE.getStudent_RollNumber();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STUDENT__NAME = eINSTANCE.getStudent_Name();

		/**
		 * The meta object literal for the '<em><b>Batche</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STUDENT__BATCHE = eINSTANCE.getStudent_Batche();

		/**
		 * The meta object literal for the '<em><b>Registercourse</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STUDENT__REGISTERCOURSE = eINSTANCE.getStudent_Registercourse();

		/**
		 * The meta object literal for the '<em><b>Results</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STUDENT__RESULTS = eINSTANCE.getStudent_Results();

		/**
		 * The meta object literal for the '{@link ObeModel.impl.CLOImpl <em>CLO</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ObeModel.impl.CLOImpl
		 * @see ObeModel.impl.ObeModelPackageImpl#getCLO()
		 * @generated
		 */
		EClass CLO = eINSTANCE.getCLO();

		/**
		 * The meta object literal for the '<em><b>Statement</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CLO__STATEMENT = eINSTANCE.getCLO_Statement();

		/**
		 * The meta object literal for the '<em><b>Learninglevels</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CLO__LEARNINGLEVELS = eINSTANCE.getCLO_Learninglevels();

		/**
		 * The meta object literal for the '<em><b>Activity</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CLO__ACTIVITY = eINSTANCE.getCLO_Activity();

		/**
		 * The meta object literal for the '<em><b>Maptoplo</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CLO__MAPTOPLO = eINSTANCE.getCLO_Maptoplo();

		/**
		 * The meta object literal for the '{@link ObeModel.impl.LearningLevelsImpl <em>Learning Levels</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ObeModel.impl.LearningLevelsImpl
		 * @see ObeModel.impl.ObeModelPackageImpl#getLearningLevels()
		 * @generated
		 */
		EClass LEARNING_LEVELS = eINSTANCE.getLearningLevels();

		/**
		 * The meta object literal for the '<em><b>Level</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LEARNING_LEVELS__LEVEL = eINSTANCE.getLearningLevels_Level();

		/**
		 * The meta object literal for the '<em><b>Domain</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LEARNING_LEVELS__DOMAIN = eINSTANCE.getLearningLevels_Domain();

		/**
		 * The meta object literal for the '<em><b>Clo</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LEARNING_LEVELS__CLO = eINSTANCE.getLearningLevels_Clo();

		/**
		 * The meta object literal for the '{@link ObeModel.impl.ActivityImpl <em>Activity</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ObeModel.impl.ActivityImpl
		 * @see ObeModel.impl.ObeModelPackageImpl#getActivity()
		 * @generated
		 */
		EClass ACTIVITY = eINSTANCE.getActivity();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACTIVITY__NAME = eINSTANCE.getActivity_Name();

		/**
		 * The meta object literal for the '<em><b>Total Marks</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACTIVITY__TOTAL_MARKS = eINSTANCE.getActivity_TotalMarks();

		/**
		 * The meta object literal for the '<em><b>Assesment Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACTIVITY__ASSESMENT_TYPE = eINSTANCE.getActivity_AssesmentType();

		/**
		 * The meta object literal for the '<em><b>Activity Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACTIVITY__ACTIVITY_TYPE = eINSTANCE.getActivity_ActivityType();

		/**
		 * The meta object literal for the '<em><b>Clo</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTIVITY__CLO = eINSTANCE.getActivity_Clo();

		/**
		 * The meta object literal for the '<em><b>Results</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTIVITY__RESULTS = eINSTANCE.getActivity_Results();

		/**
		 * The meta object literal for the '<em><b>Activity Weight</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACTIVITY__ACTIVITY_WEIGHT = eINSTANCE.getActivity_ActivityWeight();

		/**
		 * The meta object literal for the '{@link ObeModel.impl.ResultsImpl <em>Results</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ObeModel.impl.ResultsImpl
		 * @see ObeModel.impl.ObeModelPackageImpl#getResults()
		 * @generated
		 */
		EClass RESULTS = eINSTANCE.getResults();

		/**
		 * The meta object literal for the '<em><b>Obtained Marks</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RESULTS__OBTAINED_MARKS = eINSTANCE.getResults_ObtainedMarks();

		/**
		 * The meta object literal for the '<em><b>Student</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RESULTS__STUDENT = eINSTANCE.getResults_Student();

		/**
		 * The meta object literal for the '<em><b>Activity</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RESULTS__ACTIVITY = eINSTANCE.getResults_Activity();

		/**
		 * The meta object literal for the '{@link ObeModel.impl.AssesmentImpl <em>Assesment</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ObeModel.impl.AssesmentImpl
		 * @see ObeModel.impl.ObeModelPackageImpl#getAssesment()
		 * @generated
		 */
		EClass ASSESMENT = eINSTANCE.getAssesment();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ASSESMENT__NAME = eINSTANCE.getAssesment_Name();

		/**
		 * The meta object literal for the '<em><b>Assesment Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ASSESMENT__ASSESMENT_TYPE = eINSTANCE.getAssesment_AssesmentType();

		/**
		 * The meta object literal for the '<em><b>Activity Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ASSESMENT__ACTIVITY_TYPE = eINSTANCE.getAssesment_ActivityType();

		/**
		 * The meta object literal for the '<em><b>Respondant Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ASSESMENT__RESPONDANT_NAME = eINSTANCE.getAssesment_RespondantName();

		/**
		 * The meta object literal for the '<em><b>Marks</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ASSESMENT__MARKS = eINSTANCE.getAssesment_Marks();

		/**
		 * The meta object literal for the '{@link ObeModel.LearningDomain <em>Learning Domain</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ObeModel.LearningDomain
		 * @see ObeModel.impl.ObeModelPackageImpl#getLearningDomain()
		 * @generated
		 */
		EEnum LEARNING_DOMAIN = eINSTANCE.getLearningDomain();

		/**
		 * The meta object literal for the '{@link ObeModel.ActivityType <em>Activity Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ObeModel.ActivityType
		 * @see ObeModel.impl.ObeModelPackageImpl#getActivityType()
		 * @generated
		 */
		EEnum ACTIVITY_TYPE = eINSTANCE.getActivityType();

		/**
		 * The meta object literal for the '{@link ObeModel.AssesmentType <em>Assesment Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ObeModel.AssesmentType
		 * @see ObeModel.impl.ObeModelPackageImpl#getAssesmentType()
		 * @generated
		 */
		EEnum ASSESMENT_TYPE = eINSTANCE.getAssesmentType();

		/**
		 * The meta object literal for the '{@link ObeModel.InstituteLevel <em>Institute Level</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ObeModel.InstituteLevel
		 * @see ObeModel.impl.ObeModelPackageImpl#getInstituteLevel()
		 * @generated
		 */
		EEnum INSTITUTE_LEVEL = eINSTANCE.getInstituteLevel();

	}

} //ObeModelPackage
