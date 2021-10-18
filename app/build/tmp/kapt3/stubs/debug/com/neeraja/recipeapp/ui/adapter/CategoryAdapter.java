package com.neeraja.recipeapp.ui.adapter;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.neeraja.recipeapp.data.model.db.Category;
import com.neeraja.recipeapp.databinding.CategoryItemLayoutBinding;
import com.neeraja.recipeapp.ui.view.fragments.CategoriesFragmentDirections;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\f\u0012\b\u0012\u00060\u0002R\u00020\u00000\u0001:\u0001\u0015B\u001d\u0012\u0016\u0010\u0003\u001a\u0012\u0012\u0004\u0012\u00020\u00050\u0004j\b\u0012\u0004\u0012\u00020\u0005`\u0006\u00a2\u0006\u0002\u0010\u0007J\u0014\u0010\b\u001a\u00020\t2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00050\u000bJ\b\u0010\f\u001a\u00020\rH\u0016J\u001c\u0010\u000e\u001a\u00020\t2\n\u0010\u000f\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u0010\u001a\u00020\rH\u0016J\u001c\u0010\u0011\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\rH\u0016R\u001e\u0010\u0003\u001a\u0012\u0012\u0004\u0012\u00020\u00050\u0004j\b\u0012\u0004\u0012\u00020\u0005`\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0016"}, d2 = {"Lcom/neeraja/recipeapp/ui/adapter/CategoryAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/neeraja/recipeapp/ui/adapter/CategoryAdapter$DataViewHolder;", "users", "Ljava/util/ArrayList;", "Lcom/neeraja/recipeapp/data/model/db/Category;", "Lkotlin/collections/ArrayList;", "(Ljava/util/ArrayList;)V", "addData", "", "list", "", "getItemCount", "", "onBindViewHolder", "holder", "position", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "DataViewHolder", "app_debug"})
public final class CategoryAdapter extends androidx.recyclerview.widget.RecyclerView.Adapter<com.neeraja.recipeapp.ui.adapter.CategoryAdapter.DataViewHolder> {
    private final java.util.ArrayList<com.neeraja.recipeapp.data.model.db.Category> users = null;
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public com.neeraja.recipeapp.ui.adapter.CategoryAdapter.DataViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @java.lang.Override()
    public int getItemCount() {
        return 0;
    }
    
    @java.lang.Override()
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
    com.neeraja.recipeapp.ui.adapter.CategoryAdapter.DataViewHolder holder, int position) {
    }
    
    public final void addData(@org.jetbrains.annotations.NotNull()
    java.util.List<com.neeraja.recipeapp.data.model.db.Category> list) {
    }
    
    public CategoryAdapter(@org.jetbrains.annotations.NotNull()
    java.util.ArrayList<com.neeraja.recipeapp.data.model.db.Category> users) {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u000e\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nJ\u001a\u0010\u000b\u001a\u00020\b2\b\u0010\f\u001a\u0004\u0018\u00010\r2\u0006\u0010\u000e\u001a\u00020\u000fH\u0002R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0010"}, d2 = {"Lcom/neeraja/recipeapp/ui/adapter/CategoryAdapter$DataViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "binding", "Lcom/neeraja/recipeapp/databinding/CategoryItemLayoutBinding;", "(Lcom/neeraja/recipeapp/ui/adapter/CategoryAdapter;Lcom/neeraja/recipeapp/databinding/CategoryItemLayoutBinding;)V", "getBinding", "()Lcom/neeraja/recipeapp/databinding/CategoryItemLayoutBinding;", "bind", "", "category", "Lcom/neeraja/recipeapp/data/model/db/Category;", "navigateToCategory", "categoryId", "", "view", "Landroid/view/View;", "app_debug"})
    public final class DataViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        @org.jetbrains.annotations.NotNull()
        private final com.neeraja.recipeapp.databinding.CategoryItemLayoutBinding binding = null;
        
        private final void navigateToCategory(java.lang.String categoryId, android.view.View view) {
        }
        
        public final void bind(@org.jetbrains.annotations.NotNull()
        com.neeraja.recipeapp.data.model.db.Category category) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.neeraja.recipeapp.databinding.CategoryItemLayoutBinding getBinding() {
            return null;
        }
        
        public DataViewHolder(@org.jetbrains.annotations.NotNull()
        com.neeraja.recipeapp.databinding.CategoryItemLayoutBinding binding) {
            super(null);
        }
    }
}