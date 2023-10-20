/**
 */
package ObeModel.impl;

import ObeModel.CLO;
import ObeModel.LearningDomain;
import ObeModel.LearningLevels;
import ObeModel.ObeModelPackage;

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
 * An implementation of the model object '<em><b>Learning Levels</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ObeModel.impl.LearningLevelsImpl#getLevel <em>Level</em>}</li>
 *   <li>{@link ObeModel.impl.LearningLevelsImpl#getDomain <em>Domain</em>}</li>
 *   <li>{@link ObeModel.impl.LearningLevelsImpl#getClo <em>Clo</em>}</li>
 * </ul>
 *
 * @generated
 */
public class LearningLevelsImpl extends MinimalEObjectImpl.Container implements LearningLevels {
	/**
	 * The default value of the '{@link #getLevel() <em>Level</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLevel()
	 * @generated
	 * @ordered
	 */
	protected static final String LEVEL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLevel() <em>Level</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLevel()
	 * @generated
	 * @ordered
	 */
	protected String level = LEVEL_EDEFAULT;

	/**
	 * The default value of the '{@link #getDomain() <em>Domain</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDomain()
	 * @generated
	 * @ordered
	 */
	protected static final LearningDomain DOMAIN_EDEFAULT = LearningDomain.COGNITIVE;

	/**
	 * The cached value of the '{@link #getDomain() <em>Domain</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDomain()
	 * @generated
	 * @ordered
	 */
	protected LearningDomain domain = DOMAIN_EDEFAULT;

	/**
	 * The cached value of the '{@link #getClo() <em>Clo</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClo()
	 * @generated
	 * @ordered
	 */
	protected EList<CLO> clo;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LearningLevelsImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ObeModelPackage.Literals.LEARNING_LEVELS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLevel() {
		return level;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLevel(String newLevel) {
		String oldLevel = level;
		level = newLevel;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ObeModelPackage.LEARNING_LEVELS__LEVEL, oldLevel,
					level));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LearningDomain getDomain() {
		return domain;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDomain(LearningDomain newDomain) {
		LearningDomain oldDomain = domain;
		domain = newDomain == null ? DOMAIN_EDEFAULT : newDomain;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ObeModelPackage.LEARNING_LEVELS__DOMAIN, oldDomain,
					domain));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CLO> getClo() {
		if (clo == null) {
			clo = new EObjectWithInverseResolvingEList<CLO>(CLO.class, this, ObeModelPackage.LEARNING_LEVELS__CLO,
					ObeModelPackage.CLO__LEARNINGLEVELS);
		}
		return clo;
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
		case ObeModelPackage.LEARNING_LEVELS__CLO:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getClo()).basicAdd(otherEnd, msgs);
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
		case ObeModelPackage.LEARNING_LEVELS__CLO:
			return ((InternalEList<?>) getClo()).basicRemove(otherEnd, msgs);
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
		case ObeModelPackage.LEARNING_LEVELS__LEVEL:
			return getLevel();
		case ObeModelPackage.LEARNING_LEVELS__DOMAIN:
			return getDomain();
		case ObeModelPackage.LEARNING_LEVELS__CLO:
			return getClo();
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
		case ObeModelPackage.LEARNING_LEVELS__LEVEL:
			setLevel((String) newValue);
			return;
		case ObeModelPackage.LEARNING_LEVELS__DOMAIN:
			setDomain((LearningDomain) newValue);
			return;
		case ObeModelPackage.LEARNING_LEVELS__CLO:
			getClo().clear();
			getClo().addAll((Collection<? extends CLO>) newValue);
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
		case ObeModelPackage.LEARNING_LEVELS__LEVEL:
			setLevel(LEVEL_EDEFAULT);
			return;
		case ObeModelPackage.LEARNING_LEVELS__DOMAIN:
			setDomain(DOMAIN_EDEFAULT);
			return;
		case ObeModelPackage.LEARNING_LEVELS__CLO:
			getClo().clear();
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
		case ObeModelPackage.LEARNING_LEVELS__LEVEL:
			return LEVEL_EDEFAULT == null ? level != null : !LEVEL_EDEFAULT.equals(level);
		case ObeModelPackage.LEARNING_LEVELS__DOMAIN:
			return domain != DOMAIN_EDEFAULT;
		case ObeModelPackage.LEARNING_LEVELS__CLO:
			return clo != null && !clo.isEmpty();
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
		result.append(" (Level: ");
		result.append(level);
		result.append(", domain: ");
		result.append(domain);
		result.append(')');
		return result.toString();
	}

} //LearningLevelsImpl
