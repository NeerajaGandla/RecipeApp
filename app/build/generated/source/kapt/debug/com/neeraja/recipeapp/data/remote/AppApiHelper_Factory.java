package com.neeraja.recipeapp.data.remote;

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
public final class AppApiHelper_Factory implements Factory<AppApiHelper> {
  private final Provider<ApiService> apiServiceProvider;

  public AppApiHelper_Factory(Provider<ApiService> apiServiceProvider) {
    this.apiServiceProvider = apiServiceProvider;
  }

  @Override
  public AppApiHelper get() {
    return newInstance(apiServiceProvider.get());
  }

  public static AppApiHelper_Factory create(Provider<ApiService> apiServiceProvider) {
    return new AppApiHelper_Factory(apiServiceProvider);
  }

  public static AppApiHelper newInstance(ApiService apiService) {
    return new AppApiHelper(apiService);
  }
}
