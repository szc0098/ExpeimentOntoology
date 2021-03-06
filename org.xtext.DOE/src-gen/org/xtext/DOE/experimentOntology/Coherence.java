/**
 */
package org.xtext.DOE.experimentOntology;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Coherence</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.xtext.DOE.experimentOntology.ExperimentOntologyPackage#getCoherence()
 * @model
 * @generated
 */
public enum Coherence implements Enumerator
{
  /**
   * The '<em><b>EXPLAIN</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #EXPLAIN_VALUE
   * @generated
   * @ordered
   */
  EXPLAIN(0, "EXPLAIN", "EXPLAIN"),

  /**
   * The '<em><b>ANALOGOUS</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #ANALOGOUS_VALUE
   * @generated
   * @ordered
   */
  ANALOGOUS(1, "ANALOGOUS", "ANALOGOUS"),

  /**
   * The '<em><b>DATA</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #DATA_VALUE
   * @generated
   * @ordered
   */
  DATA(2, "DATA", "DATA"),

  /**
   * The '<em><b>CONTRADICT</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #CONTRADICT_VALUE
   * @generated
   * @ordered
   */
  CONTRADICT(3, "CONTRADICT", "CONTRADICT");

  /**
   * The '<em><b>EXPLAIN</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>EXPLAIN</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #EXPLAIN
   * @model
   * @generated
   * @ordered
   */
  public static final int EXPLAIN_VALUE = 0;

  /**
   * The '<em><b>ANALOGOUS</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>ANALOGOUS</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #ANALOGOUS
   * @model
   * @generated
   * @ordered
   */
  public static final int ANALOGOUS_VALUE = 1;

  /**
   * The '<em><b>DATA</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>DATA</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #DATA
   * @model
   * @generated
   * @ordered
   */
  public static final int DATA_VALUE = 2;

  /**
   * The '<em><b>CONTRADICT</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>CONTRADICT</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #CONTRADICT
   * @model
   * @generated
   * @ordered
   */
  public static final int CONTRADICT_VALUE = 3;

  /**
   * An array of all the '<em><b>Coherence</b></em>' enumerators.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private static final Coherence[] VALUES_ARRAY =
    new Coherence[]
    {
      EXPLAIN,
      ANALOGOUS,
      DATA,
      CONTRADICT,
    };

  /**
   * A public read-only list of all the '<em><b>Coherence</b></em>' enumerators.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final List<Coherence> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

  /**
   * Returns the '<em><b>Coherence</b></em>' literal with the specified literal value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static Coherence get(String literal)
  {
    for (int i = 0; i < VALUES_ARRAY.length; ++i)
    {
      Coherence result = VALUES_ARRAY[i];
      if (result.toString().equals(literal))
      {
        return result;
      }
    }
    return null;
  }

  /**
   * Returns the '<em><b>Coherence</b></em>' literal with the specified name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static Coherence getByName(String name)
  {
    for (int i = 0; i < VALUES_ARRAY.length; ++i)
    {
      Coherence result = VALUES_ARRAY[i];
      if (result.getName().equals(name))
      {
        return result;
      }
    }
    return null;
  }

  /**
   * Returns the '<em><b>Coherence</b></em>' literal with the specified integer value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static Coherence get(int value)
  {
    switch (value)
    {
      case EXPLAIN_VALUE: return EXPLAIN;
      case ANALOGOUS_VALUE: return ANALOGOUS;
      case DATA_VALUE: return DATA;
      case CONTRADICT_VALUE: return CONTRADICT;
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
  private Coherence(int value, String name, String literal)
  {
    this.value = value;
    this.name = name;
    this.literal = literal;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public int getValue()
  {
    return value;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getName()
  {
    return name;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getLiteral()
  {
    return literal;
  }

  /**
   * Returns the literal value of the enumerator, which is its string representation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    return literal;
  }
  
} //Coherence
