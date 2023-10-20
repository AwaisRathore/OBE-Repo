/**
 */
package ObeModel.util;

import ObeModel.*;

import java.util.Map;

import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.EObjectValidator;

/**
 * <!-- begin-user-doc -->
 * The <b>Validator</b> for the model.
 * <!-- end-user-doc -->
 * @see ObeModel.ObeModelPackage
 * @generated
 */
public class ObeModelValidator extends EObjectValidator {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final ObeModelValidator INSTANCE = new ObeModelValidator();

	/**
	 * A constant for the {@link org.eclipse.emf.common.util.Diagnostic#getSource() source} of diagnostic {@link org.eclipse.emf.common.util.Diagnostic#getCode() codes} from this package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.common.util.Diagnostic#getSource()
	 * @see org.eclipse.emf.common.util.Diagnostic#getCode()
	 * @generated
	 */
	public static final String DIAGNOSTIC_SOURCE = "ObeModel";

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final int GENERATED_DIAGNOSTIC_CODE_COUNT = 0;

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants in a derived class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final int DIAGNOSTIC_CODE_COUNT = GENERATED_DIAGNOSTIC_CODE_COUNT;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ObeModelValidator() {
		super();
	}

	/**
	 * Returns the package of this validator switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EPackage getEPackage() {
		return ObeModelPackage.eINSTANCE;
	}

	/**
	 * Calls <code>validateXXX</code> for the corresponding classifier of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected boolean validate(int classifierID, Object value, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		switch (classifierID) {
		case ObeModelPackage.OBE_ROOT_NODE:
			return validateOBERootNode((OBERootNode) value, diagnostics, context);
		case ObeModelPackage.INSTITUTE:
			return validateInstitute((Institute) value, diagnostics, context);
		case ObeModelPackage.VISION:
			return validateVision((Vision) value, diagnostics, context);
		case ObeModelPackage.MISSION:
			return validateMission((Mission) value, diagnostics, context);
		case ObeModelPackage.PROGRAM:
			return validateProgram((Program) value, diagnostics, context);
		case ObeModelPackage.PEO:
			return validatePEO((PEO) value, diagnostics, context);
		case ObeModelPackage.PLO:
			return validatePlo((Plo) value, diagnostics, context);
		case ObeModelPackage.COURSES:
			return validateCourses((Courses) value, diagnostics, context);
		case ObeModelPackage.BATCHES:
			return validateBatches((Batches) value, diagnostics, context);
		case ObeModelPackage.STUDENT:
			return validateStudent((Student) value, diagnostics, context);
		case ObeModelPackage.CLO:
			return validateCLO((CLO) value, diagnostics, context);
		case ObeModelPackage.LEARNING_LEVELS:
			return validateLearningLevels((LearningLevels) value, diagnostics, context);
		case ObeModelPackage.ACTIVITY:
			return validateActivity((Activity) value, diagnostics, context);
		case ObeModelPackage.RESULTS:
			return validateResults((Results) value, diagnostics, context);
		case ObeModelPackage.ASSESMENT:
			return validateAssesment((Assesment) value, diagnostics, context);
		case ObeModelPackage.LEARNING_DOMAIN:
			return validateLearningDomain((LearningDomain) value, diagnostics, context);
		case ObeModelPackage.ACTIVITY_TYPE:
			return validateActivityType((ActivityType) value, diagnostics, context);
		case ObeModelPackage.ASSESMENT_TYPE:
			return validateAssesmentType((AssesmentType) value, diagnostics, context);
		case ObeModelPackage.INSTITUTE_LEVEL:
			return validateInstituteLevel((InstituteLevel) value, diagnostics, context);
		default:
			return true;
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOBERootNode(OBERootNode obeRootNode, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(obeRootNode, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInstitute(Institute institute, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(institute, diagnostics, context))
			return false;
		boolean result = validate_EveryMultiplicityConforms(institute, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryDataValueConforms(institute, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryReferenceIsContained(institute, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryBidirectionalReferenceIsPaired(institute, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryProxyResolves(institute, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_UniqueID(institute, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryKeyUnique(institute, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryMapEntryUnique(institute, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateInstitute_parentInsitutionCheck(institute, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateInstitute_VisionCanBeAssignedOnlyToInstitutionLevelUniversity(institute, diagnostics,
					context);
		if (result || diagnostics != null)
			result &= validateInstitute_OnlyDepartmentCanOfferPrograms(institute, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the parentInsitutionCheck constraint of '<em>Institute</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String INSTITUTE__PARENT_INSITUTION_CHECK__EEXPRESSION = "\n"
			+ "\t\t  if self.InstituteLevel = InstituteLevel::University then\n"
			+ "\t\t    self.parentInstitute = null\n" + "\t\t  else\n"
			+ "\t\t    if self.InstituteLevel = InstituteLevel::Department then\n"
			+ "\t\t      self.parentInstitute.InstituteLevel = InstituteLevel::Faculty\n" + "\t\t    else\n"
			+ "\t\t       self.parentInstitute.InstituteLevel = InstituteLevel::University\n" + "\t\t    endif\n"
			+ "\t\t  endif";

	/**
	 * Validates the parentInsitutionCheck constraint of '<em>Institute</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInstitute_parentInsitutionCheck(Institute institute, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate(ObeModelPackage.Literals.INSTITUTE, institute, diagnostics, context,
				"http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot", "parentInsitutionCheck",
				INSTITUTE__PARENT_INSITUTION_CHECK__EEXPRESSION, Diagnostic.ERROR, DIAGNOSTIC_SOURCE, 0);
	}

	/**
	 * The cached validation expression for the VisionCanBeAssignedOnlyToInstitutionLevelUniversity constraint of '<em>Institute</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String INSTITUTE__VISION_CAN_BE_ASSIGNED_ONLY_TO_INSTITUTION_LEVEL_UNIVERSITY__EEXPRESSION = "\n"
			+ "\t\t  if self.InstituteLevel = InstituteLevel::University then\n"
			+ "\t\t    self.associatedvision <> null\n" + "\t\t  else\n" + "\t\t    self.associatedvision = null\n"
			+ "\t\t  endif";

	/**
	 * Validates the VisionCanBeAssignedOnlyToInstitutionLevelUniversity constraint of '<em>Institute</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInstitute_VisionCanBeAssignedOnlyToInstitutionLevelUniversity(Institute institute,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate(ObeModelPackage.Literals.INSTITUTE, institute, diagnostics, context,
				"http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				"VisionCanBeAssignedOnlyToInstitutionLevelUniversity",
				INSTITUTE__VISION_CAN_BE_ASSIGNED_ONLY_TO_INSTITUTION_LEVEL_UNIVERSITY__EEXPRESSION, Diagnostic.ERROR,
				DIAGNOSTIC_SOURCE, 0);
	}

	/**
	 * The cached validation expression for the OnlyDepartmentCanOfferPrograms constraint of '<em>Institute</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String INSTITUTE__ONLY_DEPARTMENT_CAN_OFFER_PROGRAMS__EEXPRESSION = "\n"
			+ "\t\t  if self.InstituteLevel = InstituteLevel::Department then\n"
			+ "\t\t    self.Offerprograms->notEmpty()\n" + "\t\t  else\n" + "\t\t    self.Offerprograms->isEmpty()\n"
			+ "\t\t  endif";

	/**
	 * Validates the OnlyDepartmentCanOfferPrograms constraint of '<em>Institute</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInstitute_OnlyDepartmentCanOfferPrograms(Institute institute, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate(ObeModelPackage.Literals.INSTITUTE, institute, diagnostics, context,
				"http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot", "OnlyDepartmentCanOfferPrograms",
				INSTITUTE__ONLY_DEPARTMENT_CAN_OFFER_PROGRAMS__EEXPRESSION, Diagnostic.ERROR, DIAGNOSTIC_SOURCE, 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateVision(Vision vision, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(vision, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMission(Mission mission, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(mission, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProgram(Program program, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(program, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePEO(PEO peo, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(peo, diagnostics, context))
			return false;
		boolean result = validate_EveryMultiplicityConforms(peo, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryDataValueConforms(peo, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryReferenceIsContained(peo, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryBidirectionalReferenceIsPaired(peo, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryProxyResolves(peo, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_UniqueID(peo, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryKeyUnique(peo, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryMapEntryUnique(peo, diagnostics, context);
		if (result || diagnostics != null)
			result &= validatePEO_PEOCanBeMappedToOnlyMissionInstanceofDepartment(peo, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the PEOCanBeMappedToOnlyMissionInstanceofDepartment constraint of '<em>PEO</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String PEO__PEO_CAN_BE_MAPPED_TO_ONLY_MISSION_INSTANCEOF_DEPARTMENT__EEXPRESSION = "\n"
			+ "  \t\tself.mission.institute.InstituteLevel = InstituteLevel::Department";

	/**
	 * Validates the PEOCanBeMappedToOnlyMissionInstanceofDepartment constraint of '<em>PEO</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePEO_PEOCanBeMappedToOnlyMissionInstanceofDepartment(PEO peo, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate(ObeModelPackage.Literals.PEO, peo, diagnostics, context,
				"http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot", "PEOCanBeMappedToOnlyMissionInstanceofDepartment",
				PEO__PEO_CAN_BE_MAPPED_TO_ONLY_MISSION_INSTANCEOF_DEPARTMENT__EEXPRESSION, Diagnostic.ERROR,
				DIAGNOSTIC_SOURCE, 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePlo(Plo plo, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(plo, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCourses(Courses courses, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(courses, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBatches(Batches batches, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(batches, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStudent(Student student, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(student, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCLO(CLO clo, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(clo, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLearningLevels(LearningLevels learningLevels, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(learningLevels, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateActivity(Activity activity, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(activity, diagnostics, context))
			return false;
		boolean result = validate_EveryMultiplicityConforms(activity, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryDataValueConforms(activity, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryReferenceIsContained(activity, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryBidirectionalReferenceIsPaired(activity, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryProxyResolves(activity, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_UniqueID(activity, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryKeyUnique(activity, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryMapEntryUnique(activity, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateActivity_OnlyDirectAssesmentCanHaveCLO(activity, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the OnlyDirectAssesmentCanHaveCLO constraint of '<em>Activity</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String ACTIVITY__ONLY_DIRECT_ASSESMENT_CAN_HAVE_CLO__EEXPRESSION = "\n"
			+ "\t\t  if self.AssesmentType = AssesmentType::Direct then\n"
			+ "\t\t    self.clo->notEmpty() and self.clo->size() = 1\n" + "\t\t  else\n"
			+ "\t\t    self.clo->isEmpty()\n" + "\t\t  endif";

	/**
	 * Validates the OnlyDirectAssesmentCanHaveCLO constraint of '<em>Activity</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateActivity_OnlyDirectAssesmentCanHaveCLO(Activity activity, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate(ObeModelPackage.Literals.ACTIVITY, activity, diagnostics, context,
				"http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot", "OnlyDirectAssesmentCanHaveCLO",
				ACTIVITY__ONLY_DIRECT_ASSESMENT_CAN_HAVE_CLO__EEXPRESSION, Diagnostic.ERROR, DIAGNOSTIC_SOURCE, 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateResults(Results results, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(results, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAssesment(Assesment assesment, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(assesment, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLearningDomain(LearningDomain learningDomain, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateActivityType(ActivityType activityType, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAssesmentType(AssesmentType assesmentType, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInstituteLevel(InstituteLevel instituteLevel, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return true;
	}

	/**
	 * Returns the resource locator that will be used to fetch messages for this validator's diagnostics.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		// TODO
		// Specialize this to return a resource locator for messages specific to this validator.
		// Ensure that you remove @generated or mark it @generated NOT
		return super.getResourceLocator();
	}

} //ObeModelValidator
