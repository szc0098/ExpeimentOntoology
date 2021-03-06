/**
 */
package org.xtext.DOE.experimentOntology.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EDataTypeEList;

import org.xtext.DOE.experimentOntology.Condition;
import org.xtext.DOE.experimentOntology.Event;
import org.xtext.DOE.experimentOntology.ExperimentOntologyPackage;
import org.xtext.DOE.experimentOntology.Expression;
import org.xtext.DOE.experimentOntology.Links;
import org.xtext.DOE.experimentOntology.Logical;
import org.xtext.DOE.experimentOntology.Temporal;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Condition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.xtext.DOE.experimentOntology.impl.ConditionImpl#getL2 <em>L2</em>}</li>
 *   <li>{@link org.xtext.DOE.experimentOntology.impl.ConditionImpl#getExp <em>Exp</em>}</li>
 *   <li>{@link org.xtext.DOE.experimentOntology.impl.ConditionImpl#getOp1 <em>Op1</em>}</li>
 *   <li>{@link org.xtext.DOE.experimentOntology.impl.ConditionImpl#getOp2 <em>Op2</em>}</li>
 *   <li>{@link org.xtext.DOE.experimentOntology.impl.ConditionImpl#getL3 <em>L3</em>}</li>
 *   <li>{@link org.xtext.DOE.experimentOntology.impl.ConditionImpl#getCondition <em>Condition</em>}</li>
 *   <li>{@link org.xtext.DOE.experimentOntology.impl.ConditionImpl#getLo <em>Lo</em>}</li>
 *   <li>{@link org.xtext.DOE.experimentOntology.impl.ConditionImpl#getE <em>E</em>}</li>
 *   <li>{@link org.xtext.DOE.experimentOntology.impl.ConditionImpl#getExp1 <em>Exp1</em>}</li>
 *   <li>{@link org.xtext.DOE.experimentOntology.impl.ConditionImpl#getV <em>V</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ConditionImpl extends TemporalPatternImpl implements Condition
{
  /**
   * The cached value of the '{@link #getL2() <em>L2</em>}' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getL2()
   * @generated
   * @ordered
   */
  protected EList<Links> l2;

  /**
   * The cached value of the '{@link #getExp() <em>Exp</em>}' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getExp()
   * @generated
   * @ordered
   */
  protected EList<Expression> exp;

  /**
   * The cached value of the '{@link #getOp1() <em>Op1</em>}' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getOp1()
   * @generated
   * @ordered
   */
  protected EList<Temporal> op1;

  /**
   * The cached value of the '{@link #getOp2() <em>Op2</em>}' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getOp2()
   * @generated
   * @ordered
   */
  protected EList<Logical> op2;

  /**
   * The default value of the '{@link #getL3() <em>L3</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getL3()
   * @generated
   * @ordered
   */
  protected static final Links L3_EDEFAULT = Links.IS;

  /**
   * The cached value of the '{@link #getL3() <em>L3</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getL3()
   * @generated
   * @ordered
   */
  protected Links l3 = L3_EDEFAULT;

  /**
   * The cached value of the '{@link #getCondition() <em>Condition</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCondition()
   * @generated
   * @ordered
   */
  protected Event condition;

  /**
   * The default value of the '{@link #getLo() <em>Lo</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLo()
   * @generated
   * @ordered
   */
  protected static final String LO_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getLo() <em>Lo</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLo()
   * @generated
   * @ordered
   */
  protected String lo = LO_EDEFAULT;

  /**
   * The cached value of the '{@link #getE() <em>E</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getE()
   * @generated
   * @ordered
   */
  protected Event e;

  /**
   * The default value of the '{@link #getExp1() <em>Exp1</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getExp1()
   * @generated
   * @ordered
   */
  protected static final Expression EXP1_EDEFAULT = Expression.TRUE;

  /**
   * The cached value of the '{@link #getExp1() <em>Exp1</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getExp1()
   * @generated
   * @ordered
   */
  protected Expression exp1 = EXP1_EDEFAULT;

  /**
   * The default value of the '{@link #getV() <em>V</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getV()
   * @generated
   * @ordered
   */
  protected static final String V_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getV() <em>V</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getV()
   * @generated
   * @ordered
   */
  protected String v = V_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ConditionImpl()
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
    return ExperimentOntologyPackage.Literals.CONDITION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Links> getL2()
  {
    if (l2 == null)
    {
      l2 = new EDataTypeEList<Links>(Links.class, this, ExperimentOntologyPackage.CONDITION__L2);
    }
    return l2;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Expression> getExp()
  {
    if (exp == null)
    {
      exp = new EDataTypeEList<Expression>(Expression.class, this, ExperimentOntologyPackage.CONDITION__EXP);
    }
    return exp;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Temporal> getOp1()
  {
    if (op1 == null)
    {
      op1 = new EDataTypeEList<Temporal>(Temporal.class, this, ExperimentOntologyPackage.CONDITION__OP1);
    }
    return op1;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Logical> getOp2()
  {
    if (op2 == null)
    {
      op2 = new EDataTypeEList<Logical>(Logical.class, this, ExperimentOntologyPackage.CONDITION__OP2);
    }
    return op2;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Links getL3()
  {
    return l3;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setL3(Links newL3)
  {
    Links oldL3 = l3;
    l3 = newL3 == null ? L3_EDEFAULT : newL3;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ExperimentOntologyPackage.CONDITION__L3, oldL3, l3));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Event getCondition()
  {
    return condition;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetCondition(Event newCondition, NotificationChain msgs)
  {
    Event oldCondition = condition;
    condition = newCondition;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ExperimentOntologyPackage.CONDITION__CONDITION, oldCondition, newCondition);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setCondition(Event newCondition)
  {
    if (newCondition != condition)
    {
      NotificationChain msgs = null;
      if (condition != null)
        msgs = ((InternalEObject)condition).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ExperimentOntologyPackage.CONDITION__CONDITION, null, msgs);
      if (newCondition != null)
        msgs = ((InternalEObject)newCondition).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ExperimentOntologyPackage.CONDITION__CONDITION, null, msgs);
      msgs = basicSetCondition(newCondition, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ExperimentOntologyPackage.CONDITION__CONDITION, newCondition, newCondition));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getLo()
  {
    return lo;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setLo(String newLo)
  {
    String oldLo = lo;
    lo = newLo;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ExperimentOntologyPackage.CONDITION__LO, oldLo, lo));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Event getE()
  {
    return e;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetE(Event newE, NotificationChain msgs)
  {
    Event oldE = e;
    e = newE;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ExperimentOntologyPackage.CONDITION__E, oldE, newE);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setE(Event newE)
  {
    if (newE != e)
    {
      NotificationChain msgs = null;
      if (e != null)
        msgs = ((InternalEObject)e).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ExperimentOntologyPackage.CONDITION__E, null, msgs);
      if (newE != null)
        msgs = ((InternalEObject)newE).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ExperimentOntologyPackage.CONDITION__E, null, msgs);
      msgs = basicSetE(newE, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ExperimentOntologyPackage.CONDITION__E, newE, newE));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Expression getExp1()
  {
    return exp1;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setExp1(Expression newExp1)
  {
    Expression oldExp1 = exp1;
    exp1 = newExp1 == null ? EXP1_EDEFAULT : newExp1;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ExperimentOntologyPackage.CONDITION__EXP1, oldExp1, exp1));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getV()
  {
    return v;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setV(String newV)
  {
    String oldV = v;
    v = newV;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ExperimentOntologyPackage.CONDITION__V, oldV, v));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case ExperimentOntologyPackage.CONDITION__CONDITION:
        return basicSetCondition(null, msgs);
      case ExperimentOntologyPackage.CONDITION__E:
        return basicSetE(null, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
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
      case ExperimentOntologyPackage.CONDITION__L2:
        return getL2();
      case ExperimentOntologyPackage.CONDITION__EXP:
        return getExp();
      case ExperimentOntologyPackage.CONDITION__OP1:
        return getOp1();
      case ExperimentOntologyPackage.CONDITION__OP2:
        return getOp2();
      case ExperimentOntologyPackage.CONDITION__L3:
        return getL3();
      case ExperimentOntologyPackage.CONDITION__CONDITION:
        return getCondition();
      case ExperimentOntologyPackage.CONDITION__LO:
        return getLo();
      case ExperimentOntologyPackage.CONDITION__E:
        return getE();
      case ExperimentOntologyPackage.CONDITION__EXP1:
        return getExp1();
      case ExperimentOntologyPackage.CONDITION__V:
        return getV();
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
      case ExperimentOntologyPackage.CONDITION__L2:
        getL2().clear();
        getL2().addAll((Collection<? extends Links>)newValue);
        return;
      case ExperimentOntologyPackage.CONDITION__EXP:
        getExp().clear();
        getExp().addAll((Collection<? extends Expression>)newValue);
        return;
      case ExperimentOntologyPackage.CONDITION__OP1:
        getOp1().clear();
        getOp1().addAll((Collection<? extends Temporal>)newValue);
        return;
      case ExperimentOntologyPackage.CONDITION__OP2:
        getOp2().clear();
        getOp2().addAll((Collection<? extends Logical>)newValue);
        return;
      case ExperimentOntologyPackage.CONDITION__L3:
        setL3((Links)newValue);
        return;
      case ExperimentOntologyPackage.CONDITION__CONDITION:
        setCondition((Event)newValue);
        return;
      case ExperimentOntologyPackage.CONDITION__LO:
        setLo((String)newValue);
        return;
      case ExperimentOntologyPackage.CONDITION__E:
        setE((Event)newValue);
        return;
      case ExperimentOntologyPackage.CONDITION__EXP1:
        setExp1((Expression)newValue);
        return;
      case ExperimentOntologyPackage.CONDITION__V:
        setV((String)newValue);
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
      case ExperimentOntologyPackage.CONDITION__L2:
        getL2().clear();
        return;
      case ExperimentOntologyPackage.CONDITION__EXP:
        getExp().clear();
        return;
      case ExperimentOntologyPackage.CONDITION__OP1:
        getOp1().clear();
        return;
      case ExperimentOntologyPackage.CONDITION__OP2:
        getOp2().clear();
        return;
      case ExperimentOntologyPackage.CONDITION__L3:
        setL3(L3_EDEFAULT);
        return;
      case ExperimentOntologyPackage.CONDITION__CONDITION:
        setCondition((Event)null);
        return;
      case ExperimentOntologyPackage.CONDITION__LO:
        setLo(LO_EDEFAULT);
        return;
      case ExperimentOntologyPackage.CONDITION__E:
        setE((Event)null);
        return;
      case ExperimentOntologyPackage.CONDITION__EXP1:
        setExp1(EXP1_EDEFAULT);
        return;
      case ExperimentOntologyPackage.CONDITION__V:
        setV(V_EDEFAULT);
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
      case ExperimentOntologyPackage.CONDITION__L2:
        return l2 != null && !l2.isEmpty();
      case ExperimentOntologyPackage.CONDITION__EXP:
        return exp != null && !exp.isEmpty();
      case ExperimentOntologyPackage.CONDITION__OP1:
        return op1 != null && !op1.isEmpty();
      case ExperimentOntologyPackage.CONDITION__OP2:
        return op2 != null && !op2.isEmpty();
      case ExperimentOntologyPackage.CONDITION__L3:
        return l3 != L3_EDEFAULT;
      case ExperimentOntologyPackage.CONDITION__CONDITION:
        return condition != null;
      case ExperimentOntologyPackage.CONDITION__LO:
        return LO_EDEFAULT == null ? lo != null : !LO_EDEFAULT.equals(lo);
      case ExperimentOntologyPackage.CONDITION__E:
        return e != null;
      case ExperimentOntologyPackage.CONDITION__EXP1:
        return exp1 != EXP1_EDEFAULT;
      case ExperimentOntologyPackage.CONDITION__V:
        return V_EDEFAULT == null ? v != null : !V_EDEFAULT.equals(v);
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
    result.append(" (l2: ");
    result.append(l2);
    result.append(", exp: ");
    result.append(exp);
    result.append(", op1: ");
    result.append(op1);
    result.append(", op2: ");
    result.append(op2);
    result.append(", l3: ");
    result.append(l3);
    result.append(", lo: ");
    result.append(lo);
    result.append(", exp1: ");
    result.append(exp1);
    result.append(", v: ");
    result.append(v);
    result.append(')');
    return result.toString();
  }

} //ConditionImpl
