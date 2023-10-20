/*******************************************************************************
 *************************************************************************
 * This code is 100% auto-generated
 * from:
 *   /OBEModel/model/ObeModel.ecore
 * using:
 *   /OBEModel/model/ObeModel.genmodel
 *   org.eclipse.ocl.examples.codegen.oclinecore.OCLinEcoreTables
 *
 * Do not edit it.
 *******************************************************************************/
package ObeModel;

// import ObeModel.ObeModelTables;
import org.eclipse.ocl.pivot.internal.library.ecore.EcoreExecutorEnumeration;
import org.eclipse.ocl.pivot.internal.library.ecore.EcoreExecutorEnumerationLiteral;
import org.eclipse.ocl.pivot.internal.library.ecore.EcoreExecutorPackage;
import org.eclipse.ocl.pivot.internal.library.ecore.EcoreExecutorProperty;
import org.eclipse.ocl.pivot.internal.library.ecore.EcoreExecutorType;
import org.eclipse.ocl.pivot.internal.library.ecore.EcoreLibraryOppositeProperty;
import org.eclipse.ocl.pivot.internal.library.executor.ExecutorFragment;
import org.eclipse.ocl.pivot.internal.library.executor.ExecutorOperation;
import org.eclipse.ocl.pivot.internal.library.executor.ExecutorProperty;
import org.eclipse.ocl.pivot.internal.library.executor.ExecutorPropertyWithImplementation;
import org.eclipse.ocl.pivot.internal.library.executor.ExecutorStandardLibrary;
import org.eclipse.ocl.pivot.oclstdlib.OCLstdlibTables;
import org.eclipse.ocl.pivot.utilities.AbstractTables;

/**
 * ObeModelTables provides the dispatch tables for the ObeModel for use by the OCL dispatcher.
 *
 * In order to ensure correct static initialization, a top level class element must be accessed
 * before any nested class element. Therefore an access to PACKAGE.getClass() is recommended.
 */
public class ObeModelTables extends AbstractTables
{
	static {
		Init.initStart();
	}

	/**
	 *	The package descriptor for the package.
	 */
	public static final EcoreExecutorPackage PACKAGE = new EcoreExecutorPackage(ObeModelPackage.eINSTANCE);

	/**
	 *	The library of all packages and types.
	 */
	public static final ExecutorStandardLibrary LIBRARY = OCLstdlibTables.LIBRARY;

	/**
	 *	The type parameters for templated types and operations.
	 */
	public static class TypeParameters {
		static {
			Init.initStart();
			ObeModelTables.init();
		}

		static {
			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of ObeModelTables::TypeParameters and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 *	The type descriptors for each type.
	 */
	public static class Types {
		static {
			Init.initStart();
			TypeParameters.init();
		}

		public static final EcoreExecutorType _Activity = new EcoreExecutorType(ObeModelPackage.Literals.ACTIVITY, PACKAGE, 0);
		public static final EcoreExecutorEnumeration _ActivityType = new EcoreExecutorEnumeration(ObeModelPackage.Literals.ACTIVITY_TYPE, PACKAGE, 0);
		public static final EcoreExecutorType _Assesment = new EcoreExecutorType(ObeModelPackage.Literals.ASSESMENT, PACKAGE, 0);
		public static final EcoreExecutorEnumeration _AssesmentType = new EcoreExecutorEnumeration(ObeModelPackage.Literals.ASSESMENT_TYPE, PACKAGE, 0);
		public static final EcoreExecutorType _Batches = new EcoreExecutorType(ObeModelPackage.Literals.BATCHES, PACKAGE, 0);
		public static final EcoreExecutorType _CLO = new EcoreExecutorType(ObeModelPackage.Literals.CLO, PACKAGE, 0);
		public static final EcoreExecutorType _Courses = new EcoreExecutorType(ObeModelPackage.Literals.COURSES, PACKAGE, 0);
		public static final EcoreExecutorType _Institute = new EcoreExecutorType(ObeModelPackage.Literals.INSTITUTE, PACKAGE, 0);
		public static final EcoreExecutorEnumeration _InstituteLevel = new EcoreExecutorEnumeration(ObeModelPackage.Literals.INSTITUTE_LEVEL, PACKAGE, 0);
		public static final EcoreExecutorEnumeration _LearningDomain = new EcoreExecutorEnumeration(ObeModelPackage.Literals.LEARNING_DOMAIN, PACKAGE, 0);
		public static final EcoreExecutorType _LearningLevels = new EcoreExecutorType(ObeModelPackage.Literals.LEARNING_LEVELS, PACKAGE, 0);
		public static final EcoreExecutorType _Mission = new EcoreExecutorType(ObeModelPackage.Literals.MISSION, PACKAGE, 0);
		public static final EcoreExecutorType _OBERootNode = new EcoreExecutorType(ObeModelPackage.Literals.OBE_ROOT_NODE, PACKAGE, 0);
		public static final EcoreExecutorType _PEO = new EcoreExecutorType(ObeModelPackage.Literals.PEO, PACKAGE, 0);
		public static final EcoreExecutorType _Plo = new EcoreExecutorType(ObeModelPackage.Literals.PLO, PACKAGE, 0);
		public static final EcoreExecutorType _Program = new EcoreExecutorType(ObeModelPackage.Literals.PROGRAM, PACKAGE, 0);
		public static final EcoreExecutorType _Results = new EcoreExecutorType(ObeModelPackage.Literals.RESULTS, PACKAGE, 0);
		public static final EcoreExecutorType _Student = new EcoreExecutorType(ObeModelPackage.Literals.STUDENT, PACKAGE, 0);
		public static final EcoreExecutorType _Vision = new EcoreExecutorType(ObeModelPackage.Literals.VISION, PACKAGE, 0);

		private static final EcoreExecutorType /*@NonNull*/ [] types = {
			_Activity,
			_ActivityType,
			_Assesment,
			_AssesmentType,
			_Batches,
			_CLO,
			_Courses,
			_Institute,
			_InstituteLevel,
			_LearningDomain,
			_LearningLevels,
			_Mission,
			_OBERootNode,
			_PEO,
			_Plo,
			_Program,
			_Results,
			_Student,
			_Vision
		};

		/*
		 *	Install the type descriptors in the package descriptor.
		 */
		static {
			PACKAGE.init(LIBRARY, types);
			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of ObeModelTables::Types and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 *	The fragment descriptors for the local elements of each type and its supertypes.
	 */
	public static class Fragments {
		static {
			Init.initStart();
			Types.init();
		}

		private static final ExecutorFragment _Activity__Activity = new ExecutorFragment(Types._Activity, ObeModelTables.Types._Activity);
		private static final ExecutorFragment _Activity__OclAny = new ExecutorFragment(Types._Activity, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _Activity__OclElement = new ExecutorFragment(Types._Activity, OCLstdlibTables.Types._OclElement);

		private static final ExecutorFragment _ActivityType__ActivityType = new ExecutorFragment(Types._ActivityType, ObeModelTables.Types._ActivityType);
		private static final ExecutorFragment _ActivityType__OclAny = new ExecutorFragment(Types._ActivityType, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _ActivityType__OclElement = new ExecutorFragment(Types._ActivityType, OCLstdlibTables.Types._OclElement);
		private static final ExecutorFragment _ActivityType__OclEnumeration = new ExecutorFragment(Types._ActivityType, OCLstdlibTables.Types._OclEnumeration);
		private static final ExecutorFragment _ActivityType__OclType = new ExecutorFragment(Types._ActivityType, OCLstdlibTables.Types._OclType);

		private static final ExecutorFragment _Assesment__Assesment = new ExecutorFragment(Types._Assesment, ObeModelTables.Types._Assesment);
		private static final ExecutorFragment _Assesment__OclAny = new ExecutorFragment(Types._Assesment, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _Assesment__OclElement = new ExecutorFragment(Types._Assesment, OCLstdlibTables.Types._OclElement);

		private static final ExecutorFragment _AssesmentType__AssesmentType = new ExecutorFragment(Types._AssesmentType, ObeModelTables.Types._AssesmentType);
		private static final ExecutorFragment _AssesmentType__OclAny = new ExecutorFragment(Types._AssesmentType, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _AssesmentType__OclElement = new ExecutorFragment(Types._AssesmentType, OCLstdlibTables.Types._OclElement);
		private static final ExecutorFragment _AssesmentType__OclEnumeration = new ExecutorFragment(Types._AssesmentType, OCLstdlibTables.Types._OclEnumeration);
		private static final ExecutorFragment _AssesmentType__OclType = new ExecutorFragment(Types._AssesmentType, OCLstdlibTables.Types._OclType);

		private static final ExecutorFragment _Batches__Batches = new ExecutorFragment(Types._Batches, ObeModelTables.Types._Batches);
		private static final ExecutorFragment _Batches__OclAny = new ExecutorFragment(Types._Batches, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _Batches__OclElement = new ExecutorFragment(Types._Batches, OCLstdlibTables.Types._OclElement);

		private static final ExecutorFragment _CLO__CLO = new ExecutorFragment(Types._CLO, ObeModelTables.Types._CLO);
		private static final ExecutorFragment _CLO__OclAny = new ExecutorFragment(Types._CLO, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _CLO__OclElement = new ExecutorFragment(Types._CLO, OCLstdlibTables.Types._OclElement);

		private static final ExecutorFragment _Courses__Courses = new ExecutorFragment(Types._Courses, ObeModelTables.Types._Courses);
		private static final ExecutorFragment _Courses__OclAny = new ExecutorFragment(Types._Courses, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _Courses__OclElement = new ExecutorFragment(Types._Courses, OCLstdlibTables.Types._OclElement);

		private static final ExecutorFragment _Institute__Institute = new ExecutorFragment(Types._Institute, ObeModelTables.Types._Institute);
		private static final ExecutorFragment _Institute__OclAny = new ExecutorFragment(Types._Institute, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _Institute__OclElement = new ExecutorFragment(Types._Institute, OCLstdlibTables.Types._OclElement);

		private static final ExecutorFragment _InstituteLevel__InstituteLevel = new ExecutorFragment(Types._InstituteLevel, ObeModelTables.Types._InstituteLevel);
		private static final ExecutorFragment _InstituteLevel__OclAny = new ExecutorFragment(Types._InstituteLevel, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _InstituteLevel__OclElement = new ExecutorFragment(Types._InstituteLevel, OCLstdlibTables.Types._OclElement);
		private static final ExecutorFragment _InstituteLevel__OclEnumeration = new ExecutorFragment(Types._InstituteLevel, OCLstdlibTables.Types._OclEnumeration);
		private static final ExecutorFragment _InstituteLevel__OclType = new ExecutorFragment(Types._InstituteLevel, OCLstdlibTables.Types._OclType);

		private static final ExecutorFragment _LearningDomain__LearningDomain = new ExecutorFragment(Types._LearningDomain, ObeModelTables.Types._LearningDomain);
		private static final ExecutorFragment _LearningDomain__OclAny = new ExecutorFragment(Types._LearningDomain, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _LearningDomain__OclElement = new ExecutorFragment(Types._LearningDomain, OCLstdlibTables.Types._OclElement);
		private static final ExecutorFragment _LearningDomain__OclEnumeration = new ExecutorFragment(Types._LearningDomain, OCLstdlibTables.Types._OclEnumeration);
		private static final ExecutorFragment _LearningDomain__OclType = new ExecutorFragment(Types._LearningDomain, OCLstdlibTables.Types._OclType);

		private static final ExecutorFragment _LearningLevels__LearningLevels = new ExecutorFragment(Types._LearningLevels, ObeModelTables.Types._LearningLevels);
		private static final ExecutorFragment _LearningLevels__OclAny = new ExecutorFragment(Types._LearningLevels, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _LearningLevels__OclElement = new ExecutorFragment(Types._LearningLevels, OCLstdlibTables.Types._OclElement);

		private static final ExecutorFragment _Mission__Mission = new ExecutorFragment(Types._Mission, ObeModelTables.Types._Mission);
		private static final ExecutorFragment _Mission__OclAny = new ExecutorFragment(Types._Mission, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _Mission__OclElement = new ExecutorFragment(Types._Mission, OCLstdlibTables.Types._OclElement);

		private static final ExecutorFragment _OBERootNode__OBERootNode = new ExecutorFragment(Types._OBERootNode, ObeModelTables.Types._OBERootNode);
		private static final ExecutorFragment _OBERootNode__OclAny = new ExecutorFragment(Types._OBERootNode, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _OBERootNode__OclElement = new ExecutorFragment(Types._OBERootNode, OCLstdlibTables.Types._OclElement);

		private static final ExecutorFragment _PEO__OclAny = new ExecutorFragment(Types._PEO, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _PEO__OclElement = new ExecutorFragment(Types._PEO, OCLstdlibTables.Types._OclElement);
		private static final ExecutorFragment _PEO__PEO = new ExecutorFragment(Types._PEO, ObeModelTables.Types._PEO);

		private static final ExecutorFragment _Plo__OclAny = new ExecutorFragment(Types._Plo, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _Plo__OclElement = new ExecutorFragment(Types._Plo, OCLstdlibTables.Types._OclElement);
		private static final ExecutorFragment _Plo__Plo = new ExecutorFragment(Types._Plo, ObeModelTables.Types._Plo);

		private static final ExecutorFragment _Program__OclAny = new ExecutorFragment(Types._Program, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _Program__OclElement = new ExecutorFragment(Types._Program, OCLstdlibTables.Types._OclElement);
		private static final ExecutorFragment _Program__Program = new ExecutorFragment(Types._Program, ObeModelTables.Types._Program);

		private static final ExecutorFragment _Results__OclAny = new ExecutorFragment(Types._Results, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _Results__OclElement = new ExecutorFragment(Types._Results, OCLstdlibTables.Types._OclElement);
		private static final ExecutorFragment _Results__Results = new ExecutorFragment(Types._Results, ObeModelTables.Types._Results);

		private static final ExecutorFragment _Student__OclAny = new ExecutorFragment(Types._Student, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _Student__OclElement = new ExecutorFragment(Types._Student, OCLstdlibTables.Types._OclElement);
		private static final ExecutorFragment _Student__Student = new ExecutorFragment(Types._Student, ObeModelTables.Types._Student);

		private static final ExecutorFragment _Vision__OclAny = new ExecutorFragment(Types._Vision, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _Vision__OclElement = new ExecutorFragment(Types._Vision, OCLstdlibTables.Types._OclElement);
		private static final ExecutorFragment _Vision__Vision = new ExecutorFragment(Types._Vision, ObeModelTables.Types._Vision);

		static {
			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of ObeModelTables::Fragments and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 *	The parameter lists shared by operations.
	 *
	 * @noextend This class is not intended to be subclassed by clients.
	 * @noinstantiate This class is not intended to be instantiated by clients.
	 * @noreference This class is not intended to be referenced by clients.
	 */
	public static class Parameters {
		static {
			Init.initStart();
			Fragments.init();
		}


		static {
			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of ObeModelTables::Parameters and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 *	The operation descriptors for each operation of each type.
	 *
	 * @noextend This class is not intended to be subclassed by clients.
	 * @noinstantiate This class is not intended to be instantiated by clients.
	 * @noreference This class is not intended to be referenced by clients.
	 */
	public static class Operations {
		static {
			Init.initStart();
			Parameters.init();
		}

		static {
			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of ObeModelTables::Operations and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 *	The property descriptors for each property of each type.
	 *
	 * @noextend This class is not intended to be subclassed by clients.
	 * @noinstantiate This class is not intended to be instantiated by clients.
	 * @noreference This class is not intended to be referenced by clients.
	 */
	public static class Properties {
		static {
			Init.initStart();
			Operations.init();
		}

		public static final ExecutorProperty _Activity__ActivityType = new EcoreExecutorProperty(ObeModelPackage.Literals.ACTIVITY__ACTIVITY_TYPE, Types._Activity, 0);
		public static final ExecutorProperty _Activity__AssesmentType = new EcoreExecutorProperty(ObeModelPackage.Literals.ACTIVITY__ASSESMENT_TYPE, Types._Activity, 1);
		public static final ExecutorProperty _Activity__Name = new EcoreExecutorProperty(ObeModelPackage.Literals.ACTIVITY__NAME, Types._Activity, 2);
		public static final ExecutorProperty _Activity__activityWeight = new EcoreExecutorProperty(ObeModelPackage.Literals.ACTIVITY__ACTIVITY_WEIGHT, Types._Activity, 3);
		public static final ExecutorProperty _Activity__clo = new EcoreExecutorProperty(ObeModelPackage.Literals.ACTIVITY__CLO, Types._Activity, 4);
		public static final ExecutorProperty _Activity__results = new EcoreExecutorProperty(ObeModelPackage.Literals.ACTIVITY__RESULTS, Types._Activity, 5);
		public static final ExecutorProperty _Activity__totalMarks = new EcoreExecutorProperty(ObeModelPackage.Literals.ACTIVITY__TOTAL_MARKS, Types._Activity, 6);
		public static final ExecutorProperty _Activity__Courses__activities = new ExecutorPropertyWithImplementation("Courses", Types._Activity, 7, new EcoreLibraryOppositeProperty(ObeModelPackage.Literals.COURSES__ACTIVITIES));
		public static final ExecutorProperty _Activity__OBERootNode__activitties = new ExecutorPropertyWithImplementation("OBERootNode", Types._Activity, 8, new EcoreLibraryOppositeProperty(ObeModelPackage.Literals.OBE_ROOT_NODE__ACTIVITTIES));

		public static final ExecutorProperty _Assesment__ActivityType = new EcoreExecutorProperty(ObeModelPackage.Literals.ASSESMENT__ACTIVITY_TYPE, Types._Assesment, 0);
		public static final ExecutorProperty _Assesment__AssesmentType = new EcoreExecutorProperty(ObeModelPackage.Literals.ASSESMENT__ASSESMENT_TYPE, Types._Assesment, 1);
		public static final ExecutorProperty _Assesment__Marks = new EcoreExecutorProperty(ObeModelPackage.Literals.ASSESMENT__MARKS, Types._Assesment, 2);
		public static final ExecutorProperty _Assesment__RespondantName = new EcoreExecutorProperty(ObeModelPackage.Literals.ASSESMENT__RESPONDANT_NAME, Types._Assesment, 3);
		public static final ExecutorProperty _Assesment__name = new EcoreExecutorProperty(ObeModelPackage.Literals.ASSESMENT__NAME, Types._Assesment, 4);
		public static final ExecutorProperty _Assesment__Mission__assesment = new ExecutorPropertyWithImplementation("Mission", Types._Assesment, 5, new EcoreLibraryOppositeProperty(ObeModelPackage.Literals.MISSION__ASSESMENT));
		public static final ExecutorProperty _Assesment__PEO__assesment = new ExecutorPropertyWithImplementation("PEO", Types._Assesment, 6, new EcoreLibraryOppositeProperty(ObeModelPackage.Literals.PEO__ASSESMENT));

		public static final ExecutorProperty _Batches__ChortLevelThreshold = new EcoreExecutorProperty(ObeModelPackage.Literals.BATCHES__CHORT_LEVEL_THRESHOLD, Types._Batches, 0);
		public static final ExecutorProperty _Batches__IndvThreshold = new EcoreExecutorProperty(ObeModelPackage.Literals.BATCHES__INDV_THRESHOLD, Types._Batches, 1);
		public static final ExecutorProperty _Batches__Name = new EcoreExecutorProperty(ObeModelPackage.Literals.BATCHES__NAME, Types._Batches, 2);
		public static final ExecutorProperty _Batches__students = new EcoreExecutorProperty(ObeModelPackage.Literals.BATCHES__STUDENTS, Types._Batches, 3);
		public static final ExecutorProperty _Batches__OBERootNode__batches = new ExecutorPropertyWithImplementation("OBERootNode", Types._Batches, 4, new EcoreLibraryOppositeProperty(ObeModelPackage.Literals.OBE_ROOT_NODE__BATCHES));
		public static final ExecutorProperty _Batches__Program__associatedbatches = new ExecutorPropertyWithImplementation("Program", Types._Batches, 5, new EcoreLibraryOppositeProperty(ObeModelPackage.Literals.PROGRAM__ASSOCIATEDBATCHES));

		public static final ExecutorProperty _CLO__Statement = new EcoreExecutorProperty(ObeModelPackage.Literals.CLO__STATEMENT, Types._CLO, 0);
		public static final ExecutorProperty _CLO__activity = new EcoreExecutorProperty(ObeModelPackage.Literals.CLO__ACTIVITY, Types._CLO, 1);
		public static final ExecutorProperty _CLO__learninglevels = new EcoreExecutorProperty(ObeModelPackage.Literals.CLO__LEARNINGLEVELS, Types._CLO, 2);
		public static final ExecutorProperty _CLO__maptoplo = new EcoreExecutorProperty(ObeModelPackage.Literals.CLO__MAPTOPLO, Types._CLO, 3);
		public static final ExecutorProperty _CLO__Courses__learningoutcomes = new ExecutorPropertyWithImplementation("Courses", Types._CLO, 4, new EcoreLibraryOppositeProperty(ObeModelPackage.Literals.COURSES__LEARNINGOUTCOMES));
		public static final ExecutorProperty _CLO__OBERootNode__clos = new ExecutorPropertyWithImplementation("OBERootNode", Types._CLO, 5, new EcoreLibraryOppositeProperty(ObeModelPackage.Literals.OBE_ROOT_NODE__CLOS));

		public static final ExecutorProperty _Courses__Name = new EcoreExecutorProperty(ObeModelPackage.Literals.COURSES__NAME, Types._Courses, 0);
		public static final ExecutorProperty _Courses__activities = new EcoreExecutorProperty(ObeModelPackage.Literals.COURSES__ACTIVITIES, Types._Courses, 1);
		public static final ExecutorProperty _Courses__learningoutcomes = new EcoreExecutorProperty(ObeModelPackage.Literals.COURSES__LEARNINGOUTCOMES, Types._Courses, 2);
		public static final ExecutorProperty _Courses__OBERootNode__courses = new ExecutorPropertyWithImplementation("OBERootNode", Types._Courses, 3, new EcoreLibraryOppositeProperty(ObeModelPackage.Literals.OBE_ROOT_NODE__COURSES));
		public static final ExecutorProperty _Courses__Program__offeredcourses = new ExecutorPropertyWithImplementation("Program", Types._Courses, 4, new EcoreLibraryOppositeProperty(ObeModelPackage.Literals.PROGRAM__OFFEREDCOURSES));
		public static final ExecutorProperty _Courses__Student__registercourse = new ExecutorPropertyWithImplementation("Student", Types._Courses, 5, new EcoreLibraryOppositeProperty(ObeModelPackage.Literals.STUDENT__REGISTERCOURSE));

		public static final ExecutorProperty _Institute__InstituteLevel = new EcoreExecutorProperty(ObeModelPackage.Literals.INSTITUTE__INSTITUTE_LEVEL, Types._Institute, 0);
		public static final ExecutorProperty _Institute__Name = new EcoreExecutorProperty(ObeModelPackage.Literals.INSTITUTE__NAME, Types._Institute, 1);
		public static final ExecutorProperty _Institute__Offerprograms = new EcoreExecutorProperty(ObeModelPackage.Literals.INSTITUTE__OFFERPROGRAMS, Types._Institute, 2);
		public static final ExecutorProperty _Institute__associatedmission = new EcoreExecutorProperty(ObeModelPackage.Literals.INSTITUTE__ASSOCIATEDMISSION, Types._Institute, 3);
		public static final ExecutorProperty _Institute__associatedvision = new EcoreExecutorProperty(ObeModelPackage.Literals.INSTITUTE__ASSOCIATEDVISION, Types._Institute, 4);
		public static final ExecutorProperty _Institute__parentInstitute = new EcoreExecutorProperty(ObeModelPackage.Literals.INSTITUTE__PARENT_INSTITUTE, Types._Institute, 5);
		public static final ExecutorProperty _Institute__Institute__parentInstitute = new ExecutorPropertyWithImplementation("Institute", Types._Institute, 6, new EcoreLibraryOppositeProperty(ObeModelPackage.Literals.INSTITUTE__PARENT_INSTITUTE));
		public static final ExecutorProperty _Institute__OBERootNode__institutes = new ExecutorPropertyWithImplementation("OBERootNode", Types._Institute, 7, new EcoreLibraryOppositeProperty(ObeModelPackage.Literals.OBE_ROOT_NODE__INSTITUTES));

		public static final ExecutorProperty _LearningLevels__Level = new EcoreExecutorProperty(ObeModelPackage.Literals.LEARNING_LEVELS__LEVEL, Types._LearningLevels, 0);
		public static final ExecutorProperty _LearningLevels__clo = new EcoreExecutorProperty(ObeModelPackage.Literals.LEARNING_LEVELS__CLO, Types._LearningLevels, 1);
		public static final ExecutorProperty _LearningLevels__domain = new EcoreExecutorProperty(ObeModelPackage.Literals.LEARNING_LEVELS__DOMAIN, Types._LearningLevels, 2);
		public static final ExecutorProperty _LearningLevels__OBERootNode__learninglevels = new ExecutorPropertyWithImplementation("OBERootNode", Types._LearningLevels, 3, new EcoreLibraryOppositeProperty(ObeModelPackage.Literals.OBE_ROOT_NODE__LEARNINGLEVELS));

		public static final ExecutorProperty _Mission__MissionStatement = new EcoreExecutorProperty(ObeModelPackage.Literals.MISSION__MISSION_STATEMENT, Types._Mission, 0);
		public static final ExecutorProperty _Mission__assesment = new EcoreExecutorProperty(ObeModelPackage.Literals.MISSION__ASSESMENT, Types._Mission, 1);
		public static final ExecutorProperty _Mission__institute = new EcoreExecutorProperty(ObeModelPackage.Literals.MISSION__INSTITUTE, Types._Mission, 2);
		public static final ExecutorProperty _Mission__OBERootNode__missions = new ExecutorPropertyWithImplementation("OBERootNode", Types._Mission, 3, new EcoreLibraryOppositeProperty(ObeModelPackage.Literals.OBE_ROOT_NODE__MISSIONS));
		public static final ExecutorProperty _Mission__PEO__mission = new ExecutorPropertyWithImplementation("PEO", Types._Mission, 4, new EcoreLibraryOppositeProperty(ObeModelPackage.Literals.PEO__MISSION));

		public static final ExecutorProperty _OBERootNode__activitties = new EcoreExecutorProperty(ObeModelPackage.Literals.OBE_ROOT_NODE__ACTIVITTIES, Types._OBERootNode, 0);
		public static final ExecutorProperty _OBERootNode__batches = new EcoreExecutorProperty(ObeModelPackage.Literals.OBE_ROOT_NODE__BATCHES, Types._OBERootNode, 1);
		public static final ExecutorProperty _OBERootNode__clos = new EcoreExecutorProperty(ObeModelPackage.Literals.OBE_ROOT_NODE__CLOS, Types._OBERootNode, 2);
		public static final ExecutorProperty _OBERootNode__courses = new EcoreExecutorProperty(ObeModelPackage.Literals.OBE_ROOT_NODE__COURSES, Types._OBERootNode, 3);
		public static final ExecutorProperty _OBERootNode__institutes = new EcoreExecutorProperty(ObeModelPackage.Literals.OBE_ROOT_NODE__INSTITUTES, Types._OBERootNode, 4);
		public static final ExecutorProperty _OBERootNode__learninglevels = new EcoreExecutorProperty(ObeModelPackage.Literals.OBE_ROOT_NODE__LEARNINGLEVELS, Types._OBERootNode, 5);
		public static final ExecutorProperty _OBERootNode__missions = new EcoreExecutorProperty(ObeModelPackage.Literals.OBE_ROOT_NODE__MISSIONS, Types._OBERootNode, 6);
		public static final ExecutorProperty _OBERootNode__peos = new EcoreExecutorProperty(ObeModelPackage.Literals.OBE_ROOT_NODE__PEOS, Types._OBERootNode, 7);
		public static final ExecutorProperty _OBERootNode__plos = new EcoreExecutorProperty(ObeModelPackage.Literals.OBE_ROOT_NODE__PLOS, Types._OBERootNode, 8);
		public static final ExecutorProperty _OBERootNode__programs = new EcoreExecutorProperty(ObeModelPackage.Literals.OBE_ROOT_NODE__PROGRAMS, Types._OBERootNode, 9);
		public static final ExecutorProperty _OBERootNode__results = new EcoreExecutorProperty(ObeModelPackage.Literals.OBE_ROOT_NODE__RESULTS, Types._OBERootNode, 10);
		public static final ExecutorProperty _OBERootNode__students = new EcoreExecutorProperty(ObeModelPackage.Literals.OBE_ROOT_NODE__STUDENTS, Types._OBERootNode, 11);
		public static final ExecutorProperty _OBERootNode__visions = new EcoreExecutorProperty(ObeModelPackage.Literals.OBE_ROOT_NODE__VISIONS, Types._OBERootNode, 12);

		public static final ExecutorProperty _PEO__PEOStatement = new EcoreExecutorProperty(ObeModelPackage.Literals.PEO__PEO_STATEMENT, Types._PEO, 0);
		public static final ExecutorProperty _PEO__Title = new EcoreExecutorProperty(ObeModelPackage.Literals.PEO__TITLE, Types._PEO, 1);
		public static final ExecutorProperty _PEO__assesment = new EcoreExecutorProperty(ObeModelPackage.Literals.PEO__ASSESMENT, Types._PEO, 2);
		public static final ExecutorProperty _PEO__mission = new EcoreExecutorProperty(ObeModelPackage.Literals.PEO__MISSION, Types._PEO, 3);
		public static final ExecutorProperty _PEO__plos = new EcoreExecutorProperty(ObeModelPackage.Literals.PEO__PLOS, Types._PEO, 4);
		public static final ExecutorProperty _PEO__threshold = new EcoreExecutorProperty(ObeModelPackage.Literals.PEO__THRESHOLD, Types._PEO, 5);
		public static final ExecutorProperty _PEO__OBERootNode__peos = new ExecutorPropertyWithImplementation("OBERootNode", Types._PEO, 6, new EcoreLibraryOppositeProperty(ObeModelPackage.Literals.OBE_ROOT_NODE__PEOS));
		public static final ExecutorProperty _PEO__Program__programobjectives = new ExecutorPropertyWithImplementation("Program", Types._PEO, 7, new EcoreLibraryOppositeProperty(ObeModelPackage.Literals.PROGRAM__PROGRAMOBJECTIVES));

		public static final ExecutorProperty _Plo__Title = new EcoreExecutorProperty(ObeModelPackage.Literals.PLO__TITLE, Types._Plo, 0);
		public static final ExecutorProperty _Plo__closMapping = new EcoreExecutorProperty(ObeModelPackage.Literals.PLO__CLOS_MAPPING, Types._Plo, 1);
		public static final ExecutorProperty _Plo__peo = new EcoreExecutorProperty(ObeModelPackage.Literals.PLO__PEO, Types._Plo, 2);
		public static final ExecutorProperty _Plo__OBERootNode__plos = new ExecutorPropertyWithImplementation("OBERootNode", Types._Plo, 3, new EcoreLibraryOppositeProperty(ObeModelPackage.Literals.OBE_ROOT_NODE__PLOS));
		public static final ExecutorProperty _Plo__Program__programlearningoutcomes = new ExecutorPropertyWithImplementation("Program", Types._Plo, 4, new EcoreLibraryOppositeProperty(ObeModelPackage.Literals.PROGRAM__PROGRAMLEARNINGOUTCOMES));

		public static final ExecutorProperty _Program__associatedbatches = new EcoreExecutorProperty(ObeModelPackage.Literals.PROGRAM__ASSOCIATEDBATCHES, Types._Program, 0);
		public static final ExecutorProperty _Program__name = new EcoreExecutorProperty(ObeModelPackage.Literals.PROGRAM__NAME, Types._Program, 1);
		public static final ExecutorProperty _Program__offeredcourses = new EcoreExecutorProperty(ObeModelPackage.Literals.PROGRAM__OFFEREDCOURSES, Types._Program, 2);
		public static final ExecutorProperty _Program__programlearningoutcomes = new EcoreExecutorProperty(ObeModelPackage.Literals.PROGRAM__PROGRAMLEARNINGOUTCOMES, Types._Program, 3);
		public static final ExecutorProperty _Program__programobjectives = new EcoreExecutorProperty(ObeModelPackage.Literals.PROGRAM__PROGRAMOBJECTIVES, Types._Program, 4);
		public static final ExecutorProperty _Program__Institute__Offerprograms = new ExecutorPropertyWithImplementation("Institute", Types._Program, 5, new EcoreLibraryOppositeProperty(ObeModelPackage.Literals.INSTITUTE__OFFERPROGRAMS));
		public static final ExecutorProperty _Program__OBERootNode__programs = new ExecutorPropertyWithImplementation("OBERootNode", Types._Program, 6, new EcoreLibraryOppositeProperty(ObeModelPackage.Literals.OBE_ROOT_NODE__PROGRAMS));

		public static final ExecutorProperty _Results__activity = new EcoreExecutorProperty(ObeModelPackage.Literals.RESULTS__ACTIVITY, Types._Results, 0);
		public static final ExecutorProperty _Results__obtainedMarks = new EcoreExecutorProperty(ObeModelPackage.Literals.RESULTS__OBTAINED_MARKS, Types._Results, 1);
		public static final ExecutorProperty _Results__student = new EcoreExecutorProperty(ObeModelPackage.Literals.RESULTS__STUDENT, Types._Results, 2);
		public static final ExecutorProperty _Results__OBERootNode__results = new ExecutorPropertyWithImplementation("OBERootNode", Types._Results, 3, new EcoreLibraryOppositeProperty(ObeModelPackage.Literals.OBE_ROOT_NODE__RESULTS));

		public static final ExecutorProperty _Student__Name = new EcoreExecutorProperty(ObeModelPackage.Literals.STUDENT__NAME, Types._Student, 0);
		public static final ExecutorProperty _Student__RollNumber = new EcoreExecutorProperty(ObeModelPackage.Literals.STUDENT__ROLL_NUMBER, Types._Student, 1);
		public static final ExecutorProperty _Student__batche = new EcoreExecutorProperty(ObeModelPackage.Literals.STUDENT__BATCHE, Types._Student, 2);
		public static final ExecutorProperty _Student__registercourse = new EcoreExecutorProperty(ObeModelPackage.Literals.STUDENT__REGISTERCOURSE, Types._Student, 3);
		public static final ExecutorProperty _Student__results = new EcoreExecutorProperty(ObeModelPackage.Literals.STUDENT__RESULTS, Types._Student, 4);
		public static final ExecutorProperty _Student__OBERootNode__students = new ExecutorPropertyWithImplementation("OBERootNode", Types._Student, 5, new EcoreLibraryOppositeProperty(ObeModelPackage.Literals.OBE_ROOT_NODE__STUDENTS));

		public static final ExecutorProperty _Vision__VisionStatement = new EcoreExecutorProperty(ObeModelPackage.Literals.VISION__VISION_STATEMENT, Types._Vision, 0);
		public static final ExecutorProperty _Vision__Institute__associatedvision = new ExecutorPropertyWithImplementation("Institute", Types._Vision, 1, new EcoreLibraryOppositeProperty(ObeModelPackage.Literals.INSTITUTE__ASSOCIATEDVISION));
		public static final ExecutorProperty _Vision__OBERootNode__visions = new ExecutorPropertyWithImplementation("OBERootNode", Types._Vision, 2, new EcoreLibraryOppositeProperty(ObeModelPackage.Literals.OBE_ROOT_NODE__VISIONS));
		static {
			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of ObeModelTables::Properties and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 *	The fragments for all base types in depth order: OclAny first, OclSelf last.
	 */
	public static class TypeFragments {
		static {
			Init.initStart();
			Properties.init();
		}

		private static final ExecutorFragment /*@NonNull*/ [] _Activity =
			{
				Fragments._Activity__OclAny /* 0 */,
				Fragments._Activity__OclElement /* 1 */,
				Fragments._Activity__Activity /* 2 */
			};
		private static final int /*@NonNull*/ [] __Activity = { 1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _ActivityType =
			{
				Fragments._ActivityType__OclAny /* 0 */,
				Fragments._ActivityType__OclElement /* 1 */,
				Fragments._ActivityType__OclType /* 2 */,
				Fragments._ActivityType__OclEnumeration /* 3 */,
				Fragments._ActivityType__ActivityType /* 4 */
			};
		private static final int /*@NonNull*/ [] __ActivityType = { 1,1,1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _Assesment =
			{
				Fragments._Assesment__OclAny /* 0 */,
				Fragments._Assesment__OclElement /* 1 */,
				Fragments._Assesment__Assesment /* 2 */
			};
		private static final int /*@NonNull*/ [] __Assesment = { 1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _AssesmentType =
			{
				Fragments._AssesmentType__OclAny /* 0 */,
				Fragments._AssesmentType__OclElement /* 1 */,
				Fragments._AssesmentType__OclType /* 2 */,
				Fragments._AssesmentType__OclEnumeration /* 3 */,
				Fragments._AssesmentType__AssesmentType /* 4 */
			};
		private static final int /*@NonNull*/ [] __AssesmentType = { 1,1,1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _Batches =
			{
				Fragments._Batches__OclAny /* 0 */,
				Fragments._Batches__OclElement /* 1 */,
				Fragments._Batches__Batches /* 2 */
			};
		private static final int /*@NonNull*/ [] __Batches = { 1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _CLO =
			{
				Fragments._CLO__OclAny /* 0 */,
				Fragments._CLO__OclElement /* 1 */,
				Fragments._CLO__CLO /* 2 */
			};
		private static final int /*@NonNull*/ [] __CLO = { 1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _Courses =
			{
				Fragments._Courses__OclAny /* 0 */,
				Fragments._Courses__OclElement /* 1 */,
				Fragments._Courses__Courses /* 2 */
			};
		private static final int /*@NonNull*/ [] __Courses = { 1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _Institute =
			{
				Fragments._Institute__OclAny /* 0 */,
				Fragments._Institute__OclElement /* 1 */,
				Fragments._Institute__Institute /* 2 */
			};
		private static final int /*@NonNull*/ [] __Institute = { 1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _InstituteLevel =
			{
				Fragments._InstituteLevel__OclAny /* 0 */,
				Fragments._InstituteLevel__OclElement /* 1 */,
				Fragments._InstituteLevel__OclType /* 2 */,
				Fragments._InstituteLevel__OclEnumeration /* 3 */,
				Fragments._InstituteLevel__InstituteLevel /* 4 */
			};
		private static final int /*@NonNull*/ [] __InstituteLevel = { 1,1,1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _LearningDomain =
			{
				Fragments._LearningDomain__OclAny /* 0 */,
				Fragments._LearningDomain__OclElement /* 1 */,
				Fragments._LearningDomain__OclType /* 2 */,
				Fragments._LearningDomain__OclEnumeration /* 3 */,
				Fragments._LearningDomain__LearningDomain /* 4 */
			};
		private static final int /*@NonNull*/ [] __LearningDomain = { 1,1,1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _LearningLevels =
			{
				Fragments._LearningLevels__OclAny /* 0 */,
				Fragments._LearningLevels__OclElement /* 1 */,
				Fragments._LearningLevels__LearningLevels /* 2 */
			};
		private static final int /*@NonNull*/ [] __LearningLevels = { 1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _Mission =
			{
				Fragments._Mission__OclAny /* 0 */,
				Fragments._Mission__OclElement /* 1 */,
				Fragments._Mission__Mission /* 2 */
			};
		private static final int /*@NonNull*/ [] __Mission = { 1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _OBERootNode =
			{
				Fragments._OBERootNode__OclAny /* 0 */,
				Fragments._OBERootNode__OclElement /* 1 */,
				Fragments._OBERootNode__OBERootNode /* 2 */
			};
		private static final int /*@NonNull*/ [] __OBERootNode = { 1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _PEO =
			{
				Fragments._PEO__OclAny /* 0 */,
				Fragments._PEO__OclElement /* 1 */,
				Fragments._PEO__PEO /* 2 */
			};
		private static final int /*@NonNull*/ [] __PEO = { 1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _Plo =
			{
				Fragments._Plo__OclAny /* 0 */,
				Fragments._Plo__OclElement /* 1 */,
				Fragments._Plo__Plo /* 2 */
			};
		private static final int /*@NonNull*/ [] __Plo = { 1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _Program =
			{
				Fragments._Program__OclAny /* 0 */,
				Fragments._Program__OclElement /* 1 */,
				Fragments._Program__Program /* 2 */
			};
		private static final int /*@NonNull*/ [] __Program = { 1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _Results =
			{
				Fragments._Results__OclAny /* 0 */,
				Fragments._Results__OclElement /* 1 */,
				Fragments._Results__Results /* 2 */
			};
		private static final int /*@NonNull*/ [] __Results = { 1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _Student =
			{
				Fragments._Student__OclAny /* 0 */,
				Fragments._Student__OclElement /* 1 */,
				Fragments._Student__Student /* 2 */
			};
		private static final int /*@NonNull*/ [] __Student = { 1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _Vision =
			{
				Fragments._Vision__OclAny /* 0 */,
				Fragments._Vision__OclElement /* 1 */,
				Fragments._Vision__Vision /* 2 */
			};
		private static final int /*@NonNull*/ [] __Vision = { 1,1,1 };

		/**
		 *	Install the fragment descriptors in the class descriptors.
		 */
		static {
			Types._Activity.initFragments(_Activity, __Activity);
			Types._ActivityType.initFragments(_ActivityType, __ActivityType);
			Types._Assesment.initFragments(_Assesment, __Assesment);
			Types._AssesmentType.initFragments(_AssesmentType, __AssesmentType);
			Types._Batches.initFragments(_Batches, __Batches);
			Types._CLO.initFragments(_CLO, __CLO);
			Types._Courses.initFragments(_Courses, __Courses);
			Types._Institute.initFragments(_Institute, __Institute);
			Types._InstituteLevel.initFragments(_InstituteLevel, __InstituteLevel);
			Types._LearningDomain.initFragments(_LearningDomain, __LearningDomain);
			Types._LearningLevels.initFragments(_LearningLevels, __LearningLevels);
			Types._Mission.initFragments(_Mission, __Mission);
			Types._OBERootNode.initFragments(_OBERootNode, __OBERootNode);
			Types._PEO.initFragments(_PEO, __PEO);
			Types._Plo.initFragments(_Plo, __Plo);
			Types._Program.initFragments(_Program, __Program);
			Types._Results.initFragments(_Results, __Results);
			Types._Student.initFragments(_Student, __Student);
			Types._Vision.initFragments(_Vision, __Vision);

			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of ObeModelTables::TypeFragments and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 *	The lists of local operations or local operation overrides for each fragment of each type.
	 */
	public static class FragmentOperations {
		static {
			Init.initStart();
			TypeFragments.init();
		}

		private static final ExecutorOperation /*@NonNull*/ [] _Activity__Activity = {};
		private static final ExecutorOperation /*@NonNull*/ [] _Activity__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _Activity__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _ActivityType__ActivityType = {};
		private static final ExecutorOperation /*@NonNull*/ [] _ActivityType__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _ActivityType__OclElement = {
			OCLstdlibTables.Operations._OclEnumeration__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _ActivityType__OclEnumeration = {
			OCLstdlibTables.Operations._OclEnumeration__allInstances /* allInstances() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _ActivityType__OclType = {
			OCLstdlibTables.Operations._OclType__conformsTo /* conformsTo(OclType[?]) */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _Assesment__Assesment = {};
		private static final ExecutorOperation /*@NonNull*/ [] _Assesment__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _Assesment__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _AssesmentType__AssesmentType = {};
		private static final ExecutorOperation /*@NonNull*/ [] _AssesmentType__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _AssesmentType__OclElement = {
			OCLstdlibTables.Operations._OclEnumeration__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _AssesmentType__OclEnumeration = {
			OCLstdlibTables.Operations._OclEnumeration__allInstances /* allInstances() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _AssesmentType__OclType = {
			OCLstdlibTables.Operations._OclType__conformsTo /* conformsTo(OclType[?]) */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _Batches__Batches = {};
		private static final ExecutorOperation /*@NonNull*/ [] _Batches__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _Batches__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _CLO__CLO = {};
		private static final ExecutorOperation /*@NonNull*/ [] _CLO__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _CLO__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _Courses__Courses = {};
		private static final ExecutorOperation /*@NonNull*/ [] _Courses__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _Courses__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _Institute__Institute = {};
		private static final ExecutorOperation /*@NonNull*/ [] _Institute__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _Institute__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _InstituteLevel__InstituteLevel = {};
		private static final ExecutorOperation /*@NonNull*/ [] _InstituteLevel__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _InstituteLevel__OclElement = {
			OCLstdlibTables.Operations._OclEnumeration__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _InstituteLevel__OclEnumeration = {
			OCLstdlibTables.Operations._OclEnumeration__allInstances /* allInstances() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _InstituteLevel__OclType = {
			OCLstdlibTables.Operations._OclType__conformsTo /* conformsTo(OclType[?]) */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _LearningDomain__LearningDomain = {};
		private static final ExecutorOperation /*@NonNull*/ [] _LearningDomain__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _LearningDomain__OclElement = {
			OCLstdlibTables.Operations._OclEnumeration__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _LearningDomain__OclEnumeration = {
			OCLstdlibTables.Operations._OclEnumeration__allInstances /* allInstances() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _LearningDomain__OclType = {
			OCLstdlibTables.Operations._OclType__conformsTo /* conformsTo(OclType[?]) */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _LearningLevels__LearningLevels = {};
		private static final ExecutorOperation /*@NonNull*/ [] _LearningLevels__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _LearningLevels__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _Mission__Mission = {};
		private static final ExecutorOperation /*@NonNull*/ [] _Mission__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _Mission__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _OBERootNode__OBERootNode = {};
		private static final ExecutorOperation /*@NonNull*/ [] _OBERootNode__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _OBERootNode__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _PEO__PEO = {};
		private static final ExecutorOperation /*@NonNull*/ [] _PEO__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _PEO__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _Plo__Plo = {};
		private static final ExecutorOperation /*@NonNull*/ [] _Plo__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _Plo__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _Program__Program = {};
		private static final ExecutorOperation /*@NonNull*/ [] _Program__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _Program__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _Results__Results = {};
		private static final ExecutorOperation /*@NonNull*/ [] _Results__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _Results__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _Student__Student = {};
		private static final ExecutorOperation /*@NonNull*/ [] _Student__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _Student__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _Vision__Vision = {};
		private static final ExecutorOperation /*@NonNull*/ [] _Vision__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _Vision__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		/*
		 *	Install the operation descriptors in the fragment descriptors.
		 */
		static {
			Fragments._Activity__Activity.initOperations(_Activity__Activity);
			Fragments._Activity__OclAny.initOperations(_Activity__OclAny);
			Fragments._Activity__OclElement.initOperations(_Activity__OclElement);

			Fragments._ActivityType__ActivityType.initOperations(_ActivityType__ActivityType);
			Fragments._ActivityType__OclAny.initOperations(_ActivityType__OclAny);
			Fragments._ActivityType__OclElement.initOperations(_ActivityType__OclElement);
			Fragments._ActivityType__OclEnumeration.initOperations(_ActivityType__OclEnumeration);
			Fragments._ActivityType__OclType.initOperations(_ActivityType__OclType);

			Fragments._Assesment__Assesment.initOperations(_Assesment__Assesment);
			Fragments._Assesment__OclAny.initOperations(_Assesment__OclAny);
			Fragments._Assesment__OclElement.initOperations(_Assesment__OclElement);

			Fragments._AssesmentType__AssesmentType.initOperations(_AssesmentType__AssesmentType);
			Fragments._AssesmentType__OclAny.initOperations(_AssesmentType__OclAny);
			Fragments._AssesmentType__OclElement.initOperations(_AssesmentType__OclElement);
			Fragments._AssesmentType__OclEnumeration.initOperations(_AssesmentType__OclEnumeration);
			Fragments._AssesmentType__OclType.initOperations(_AssesmentType__OclType);

			Fragments._Batches__Batches.initOperations(_Batches__Batches);
			Fragments._Batches__OclAny.initOperations(_Batches__OclAny);
			Fragments._Batches__OclElement.initOperations(_Batches__OclElement);

			Fragments._CLO__CLO.initOperations(_CLO__CLO);
			Fragments._CLO__OclAny.initOperations(_CLO__OclAny);
			Fragments._CLO__OclElement.initOperations(_CLO__OclElement);

			Fragments._Courses__Courses.initOperations(_Courses__Courses);
			Fragments._Courses__OclAny.initOperations(_Courses__OclAny);
			Fragments._Courses__OclElement.initOperations(_Courses__OclElement);

			Fragments._Institute__Institute.initOperations(_Institute__Institute);
			Fragments._Institute__OclAny.initOperations(_Institute__OclAny);
			Fragments._Institute__OclElement.initOperations(_Institute__OclElement);

			Fragments._InstituteLevel__InstituteLevel.initOperations(_InstituteLevel__InstituteLevel);
			Fragments._InstituteLevel__OclAny.initOperations(_InstituteLevel__OclAny);
			Fragments._InstituteLevel__OclElement.initOperations(_InstituteLevel__OclElement);
			Fragments._InstituteLevel__OclEnumeration.initOperations(_InstituteLevel__OclEnumeration);
			Fragments._InstituteLevel__OclType.initOperations(_InstituteLevel__OclType);

			Fragments._LearningDomain__LearningDomain.initOperations(_LearningDomain__LearningDomain);
			Fragments._LearningDomain__OclAny.initOperations(_LearningDomain__OclAny);
			Fragments._LearningDomain__OclElement.initOperations(_LearningDomain__OclElement);
			Fragments._LearningDomain__OclEnumeration.initOperations(_LearningDomain__OclEnumeration);
			Fragments._LearningDomain__OclType.initOperations(_LearningDomain__OclType);

			Fragments._LearningLevels__LearningLevels.initOperations(_LearningLevels__LearningLevels);
			Fragments._LearningLevels__OclAny.initOperations(_LearningLevels__OclAny);
			Fragments._LearningLevels__OclElement.initOperations(_LearningLevels__OclElement);

			Fragments._Mission__Mission.initOperations(_Mission__Mission);
			Fragments._Mission__OclAny.initOperations(_Mission__OclAny);
			Fragments._Mission__OclElement.initOperations(_Mission__OclElement);

			Fragments._OBERootNode__OBERootNode.initOperations(_OBERootNode__OBERootNode);
			Fragments._OBERootNode__OclAny.initOperations(_OBERootNode__OclAny);
			Fragments._OBERootNode__OclElement.initOperations(_OBERootNode__OclElement);

			Fragments._PEO__OclAny.initOperations(_PEO__OclAny);
			Fragments._PEO__OclElement.initOperations(_PEO__OclElement);
			Fragments._PEO__PEO.initOperations(_PEO__PEO);

			Fragments._Plo__OclAny.initOperations(_Plo__OclAny);
			Fragments._Plo__OclElement.initOperations(_Plo__OclElement);
			Fragments._Plo__Plo.initOperations(_Plo__Plo);

			Fragments._Program__OclAny.initOperations(_Program__OclAny);
			Fragments._Program__OclElement.initOperations(_Program__OclElement);
			Fragments._Program__Program.initOperations(_Program__Program);

			Fragments._Results__OclAny.initOperations(_Results__OclAny);
			Fragments._Results__OclElement.initOperations(_Results__OclElement);
			Fragments._Results__Results.initOperations(_Results__Results);

			Fragments._Student__OclAny.initOperations(_Student__OclAny);
			Fragments._Student__OclElement.initOperations(_Student__OclElement);
			Fragments._Student__Student.initOperations(_Student__Student);

			Fragments._Vision__OclAny.initOperations(_Vision__OclAny);
			Fragments._Vision__OclElement.initOperations(_Vision__OclElement);
			Fragments._Vision__Vision.initOperations(_Vision__Vision);

			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of ObeModelTables::FragmentOperations and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 *	The lists of local properties for the local fragment of each type.
	 */
	public static class FragmentProperties {
		static {
			Init.initStart();
			FragmentOperations.init();
		}

		private static final ExecutorProperty /*@NonNull*/ [] _Activity = {
			ObeModelTables.Properties._Activity__ActivityType,
			ObeModelTables.Properties._Activity__AssesmentType,
			ObeModelTables.Properties._Activity__Name,
			ObeModelTables.Properties._Activity__activityWeight,
			ObeModelTables.Properties._Activity__clo,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents,
			ObeModelTables.Properties._Activity__results,
			ObeModelTables.Properties._Activity__totalMarks
		};

		private static final ExecutorProperty /*@NonNull*/ [] _ActivityType = {
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents
		};

		private static final ExecutorProperty /*@NonNull*/ [] _Assesment = {
			ObeModelTables.Properties._Assesment__ActivityType,
			ObeModelTables.Properties._Assesment__AssesmentType,
			ObeModelTables.Properties._Assesment__Marks,
			ObeModelTables.Properties._Assesment__RespondantName,
			ObeModelTables.Properties._Assesment__name,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents
		};

		private static final ExecutorProperty /*@NonNull*/ [] _AssesmentType = {
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents
		};

		private static final ExecutorProperty /*@NonNull*/ [] _Batches = {
			ObeModelTables.Properties._Batches__ChortLevelThreshold,
			ObeModelTables.Properties._Batches__IndvThreshold,
			ObeModelTables.Properties._Batches__Name,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents,
			ObeModelTables.Properties._Batches__students
		};

		private static final ExecutorProperty /*@NonNull*/ [] _CLO = {
			ObeModelTables.Properties._CLO__Statement,
			ObeModelTables.Properties._CLO__activity,
			ObeModelTables.Properties._CLO__learninglevels,
			ObeModelTables.Properties._CLO__maptoplo,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents
		};

		private static final ExecutorProperty /*@NonNull*/ [] _Courses = {
			ObeModelTables.Properties._Courses__Name,
			ObeModelTables.Properties._Courses__activities,
			ObeModelTables.Properties._Courses__learningoutcomes,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents
		};

		private static final ExecutorProperty /*@NonNull*/ [] _Institute = {
			ObeModelTables.Properties._Institute__InstituteLevel,
			ObeModelTables.Properties._Institute__Name,
			ObeModelTables.Properties._Institute__Offerprograms,
			ObeModelTables.Properties._Institute__associatedmission,
			ObeModelTables.Properties._Institute__associatedvision,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents,
			ObeModelTables.Properties._Institute__parentInstitute
		};

		private static final ExecutorProperty /*@NonNull*/ [] _InstituteLevel = {
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents
		};

		private static final ExecutorProperty /*@NonNull*/ [] _LearningDomain = {
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents
		};

		private static final ExecutorProperty /*@NonNull*/ [] _LearningLevels = {
			ObeModelTables.Properties._LearningLevels__Level,
			ObeModelTables.Properties._LearningLevels__clo,
			ObeModelTables.Properties._LearningLevels__domain,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents
		};

		private static final ExecutorProperty /*@NonNull*/ [] _Mission = {
			ObeModelTables.Properties._Mission__MissionStatement,
			ObeModelTables.Properties._Mission__assesment,
			ObeModelTables.Properties._Mission__institute,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents
		};

		private static final ExecutorProperty /*@NonNull*/ [] _OBERootNode = {
			ObeModelTables.Properties._OBERootNode__activitties,
			ObeModelTables.Properties._OBERootNode__batches,
			ObeModelTables.Properties._OBERootNode__clos,
			ObeModelTables.Properties._OBERootNode__courses,
			ObeModelTables.Properties._OBERootNode__institutes,
			ObeModelTables.Properties._OBERootNode__learninglevels,
			ObeModelTables.Properties._OBERootNode__missions,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents,
			ObeModelTables.Properties._OBERootNode__peos,
			ObeModelTables.Properties._OBERootNode__plos,
			ObeModelTables.Properties._OBERootNode__programs,
			ObeModelTables.Properties._OBERootNode__results,
			ObeModelTables.Properties._OBERootNode__students,
			ObeModelTables.Properties._OBERootNode__visions
		};

		private static final ExecutorProperty /*@NonNull*/ [] _PEO = {
			ObeModelTables.Properties._PEO__PEOStatement,
			ObeModelTables.Properties._PEO__Title,
			ObeModelTables.Properties._PEO__assesment,
			ObeModelTables.Properties._PEO__mission,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents,
			ObeModelTables.Properties._PEO__plos,
			ObeModelTables.Properties._PEO__threshold
		};

		private static final ExecutorProperty /*@NonNull*/ [] _Plo = {
			ObeModelTables.Properties._Plo__Title,
			ObeModelTables.Properties._Plo__closMapping,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents,
			ObeModelTables.Properties._Plo__peo
		};

		private static final ExecutorProperty /*@NonNull*/ [] _Program = {
			ObeModelTables.Properties._Program__associatedbatches,
			ObeModelTables.Properties._Program__name,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents,
			ObeModelTables.Properties._Program__offeredcourses,
			ObeModelTables.Properties._Program__programlearningoutcomes,
			ObeModelTables.Properties._Program__programobjectives
		};

		private static final ExecutorProperty /*@NonNull*/ [] _Results = {
			ObeModelTables.Properties._Results__activity,
			ObeModelTables.Properties._Results__obtainedMarks,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents,
			ObeModelTables.Properties._Results__student
		};

		private static final ExecutorProperty /*@NonNull*/ [] _Student = {
			ObeModelTables.Properties._Student__Name,
			ObeModelTables.Properties._Student__RollNumber,
			ObeModelTables.Properties._Student__batche,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents,
			ObeModelTables.Properties._Student__registercourse,
			ObeModelTables.Properties._Student__results
		};

		private static final ExecutorProperty /*@NonNull*/ [] _Vision = {
			ObeModelTables.Properties._Vision__VisionStatement,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents
		};

		/**
		 *	Install the property descriptors in the fragment descriptors.
		 */
		static {
			Fragments._Activity__Activity.initProperties(_Activity);
			Fragments._ActivityType__ActivityType.initProperties(_ActivityType);
			Fragments._Assesment__Assesment.initProperties(_Assesment);
			Fragments._AssesmentType__AssesmentType.initProperties(_AssesmentType);
			Fragments._Batches__Batches.initProperties(_Batches);
			Fragments._CLO__CLO.initProperties(_CLO);
			Fragments._Courses__Courses.initProperties(_Courses);
			Fragments._Institute__Institute.initProperties(_Institute);
			Fragments._InstituteLevel__InstituteLevel.initProperties(_InstituteLevel);
			Fragments._LearningDomain__LearningDomain.initProperties(_LearningDomain);
			Fragments._LearningLevels__LearningLevels.initProperties(_LearningLevels);
			Fragments._Mission__Mission.initProperties(_Mission);
			Fragments._OBERootNode__OBERootNode.initProperties(_OBERootNode);
			Fragments._PEO__PEO.initProperties(_PEO);
			Fragments._Plo__Plo.initProperties(_Plo);
			Fragments._Program__Program.initProperties(_Program);
			Fragments._Results__Results.initProperties(_Results);
			Fragments._Student__Student.initProperties(_Student);
			Fragments._Vision__Vision.initProperties(_Vision);

			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of ObeModelTables::FragmentProperties and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 *	The lists of enumeration literals for each enumeration.
	 */
	public static class EnumerationLiterals {
		static {
			Init.initStart();
			FragmentProperties.init();
		}

		public static final EcoreExecutorEnumerationLiteral _ActivityType__Quiz = new EcoreExecutorEnumerationLiteral(ObeModelPackage.Literals.ACTIVITY_TYPE.getEEnumLiteral("Quiz"), Types._ActivityType, 0);
		public static final EcoreExecutorEnumerationLiteral _ActivityType__Assignment = new EcoreExecutorEnumerationLiteral(ObeModelPackage.Literals.ACTIVITY_TYPE.getEEnumLiteral("Assignment"), Types._ActivityType, 1);
		public static final EcoreExecutorEnumerationLiteral _ActivityType__Mid = new EcoreExecutorEnumerationLiteral(ObeModelPackage.Literals.ACTIVITY_TYPE.getEEnumLiteral("Mid"), Types._ActivityType, 2);
		public static final EcoreExecutorEnumerationLiteral _ActivityType__Finals = new EcoreExecutorEnumerationLiteral(ObeModelPackage.Literals.ACTIVITY_TYPE.getEEnumLiteral("Finals"), Types._ActivityType, 3);
		public static final EcoreExecutorEnumerationLiteral _ActivityType__Lab = new EcoreExecutorEnumerationLiteral(ObeModelPackage.Literals.ACTIVITY_TYPE.getEEnumLiteral("Lab"), Types._ActivityType, 4);
		public static final EcoreExecutorEnumerationLiteral _ActivityType__Surveys = new EcoreExecutorEnumerationLiteral(ObeModelPackage.Literals.ACTIVITY_TYPE.getEEnumLiteral("Surveys"), Types._ActivityType, 5);
		private static final EcoreExecutorEnumerationLiteral /*@NonNull*/ [] _ActivityType = {
			_ActivityType__Quiz,
			_ActivityType__Assignment,
			_ActivityType__Mid,
			_ActivityType__Finals,
			_ActivityType__Lab,
			_ActivityType__Surveys
		};

		public static final EcoreExecutorEnumerationLiteral _AssesmentType__Direct = new EcoreExecutorEnumerationLiteral(ObeModelPackage.Literals.ASSESMENT_TYPE.getEEnumLiteral("Direct"), Types._AssesmentType, 0);
		public static final EcoreExecutorEnumerationLiteral _AssesmentType__Indirect = new EcoreExecutorEnumerationLiteral(ObeModelPackage.Literals.ASSESMENT_TYPE.getEEnumLiteral("Indirect"), Types._AssesmentType, 1);
		private static final EcoreExecutorEnumerationLiteral /*@NonNull*/ [] _AssesmentType = {
			_AssesmentType__Direct,
			_AssesmentType__Indirect
		};

		public static final EcoreExecutorEnumerationLiteral _InstituteLevel__University = new EcoreExecutorEnumerationLiteral(ObeModelPackage.Literals.INSTITUTE_LEVEL.getEEnumLiteral("University"), Types._InstituteLevel, 0);
		public static final EcoreExecutorEnumerationLiteral _InstituteLevel__Faculty = new EcoreExecutorEnumerationLiteral(ObeModelPackage.Literals.INSTITUTE_LEVEL.getEEnumLiteral("Faculty"), Types._InstituteLevel, 1);
		public static final EcoreExecutorEnumerationLiteral _InstituteLevel__Department = new EcoreExecutorEnumerationLiteral(ObeModelPackage.Literals.INSTITUTE_LEVEL.getEEnumLiteral("Department"), Types._InstituteLevel, 2);
		private static final EcoreExecutorEnumerationLiteral /*@NonNull*/ [] _InstituteLevel = {
			_InstituteLevel__University,
			_InstituteLevel__Faculty,
			_InstituteLevel__Department
		};

		public static final EcoreExecutorEnumerationLiteral _LearningDomain__Cognitive = new EcoreExecutorEnumerationLiteral(ObeModelPackage.Literals.LEARNING_DOMAIN.getEEnumLiteral("Cognitive"), Types._LearningDomain, 0);
		public static final EcoreExecutorEnumerationLiteral _LearningDomain__Affective = new EcoreExecutorEnumerationLiteral(ObeModelPackage.Literals.LEARNING_DOMAIN.getEEnumLiteral("Affective"), Types._LearningDomain, 1);
		public static final EcoreExecutorEnumerationLiteral _LearningDomain__Physcomotor = new EcoreExecutorEnumerationLiteral(ObeModelPackage.Literals.LEARNING_DOMAIN.getEEnumLiteral("Physcomotor"), Types._LearningDomain, 2);
		private static final EcoreExecutorEnumerationLiteral /*@NonNull*/ [] _LearningDomain = {
			_LearningDomain__Cognitive,
			_LearningDomain__Affective,
			_LearningDomain__Physcomotor
		};

		/**
		 *	Install the enumeration literals in the enumerations.
		 */
		static {
			Types._ActivityType.initLiterals(_ActivityType);
			Types._AssesmentType.initLiterals(_AssesmentType);
			Types._InstituteLevel.initLiterals(_InstituteLevel);
			Types._LearningDomain.initLiterals(_LearningDomain);

			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of ObeModelTables::EnumerationLiterals and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 * The multiple packages above avoid problems with the Java 65536 byte limit but introduce a difficulty in ensuring that
	 * static construction occurs in the disciplined order of the packages when construction may start in any of the packages.
	 * The problem is resolved by ensuring that the static construction of each package first initializes its immediate predecessor.
	 * On completion of predecessor initialization, the residual packages are initialized by starting an initialization in the last package.
	 * This class maintains a count so that the various predecessors can distinguish whether they are the starting point and so
	 * ensure that residual construction occurs just once after all predecessors.
	 */
	private static class Init {
		/**
		 * Counter of nested static constructions. On return to zero residual construction starts. -ve once residual construction started.
		 */
		private static int initCount = 0;

		/**
		 * Invoked at the start of a static construction to defer residual construction until primary constructions complete.
		 */
		private static void initStart() {
			if (initCount >= 0) {
				initCount++;
			}
		}

		/**
		 * Invoked at the end of a static construction to activate residual construction once primary constructions complete.
		 */
		private static void initEnd() {
			if (initCount > 0) {
				if (--initCount == 0) {
					initCount = -1;
					EnumerationLiterals.init();
				}
			}
		}
	}

	static {
		Init.initEnd();
	}

	/*
	 * Force initialization of outer fields. Inner fields are lazily initialized.
	 */
	public static void init() {
		new ObeModelTables();
	}

	private ObeModelTables() {
		super(ObeModelPackage.eNS_URI);
	}
}
