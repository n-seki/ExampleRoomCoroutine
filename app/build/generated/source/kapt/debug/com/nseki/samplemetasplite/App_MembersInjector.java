// Generated by Dagger (https://dagger.dev).
package com.nseki.samplemetasplite;

import dagger.MembersInjector;
import dagger.android.DaggerApplication_MembersInjector;
import dagger.android.DispatchingAndroidInjector;
import javax.inject.Provider;

@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class App_MembersInjector implements MembersInjector<App> {
  private final Provider<DispatchingAndroidInjector<Object>> androidInjectorProvider;

  public App_MembersInjector(Provider<DispatchingAndroidInjector<Object>> androidInjectorProvider) {
    this.androidInjectorProvider = androidInjectorProvider;
  }

  public static MembersInjector<App> create(
      Provider<DispatchingAndroidInjector<Object>> androidInjectorProvider) {
    return new App_MembersInjector(androidInjectorProvider);}

  @Override
  public void injectMembers(App instance) {
    DaggerApplication_MembersInjector.injectAndroidInjector(instance, androidInjectorProvider.get());
  }
}
