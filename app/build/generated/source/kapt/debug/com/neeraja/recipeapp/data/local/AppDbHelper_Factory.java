package com.neeraja.recipeapp.data.local;

import dagger.internal.Factory;
import javax.annotation.Generated;
import javax.inject.Provider;

@Generated(
    value = "dagger.internal.codegen.ComponentProcessor",
    comments = "https://dagger.dev"
)
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class AppDbHelper_Factory implements Factory<AppDbHelper> {
  private final Provider<AppDatabase> appDatabaseProvider;

  public AppDbHelper_Factory(Provider<AppDatabase> appDatabaseProvider) {
    this.appDatabaseProvider = appDatabaseProvider;
  }

  @Override
  public AppDbHelper get() {
    return newInstance(appDatabaseProvider.get());
  }

  public static AppDbHelper_Factory create(Provider<AppDatabase> appDatabaseProvider) {
    return new AppDbHelper_Factory(appDatabaseProvider);
  }

  public static AppDbHelper newInstance(AppDatabase appDatabase) {
    return new AppDbHelper(appDatabase);
  }
}
