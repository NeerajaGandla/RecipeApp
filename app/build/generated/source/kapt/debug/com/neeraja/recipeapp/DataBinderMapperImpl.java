package com.neeraja.recipeapp;

import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import androidx.databinding.DataBinderMapper;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import com.neeraja.recipeapp.databinding.ActivityHomeBindingImpl;
import com.neeraja.recipeapp.databinding.ActivitySplashBindingImpl;
import com.neeraja.recipeapp.databinding.CategoryItemLayoutBindingImpl;
import com.neeraja.recipeapp.databinding.FragmentCategoriesBindingImpl;
import com.neeraja.recipeapp.databinding.FragmentFilterByTypeBindingImpl;
import com.neeraja.recipeapp.databinding.MealItemLayoutBindingImpl;
import com.neeraja.recipeapp.databinding.RecipeDetailFragmentBindingImpl;
import java.lang.IllegalArgumentException;
import java.lang.Integer;
import java.lang.Object;
import java.lang.Override;
import java.lang.RuntimeException;
import java.lang.String;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class DataBinderMapperImpl extends DataBinderMapper {
  private static final int LAYOUT_ACTIVITYHOME = 1;

  private static final int LAYOUT_ACTIVITYSPLASH = 2;

  private static final int LAYOUT_CATEGORYITEMLAYOUT = 3;

  private static final int LAYOUT_FRAGMENTCATEGORIES = 4;

  private static final int LAYOUT_FRAGMENTFILTERBYTYPE = 5;

  private static final int LAYOUT_MEALITEMLAYOUT = 6;

  private static final int LAYOUT_RECIPEDETAILFRAGMENT = 7;

  private static final SparseIntArray INTERNAL_LAYOUT_ID_LOOKUP = new SparseIntArray(7);

  static {
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.neeraja.recipeapp.R.layout.activity_home, LAYOUT_ACTIVITYHOME);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.neeraja.recipeapp.R.layout.activity_splash, LAYOUT_ACTIVITYSPLASH);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.neeraja.recipeapp.R.layout.category_item_layout, LAYOUT_CATEGORYITEMLAYOUT);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.neeraja.recipeapp.R.layout.fragment_categories, LAYOUT_FRAGMENTCATEGORIES);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.neeraja.recipeapp.R.layout.fragment_filter_by_type, LAYOUT_FRAGMENTFILTERBYTYPE);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.neeraja.recipeapp.R.layout.meal_item_layout, LAYOUT_MEALITEMLAYOUT);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.neeraja.recipeapp.R.layout.recipe_detail_fragment, LAYOUT_RECIPEDETAILFRAGMENT);
  }

  @Override
  public ViewDataBinding getDataBinder(DataBindingComponent component, View view, int layoutId) {
    int localizedLayoutId = INTERNAL_LAYOUT_ID_LOOKUP.get(layoutId);
    if(localizedLayoutId > 0) {
      final Object tag = view.getTag();
      if(tag == null) {
        throw new RuntimeException("view must have a tag");
      }
      switch(localizedLayoutId) {
        case  LAYOUT_ACTIVITYHOME: {
          if ("layout/activity_home_0".equals(tag)) {
            return new ActivityHomeBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for activity_home is invalid. Received: " + tag);
        }
        case  LAYOUT_ACTIVITYSPLASH: {
          if ("layout/activity_splash_0".equals(tag)) {
            return new ActivitySplashBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for activity_splash is invalid. Received: " + tag);
        }
        case  LAYOUT_CATEGORYITEMLAYOUT: {
          if ("layout/category_item_layout_0".equals(tag)) {
            return new CategoryItemLayoutBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for category_item_layout is invalid. Received: " + tag);
        }
        case  LAYOUT_FRAGMENTCATEGORIES: {
          if ("layout/fragment_categories_0".equals(tag)) {
            return new FragmentCategoriesBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_categories is invalid. Received: " + tag);
        }
        case  LAYOUT_FRAGMENTFILTERBYTYPE: {
          if ("layout/fragment_filter_by_type_0".equals(tag)) {
            return new FragmentFilterByTypeBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_filter_by_type is invalid. Received: " + tag);
        }
        case  LAYOUT_MEALITEMLAYOUT: {
          if ("layout/meal_item_layout_0".equals(tag)) {
            return new MealItemLayoutBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for meal_item_layout is invalid. Received: " + tag);
        }
        case  LAYOUT_RECIPEDETAILFRAGMENT: {
          if ("layout/recipe_detail_fragment_0".equals(tag)) {
            return new RecipeDetailFragmentBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for recipe_detail_fragment is invalid. Received: " + tag);
        }
      }
    }
    return null;
  }

  @Override
  public ViewDataBinding getDataBinder(DataBindingComponent component, View[] views, int layoutId) {
    if(views == null || views.length == 0) {
      return null;
    }
    int localizedLayoutId = INTERNAL_LAYOUT_ID_LOOKUP.get(layoutId);
    if(localizedLayoutId > 0) {
      final Object tag = views[0].getTag();
      if(tag == null) {
        throw new RuntimeException("view must have a tag");
      }
      switch(localizedLayoutId) {
      }
    }
    return null;
  }

  @Override
  public int getLayoutId(String tag) {
    if (tag == null) {
      return 0;
    }
    Integer tmpVal = InnerLayoutIdLookup.sKeys.get(tag);
    return tmpVal == null ? 0 : tmpVal;
  }

  @Override
  public String convertBrIdToString(int localId) {
    String tmpVal = InnerBrLookup.sKeys.get(localId);
    return tmpVal;
  }

  @Override
  public List<DataBinderMapper> collectDependencies() {
    ArrayList<DataBinderMapper> result = new ArrayList<DataBinderMapper>(1);
    result.add(new androidx.databinding.library.baseAdapters.DataBinderMapperImpl());
    return result;
  }

  private static class InnerBrLookup {
    static final SparseArray<String> sKeys = new SparseArray<String>(6);

    static {
      sKeys.put(0, "_all");
      sKeys.put(1, "categoryId");
      sKeys.put(2, "clickListener");
      sKeys.put(3, "favoriteClickListener");
      sKeys.put(4, "favoritesClickListener");
      sKeys.put(5, "meal");
    }
  }

  private static class InnerLayoutIdLookup {
    static final HashMap<String, Integer> sKeys = new HashMap<String, Integer>(7);

    static {
      sKeys.put("layout/activity_home_0", com.neeraja.recipeapp.R.layout.activity_home);
      sKeys.put("layout/activity_splash_0", com.neeraja.recipeapp.R.layout.activity_splash);
      sKeys.put("layout/category_item_layout_0", com.neeraja.recipeapp.R.layout.category_item_layout);
      sKeys.put("layout/fragment_categories_0", com.neeraja.recipeapp.R.layout.fragment_categories);
      sKeys.put("layout/fragment_filter_by_type_0", com.neeraja.recipeapp.R.layout.fragment_filter_by_type);
      sKeys.put("layout/meal_item_layout_0", com.neeraja.recipeapp.R.layout.meal_item_layout);
      sKeys.put("layout/recipe_detail_fragment_0", com.neeraja.recipeapp.R.layout.recipe_detail_fragment);
    }
  }
}
