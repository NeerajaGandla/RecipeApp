package com.neeraja.recipeapp.data.repository;

import com.neeraja.recipeapp.data.api.ApiHelper;
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
public final class CategoryRepository_Factory implements Factory<CategoryRepository> {
  private final Provider<ApiHelper> apiHelperProvider;

  public CategoryRepository_Factory(Provider<ApiHelper> apiHelperProvider) {
    this.apiHelperProvider = apiHelperProvider;
  }

  @Override
  public CategoryRepository get() {
    return newInstance(apiHelperProvider.get());
  }

  public static CategoryRepository_Factory create(Provider<ApiHelper> apiHelperProvider) {
    return new CategoryRepository_Factory(apiHelperProvider);
  }

  public static CategoryRepository newInstance(ApiHelper apiHelper) {
    return new CategoryRepository(apiHelper);
  }
}
