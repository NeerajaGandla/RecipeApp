package com.neeraja.recipeapp.data.local.dao;

import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.OnConflictStrategy;
import androidx.room.Query;
import com.neeraja.recipeapp.data.model.db.Category;
import io.reactivex.Single;

@androidx.room.Dao()
@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bg\u0018\u00002\u00020\u0001J\u001a\u0010\u0002\u001a\u00020\u00032\u0010\u0010\u0004\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0006\u0018\u00010\u0005H\'J\u001a\u0010\u0007\u001a\u0014\u0012\u000e\u0012\f\u0012\u0006\u0012\u0004\u0018\u00010\u0006\u0018\u00010\u0005\u0018\u00010\bH\'\u00a8\u0006\t"}, d2 = {"Lcom/neeraja/recipeapp/data/local/dao/CategoryDao;", "", "insertAll", "", "options", "", "Lcom/neeraja/recipeapp/data/model/db/Category;", "loadAll", "Lio/reactivex/Single;", "app_debug"})
public abstract interface CategoryDao {
    
    @androidx.room.Insert(onConflict = androidx.room.OnConflictStrategy.REPLACE)
    public abstract void insertAll(@org.jetbrains.annotations.Nullable()
    java.util.List<com.neeraja.recipeapp.data.model.db.Category> options);
    
    @org.jetbrains.annotations.Nullable()
    @androidx.room.Query(value = "SELECT * FROM categories")
    public abstract io.reactivex.Single<java.util.List<com.neeraja.recipeapp.data.model.db.Category>> loadAll();
}