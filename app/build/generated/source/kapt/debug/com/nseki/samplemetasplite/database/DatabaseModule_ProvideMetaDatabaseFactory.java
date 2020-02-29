// Generated by Dagger (https://dagger.dev).
package com.nseki.samplemetasplite.database;

import android.content.Context;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.inject.Provider;

@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class DatabaseModule_ProvideMetaDatabaseFactory implements Factory<MetaDatabase> {
  private final Provider<Context> contextProvider;

  public DatabaseModule_ProvideMetaDatabaseFactory(Provider<Context> contextProvider) {
    this.contextProvider = contextProvider;
  }

  @Override
  public MetaDatabase get() {
    return provideMetaDatabase(contextProvider.get());
  }

  public static DatabaseModule_ProvideMetaDatabaseFactory create(
      Provider<Context> contextProvider) {
    return new DatabaseModule_ProvideMetaDatabaseFactory(contextProvider);
  }

  public static MetaDatabase provideMetaDatabase(Context context) {
    return Preconditions.checkNotNull(DatabaseModule.INSTANCE.provideMetaDatabase(context), "Cannot return null from a non-@Nullable @Provides method");
  }
}