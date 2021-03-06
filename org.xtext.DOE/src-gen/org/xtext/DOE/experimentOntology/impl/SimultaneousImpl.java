/**
 */
package org.xtext.DOE.experimentOntology.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EDataTypeEList;

import org.xtext.DOE.experimentOntology.ExperimentOntologyPackage;
import org.xtext.DOE.experimentOntology.Logical;
import org.xtext.DOE.experimentOntology.Simultaneous;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Simultaneous</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.xtext.DOE.experimentOntology.impl.SimultaneousImpl#getSim1 <em>Sim1</em>}</li>
 *   <li>{@link org.xtext.DOE.experimentOntology.impl.SimultaneousImpl#getLog <em>Log</em>}</li>
 *   <li>{@link org.xtext.DOE.experimentOntology.impl.SimultaneousImpl#getSim2 <em>Sim2</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SimultaneousImpl extends EventImpl implements Simultaneous
{
  /**
   * The default value of the '{@link #getSim1() <em>Sim1</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSim1()
   * @generated
   * @ordered
   */
  protected static final String SIM1_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getSim1() <em>Sim1</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSim1()
   * @generated
   * @ordered
   */
  protected String sim1 = SIM1_EDEFAULT;

  /**
   * The cached value of the '{@link #getLog() <em>Log</em>}' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLog()
   * @generated
   * @ordered
   */
  protected EList<Logical> log;

  /**
   * The cached value of the '{@link #getSim2() <em>Sim2</em>}' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSim2()
   * @generated
   * @ordered
   */
  protected EList<String> sim2;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected SimultaneousImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return ExperimentOntologyPackage.Literals.SIMULTANEOUS;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getSim1()
  {
    return sim1;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setSim1(String newSim1)
  {
    String oldSim1 = sim1;
    sim1 = newSim1;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ExperimentOntologyPackage.SIMULTANEOUS__SIM1, oldSim1, sim1));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Logical> getLog()
  {
    if (log == null)
    {
      log = new EDataTypeEList<Logical>(Logical.class, this, ExperimentOntologyPackage.SIMULTANEOUS__LOG);
    }
    return log;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<String> getSim2()
  {
    if (sim2 == null)
    {
      sim2 = new EDataTypeEList<String>(String.class, this, ExperimentOntologyPackage.SIMULTANEOUS__SIM2);
    }
    return sim2;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case ExperimentOntologyPackage.SIMULTANEOUS__SIM1:
        return getSim1();
      case ExperimentOntologyPackage.SIMULTANEOUS__LOG:
        return getLog();
      case ExperimentOntologyPackage.SIMULTANEOUS__SIM2:
        return getSim2();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @SuppressWarnings("unchecked")
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case ExperimentOntologyPackage.SIMULTANEOUS__SIM1:
        setSim1((String)newValue);
        return;
      case ExperimentOntologyPackage.SIMULTANEOUS__LOG:
        getLog().clear();
        getLog().addAll((Collection<? extends Logical>)newValue);
        return;
      case ExperimentOntologyPackage.SIMULTANEOUS__SIM2:
        getSim2().clear();
        getSim2().addAll((Collection<? extends String>)newValue);
        return;
    }
    super.eSet(featureID, newValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case ExperimentOntologyPackage.SIMULTANEOUS__SIM1:
        setSim1(SIM1_EDEFAULT);
        return;
      case ExperimentOntologyPackage.SIMULTANEOUS__LOG:
        getLog().clear();
        return;
      case ExperimentOntologyPackage.SIMULTANEOUS__SIM2:
        getSim2().clear();
        return;
    }
    super.eUnset(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case ExperimentOntologyPackage.SIMULTANEOUS__SIM1:
        return SIM1_EDEFAULT == null ? sim1 != null : !SIM1_EDEFAULT.equals(sim1);
      case ExperimentOntologyPackage.SIMULTANEOUS__LOG:
        return log != null && !log.isEmpty();
      case ExperimentOntologyPackage.SIMULTANEOUS__SIM2:
        return sim2 != null && !sim2.isEmpty();
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    if (eIsProxy()) return super.toString();

    StringBuffer result = new StringBuffer(super.toString());
    result.append(" (sim1: ");
    result.append(sim1);
    result.append(", log: ");
    result.append(log);
    result.append(", sim2: ");
    result.append(sim2);
    result.append(')');
    return result.toString();
  }

} //SimultaneousImpl
