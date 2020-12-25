package com.neeraja.recipeapp.data.local;

import com.neeraja.recipeapp.data.model.db.Category;
import javax.inject.Inject;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\bJ\u001f\u0010\t\u001a\u00020\n2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\fR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\r"}, d2 = {"Lcom/neeraja/recipeapp/data/local/AppDbHelper;", "Lcom/neeraja/recipeapp/data/local/DbHelper;", "appDatabase", "Lcom/neeraja/recipeapp/data/local/AppDatabase;", "(Lcom/neeraja/recipeapp/data/local/AppDatabase;)V", "getCategories", "", "Lcom/neeraja/recipeapp/data/model/db/Category;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "saveCategories", "", "categories", "(Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_debug"})
public final class AppDbHelper implements com.neeraja.recipeapp.data.local.DbHelper {
    private final com.neeraja.recipeapp.data.local.AppDatabase appDatabase = null;
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.Object getCategories(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.util.List<com.neeraja.recipeapp.data.model.db.Category>> p0) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.Object saveCategories(@org.jetbrains.annotations.NotNull()
    java.util.List<com.neeraja.recipeapp.data.model.db.Category> categories, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> p1) {
        return null;
    }
    
    @javax.inject.Inject()
    public AppDbHelper(@org.jetbrains.annotations.NotNull()
    com.neeraja.recipeapp.data.local.AppDatabase appDatabase) {
        super();
    }
}