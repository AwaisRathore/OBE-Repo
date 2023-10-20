/**
 */
package ObeModel.provider;

import ObeModel.OBERootNode;
import ObeModel.ObeModelFactory;
import ObeModel.ObeModelPackage;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ItemProviderAdapter;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link ObeModel.OBERootNode} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class OBERootNodeItemProvider extends ItemProviderAdapter implements IEditingDomainItemProvider,
		IStructuredItemContentProvider, ITreeItemContentProvider, IItemLabelProvider, IItemPropertySource {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OBERootNodeItemProvider(AdapterFactory adapterFactory) {
		super(adapterFactory);
	}

	/**
	 * This returns the property descriptors for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<IItemPropertyDescriptor> getPropertyDescriptors(Object object) {
		if (itemPropertyDescriptors == null) {
			super.getPropertyDescriptors(object);

		}
		return itemPropertyDescriptors;
	}

	/**
	 * This specifies how to implement {@link #getChildren} and is used to deduce an appropriate feature for an
	 * {@link org.eclipse.emf.edit.command.AddCommand}, {@link org.eclipse.emf.edit.command.RemoveCommand} or
	 * {@link org.eclipse.emf.edit.command.MoveCommand} in {@link #createCommand}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Collection<? extends EStructuralFeature> getChildrenFeatures(Object object) {
		if (childrenFeatures == null) {
			super.getChildrenFeatures(object);
			childrenFeatures.add(ObeModelPackage.Literals.OBE_ROOT_NODE__INSTITUTES);
			childrenFeatures.add(ObeModelPackage.Literals.OBE_ROOT_NODE__VISIONS);
			childrenFeatures.add(ObeModelPackage.Literals.OBE_ROOT_NODE__MISSIONS);
			childrenFeatures.add(ObeModelPackage.Literals.OBE_ROOT_NODE__PEOS);
			childrenFeatures.add(ObeModelPackage.Literals.OBE_ROOT_NODE__COURSES);
			childrenFeatures.add(ObeModelPackage.Literals.OBE_ROOT_NODE__BATCHES);
			childrenFeatures.add(ObeModelPackage.Literals.OBE_ROOT_NODE__PROGRAMS);
			childrenFeatures.add(ObeModelPackage.Literals.OBE_ROOT_NODE__PLOS);
			childrenFeatures.add(ObeModelPackage.Literals.OBE_ROOT_NODE__STUDENTS);
			childrenFeatures.add(ObeModelPackage.Literals.OBE_ROOT_NODE__ACTIVITTIES);
			childrenFeatures.add(ObeModelPackage.Literals.OBE_ROOT_NODE__CLOS);
			childrenFeatures.add(ObeModelPackage.Literals.OBE_ROOT_NODE__LEARNINGLEVELS);
			childrenFeatures.add(ObeModelPackage.Literals.OBE_ROOT_NODE__RESULTS);
		}
		return childrenFeatures;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EStructuralFeature getChildFeature(Object object, Object child) {
		// Check the type of the specified child object and return the proper feature to use for
		// adding (see {@link AddCommand}) it as a child.

		return super.getChildFeature(object, child);
	}

	/**
	 * This returns OBERootNode.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/OBERootNode"));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected boolean shouldComposeCreationImage() {
		return true;
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		return getString("_UI_OBERootNode_type");
	}

	/**
	 * This handles model notifications by calling {@link #updateChildren} to update any cached
	 * children and by creating a viewer notification, which it passes to {@link #fireNotifyChanged}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void notifyChanged(Notification notification) {
		updateChildren(notification);

		switch (notification.getFeatureID(OBERootNode.class)) {
		case ObeModelPackage.OBE_ROOT_NODE__INSTITUTES:
		case ObeModelPackage.OBE_ROOT_NODE__VISIONS:
		case ObeModelPackage.OBE_ROOT_NODE__MISSIONS:
		case ObeModelPackage.OBE_ROOT_NODE__PEOS:
		case ObeModelPackage.OBE_ROOT_NODE__COURSES:
		case ObeModelPackage.OBE_ROOT_NODE__BATCHES:
		case ObeModelPackage.OBE_ROOT_NODE__PROGRAMS:
		case ObeModelPackage.OBE_ROOT_NODE__PLOS:
		case ObeModelPackage.OBE_ROOT_NODE__STUDENTS:
		case ObeModelPackage.OBE_ROOT_NODE__ACTIVITTIES:
		case ObeModelPackage.OBE_ROOT_NODE__CLOS:
		case ObeModelPackage.OBE_ROOT_NODE__LEARNINGLEVELS:
		case ObeModelPackage.OBE_ROOT_NODE__RESULTS:
			fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), true, false));
			return;
		}
		super.notifyChanged(notification);
	}

	/**
	 * This adds {@link org.eclipse.emf.edit.command.CommandParameter}s describing the children
	 * that can be created under this object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected void collectNewChildDescriptors(Collection<Object> newChildDescriptors, Object object) {
		super.collectNewChildDescriptors(newChildDescriptors, object);

		newChildDescriptors.add(createChildParameter(ObeModelPackage.Literals.OBE_ROOT_NODE__INSTITUTES,
				ObeModelFactory.eINSTANCE.createInstitute()));

		newChildDescriptors.add(createChildParameter(ObeModelPackage.Literals.OBE_ROOT_NODE__VISIONS,
				ObeModelFactory.eINSTANCE.createVision()));

		newChildDescriptors.add(createChildParameter(ObeModelPackage.Literals.OBE_ROOT_NODE__MISSIONS,
				ObeModelFactory.eINSTANCE.createMission()));

		newChildDescriptors.add(createChildParameter(ObeModelPackage.Literals.OBE_ROOT_NODE__PEOS,
				ObeModelFactory.eINSTANCE.createPEO()));

		newChildDescriptors.add(createChildParameter(ObeModelPackage.Literals.OBE_ROOT_NODE__COURSES,
				ObeModelFactory.eINSTANCE.createCourses()));

		newChildDescriptors.add(createChildParameter(ObeModelPackage.Literals.OBE_ROOT_NODE__BATCHES,
				ObeModelFactory.eINSTANCE.createBatches()));

		newChildDescriptors.add(createChildParameter(ObeModelPackage.Literals.OBE_ROOT_NODE__PROGRAMS,
				ObeModelFactory.eINSTANCE.createProgram()));

		newChildDescriptors.add(createChildParameter(ObeModelPackage.Literals.OBE_ROOT_NODE__PLOS,
				ObeModelFactory.eINSTANCE.createPlo()));

		newChildDescriptors.add(createChildParameter(ObeModelPackage.Literals.OBE_ROOT_NODE__STUDENTS,
				ObeModelFactory.eINSTANCE.createStudent()));

		newChildDescriptors.add(createChildParameter(ObeModelPackage.Literals.OBE_ROOT_NODE__ACTIVITTIES,
				ObeModelFactory.eINSTANCE.createActivity()));

		newChildDescriptors.add(createChildParameter(ObeModelPackage.Literals.OBE_ROOT_NODE__CLOS,
				ObeModelFactory.eINSTANCE.createCLO()));

		newChildDescriptors.add(createChildParameter(ObeModelPackage.Literals.OBE_ROOT_NODE__LEARNINGLEVELS,
				ObeModelFactory.eINSTANCE.createLearningLevels()));

		newChildDescriptors.add(createChildParameter(ObeModelPackage.Literals.OBE_ROOT_NODE__RESULTS,
				ObeModelFactory.eINSTANCE.createResults()));
	}

	/**
	 * Return the resource locator for this item provider's resources.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		return ObeModelEditPlugin.INSTANCE;
	}

}
