// Generated by Dagger (https://dagger.dev).
package com.nseki.samplemetasplite.database;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.inject.Provider;

@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class DatabaseModule_ProvideMetaDaoFactory implements Factory<MetaDao> {
  private final Provider<MetaDatabase> databaseProvider;

  public DatabaseModule_ProvideMetaDaoFactory(Provider<MetaDatabase> databaseProvider) {
    this.databaseProvider = databaseProvider;
  }

  @Override
  public MetaDao get() {
    return provideMetaDao(databaseProvider.get());
  }

  public static DatabaseModule_ProvideMetaDaoFactory create(
      Provider<MetaDatabase> databaseProvider) {
    return new DatabaseModule_ProvideMetaDaoFactory(databaseProvider);
  }

  public static MetaDao provideMetaDao(MetaDatabase database) {
    return Preconditions.checkNotNull(DatabaseModule.INSTANCE.provideMetaDao(database), "Cannot return null from a non-@Nullable @Provides method");
  }
}
