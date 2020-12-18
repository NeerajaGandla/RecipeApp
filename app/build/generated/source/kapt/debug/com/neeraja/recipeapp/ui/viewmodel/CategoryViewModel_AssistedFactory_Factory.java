package com.neeraja.recipeapp.ui.viewmodel;

import com.neeraja.recipeapp.data.repository.CategoryRepository;
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
  private final Provider<CategoryRepository> categoryRepositoryProvider;

  private final Provider<NetworkHelper> networkHelperProvider;

  public CategoryViewModel_AssistedFactory_Factory(
      Provider<CategoryRepository> categoryRepositoryProvider,
      Provider<NetworkHelper> networkHelperProvider) {
    this.categoryRepositoryProvider = categoryRepositoryProvider;
    this.networkHelperProvider = networkHelperProvider;
  }

  @Override
  public CategoryViewModel_AssistedFactory get() {
    return newInstance(categoryRepositoryProvider, networkHelperProvider);
  }

  public static CategoryViewModel_AssistedFactory_Factory create(
      Provider<CategoryRepository> categoryRepositoryProvider,
      Provider<NetworkHelper> networkHelperProvider) {
    return new CategoryViewModel_AssistedFactory_Factory(categoryRepositoryProvider, networkHelperProvider);
  }

  public static CategoryViewModel_AssistedFactory newInstance(
      Provider<CategoryRepository> categoryRepository, Provider<NetworkHelper> networkHelper) {
    return new CategoryViewModel_AssistedFactory(categoryRepository, networkHelper);
  }
}
