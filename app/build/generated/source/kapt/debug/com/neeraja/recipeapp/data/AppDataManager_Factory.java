package com.neeraja.recipeapp.data;

import com.neeraja.recipeapp.data.local.DbHelper;
import com.neeraja.recipeapp.data.remote.ApiHelper;
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
public final class AppDataManager_Factory implements Factory<AppDataManager> {
  private final Provider<ApiHelper> apiHelperProvider;

  private final Provider<DbHelper> dbHelperProvider;

  public AppDataManager_Factory(Provider<ApiHelper> apiHelperProvider,
      Provider<DbHelper> dbHelperProvider) {
    this.apiHelperProvider = apiHelperProvider;
    this.dbHelperProvider = dbHelperProvider;
  }

  @Override
  public AppDataManager get() {
    return newInstance(apiHelperProvider.get(), dbHelperProvider.get());
  }

  public static AppDataManager_Factory create(Provider<ApiHelper> apiHelperProvider,
      Provider<DbHelper> dbHelperProvider) {
    return new AppDataManager_Factory(apiHelperProvider, dbHelperProvider);
  }

  public static AppDataManager newInstance(ApiHelper apiHelper, DbHelper dbHelper) {
    return new AppDataManager(apiHelper, dbHelper);
  }
}
