/**
 */
package ObeModel.provider;

import ObeModel.util.ObeModelAdapterFactory;

import java.util.ArrayList;
import java.util.Collection;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.edit.provider.ChangeNotifier;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.ComposedAdapterFactory;
import org.eclipse.emf.edit.provider.IChangeNotifier;
import org.eclipse.emf.edit.provider.IDisposable;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.INotifyChangedListener;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;

/**
 * This is the factory that is used to provide the interfaces needed to support Viewers.
 * The adapters generated by this factory convert EMF adapter notifications into calls to {@link #fireNotifyChanged fireNotifyChanged}.
 * The adapters also support Eclipse property sheets.
 * Note that most of the adapters are shared among multiple instances.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class ObeModelItemProviderAdapterFactory extends ObeModelAdapterFactory
		implements ComposeableAdapterFactory, IChangeNotifier, IDisposable {
	/**
	 * This keeps track of the root adapter factory that delegates to this adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ComposedAdapterFactory parentAdapterFactory;

	/**
	 * This is used to implement {@link org.eclipse.emf.edit.provider.IChangeNotifier}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IChangeNotifier changeNotifier = new ChangeNotifier();

	/**
	 * This keeps track of all the supported types checked by {@link #isFactoryForType isFactoryForType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Collection<Object> supportedTypes = new ArrayList<Object>();

	/**
	 * This constructs an instance.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ObeModelItemProviderAdapterFactory() {
		supportedTypes.add(IEditingDomainItemProvider.class);
		supportedTypes.add(IStructuredItemContentProvider.class);
		supportedTypes.add(ITreeItemContentProvider.class);
		supportedTypes.add(IItemLabelProvider.class);
		supportedTypes.add(IItemPropertySource.class);
	}

	/**
	 * This keeps track of the one adapter used for all {@link ObeModel.OBERootNode} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OBERootNodeItemProvider obeRootNodeItemProvider;

	/**
	 * This creates an adapter for a {@link ObeModel.OBERootNode}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createOBERootNodeAdapter() {
		if (obeRootNodeItemProvider == null) {
			obeRootNodeItemProvider = new OBERootNodeItemProvider(this);
		}

		return obeRootNodeItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link ObeModel.Institute} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected InstituteItemProvider instituteItemProvider;

	/**
	 * This creates an adapter for a {@link ObeModel.Institute}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createInstituteAdapter() {
		if (instituteItemProvider == null) {
			instituteItemProvider = new InstituteItemProvider(this);
		}

		return instituteItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link ObeModel.Vision} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected VisionItemProvider visionItemProvider;

	/**
	 * This creates an adapter for a {@link ObeModel.Vision}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createVisionAdapter() {
		if (visionItemProvider == null) {
			visionItemProvider = new VisionItemProvider(this);
		}

		return visionItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link ObeModel.Mission} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MissionItemProvider missionItemProvider;

	/**
	 * This creates an adapter for a {@link ObeModel.Mission}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createMissionAdapter() {
		if (missionItemProvider == null) {
			missionItemProvider = new MissionItemProvider(this);
		}

		return missionItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link ObeModel.Program} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ProgramItemProvider programItemProvider;

	/**
	 * This creates an adapter for a {@link ObeModel.Program}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createProgramAdapter() {
		if (programItemProvider == null) {
			programItemProvider = new ProgramItemProvider(this);
		}

		return programItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link ObeModel.PEO} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PEOItemProvider peoItemProvider;

	/**
	 * This creates an adapter for a {@link ObeModel.PEO}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createPEOAdapter() {
		if (peoItemProvider == null) {
			peoItemProvider = new PEOItemProvider(this);
		}

		return peoItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link ObeModel.Plo} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PloItemProvider ploItemProvider;

	/**
	 * This creates an adapter for a {@link ObeModel.Plo}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createPloAdapter() {
		if (ploItemProvider == null) {
			ploItemProvider = new PloItemProvider(this);
		}

		return ploItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link ObeModel.Courses} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CoursesItemProvider coursesItemProvider;

	/**
	 * This creates an adapter for a {@link ObeModel.Courses}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createCoursesAdapter() {
		if (coursesItemProvider == null) {
			coursesItemProvider = new CoursesItemProvider(this);
		}

		return coursesItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link ObeModel.Batches} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BatchesItemProvider batchesItemProvider;

	/**
	 * This creates an adapter for a {@link ObeModel.Batches}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createBatchesAdapter() {
		if (batchesItemProvider == null) {
			batchesItemProvider = new BatchesItemProvider(this);
		}

		return batchesItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link ObeModel.Student} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StudentItemProvider studentItemProvider;

	/**
	 * This creates an adapter for a {@link ObeModel.Student}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createStudentAdapter() {
		if (studentItemProvider == null) {
			studentItemProvider = new StudentItemProvider(this);
		}

		return studentItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link ObeModel.CLO} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CLOItemProvider cloItemProvider;

	/**
	 * This creates an adapter for a {@link ObeModel.CLO}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createCLOAdapter() {
		if (cloItemProvider == null) {
			cloItemProvider = new CLOItemProvider(this);
		}

		return cloItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link ObeModel.LearningLevels} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LearningLevelsItemProvider learningLevelsItemProvider;

	/**
	 * This creates an adapter for a {@link ObeModel.LearningLevels}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createLearningLevelsAdapter() {
		if (learningLevelsItemProvider == null) {
			learningLevelsItemProvider = new LearningLevelsItemProvider(this);
		}

		return learningLevelsItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link ObeModel.Activity} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ActivityItemProvider activityItemProvider;

	/**
	 * This creates an adapter for a {@link ObeModel.Activity}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createActivityAdapter() {
		if (activityItemProvider == null) {
			activityItemProvider = new ActivityItemProvider(this);
		}

		return activityItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link ObeModel.Results} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ResultsItemProvider resultsItemProvider;

	/**
	 * This creates an adapter for a {@link ObeModel.Results}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createResultsAdapter() {
		if (resultsItemProvider == null) {
			resultsItemProvider = new ResultsItemProvider(this);
		}

		return resultsItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link ObeModel.Assesment} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AssesmentItemProvider assesmentItemProvider;

	/**
	 * This creates an adapter for a {@link ObeModel.Assesment}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createAssesmentAdapter() {
		if (assesmentItemProvider == null) {
			assesmentItemProvider = new AssesmentItemProvider(this);
		}

		return assesmentItemProvider;
	}

	/**
	 * This returns the root adapter factory that contains this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComposeableAdapterFactory getRootAdapterFactory() {
		return parentAdapterFactory == null ? this : parentAdapterFactory.getRootAdapterFactory();
	}

	/**
	 * This sets the composed adapter factory that contains this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParentAdapterFactory(ComposedAdapterFactory parentAdapterFactory) {
		this.parentAdapterFactory = parentAdapterFactory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object type) {
		return supportedTypes.contains(type) || super.isFactoryForType(type);
	}

	/**
	 * This implementation substitutes the factory itself as the key for the adapter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter adapt(Notifier notifier, Object type) {
		return super.adapt(notifier, this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object adapt(Object object, Object type) {
		if (isFactoryForType(type)) {
			Object adapter = super.adapt(object, type);
			if (!(type instanceof Class<?>) || (((Class<?>) type).isInstance(adapter))) {
				return adapter;
			}
		}

		return null;
	}

	/**
	 * This adds a listener.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void addListener(INotifyChangedListener notifyChangedListener) {
		changeNotifier.addListener(notifyChangedListener);
	}

	/**
	 * This removes a listener.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void removeListener(INotifyChangedListener notifyChangedListener) {
		changeNotifier.removeListener(notifyChangedListener);
	}

	/**
	 * This delegates to {@link #changeNotifier} and to {@link #parentAdapterFactory}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void fireNotifyChanged(Notification notification) {
		changeNotifier.fireNotifyChanged(notification);

		if (parentAdapterFactory != null) {
			parentAdapterFactory.fireNotifyChanged(notification);
		}
	}

	/**
	 * This disposes all of the item providers created by this factory. 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void dispose() {
		if (obeRootNodeItemProvider != null)
			obeRootNodeItemProvider.dispose();
		if (instituteItemProvider != null)
			instituteItemProvider.dispose();
		if (visionItemProvider != null)
			visionItemProvider.dispose();
		if (missionItemProvider != null)
			missionItemProvider.dispose();
		if (programItemProvider != null)
			programItemProvider.dispose();
		if (peoItemProvider != null)
			peoItemProvider.dispose();
		if (ploItemProvider != null)
			ploItemProvider.dispose();
		if (coursesItemProvider != null)
			coursesItemProvider.dispose();
		if (batchesItemProvider != null)
			batchesItemProvider.dispose();
		if (studentItemProvider != null)
			studentItemProvider.dispose();
		if (cloItemProvider != null)
			cloItemProvider.dispose();
		if (learningLevelsItemProvider != null)
			learningLevelsItemProvider.dispose();
		if (activityItemProvider != null)
			activityItemProvider.dispose();
		if (resultsItemProvider != null)
			resultsItemProvider.dispose();
		if (assesmentItemProvider != null)
			assesmentItemProvider.dispose();
	}

}
