// Generated by data binding compiler. Do not edit!
package com.example.kotlindemo.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.example.kotlindemo.R;
import com.google.android.material.textfield.TextInputEditText;
import java.lang.Deprecated;
import java.lang.Object;

public abstract class FragmentNoteAddBinding extends ViewDataBinding {
  @NonNull
  public final TextInputEditText tvDescription;

  @NonNull
  public final TextInputEditText tvTitle;

  protected FragmentNoteAddBinding(Object _bindingComponent, View _root, int _localFieldCount,
      TextInputEditText tvDescription, TextInputEditText tvTitle) {
    super(_bindingComponent, _root, _localFieldCount);
    this.tvDescription = tvDescription;
    this.tvTitle = tvTitle;
  }

  @NonNull
  public static FragmentNoteAddBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.fragment_note_add, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static FragmentNoteAddBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<FragmentNoteAddBinding>inflateInternal(inflater, R.layout.fragment_note_add, root, attachToRoot, component);
  }

  @NonNull
  public static FragmentNoteAddBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.fragment_note_add, null, false, component)
   */
  @NonNull
  @Deprecated
  public static FragmentNoteAddBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<FragmentNoteAddBinding>inflateInternal(inflater, R.layout.fragment_note_add, null, false, component);
  }

  public static FragmentNoteAddBinding bind(@NonNull View view) {
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
  public static FragmentNoteAddBinding bind(@NonNull View view, @Nullable Object component) {
    return (FragmentNoteAddBinding)bind(component, view, R.layout.fragment_note_add);
  }
}
