package com.neeraja.recipeapp.ui.viewmodel;

import androidx.hilt.lifecycle.ViewModelInject;
import androidx.lifecycle.*;
import com.neeraja.recipeapp.utils.Resource;
import com.neeraja.recipeapp.data.AppDataManager;
import com.neeraja.recipeapp.data.model.api.CategoriesResponse;
import com.neeraja.recipeapp.utils.NetworkHelper;
import dagger.assisted.Assisted;
import dagger.assisted.AssistedInject;
import kotlinx.coroutines.Dispatchers;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0001\u001bB!\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bJ\b\u0010\u0017\u001a\u00020\u0018H\u0002J\b\u0010\u0015\u001a\u0004\u0018\u00010\nJ\u000e\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001a\u001a\u00020\nR\u000e\u0010\t\u001a\u00020\nX\u0082D\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u000b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\r0\fX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\n0\fX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001d\u0010\u0010\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\r0\u00118F\u00a2\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\n0\f\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001c"}, d2 = {"Lcom/neeraja/recipeapp/ui/viewmodel/CategoryViewModel;", "Landroidx/lifecycle/ViewModel;", "dataManager", "Lcom/neeraja/recipeapp/data/AppDataManager;", "networkHelper", "Lcom/neeraja/recipeapp/utils/NetworkHelper;", "state", "Landroidx/lifecycle/SavedStateHandle;", "(Lcom/neeraja/recipeapp/data/AppDataManager;Lcom/neeraja/recipeapp/utils/NetworkHelper;Landroidx/lifecycle/SavedStateHandle;)V", "SEARCH_TEXT_KEY", "", "_categories", "Landroidx/lifecycle/MutableLiveData;", "Lcom/neeraja/recipeapp/utils/Resource;", "Lcom/neeraja/recipeapp/data/model/api/CategoriesResponse;", "_searchText", "categories", "Landroidx/lifecycle/LiveData;", "getCategories", "()Landroidx/lifecycle/LiveData;", "searchText", "getSearchText", "()Landroidx/lifecycle/MutableLiveData;", "fetchCategories", "", "setSearchText", "value", "Factory", "app_debug"})
public final class CategoryViewModel extends androidx.lifecycle.ViewModel {
    private final java.lang.String SEARCH_TEXT_KEY = "SEARCH_TEXT";
    private final androidx.lifecycle.MutableLiveData<java.lang.String> _searchText = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<java.lang.String> searchText = null;
    private final androidx.lifecycle.MutableLiveData<com.neeraja.recipeapp.utils.Resource<com.neeraja.recipeapp.data.model.api.CategoriesResponse>> _categories = null;
    private final com.neeraja.recipeapp.data.AppDataManager dataManager = null;
    private final com.neeraja.recipeapp.utils.NetworkHelper networkHelper = null;
    private final androidx.lifecycle.SavedStateHandle state = null;
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.lang.String> getSearchText() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.neeraja.recipeapp.utils.Resource<com.neeraja.recipeapp.data.model.api.CategoriesResponse>> getCategories() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getSearchText() {
        return null;
    }
    
    public final void setSearchText(@org.jetbrains.annotations.NotNull()
    java.lang.String value) {
    }
    
    private final void fetchCategories() {
    }
    
    @dagger.assisted.AssistedInject()
    public CategoryViewModel(@org.jetbrains.annotations.NotNull()
    com.neeraja.recipeapp.data.AppDataManager dataManager, @org.jetbrains.annotations.NotNull()
    com.neeraja.recipeapp.utils.NetworkHelper networkHelper, @org.jetbrains.annotations.NotNull()
    @dagger.assisted.Assisted()
    androidx.lifecycle.SavedStateHandle state) {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\'\u0010\u0007\u001a\u0002H\b\"\n\b\u0000\u0010\b*\u0004\u0018\u00010\t2\f\u0010\n\u001a\b\u0012\u0004\u0012\u0002H\b0\u000bH\u0016\u00a2\u0006\u0002\u0010\fR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\r"}, d2 = {"Lcom/neeraja/recipeapp/ui/viewmodel/CategoryViewModel$Factory;", "Landroidx/lifecycle/ViewModelProvider$Factory;", "assistedFactory", "Lcom/neeraja/recipeapp/ui/viewmodel/CategoryViewModelFactory;", "state", "Landroidx/lifecycle/SavedStateHandle;", "(Lcom/neeraja/recipeapp/ui/viewmodel/CategoryViewModelFactory;Landroidx/lifecycle/SavedStateHandle;)V", "create", "T", "Landroidx/lifecycle/ViewModel;", "modelClass", "Ljava/lang/Class;", "(Ljava/lang/Class;)Landroidx/lifecycle/ViewModel;", "app_debug"})
    public static final class Factory implements androidx.lifecycle.ViewModelProvider.Factory {
        private final com.neeraja.recipeapp.ui.viewmodel.CategoryViewModelFactory assistedFactory = null;
        private final androidx.lifecycle.SavedStateHandle state = null;
        
        @java.lang.Override()
        public <T extends androidx.lifecycle.ViewModel>T create(@org.jetbrains.annotations.NotNull()
        java.lang.Class<T> modelClass) {
            return null;
        }
        
        public Factory(@org.jetbrains.annotations.NotNull()
        com.neeraja.recipeapp.ui.viewmodel.CategoryViewModelFactory assistedFactory, @org.jetbrains.annotations.NotNull()
        androidx.lifecycle.SavedStateHandle state) {
            super();
        }
    }
}