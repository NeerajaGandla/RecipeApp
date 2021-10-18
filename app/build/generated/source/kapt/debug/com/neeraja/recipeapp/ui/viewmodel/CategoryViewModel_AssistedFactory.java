package com.neeraja.recipeapp.ui.viewmodel;

import androidx.annotation.NonNull;
import androidx.hilt.lifecycle.ViewModelAssistedFactory;
import androidx.lifecycle.SavedStateHandle;
import com.neeraja.recipeapp.data.AppDataManager;
import com.neeraja.recipeapp.utils.NetworkHelper;
import java.lang.Override;
import javax.inject.Inject;
import javax.inject.Provider;

public final class CategoryViewModel_AssistedFactory implements ViewModelAssistedFactory<CategoryViewModel> {
  private final Provider<AppDataManager> dataManager;

  private final Provider<NetworkHelper> networkHelper;

  @Inject
  CategoryViewModel_AssistedFactory(Provider<AppDataManager> dataManager,
      Provider<NetworkHelper> networkHelper) {
    this.dataManager = dataManager;
    this.networkHelper = networkHelper;
  }

  @Override
  @NonNull
  public CategoryViewModel create(SavedStateHandle handle) {
    return new CategoryViewModel(dataManager.get(), networkHelper.get());
  }
}
