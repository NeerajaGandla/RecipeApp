package com.neeraja.recipeapp.ui.viewmodel;

import androidx.annotation.NonNull;
import androidx.hilt.lifecycle.ViewModelAssistedFactory;
import androidx.lifecycle.SavedStateHandle;
import com.neeraja.recipeapp.data.repository.CategoryRepository;
import com.neeraja.recipeapp.utils.NetworkHelper;
import java.lang.Override;
import javax.annotation.Generated;
import javax.inject.Inject;
import javax.inject.Provider;

@Generated("androidx.hilt.AndroidXHiltProcessor")
public final class CategoryViewModel_AssistedFactory implements ViewModelAssistedFactory<CategoryViewModel> {
  private final Provider<CategoryRepository> categoryRepository;

  private final Provider<NetworkHelper> networkHelper;

  @Inject
  CategoryViewModel_AssistedFactory(Provider<CategoryRepository> categoryRepository,
      Provider<NetworkHelper> networkHelper) {
    this.categoryRepository = categoryRepository;
    this.networkHelper = networkHelper;
  }

  @Override
  @NonNull
  public CategoryViewModel create(@NonNull SavedStateHandle arg0) {
    return new CategoryViewModel(categoryRepository.get(), networkHelper.get());
  }
}
