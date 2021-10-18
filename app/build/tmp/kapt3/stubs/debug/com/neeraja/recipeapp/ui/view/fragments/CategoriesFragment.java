package com.neeraja.recipeapp.ui.view.fragments;

import android.os.Bundle;
import androidx.fragment.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;
import androidx.databinding.DataBindingUtil;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.neeraja.recipeapp.utils.Status;
import com.neeraja.recipeapp.R;
import com.neeraja.recipeapp.data.model.db.Category;
import com.neeraja.recipeapp.databinding.FragmentCategoriesBinding;
import com.neeraja.recipeapp.ui.adapter.CategoryAdapter;
import com.neeraja.recipeapp.ui.viewmodel.CategoryViewModel;
import com.neeraja.recipeapp.utils.GridSpacingItemDecoration;
import dagger.hilt.android.AndroidEntryPoint;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J&\u0010\t\u001a\u0004\u0018\u00010\n2\u0006\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010H\u0016J\u001a\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\n2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010H\u0016J\u0016\u0010\u0014\u001a\u00020\u00122\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00170\u0016H\u0002J\b\u0010\u0018\u001a\u00020\u0012H\u0002J\b\u0010\u0019\u001a\u00020\u0012H\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082.\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001a"}, d2 = {"Lcom/neeraja/recipeapp/ui/view/fragments/CategoriesFragment;", "Landroidx/fragment/app/Fragment;", "()V", "adapter", "Lcom/neeraja/recipeapp/ui/adapter/CategoryAdapter;", "binding", "Lcom/neeraja/recipeapp/databinding/FragmentCategoriesBinding;", "categoryViewModel", "Lcom/neeraja/recipeapp/ui/viewmodel/CategoryViewModel;", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onViewCreated", "", "view", "renderList", "users", "", "Lcom/neeraja/recipeapp/data/model/db/Category;", "setupObserver", "setupUI", "app_debug"})
@dagger.hilt.android.AndroidEntryPoint()
public final class CategoriesFragment extends androidx.fragment.app.Fragment {
    private com.neeraja.recipeapp.ui.viewmodel.CategoryViewModel categoryViewModel;
    private com.neeraja.recipeapp.ui.adapter.CategoryAdapter adapter;
    private com.neeraja.recipeapp.databinding.FragmentCategoriesBinding binding;
    private java.util.HashMap _$_findViewCache;
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public android.view.View onCreateView(@org.jetbrains.annotations.NotNull()
    android.view.LayoutInflater inflater, @org.jetbrains.annotations.Nullable()
    android.view.ViewGroup container, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
        return null;
    }
    
    @java.lang.Override()
    public void onViewCreated(@org.jetbrains.annotations.NotNull()
    android.view.View view, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    private final void setupUI() {
    }
    
    private final void setupObserver() {
    }
    
    private final void renderList(java.util.List<com.neeraja.recipeapp.data.model.db.Category> users) {
    }
    
    public CategoriesFragment() {
        super();
    }
}