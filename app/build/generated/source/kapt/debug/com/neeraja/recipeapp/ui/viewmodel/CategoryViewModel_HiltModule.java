package com.neeraja.recipeapp.ui.viewmodel;

import androidx.hilt.lifecycle.ViewModelAssistedFactory;
import androidx.lifecycle.ViewModel;
import dagger.Binds;
import dagger.Module;
import dagger.hilt.InstallIn;
import dagger.hilt.android.components.ActivityRetainedComponent;
import dagger.hilt.codegen.OriginatingElement;
import dagger.multibindings.IntoMap;
import dagger.multibindings.StringKey;
import javax.annotation.Generated;

@Generated("androidx.hilt.AndroidXHiltProcessor")
@Module
@InstallIn(ActivityRetainedComponent.class)
@OriginatingElement(
    topLevelClass = CategoryViewModel.class
)
public interface CategoryViewModel_HiltModule {
  @Binds
  @IntoMap
  @StringKey("com.neeraja.recipeapp.ui.viewmodel.CategoryViewModel")
  ViewModelAssistedFactory<? extends ViewModel> bind(CategoryViewModel_AssistedFactory factory);
}
