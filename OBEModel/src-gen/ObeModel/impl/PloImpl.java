/**
 */
package ObeModel.impl;

import ObeModel.CLO;
import ObeModel.ObeModelPackage;
import ObeModel.PEO;
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
 * An implementation of the model object '<em><b>Plo</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ObeModel.impl.PloImpl#getTitle <em>Title</em>}</li>
 *   <li>{@link ObeModel.impl.PloImpl#getClosMapping <em>Clos Mapping</em>}</li>
 *   <li>{@link ObeModel.impl.PloImpl#getPeo <em>Peo</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PloImpl extends MinimalEObjectImpl.Container implements Plo {
	/**
	 * The default value of the '{@link #getTitle() <em>Title</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTitle()
	 * @generated
	 * @ordered
	 */
	protected static final String TITLE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTitle() <em>Title</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTitle()
	 * @generated
	 * @ordered
	 */
	protected String title = TITLE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getClosMapping() <em>Clos Mapping</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClosMapping()
	 * @generated
	 * @ordered
	 */
	protected EList<CLO> closMapping;

	/**
	 * The cached value of the '{@link #getPeo() <em>Peo</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPeo()
	 * @generated
	 * @ordered
	 */
	protected PEO peo;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PloImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ObeModelPackage.Literals.PLO;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTitle() {
		return title;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTitle(String newTitle) {
		String oldTitle = title;
		title = newTitle;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ObeModelPackage.PLO__TITLE, oldTitle, title));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CLO> getClosMapping() {
		if (closMapping == null) {
			closMapping = new EObjectWithInverseResolvingEList<CLO>(CLO.class, this, ObeModelPackage.PLO__CLOS_MAPPING,
					ObeModelPackage.CLO__MAPTOPLO);
		}
		return closMapping;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PEO getPeo() {
		if (peo != null && peo.eIsProxy()) {
			InternalEObject oldPeo = (InternalEObject) peo;
			peo = (PEO) eResolveProxy(oldPeo);
			if (peo != oldPeo) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ObeModelPackage.PLO__PEO, oldPeo, peo));
			}
		}
		return peo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PEO basicGetPeo() {
		return peo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPeo(PEO newPeo, NotificationChain msgs) {
		PEO oldPeo = peo;
		peo = newPeo;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ObeModelPackage.PLO__PEO,
					oldPeo, newPeo);
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
	public void setPeo(PEO newPeo) {
		if (newPeo != peo) {
			NotificationChain msgs = null;
			if (peo != null)
				msgs = ((InternalEObject) peo).eInverseRemove(this, ObeModelPackage.PEO__PLOS, PEO.class, msgs);
			if (newPeo != null)
				msgs = ((InternalEObject) newPeo).eInverseAdd(this, ObeModelPackage.PEO__PLOS, PEO.class, msgs);
			msgs = basicSetPeo(newPeo, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ObeModelPackage.PLO__PEO, newPeo, newPeo));
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
		case ObeModelPackage.PLO__CLOS_MAPPING:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getClosMapping()).basicAdd(otherEnd, msgs);
		case ObeModelPackage.PLO__PEO:
			if (peo != null)
				msgs = ((InternalEObject) peo).eInverseRemove(this, ObeModelPackage.PEO__PLOS, PEO.class, msgs);
			return basicSetPeo((PEO) otherEnd, msgs);
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
		case ObeModelPackage.PLO__CLOS_MAPPING:
			return ((InternalEList<?>) getClosMapping()).basicRemove(otherEnd, msgs);
		case ObeModelPackage.PLO__PEO:
			return basicSetPeo(null, msgs);
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
		case ObeModelPackage.PLO__TITLE:
			return getTitle();
		case ObeModelPackage.PLO__CLOS_MAPPING:
			return getClosMapping();
		case ObeModelPackage.PLO__PEO:
			if (resolve)
				return getPeo();
			return basicGetPeo();
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
		case ObeModelPackage.PLO__TITLE:
			setTitle((String) newValue);
			return;
		case ObeModelPackage.PLO__CLOS_MAPPING:
			getClosMapping().clear();
			getClosMapping().addAll((Collection<? extends CLO>) newValue);
			return;
		case ObeModelPackage.PLO__PEO:
			setPeo((PEO) newValue);
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
		case ObeModelPackage.PLO__TITLE:
			setTitle(TITLE_EDEFAULT);
			return;
		case ObeModelPackage.PLO__CLOS_MAPPING:
			getClosMapping().clear();
			return;
		case ObeModelPackage.PLO__PEO:
			setPeo((PEO) null);
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
		case ObeModelPackage.PLO__TITLE:
			return TITLE_EDEFAULT == null ? title != null : !TITLE_EDEFAULT.equals(title);
		case ObeModelPackage.PLO__CLOS_MAPPING:
			return closMapping != null && !closMapping.isEmpty();
		case ObeModelPackage.PLO__PEO:
			return peo != null;
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
		result.append(" (Title: ");
		result.append(title);
		result.append(')');
		return result.toString();
	}

} //PloImpl
