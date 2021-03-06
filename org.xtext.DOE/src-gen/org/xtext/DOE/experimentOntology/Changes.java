/**
 */
package org.xtext.DOE.experimentOntology;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Changes</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.xtext.DOE.experimentOntology.ExperimentOntologyPackage#getChanges()
 * @model
 * @generated
 */
public enum Changes implements Enumerator
{
  /**
   * The '<em><b>CHANGED</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #CHANGED_VALUE
   * @generated
   * @ordered
   */
  CHANGED(0, "CHANGED", "CHANGED"),

  /**
   * The '<em><b>INCREASED</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #INCREASED_VALUE
   * @generated
   * @ordered
   */
  INCREASED(1, "INCREASED", "INCREASED"),

  /**
   * The '<em><b>DECREASED</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #DECREASED_VALUE
   * @generated
   * @ordered
   */
  DECREASED(2, "DECREASED", "DECREASED"),

  /**
   * The '<em><b>CONSTANT</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #CONSTANT_VALUE
   * @generated
   * @ordered
   */
  CONSTANT(3, "CONSTANT", "CONSTANT");

  /**
   * The '<em><b>CHANGED</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>CHANGED</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #CHANGED
   * @model
   * @generated
   * @ordered
   */
  public static final int CHANGED_VALUE = 0;

  /**
   * The '<em><b>INCREASED</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>INCREASED</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #INCREASED
   * @model
   * @generated
   * @ordered
   */
  public static final int INCREASED_VALUE = 1;

  /**
   * The '<em><b>DECREASED</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>DECREASED</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #DECREASED
   * @model
   * @generated
   * @ordered
   */
  public static final int DECREASED_VALUE = 2;

  /**
   * The '<em><b>CONSTANT</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>CONSTANT</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #CONSTANT
   * @model
   * @generated
   * @ordered
   */
  public static final int CONSTANT_VALUE = 3;

  /**
   * An array of all the '<em><b>Changes</b></em>' enumerators.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private static final Changes[] VALUES_ARRAY =
    new Changes[]
    {
      CHANGED,
      INCREASED,
      DECREASED,
      CONSTANT,
    };

  /**
   * A public read-only list of all the '<em><b>Changes</b></em>' enumerators.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final List<Changes> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

  /**
   * Returns the '<em><b>Changes</b></em>' literal with the specified literal value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static Changes get(String literal)
  {
    for (int i = 0; i < VALUES_ARRAY.length; ++i)
    {
      Changes result = VALUES_ARRAY[i];
      if (result.toString().equals(literal))
      {
        return result;
      }
    }
    return null;
  }

  /**
   * Returns the '<em><b>Changes</b></em>' literal with the specified name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static Changes getByName(String name)
  {
    for (int i = 0; i < VALUES_ARRAY.length; ++i)
    {
      Changes result = VALUES_ARRAY[i];
      if (result.getName().equals(name))
      {
        return result;
      }
    }
    return null;
  }

  /**
   * Returns the '<em><b>Changes</b></em>' literal with the specified integer value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static Changes get(int value)
  {
    switch (value)
    {
      case CHANGED_VALUE: return CHANGED;
      case INCREASED_VALUE: return INCREASED;
      case DECREASED_VALUE: return DECREASED;
      case CONSTANT_VALUE: return CONSTANT;
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
  private Changes(int value, String name, String literal)
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
  
} //Changes
