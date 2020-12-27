// Generated by data binding compiler. Do not edit!
package com.neeraja.recipeapp.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.neeraja.recipeapp.R;
import java.lang.Deprecated;
import java.lang.Object;

public abstract class CategoryItemLayoutBinding extends ViewDataBinding {
  @NonNull
  public final ImageView imageViewThumbNail;

  @NonNull
  public final TextView textViewDescription;

  @NonNull
  public final TextView textViewTitle;

  protected CategoryItemLayoutBinding(Object _bindingComponent, View _root, int _localFieldCount,
      ImageView imageViewThumbNail, TextView textViewDescription, TextView textViewTitle) {
    super(_bindingComponent, _root, _localFieldCount);
    this.imageViewThumbNail = imageViewThumbNail;
    this.textViewDescription = textViewDescription;
    this.textViewTitle = textViewTitle;
  }

  @NonNull
  public static CategoryItemLayoutBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.category_item_layout, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static CategoryItemLayoutBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<CategoryItemLayoutBinding>inflateInternal(inflater, R.layout.category_item_layout, root, attachToRoot, component);
  }

  @NonNull
  public static CategoryItemLayoutBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.category_item_layout, null, false, component)
   */
  @NonNull
  @Deprecated
  public static CategoryItemLayoutBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<CategoryItemLayoutBinding>inflateInternal(inflater, R.layout.category_item_layout, null, false, component);
  }

  public static CategoryItemLayoutBinding bind(@NonNull View view) {
    return bind(view, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.bind(view, component)
   */
  @Deprecated
  public static CategoryItemLayoutBinding bind(@NonNull View view, @Nullable Object component) {
    return (CategoryItemLayoutBinding)bind(component, view, R.layout.category_item_layout);
  }
}
