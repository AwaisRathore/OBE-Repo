/**
 */
package ObeModel;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Learning Domain</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see ObeModel.ObeModelPackage#getLearningDomain()
 * @model
 * @generated
 */
public enum LearningDomain implements Enumerator {
	/**
	 * The '<em><b>Cognitive</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #COGNITIVE_VALUE
	 * @generated
	 * @ordered
	 */
	COGNITIVE(0, "Cognitive", "Cognitive"),

	/**
	 * The '<em><b>Affective</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #AFFECTIVE_VALUE
	 * @generated
	 * @ordered
	 */
	AFFECTIVE(1, "Affective", "Affective"),

	/**
	 * The '<em><b>Physcomotor</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PHYSCOMOTOR_VALUE
	 * @generated
	 * @ordered
	 */
	PHYSCOMOTOR(2, "Physcomotor", "Physcomotor");

	/**
	 * The '<em><b>Cognitive</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #COGNITIVE
	 * @model name="Cognitive"
	 * @generated
	 * @ordered
	 */
	public static final int COGNITIVE_VALUE = 0;

	/**
	 * The '<em><b>Affective</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #AFFECTIVE
	 * @model name="Affective"
	 * @generated
	 * @ordered
	 */
	public static final int AFFECTIVE_VALUE = 1;

	/**
	 * The '<em><b>Physcomotor</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PHYSCOMOTOR
	 * @model name="Physcomotor"
	 * @generated
	 * @ordered
	 */
	public static final int PHYSCOMOTOR_VALUE = 2;

	/**
	 * An array of all the '<em><b>Learning Domain</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final LearningDomain[] VALUES_ARRAY = new LearningDomain[] { COGNITIVE, AFFECTIVE, PHYSCOMOTOR, };

	/**
	 * A public read-only list of all the '<em><b>Learning Domain</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<LearningDomain> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Learning Domain</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static LearningDomain get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			LearningDomain result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Learning Domain</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static LearningDomain getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			LearningDomain result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Learning Domain</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static LearningDomain get(int value) {
		switch (value) {
		case COGNITIVE_VALUE:
			return COGNITIVE;
		case AFFECTIVE_VALUE:
			return AFFECTIVE;
		case PHYSCOMOTOR_VALUE:
			return PHYSCOMOTOR;
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
	private LearningDomain(int value, String name, String literal) {
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

} //LearningDomain
