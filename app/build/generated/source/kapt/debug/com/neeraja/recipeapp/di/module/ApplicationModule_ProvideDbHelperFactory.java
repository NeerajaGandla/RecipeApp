// Generated by Dagger (https://dagger.dev).
package com.neeraja.recipeapp.di.module;

import com.neeraja.recipeapp.data.local.AppDbHelper;
import com.neeraja.recipeapp.data.local.DbHelper;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.inject.Provider;

@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class ApplicationModule_ProvideDbHelperFactory implements Factory<DbHelper> {
  private final ApplicationModule module;

  private final Provider<AppDbHelper> dbHelperProvider;

  public ApplicationModule_ProvideDbHelperFactory(ApplicationModule module,
      Provider<AppDbHelper> dbHelperProvider) {
    this.module = module;
    this.dbHelperProvider = dbHelperProvider;
  }

  @Override
  public DbHelper get() {
    return provideDbHelper(module, dbHelperProvider.get());
  }

  public static ApplicationModule_ProvideDbHelperFactory create(ApplicationModule module,
      Provider<AppDbHelper> dbHelperProvider) {
    return new ApplicationModule_ProvideDbHelperFactory(module, dbHelperProvider);
  }

  public static DbHelper provideDbHelper(ApplicationModule instance, AppDbHelper dbHelper) {
    return Preconditions.checkNotNullFromProvides(instance.provideDbHelper(dbHelper));
  }
}
