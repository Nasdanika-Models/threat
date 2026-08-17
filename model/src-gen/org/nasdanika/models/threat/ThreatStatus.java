/**
 */
package org.nasdanika.models.threat;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Status</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.nasdanika.models.threat.ThreatPackage#getThreatStatus()
 * @model
 * @generated
 */
public enum ThreatStatus implements Enumerator {
	/**
	 * The '<em><b>IDENTIFIED</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #IDENTIFIED_VALUE
	 * @generated
	 * @ordered
	 */
	IDENTIFIED(0, "IDENTIFIED", "IDENTIFIED"),

	/**
	 * The '<em><b>MITIGATED</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 *  Analyzed and being addressed via controls.
	 * <!-- end-model-doc -->
	 * @see #MITIGATED_VALUE
	 * @generated
	 * @ordered
	 */
	MITIGATED(0, "MITIGATED", "MITIGATED"),

	/**
	 * The '<em><b>ACCEPTED</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 *  Risk-accepted; should trace to a governance waiver or decision.
	 * <!-- end-model-doc -->
	 * @see #ACCEPTED_VALUE
	 * @generated
	 * @ordered
	 */
	ACCEPTED(0, "ACCEPTED", "ACCEPTED"),

	/**
	 * The '<em><b>NOT APPLICABLE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 *  Analyzed and found not to apply; keeping it recorded keeps the model honest.
	 * <!-- end-model-doc -->
	 * @see #NOT_APPLICABLE_VALUE
	 * @generated
	 * @ordered
	 */
	NOT_APPLICABLE(0, "NOT_APPLICABLE", "NOT_APPLICABLE");

	/**
	 * The '<em><b>IDENTIFIED</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #IDENTIFIED
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int IDENTIFIED_VALUE = 0;

	/**
	 * The '<em><b>MITIGATED</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 *  Analyzed and being addressed via controls.
	 * <!-- end-model-doc -->
	 * @see #MITIGATED
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int MITIGATED_VALUE = 0;

	/**
	 * The '<em><b>ACCEPTED</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 *  Risk-accepted; should trace to a governance waiver or decision.
	 * <!-- end-model-doc -->
	 * @see #ACCEPTED
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int ACCEPTED_VALUE = 0;

	/**
	 * The '<em><b>NOT APPLICABLE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 *  Analyzed and found not to apply; keeping it recorded keeps the model honest.
	 * <!-- end-model-doc -->
	 * @see #NOT_APPLICABLE
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int NOT_APPLICABLE_VALUE = 0;

	/**
	 * An array of all the '<em><b>Status</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final ThreatStatus[] VALUES_ARRAY =
		new ThreatStatus[] {
			IDENTIFIED,
			MITIGATED,
			ACCEPTED,
			NOT_APPLICABLE,
		};

	/**
	 * A public read-only list of all the '<em><b>Status</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<ThreatStatus> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Status</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ThreatStatus get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ThreatStatus result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Status</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ThreatStatus getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ThreatStatus result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Status</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ThreatStatus get(int value) {
		switch (value) {
			case IDENTIFIED_VALUE: return IDENTIFIED;
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
	private ThreatStatus(int value, String name, String literal) {
		this.value = value;
		this.name = name;
		this.literal = literal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getValue() {
	  return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getName() {
	  return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
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
	
} //ThreatStatus
