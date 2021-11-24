package com.neeraja.recipeapp.ui.viewmodel;

import android.os.Bundle;
import androidx.lifecycle.*;
import androidx.savedstate.SavedStateRegistryOwner;
import com.neeraja.recipeapp.utils.Resource;
import com.neeraja.recipeapp.data.AppDataManager;
import com.neeraja.recipeapp.data.model.api.CategoriesResponse;
import com.neeraja.recipeapp.utils.NetworkHelper;
import dagger.assisted.Assisted;
import dagger.assisted.AssistedInject;
import dagger.hilt.android.lifecycle.HiltViewModel;
import kotlinx.coroutines.Dispatchers;
import javax.inject.Inject;

@dagger.hilt.android.lifecycle.HiltViewModel()
@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0017\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\b\u0010\u0014\u001a\u00020\u0015H\u0002J\u000e\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0017\u001a\u00020\fR\u001a\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t0\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001d\u0010\r\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t0\u000e8F\u00a2\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\f0\b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013\u00a8\u0006\u0018"}, d2 = {"Lcom/neeraja/recipeapp/ui/viewmodel/CategoryViewModel;", "Landroidx/lifecycle/ViewModel;", "dataManager", "Lcom/neeraja/recipeapp/data/AppDataManager;", "networkHelper", "Lcom/neeraja/recipeapp/utils/NetworkHelper;", "(Lcom/neeraja/recipeapp/data/AppDataManager;Lcom/neeraja/recipeapp/utils/NetworkHelper;)V", "_categories", "Landroidx/lifecycle/MutableLiveData;", "Lcom/neeraja/recipeapp/utils/Resource;", "Lcom/neeraja/recipeapp/data/model/api/CategoriesResponse;", "_searchText", "", "categories", "Landroidx/lifecycle/LiveData;", "getCategories", "()Landroidx/lifecycle/LiveData;", "searchText", "getSearchText", "()Landroidx/lifecycle/MutableLiveData;", "fetchCategories", "", "setSearchText", "value", "app_debug"})
public final class CategoryViewModel extends androidx.lifecycle.ViewModel {
    private final androidx.lifecycle.MutableLiveData<java.lang.String> _searchText = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<java.lang.String> searchText = null;
    private final androidx.lifecycle.MutableLiveData<com.neeraja.recipeapp.utils.Resource<com.neeraja.recipeapp.data.model.api.CategoriesResponse>> _categories = null;
    private final com.neeraja.recipeapp.data.AppDataManager dataManager = null;
    private final com.neeraja.recipeapp.utils.NetworkHelper networkHelper = null;
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.lang.String> getSearchText() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.neeraja.recipeapp.utils.Resource<com.neeraja.recipeapp.data.model.api.CategoriesResponse>> getCategories() {
        return null;
    }
    
    public final void setSearchText(@org.jetbrains.annotations.NotNull()
    java.lang.String value) {
    }
    
    private final void fetchCategories() {
    }
    
    @javax.inject.Inject()
    public CategoryViewModel(@org.jetbrains.annotations.NotNull()
    com.neeraja.recipeapp.data.AppDataManager dataManager, @org.jetbrains.annotations.NotNull()
    com.neeraja.recipeapp.utils.NetworkHelper networkHelper) {
        super();
    }
}