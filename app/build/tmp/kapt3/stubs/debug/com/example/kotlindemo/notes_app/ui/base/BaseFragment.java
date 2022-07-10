package com.example.kotlindemo.notes_app.ui.base;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b&\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u0002*\b\b\u0001\u0010\u0003*\u00020\u00042\u00020\u0005B\u0005\u00a2\u0006\u0002\u0010\u0006J\b\u0010\u0015\u001a\u00020\u0016H&J\b\u0010\u0017\u001a\u00020\u0018H\u0002J\b\u0010\u0019\u001a\u00020\u0016H\'J\u000b\u0010\u001a\u001a\u00028\u0000\u00a2\u0006\u0002\u0010\u000fJ\u0012\u0010\u001b\u001a\u00020\u001c2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001eH\u0016J&\u0010\u001f\u001a\u0004\u0018\u00010\b2\u0006\u0010 \u001a\u00020!2\b\u0010\"\u001a\u0004\u0018\u00010#2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001eH\u0016J\u001a\u0010$\u001a\u00020\u001c2\u0006\u0010%\u001a\u00020\b2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001eH\u0016J\u0010\u0010&\u001a\u00020\u001c2\u0006\u0010\'\u001a\u00020\u0018H&R\u001a\u0010\u0007\u001a\u00020\bX\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u001c\u0010\r\u001a\u00028\u0000X\u0086.\u00a2\u0006\u0010\n\u0002\u0010\u0012\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u0012\u0010\u0013\u001a\u0004\u0018\u00018\u0001X\u0082\u000e\u00a2\u0006\u0004\n\u0002\u0010\u0014\u00a8\u0006("}, d2 = {"Lcom/example/kotlindemo/notes_app/ui/base/BaseFragment;", "T", "Landroidx/databinding/ViewDataBinding;", "V", "Lcom/example/kotlindemo/notes_app/ui/base/BaseViewModel;", "Landroidx/fragment/app/Fragment;", "()V", "mRootView", "Landroid/view/View;", "getMRootView", "()Landroid/view/View;", "setMRootView", "(Landroid/view/View;)V", "mViewDataBinding", "getMViewDataBinding", "()Landroidx/databinding/ViewDataBinding;", "setMViewDataBinding", "(Landroidx/databinding/ViewDataBinding;)V", "Landroidx/databinding/ViewDataBinding;", "mViewModel", "Lcom/example/kotlindemo/notes_app/ui/base/BaseViewModel;", "getBindingVariable", "", "getBuildComponent", "Lcom/example/kotlindemo/notes_app/di/component/FragmentComponent;", "getLayoutId", "getViewDataBinding", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "onCreateView", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "onViewCreated", "view", "performDependencyInjection", "buildComponent", "app_debug"})
public abstract class BaseFragment<T extends androidx.databinding.ViewDataBinding, V extends com.example.kotlindemo.notes_app.ui.base.BaseViewModel> extends androidx.fragment.app.Fragment {
    public T mViewDataBinding;
    private V mViewModel;
    public android.view.View mRootView;
    private java.util.HashMap _$_findViewCache;
    
    public BaseFragment() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final T getMViewDataBinding() {
        return null;
    }
    
    public final void setMViewDataBinding(@org.jetbrains.annotations.NotNull()
    T p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.view.View getMRootView() {
        return null;
    }
    
    public final void setMRootView(@org.jetbrains.annotations.NotNull()
    android.view.View p0) {
    }
    
    @androidx.annotation.LayoutRes()
    public abstract int getLayoutId();
    
    public abstract int getBindingVariable();
    
    @org.jetbrains.annotations.NotNull()
    public final T getViewDataBinding() {
        return null;
    }
    
    @java.lang.Override()
    public void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
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
    
    public abstract void performDependencyInjection(@org.jetbrains.annotations.NotNull()
    com.example.kotlindemo.notes_app.di.component.FragmentComponent buildComponent);
    
    private final com.example.kotlindemo.notes_app.di.component.FragmentComponent getBuildComponent() {
        return null;
    }
}