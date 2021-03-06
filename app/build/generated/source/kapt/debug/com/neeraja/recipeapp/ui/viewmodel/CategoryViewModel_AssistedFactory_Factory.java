package com.neeraja.recipeapp.ui.viewmodel;

import com.neeraja.recipeapp.data.AppDataManager;
import com.neeraja.recipeapp.utils.NetworkHelper;
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
public final class CategoryViewModel_AssistedFactory_Factory implements Factory<CategoryViewModel_AssistedFactory> {
  private final Provider<AppDataManager> dataManagerProvider;

  private final Provider<NetworkHelper> networkHelperProvider;

  public CategoryViewModel_AssistedFactory_Factory(Provider<AppDataManager> dataManagerProvider,
      Provider<NetworkHelper> networkHelperProvider) {
    this.dataManagerProvider = dataManagerProvider;
    this.networkHelperProvider = networkHelperProvider;
  }

  @Override
  public CategoryViewModel_AssistedFactory get() {
    return newInstance(dataManagerProvider, networkHelperProvider);
  }

  public static CategoryViewModel_AssistedFactory_Factory create(
      Provider<AppDataManager> dataManagerProvider, Provider<NetworkHelper> networkHelperProvider) {
    return new CategoryViewModel_AssistedFactory_Factory(dataManagerProvider, networkHelperProvider);
  }

  public static CategoryViewModel_AssistedFactory newInstance(Provider<AppDataManager> dataManager,
      Provider<NetworkHelper> networkHelper) {
    return new CategoryViewModel_AssistedFactory(dataManager, networkHelper);
  }
}
