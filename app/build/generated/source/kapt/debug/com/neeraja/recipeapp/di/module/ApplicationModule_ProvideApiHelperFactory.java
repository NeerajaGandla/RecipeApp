// Generated by Dagger (https://dagger.dev).
package com.neeraja.recipeapp.di.module;

import com.neeraja.recipeapp.data.remote.ApiHelper;
import com.neeraja.recipeapp.data.remote.AppApiHelper;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.inject.Provider;

@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class ApplicationModule_ProvideApiHelperFactory implements Factory<ApiHelper> {
  private final ApplicationModule module;

  private final Provider<AppApiHelper> apiHelperProvider;

  public ApplicationModule_ProvideApiHelperFactory(ApplicationModule module,
      Provider<AppApiHelper> apiHelperProvider) {
    this.module = module;
    this.apiHelperProvider = apiHelperProvider;
  }

  @Override
  public ApiHelper get() {
    return provideApiHelper(module, apiHelperProvider.get());
  }

  public static ApplicationModule_ProvideApiHelperFactory create(ApplicationModule module,
      Provider<AppApiHelper> apiHelperProvider) {
    return new ApplicationModule_ProvideApiHelperFactory(module, apiHelperProvider);
  }

  public static ApiHelper provideApiHelper(ApplicationModule instance, AppApiHelper apiHelper) {
    return Preconditions.checkNotNullFromProvides(instance.provideApiHelper(apiHelper));
  }
}
