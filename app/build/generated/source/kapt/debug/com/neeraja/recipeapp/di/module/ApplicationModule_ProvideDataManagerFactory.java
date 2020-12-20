package com.neeraja.recipeapp.di.module;

import com.neeraja.recipeapp.data.AppDataManager;
import com.neeraja.recipeapp.data.DataManager;
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
public final class ApplicationModule_ProvideDataManagerFactory implements Factory<DataManager> {
  private final ApplicationModule module;

  private final Provider<AppDataManager> dataManagerProvider;

  public ApplicationModule_ProvideDataManagerFactory(ApplicationModule module,
      Provider<AppDataManager> dataManagerProvider) {
    this.module = module;
    this.dataManagerProvider = dataManagerProvider;
  }

  @Override
  public DataManager get() {
    return provideDataManager(module, dataManagerProvider.get());
  }

  public static ApplicationModule_ProvideDataManagerFactory create(ApplicationModule module,
      Provider<AppDataManager> dataManagerProvider) {
    return new ApplicationModule_ProvideDataManagerFactory(module, dataManagerProvider);
  }

  public static DataManager provideDataManager(ApplicationModule instance,
      AppDataManager dataManager) {
    return Preconditions.checkNotNull(instance.provideDataManager(dataManager), "Cannot return null from a non-@Nullable @Provides method");
  }
}
