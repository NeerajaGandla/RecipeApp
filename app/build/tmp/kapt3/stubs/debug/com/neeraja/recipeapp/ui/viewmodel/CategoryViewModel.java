package com.neeraja.recipeapp.ui.viewmodel;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0017\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\b\u0010\u0010\u001a\u00020\u0011H\u0002R \u0010\u0007\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\n0\t0\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R#\u0010\f\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\n0\t0\r8F\u00a2\u0006\u0006\u001a\u0004\b\u000e\u0010\u000fR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0012"}, d2 = {"Lcom/neeraja/recipeapp/ui/viewmodel/CategoryViewModel;", "Landroidx/lifecycle/ViewModel;", "categoryRepository", "Lcom/neeraja/recipeapp/data/repository/CategoryRepository;", "networkHelper", "Lcom/neeraja/recipeapp/utils/NetworkHelper;", "(Lcom/neeraja/recipeapp/data/repository/CategoryRepository;Lcom/neeraja/recipeapp/utils/NetworkHelper;)V", "_categories", "Landroidx/lifecycle/MutableLiveData;", "Lcom/mindorks/framework/mvvm/utils/Resource;", "", "Lcom/neeraja/recipeapp/data/model/Category;", "categories", "Landroidx/lifecycle/LiveData;", "getCategories", "()Landroidx/lifecycle/LiveData;", "fetchCategories", "", "app_debug"})
public final class CategoryViewModel extends androidx.lifecycle.ViewModel {
    private final androidx.lifecycle.MutableLiveData<com.mindorks.framework.mvvm.utils.Resource<java.util.List<com.neeraja.recipeapp.data.model.Category>>> _categories = null;
    private final com.neeraja.recipeapp.data.repository.CategoryRepository categoryRepository = null;
    private final com.neeraja.recipeapp.utils.NetworkHelper networkHelper = null;
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.mindorks.framework.mvvm.utils.Resource<java.util.List<com.neeraja.recipeapp.data.model.Category>>> getCategories() {
        return null;
    }
    
    private final void fetchCategories() {
    }
    
    @androidx.hilt.lifecycle.ViewModelInject()
    public CategoryViewModel(@org.jetbrains.annotations.NotNull()
    com.neeraja.recipeapp.data.repository.CategoryRepository categoryRepository, @org.jetbrains.annotations.NotNull()
    com.neeraja.recipeapp.utils.NetworkHelper networkHelper) {
        super();
    }
}