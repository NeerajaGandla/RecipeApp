package com.neeraja.recipeapp.data;

import com.neeraja.recipeapp.data.local.DbHelper;
import com.neeraja.recipeapp.data.model.api.CategoriesResponse;
import com.neeraja.recipeapp.data.remote.ApiHelper;
import retrofit2.Response;
import javax.inject.Inject;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0017\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u0017\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bH\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\nR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u000b"}, d2 = {"Lcom/neeraja/recipeapp/data/AppDataManager;", "Lcom/neeraja/recipeapp/data/DataManager;", "apiHelper", "Lcom/neeraja/recipeapp/data/remote/ApiHelper;", "dbHelper", "Lcom/neeraja/recipeapp/data/local/DbHelper;", "(Lcom/neeraja/recipeapp/data/remote/ApiHelper;Lcom/neeraja/recipeapp/data/local/DbHelper;)V", "getCategories", "Lretrofit2/Response;", "Lcom/neeraja/recipeapp/data/model/api/CategoriesResponse;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_debug"})
public final class AppDataManager implements com.neeraja.recipeapp.data.DataManager {
    private final com.neeraja.recipeapp.data.remote.ApiHelper apiHelper = null;
    private final com.neeraja.recipeapp.data.local.DbHelper dbHelper = null;
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.Object getCategories(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<com.neeraja.recipeapp.data.model.api.CategoriesResponse>> p0) {
        return null;
    }
    
    @javax.inject.Inject()
    public AppDataManager(@org.jetbrains.annotations.NotNull()
    com.neeraja.recipeapp.data.remote.ApiHelper apiHelper, @org.jetbrains.annotations.NotNull()
    com.neeraja.recipeapp.data.local.DbHelper dbHelper) {
        super();
    }
}