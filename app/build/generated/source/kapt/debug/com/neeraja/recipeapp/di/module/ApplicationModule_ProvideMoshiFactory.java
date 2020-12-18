package com.neeraja.recipeapp.di.module;

import com.squareup.moshi.Moshi;
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
public final class ApplicationModule_ProvideMoshiFactory implements Factory<Moshi> {
  private final ApplicationModule module;

  public ApplicationModule_ProvideMoshiFactory(ApplicationModule module) {
    this.module = module;
  }

  @Override
  public Moshi get() {
    return provideMoshi(module);
  }

  public static ApplicationModule_ProvideMoshiFactory create(ApplicationModule module) {
    return new ApplicationModule_ProvideMoshiFactory(module);
  }

  public static Moshi provideMoshi(ApplicationModule instance) {
    return Preconditions.checkNotNull(instance.provideMoshi(), "Cannot return null from a non-@Nullable @Provides method");
  }
}
