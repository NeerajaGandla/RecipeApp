package com.neeraja.recipeapp.data.repository;

import com.neeraja.recipeapp.data.remote.ApiHelper;
import javax.inject.Inject;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\bR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\t"}, d2 = {"Lcom/neeraja/recipeapp/data/repository/CategoryRepository;", "", "apiHelper", "Lcom/neeraja/recipeapp/data/remote/ApiHelper;", "(Lcom/neeraja/recipeapp/data/remote/ApiHelper;)V", "getCategories", "Lretrofit2/Response;", "Lcom/neeraja/recipeapp/data/model/api/CategoriesResponse;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_debug"})
public final class CategoryRepository {
    private final com.neeraja.recipeapp.data.remote.ApiHelper apiHelper = null;
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object getCategories(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<com.neeraja.recipeapp.data.model.api.CategoriesResponse>> p0) {
        return null;
    }
    
    @javax.inject.Inject()
    public CategoryRepository(@org.jetbrains.annotations.NotNull()
    com.neeraja.recipeapp.data.remote.ApiHelper apiHelper) {
        super();
    }
}