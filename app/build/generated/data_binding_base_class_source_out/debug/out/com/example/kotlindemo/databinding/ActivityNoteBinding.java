// Generated by data binding compiler. Do not edit!
package com.example.kotlindemo.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import androidx.fragment.app.FragmentContainerView;
import com.example.kotlindemo.R;
import java.lang.Deprecated;
import java.lang.Object;

public abstract class ActivityNoteBinding extends ViewDataBinding {
  @NonNull
  public final FragmentContainerView navHostFragmentContainer;

  protected ActivityNoteBinding(Object _bindingComponent, View _root, int _localFieldCount,
      FragmentContainerView navHostFragmentContainer) {
    super(_bindingComponent, _root, _localFieldCount);
    this.navHostFragmentContainer = navHostFragmentContainer;
  }

  @NonNull
  public static ActivityNoteBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.activity_note, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static ActivityNoteBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<ActivityNoteBinding>inflateInternal(inflater, R.layout.activity_note, root, attachToRoot, component);
  }

  @NonNull
  public static ActivityNoteBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.activity_note, null, false, component)
   */
  @NonNull
  @Deprecated
  public static ActivityNoteBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<ActivityNoteBinding>inflateInternal(inflater, R.layout.activity_note, null, false, component);
  }

  public static ActivityNoteBinding bind(@NonNull View view) {
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
  public static ActivityNoteBinding bind(@NonNull View view, @Nullable Object component) {
    return (ActivityNoteBinding)bind(component, view, R.layout.activity_note);
  }
}
