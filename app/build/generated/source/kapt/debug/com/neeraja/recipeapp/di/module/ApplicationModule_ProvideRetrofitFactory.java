package com.neeraja.recipeapp.di.module;

import com.squareup.moshi.Moshi;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import javax.inject.Provider;
import okhttp3.OkHttpClient;
import retrofit2.Retrofit;

@Generated(
    value = "dagger.internal.codegen.ComponentProcessor",
    comments = "https://dagger.dev"
)
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class ApplicationModule_ProvideRetrofitFactory implements Factory<Retrofit> {
  private final ApplicationModule module;

  private final Provider<OkHttpClient> okHttpClientProvider;

  private final Provider<String> bASE_URLProvider;

  private final Provider<Moshi> moshiProvider;

  public ApplicationModule_ProvideRetrofitFactory(ApplicationModule module,
      Provider<OkHttpClient> okHttpClientProvider, Provider<String> bASE_URLProvider,
      Provider<Moshi> moshiProvider) {
    this.module = module;
    this.okHttpClientProvider = okHttpClientProvider;
    this.bASE_URLProvider = bASE_URLProvider;
    this.moshiProvider = moshiProvider;
  }

  @Override
  public Retrofit get() {
    return provideRetrofit(module, okHttpClientProvider.get(), bASE_URLProvider.get(), moshiProvider.get());
  }

  public static ApplicationModule_ProvideRetrofitFactory create(ApplicationModule module,
      Provider<OkHttpClient> okHttpClientProvider, Provider<String> bASE_URLProvider,
      Provider<Moshi> moshiProvider) {
    return new ApplicationModule_ProvideRetrofitFactory(module, okHttpClientProvider, bASE_URLProvider, moshiProvider);
  }

  public static Retrofit provideRetrofit(ApplicationModule instance, OkHttpClient okHttpClient,
      String BASE_URL, Moshi moshi) {
    return Preconditions.checkNotNull(instance.provideRetrofit(okHttpClient, BASE_URL, moshi), "Cannot return null from a non-@Nullable @Provides method");
  }
}
