package com.neeraja.recipeapp.di.module;

import android.content.Context;
import com.neeraja.recipeapp.data.local.AppDatabase;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
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
public final class ApplicationModule_ProvideAppDatabaseFactory implements Factory<AppDatabase> {
  private final ApplicationModule module;

  private final Provider<String> dbNameProvider;

  private final Provider<Context> contextProvider;

  public ApplicationModule_ProvideAppDatabaseFactory(ApplicationModule module,
      Provider<String> dbNameProvider, Provider<Context> contextProvider) {
    this.module = module;
    this.dbNameProvider = dbNameProvider;
    this.contextProvider = contextProvider;
  }

  @Override
  public AppDatabase get() {
    return provideAppDatabase(module, dbNameProvider.get(), contextProvider.get());
  }

  public static ApplicationModule_ProvideAppDatabaseFactory create(ApplicationModule module,
      Provider<String> dbNameProvider, Provider<Context> contextProvider) {
    return new ApplicationModule_ProvideAppDatabaseFactory(module, dbNameProvider, contextProvider);
  }

  public static AppDatabase provideAppDatabase(ApplicationModule instance, String dbName,
      Context context) {
    return Preconditions.checkNotNull(instance.provideAppDatabase(dbName, context), "Cannot return null from a non-@Nullable @Provides method");
  }
}
