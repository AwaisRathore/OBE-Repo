/**
 */
package ObeModel;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Institute Level</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see ObeModel.ObeModelPackage#getInstituteLevel()
 * @model
 * @generated
 */
public enum InstituteLevel implements Enumerator {
	/**
	 * The '<em><b>University</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #UNIVERSITY_VALUE
	 * @generated
	 * @ordered
	 */
	UNIVERSITY(0, "University", "University"),

	/**
	 * The '<em><b>Faculty</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #FACULTY_VALUE
	 * @generated
	 * @ordered
	 */
	FACULTY(1, "Faculty", "Faculty"),

	/**
	 * The '<em><b>Department</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DEPARTMENT_VALUE
	 * @generated
	 * @ordered
	 */
	DEPARTMENT(2, "Department", "Department");

	/**
	 * The '<em><b>University</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #UNIVERSITY
	 * @model name="University"
	 * @generated
	 * @ordered
	 */
	public static final int UNIVERSITY_VALUE = 0;

	/**
	 * The '<em><b>Faculty</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #FACULTY
	 * @model name="Faculty"
	 * @generated
	 * @ordered
	 */
	public static final int FACULTY_VALUE = 1;

	/**
	 * The '<em><b>Department</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DEPARTMENT
	 * @model name="Department"
	 * @generated
	 * @ordered
	 */
	public static final int DEPARTMENT_VALUE = 2;

	/**
	 * An array of all the '<em><b>Institute Level</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final InstituteLevel[] VALUES_ARRAY = new InstituteLevel[] { UNIVERSITY, FACULTY, DEPARTMENT, };

	/**
	 * A public read-only list of all the '<em><b>Institute Level</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<InstituteLevel> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Institute Level</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static InstituteLevel get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			InstituteLevel result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Institute Level</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static InstituteLevel getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			InstituteLevel result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Institute Level</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static InstituteLevel get(int value) {
		switch (value) {
		case UNIVERSITY_VALUE:
			return UNIVERSITY;
		case FACULTY_VALUE:
			return FACULTY;
		case DEPARTMENT_VALUE:
			return DEPARTMENT;
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
	private InstituteLevel(int value, String name, String literal) {
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

} //InstituteLevel
