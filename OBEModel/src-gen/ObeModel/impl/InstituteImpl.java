/**
 */
package ObeModel.impl;

import ObeModel.Institute;
import ObeModel.InstituteLevel;
import ObeModel.Mission;
import ObeModel.ObeModelPackage;
import ObeModel.Program;
import ObeModel.Vision;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Institute</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ObeModel.impl.InstituteImpl#getName <em>Name</em>}</li>
 *   <li>{@link ObeModel.impl.InstituteImpl#getInstituteLevel <em>Institute Level</em>}</li>
 *   <li>{@link ObeModel.impl.InstituteImpl#getAssociatedvision <em>Associatedvision</em>}</li>
 *   <li>{@link ObeModel.impl.InstituteImpl#getOfferprograms <em>Offerprograms</em>}</li>
 *   <li>{@link ObeModel.impl.InstituteImpl#getParentInstitute <em>Parent Institute</em>}</li>
 *   <li>{@link ObeModel.impl.InstituteImpl#getAssociatedmission <em>Associatedmission</em>}</li>
 * </ul>
 *
 * @generated
 */
public class InstituteImpl extends MinimalEObjectImpl.Container implements Institute {
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getInstituteLevel() <em>Institute Level</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInstituteLevel()
	 * @generated
	 * @ordered
	 */
	protected static final InstituteLevel INSTITUTE_LEVEL_EDEFAULT = InstituteLevel.UNIVERSITY;

	/**
	 * The cached value of the '{@link #getInstituteLevel() <em>Institute Level</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInstituteLevel()
	 * @generated
	 * @ordered
	 */
	protected InstituteLevel instituteLevel = INSTITUTE_LEVEL_EDEFAULT;

	/**
	 * The cached value of the '{@link #getAssociatedvision() <em>Associatedvision</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAssociatedvision()
	 * @generated
	 * @ordered
	 */
	protected Vision associatedvision;

	/**
	 * The cached value of the '{@link #getOfferprograms() <em>Offerprograms</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOfferprograms()
	 * @generated
	 * @ordered
	 */
	protected EList<Program> offerprograms;

	/**
	 * The cached value of the '{@link #getParentInstitute() <em>Parent Institute</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParentInstitute()
	 * @generated
	 * @ordered
	 */
	protected Institute parentInstitute;

	/**
	 * The cached value of the '{@link #getAssociatedmission() <em>Associatedmission</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAssociatedmission()
	 * @generated
	 * @ordered
	 */
	protected Mission associatedmission;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected InstituteImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ObeModelPackage.Literals.INSTITUTE;
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
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ObeModelPackage.INSTITUTE__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InstituteLevel getInstituteLevel() {
		return instituteLevel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInstituteLevel(InstituteLevel newInstituteLevel) {
		InstituteLevel oldInstituteLevel = instituteLevel;
		instituteLevel = newInstituteLevel == null ? INSTITUTE_LEVEL_EDEFAULT : newInstituteLevel;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ObeModelPackage.INSTITUTE__INSTITUTE_LEVEL,
					oldInstituteLevel, instituteLevel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Vision getAssociatedvision() {
		if (associatedvision != null && associatedvision.eIsProxy()) {
			InternalEObject oldAssociatedvision = (InternalEObject) associatedvision;
			associatedvision = (Vision) eResolveProxy(oldAssociatedvision);
			if (associatedvision != oldAssociatedvision) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							ObeModelPackage.INSTITUTE__ASSOCIATEDVISION, oldAssociatedvision, associatedvision));
			}
		}
		return associatedvision;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Vision basicGetAssociatedvision() {
		return associatedvision;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAssociatedvision(Vision newAssociatedvision) {
		Vision oldAssociatedvision = associatedvision;
		associatedvision = newAssociatedvision;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ObeModelPackage.INSTITUTE__ASSOCIATEDVISION,
					oldAssociatedvision, associatedvision));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Program> getOfferprograms() {
		if (offerprograms == null) {
			offerprograms = new EObjectResolvingEList<Program>(Program.class, this,
					ObeModelPackage.INSTITUTE__OFFERPROGRAMS);
		}
		return offerprograms;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Institute getParentInstitute() {
		if (parentInstitute != null && parentInstitute.eIsProxy()) {
			InternalEObject oldParentInstitute = (InternalEObject) parentInstitute;
			parentInstitute = (Institute) eResolveProxy(oldParentInstitute);
			if (parentInstitute != oldParentInstitute) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							ObeModelPackage.INSTITUTE__PARENT_INSTITUTE, oldParentInstitute, parentInstitute));
			}
		}
		return parentInstitute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Institute basicGetParentInstitute() {
		return parentInstitute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParentInstitute(Institute newParentInstitute) {
		Institute oldParentInstitute = parentInstitute;
		parentInstitute = newParentInstitute;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ObeModelPackage.INSTITUTE__PARENT_INSTITUTE,
					oldParentInstitute, parentInstitute));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Mission getAssociatedmission() {
		if (associatedmission != null && associatedmission.eIsProxy()) {
			InternalEObject oldAssociatedmission = (InternalEObject) associatedmission;
			associatedmission = (Mission) eResolveProxy(oldAssociatedmission);
			if (associatedmission != oldAssociatedmission) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							ObeModelPackage.INSTITUTE__ASSOCIATEDMISSION, oldAssociatedmission, associatedmission));
			}
		}
		return associatedmission;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Mission basicGetAssociatedmission() {
		return associatedmission;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAssociatedmission(Mission newAssociatedmission, NotificationChain msgs) {
		Mission oldAssociatedmission = associatedmission;
		associatedmission = newAssociatedmission;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					ObeModelPackage.INSTITUTE__ASSOCIATEDMISSION, oldAssociatedmission, newAssociatedmission);
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
	public void setAssociatedmission(Mission newAssociatedmission) {
		if (newAssociatedmission != associatedmission) {
			NotificationChain msgs = null;
			if (associatedmission != null)
				msgs = ((InternalEObject) associatedmission).eInverseRemove(this, ObeModelPackage.MISSION__INSTITUTE,
						Mission.class, msgs);
			if (newAssociatedmission != null)
				msgs = ((InternalEObject) newAssociatedmission).eInverseAdd(this, ObeModelPackage.MISSION__INSTITUTE,
						Mission.class, msgs);
			msgs = basicSetAssociatedmission(newAssociatedmission, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ObeModelPackage.INSTITUTE__ASSOCIATEDMISSION,
					newAssociatedmission, newAssociatedmission));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case ObeModelPackage.INSTITUTE__ASSOCIATEDMISSION:
			if (associatedmission != null)
				msgs = ((InternalEObject) associatedmission).eInverseRemove(this, ObeModelPackage.MISSION__INSTITUTE,
						Mission.class, msgs);
			return basicSetAssociatedmission((Mission) otherEnd, msgs);
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
		case ObeModelPackage.INSTITUTE__ASSOCIATEDMISSION:
			return basicSetAssociatedmission(null, msgs);
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
		case ObeModelPackage.INSTITUTE__NAME:
			return getName();
		case ObeModelPackage.INSTITUTE__INSTITUTE_LEVEL:
			return getInstituteLevel();
		case ObeModelPackage.INSTITUTE__ASSOCIATEDVISION:
			if (resolve)
				return getAssociatedvision();
			return basicGetAssociatedvision();
		case ObeModelPackage.INSTITUTE__OFFERPROGRAMS:
			return getOfferprograms();
		case ObeModelPackage.INSTITUTE__PARENT_INSTITUTE:
			if (resolve)
				return getParentInstitute();
			return basicGetParentInstitute();
		case ObeModelPackage.INSTITUTE__ASSOCIATEDMISSION:
			if (resolve)
				return getAssociatedmission();
			return basicGetAssociatedmission();
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
		case ObeModelPackage.INSTITUTE__NAME:
			setName((String) newValue);
			return;
		case ObeModelPackage.INSTITUTE__INSTITUTE_LEVEL:
			setInstituteLevel((InstituteLevel) newValue);
			return;
		case ObeModelPackage.INSTITUTE__ASSOCIATEDVISION:
			setAssociatedvision((Vision) newValue);
			return;
		case ObeModelPackage.INSTITUTE__OFFERPROGRAMS:
			getOfferprograms().clear();
			getOfferprograms().addAll((Collection<? extends Program>) newValue);
			return;
		case ObeModelPackage.INSTITUTE__PARENT_INSTITUTE:
			setParentInstitute((Institute) newValue);
			return;
		case ObeModelPackage.INSTITUTE__ASSOCIATEDMISSION:
			setAssociatedmission((Mission) newValue);
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
		case ObeModelPackage.INSTITUTE__NAME:
			setName(NAME_EDEFAULT);
			return;
		case ObeModelPackage.INSTITUTE__INSTITUTE_LEVEL:
			setInstituteLevel(INSTITUTE_LEVEL_EDEFAULT);
			return;
		case ObeModelPackage.INSTITUTE__ASSOCIATEDVISION:
			setAssociatedvision((Vision) null);
			return;
		case ObeModelPackage.INSTITUTE__OFFERPROGRAMS:
			getOfferprograms().clear();
			return;
		case ObeModelPackage.INSTITUTE__PARENT_INSTITUTE:
			setParentInstitute((Institute) null);
			return;
		case ObeModelPackage.INSTITUTE__ASSOCIATEDMISSION:
			setAssociatedmission((Mission) null);
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
		case ObeModelPackage.INSTITUTE__NAME:
			return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
		case ObeModelPackage.INSTITUTE__INSTITUTE_LEVEL:
			return instituteLevel != INSTITUTE_LEVEL_EDEFAULT;
		case ObeModelPackage.INSTITUTE__ASSOCIATEDVISION:
			return associatedvision != null;
		case ObeModelPackage.INSTITUTE__OFFERPROGRAMS:
			return offerprograms != null && !offerprograms.isEmpty();
		case ObeModelPackage.INSTITUTE__PARENT_INSTITUTE:
			return parentInstitute != null;
		case ObeModelPackage.INSTITUTE__ASSOCIATEDMISSION:
			return associatedmission != null;
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
		result.append(" (Name: ");
		result.append(name);
		result.append(", InstituteLevel: ");
		result.append(instituteLevel);
		result.append(')');
		return result.toString();
	}

} //InstituteImpl
