package com.neeraja.recipeapp.di.module;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;

@Generated(
    value = "dagger.internal.codegen.ComponentProcessor",
    comments = "https://dagger.dev"
)
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class ApplicationModule_ProvideDatabaseNameFactory implements Factory<String> {
  private final ApplicationModule module;

  public ApplicationModule_ProvideDatabaseNameFactory(ApplicationModule module) {
    this.module = module;
  }

  @Override
  public String get() {
    return provideDatabaseName(module);
  }

  public static ApplicationModule_ProvideDatabaseNameFactory create(ApplicationModule module) {
    return new ApplicationModule_ProvideDatabaseNameFactory(module);
  }

  public static String provideDatabaseName(ApplicationModule instance) {
    return Preconditions.checkNotNull(instance.provideDatabaseName(), "Cannot return null from a non-@Nullable @Provides method");
  }
}
