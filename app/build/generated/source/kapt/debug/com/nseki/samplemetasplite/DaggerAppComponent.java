// Generated by Dagger (https://dagger.dev).
package com.nseki.samplemetasplite;

import android.content.Context;
import com.nseki.samplemetasplite.database.DatabaseModule_ProvideMetaDaoFactory;
import com.nseki.samplemetasplite.database.DatabaseModule_ProvideMetaDatabaseFactory;
import com.nseki.samplemetasplite.database.MetaDao;
import com.nseki.samplemetasplite.database.MetaDatabase;
import com.nseki.samplemetasplite.presentation.MainActivity;
import com.nseki.samplemetasplite.presentation.MainActivityModule_ContributeMainActivity;
import com.nseki.samplemetasplite.presentation.MainActivity_MembersInjector;
import com.nseki.samplemetasplite.presentation.MainViewModel;
import com.nseki.samplemetasplite.presentation.MainViewModel_Factory;
import com.nseki.samplemetasplite.presentation.ViewModelFactory;
import com.nseki.samplemetasplite.presentation.ViewModelFactory_Factory;
import dagger.android.AndroidInjector;
import dagger.android.DaggerApplication_MembersInjector;
import dagger.android.DispatchingAndroidInjector;
import dagger.android.DispatchingAndroidInjector_Factory;
import dagger.internal.DoubleCheck;
import dagger.internal.InstanceFactory;
import dagger.internal.Preconditions;
import java.util.Collections;
import java.util.Map;
import javax.inject.Provider;

@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class DaggerAppComponent implements AppComponent {
  private Provider<MainActivityModule_ContributeMainActivity.MainActivitySubcomponent.Factory> mainActivitySubcomponentFactoryProvider;

  private Provider<Context> contextProvider;

  private Provider<MetaDatabase> provideMetaDatabaseProvider;

  private Provider<MetaDao> provideMetaDaoProvider;

  private DaggerAppComponent(Context contextParam) {

    initialize(contextParam);
  }

  public static AppComponent.Factory factory() {
    return new Factory();
  }

  private Map<Class<?>, Provider<AndroidInjector.Factory<?>>> getMapOfClassOfAndProviderOfAndroidInjectorFactoryOf(
      ) {
    return Collections.<Class<?>, Provider<AndroidInjector.Factory<?>>>singletonMap(MainActivity.class, (Provider) mainActivitySubcomponentFactoryProvider);}

  private DispatchingAndroidInjector<Object> getDispatchingAndroidInjectorOfObject() {
    return DispatchingAndroidInjector_Factory.newInstance(getMapOfClassOfAndProviderOfAndroidInjectorFactoryOf(), Collections.<String, Provider<AndroidInjector.Factory<?>>>emptyMap());}

  @SuppressWarnings("unchecked")
  private void initialize(final Context contextParam) {
    this.mainActivitySubcomponentFactoryProvider = new Provider<MainActivityModule_ContributeMainActivity.MainActivitySubcomponent.Factory>() {
      @Override
      public MainActivityModule_ContributeMainActivity.MainActivitySubcomponent.Factory get() {
        return new MainActivitySubcomponentFactory();}
    };
    this.contextProvider = InstanceFactory.create(contextParam);
    this.provideMetaDatabaseProvider = DoubleCheck.provider(DatabaseModule_ProvideMetaDatabaseFactory.create(contextProvider));
    this.provideMetaDaoProvider = DatabaseModule_ProvideMetaDaoFactory.create(provideMetaDatabaseProvider);
  }

  @Override
  public void inject(App arg0) {
    injectApp(arg0);}

  private App injectApp(App instance) {
    DaggerApplication_MembersInjector.injectAndroidInjector(instance, getDispatchingAndroidInjectorOfObject());
    return instance;
  }

  private static final class Factory implements AppComponent.Factory {
    @Override
    public AppComponent newComponent(Context context) {
      Preconditions.checkNotNull(context);
      return new DaggerAppComponent(context);
    }
  }

  private final class MainActivitySubcomponentFactory implements MainActivityModule_ContributeMainActivity.MainActivitySubcomponent.Factory {
    @Override
    public MainActivityModule_ContributeMainActivity.MainActivitySubcomponent create(
        MainActivity arg0) {
      Preconditions.checkNotNull(arg0);
      return new MainActivitySubcomponentImpl(arg0);
    }
  }

  private final class MainActivitySubcomponentImpl implements MainActivityModule_ContributeMainActivity.MainActivitySubcomponent {
    private Provider<MainViewModel> mainViewModelProvider;

    private MainActivitySubcomponentImpl(MainActivity arg0) {

      initialize(arg0);
    }

    private ViewModelFactory<MainViewModel> getViewModelFactoryOfMainViewModel() {
      return ViewModelFactory_Factory.newInstance(mainViewModelProvider);}

    @SuppressWarnings("unchecked")
    private void initialize(final MainActivity arg0) {
      this.mainViewModelProvider = MainViewModel_Factory.create(DaggerAppComponent.this.provideMetaDatabaseProvider, DaggerAppComponent.this.provideMetaDaoProvider);
    }

    @Override
    public void inject(MainActivity arg0) {
      injectMainActivity(arg0);}

    private MainActivity injectMainActivity(MainActivity instance) {
      MainActivity_MembersInjector.injectViewModelFactory(instance, getViewModelFactoryOfMainViewModel());
      return instance;
    }
  }
}