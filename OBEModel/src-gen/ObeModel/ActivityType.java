/**
 */
package ObeModel;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Activity Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see ObeModel.ObeModelPackage#getActivityType()
 * @model
 * @generated
 */
public enum ActivityType implements Enumerator {
	/**
	 * The '<em><b>Quiz</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #QUIZ_VALUE
	 * @generated
	 * @ordered
	 */
	QUIZ(0, "Quiz", "Quiz"),

	/**
	 * The '<em><b>Assignment</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ASSIGNMENT_VALUE
	 * @generated
	 * @ordered
	 */
	ASSIGNMENT(1, "Assignment", "Assignment"),

	/**
	 * The '<em><b>Mid</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MID_VALUE
	 * @generated
	 * @ordered
	 */
	MID(2, "Mid", "Mid"),

	/**
	 * The '<em><b>Finals</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #FINALS_VALUE
	 * @generated
	 * @ordered
	 */
	FINALS(3, "Finals", "Finals"),

	/**
	 * The '<em><b>Lab</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LAB_VALUE
	 * @generated
	 * @ordered
	 */
	LAB(4, "Lab", "Lab"),

	/**
	 * The '<em><b>Surveys</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SURVEYS_VALUE
	 * @generated
	 * @ordered
	 */
	SURVEYS(5, "Surveys", "Surveys");

	/**
	 * The '<em><b>Quiz</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #QUIZ
	 * @model name="Quiz"
	 * @generated
	 * @ordered
	 */
	public static final int QUIZ_VALUE = 0;

	/**
	 * The '<em><b>Assignment</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ASSIGNMENT
	 * @model name="Assignment"
	 * @generated
	 * @ordered
	 */
	public static final int ASSIGNMENT_VALUE = 1;

	/**
	 * The '<em><b>Mid</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MID
	 * @model name="Mid"
	 * @generated
	 * @ordered
	 */
	public static final int MID_VALUE = 2;

	/**
	 * The '<em><b>Finals</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #FINALS
	 * @model name="Finals"
	 * @generated
	 * @ordered
	 */
	public static final int FINALS_VALUE = 3;

	/**
	 * The '<em><b>Lab</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LAB
	 * @model name="Lab"
	 * @generated
	 * @ordered
	 */
	public static final int LAB_VALUE = 4;

	/**
	 * The '<em><b>Surveys</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SURVEYS
	 * @model name="Surveys"
	 * @generated
	 * @ordered
	 */
	public static final int SURVEYS_VALUE = 5;

	/**
	 * An array of all the '<em><b>Activity Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final ActivityType[] VALUES_ARRAY = new ActivityType[] { QUIZ, ASSIGNMENT, MID, FINALS, LAB,
			SURVEYS, };

	/**
	 * A public read-only list of all the '<em><b>Activity Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<ActivityType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Activity Type</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ActivityType get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ActivityType result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Activity Type</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ActivityType getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ActivityType result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Activity Type</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ActivityType get(int value) {
		switch (value) {
		case QUIZ_VALUE:
			return QUIZ;
		case ASSIGNMENT_VALUE:
			return ASSIGNMENT;
		case MID_VALUE:
			return MID;
		case FINALS_VALUE:
			return FINALS;
		case LAB_VALUE:
			return LAB;
		case SURVEYS_VALUE:
			return SURVEYS;
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final int value;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String name;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String literal;

	/**
	 * Only this class can construct instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private ActivityType(int value, String name, String literal) {
		this.value = value;
		this.name = name;
		this.literal = literal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getValue() {
		return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLiteral() {
		return literal;
	}

	/**
	 * Returns the literal value of the enumerator, which is its string representation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		return literal;
	}

} //ActivityType
