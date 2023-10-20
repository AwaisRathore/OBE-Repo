/**
 */
package ObeModel.impl;

import ObeModel.Activity;
import ObeModel.CLO;
import ObeModel.LearningLevels;
import ObeModel.ObeModelPackage;
import ObeModel.Plo;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>CLO</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ObeModel.impl.CLOImpl#getStatement <em>Statement</em>}</li>
 *   <li>{@link ObeModel.impl.CLOImpl#getLearninglevels <em>Learninglevels</em>}</li>
 *   <li>{@link ObeModel.impl.CLOImpl#getActivity <em>Activity</em>}</li>
 *   <li>{@link ObeModel.impl.CLOImpl#getMaptoplo <em>Maptoplo</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CLOImpl extends MinimalEObjectImpl.Container implements CLO {
	/**
	 * The default value of the '{@link #getStatement() <em>Statement</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStatement()
	 * @generated
	 * @ordered
	 */
	protected static final String STATEMENT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getStatement() <em>Statement</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStatement()
	 * @generated
	 * @ordered
	 */
	protected String statement = STATEMENT_EDEFAULT;

	/**
	 * The cached value of the '{@link #getLearninglevels() <em>Learninglevels</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLearninglevels()
	 * @generated
	 * @ordered
	 */
	protected LearningLevels learninglevels;

	/**
	 * The cached value of the '{@link #getActivity() <em>Activity</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActivity()
	 * @generated
	 * @ordered
	 */
	protected EList<Activity> activity;

	/**
	 * The cached value of the '{@link #getMaptoplo() <em>Maptoplo</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaptoplo()
	 * @generated
	 * @ordered
	 */
	protected Plo maptoplo;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CLOImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ObeModelPackage.Literals.CLO;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getStatement() {
		return statement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStatement(String newStatement) {
		String oldStatement = statement;
		statement = newStatement;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ObeModelPackage.CLO__STATEMENT, oldStatement,
					statement));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LearningLevels getLearninglevels() {
		if (learninglevels != null && learninglevels.eIsProxy()) {
			InternalEObject oldLearninglevels = (InternalEObject) learninglevels;
			learninglevels = (LearningLevels) eResolveProxy(oldLearninglevels);
			if (learninglevels != oldLearninglevels) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ObeModelPackage.CLO__LEARNINGLEVELS,
							oldLearninglevels, learninglevels));
			}
		}
		return learninglevels;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LearningLevels basicGetLearninglevels() {
		return learninglevels;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLearninglevels(LearningLevels newLearninglevels, NotificationChain msgs) {
		LearningLevels oldLearninglevels = learninglevels;
		learninglevels = newLearninglevels;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					ObeModelPackage.CLO__LEARNINGLEVELS, oldLearninglevels, newLearninglevels);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLearninglevels(LearningLevels newLearninglevels) {
		if (newLearninglevels != learninglevels) {
			NotificationChain msgs = null;
			if (learninglevels != null)
				msgs = ((InternalEObject) learninglevels).eInverseRemove(this, ObeModelPackage.LEARNING_LEVELS__CLO,
						LearningLevels.class, msgs);
			if (newLearninglevels != null)
				msgs = ((InternalEObject) newLearninglevels).eInverseAdd(this, ObeModelPackage.LEARNING_LEVELS__CLO,
						LearningLevels.class, msgs);
			msgs = basicSetLearninglevels(newLearninglevels, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ObeModelPackage.CLO__LEARNINGLEVELS,
					newLearninglevels, newLearninglevels));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Activity> getActivity() {
		if (activity == null) {
			activity = new EObjectWithInverseResolvingEList<Activity>(Activity.class, this,
					ObeModelPackage.CLO__ACTIVITY, ObeModelPackage.ACTIVITY__CLO);
		}
		return activity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Plo getMaptoplo() {
		if (maptoplo != null && maptoplo.eIsProxy()) {
			InternalEObject oldMaptoplo = (InternalEObject) maptoplo;
			maptoplo = (Plo) eResolveProxy(oldMaptoplo);
			if (maptoplo != oldMaptoplo) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ObeModelPackage.CLO__MAPTOPLO,
							oldMaptoplo, maptoplo));
			}
		}
		return maptoplo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Plo basicGetMaptoplo() {
		return maptoplo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMaptoplo(Plo newMaptoplo, NotificationChain msgs) {
		Plo oldMaptoplo = maptoplo;
		maptoplo = newMaptoplo;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					ObeModelPackage.CLO__MAPTOPLO, oldMaptoplo, newMaptoplo);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMaptoplo(Plo newMaptoplo) {
		if (newMaptoplo != maptoplo) {
			NotificationChain msgs = null;
			if (maptoplo != null)
				msgs = ((InternalEObject) maptoplo).eInverseRemove(this, ObeModelPackage.PLO__CLOS_MAPPING, Plo.class,
						msgs);
			if (newMaptoplo != null)
				msgs = ((InternalEObject) newMaptoplo).eInverseAdd(this, ObeModelPackage.PLO__CLOS_MAPPING, Plo.class,
						msgs);
			msgs = basicSetMaptoplo(newMaptoplo, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ObeModelPackage.CLO__MAPTOPLO, newMaptoplo,
					newMaptoplo));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case ObeModelPackage.CLO__LEARNINGLEVELS:
			if (learninglevels != null)
				msgs = ((InternalEObject) learninglevels).eInverseRemove(this, ObeModelPackage.LEARNING_LEVELS__CLO,
						LearningLevels.class, msgs);
			return basicSetLearninglevels((LearningLevels) otherEnd, msgs);
		case ObeModelPackage.CLO__ACTIVITY:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getActivity()).basicAdd(otherEnd, msgs);
		case ObeModelPackage.CLO__MAPTOPLO:
			if (maptoplo != null)
				msgs = ((InternalEObject) maptoplo).eInverseRemove(this, ObeModelPackage.PLO__CLOS_MAPPING, Plo.class,
						msgs);
			return basicSetMaptoplo((Plo) otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case ObeModelPackage.CLO__LEARNINGLEVELS:
			return basicSetLearninglevels(null, msgs);
		case ObeModelPackage.CLO__ACTIVITY:
			return ((InternalEList<?>) getActivity()).basicRemove(otherEnd, msgs);
		case ObeModelPackage.CLO__MAPTOPLO:
			return basicSetMaptoplo(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case ObeModelPackage.CLO__STATEMENT:
			return getStatement();
		case ObeModelPackage.CLO__LEARNINGLEVELS:
			if (resolve)
				return getLearninglevels();
			return basicGetLearninglevels();
		case ObeModelPackage.CLO__ACTIVITY:
			return getActivity();
		case ObeModelPackage.CLO__MAPTOPLO:
			if (resolve)
				return getMaptoplo();
			return basicGetMaptoplo();
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
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case ObeModelPackage.CLO__STATEMENT:
			setStatement((String) newValue);
			return;
		case ObeModelPackage.CLO__LEARNINGLEVELS:
			setLearninglevels((LearningLevels) newValue);
			return;
		case ObeModelPackage.CLO__ACTIVITY:
			getActivity().clear();
			getActivity().addAll((Collection<? extends Activity>) newValue);
			return;
		case ObeModelPackage.CLO__MAPTOPLO:
			setMaptoplo((Plo) newValue);
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
	public void eUnset(int featureID) {
		switch (featureID) {
		case ObeModelPackage.CLO__STATEMENT:
			setStatement(STATEMENT_EDEFAULT);
			return;
		case ObeModelPackage.CLO__LEARNINGLEVELS:
			setLearninglevels((LearningLevels) null);
			return;
		case ObeModelPackage.CLO__ACTIVITY:
			getActivity().clear();
			return;
		case ObeModelPackage.CLO__MAPTOPLO:
			setMaptoplo((Plo) null);
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
	public boolean eIsSet(int featureID) {
		switch (featureID) {
		case ObeModelPackage.CLO__STATEMENT:
			return STATEMENT_EDEFAULT == null ? statement != null : !STATEMENT_EDEFAULT.equals(statement);
		case ObeModelPackage.CLO__LEARNINGLEVELS:
			return learninglevels != null;
		case ObeModelPackage.CLO__ACTIVITY:
			return activity != null && !activity.isEmpty();
		case ObeModelPackage.CLO__MAPTOPLO:
			return maptoplo != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy())
			return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (Statement: ");
		result.append(statement);
		result.append(')');
		return result.toString();
	}

} //CLOImpl
