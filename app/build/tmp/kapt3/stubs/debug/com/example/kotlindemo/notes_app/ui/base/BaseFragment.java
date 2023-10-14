package com.example.kotlindemo.notes_app.ui.base;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b&\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u0002*\f\b\u0001\u0010\u0003*\u0006\u0012\u0002\b\u00030\u00042\u00020\u0005B\u0005\u00a2\u0006\u0002\u0010\u0006J\b\u0010\u0016\u001a\u00020\u0017H&J\b\u0010\u0018\u001a\u00020\u0019H\u0002J\b\u0010\u001a\u001a\u00020\u0017H\'J\u000b\u0010\u001b\u001a\u00028\u0000\u00a2\u0006\u0002\u0010\u001cJ\u0012\u0010\u001d\u001a\u00020\u001e2\b\u0010\u001f\u001a\u0004\u0018\u00010 H\u0016J&\u0010!\u001a\u0004\u0018\u00010\b2\u0006\u0010\"\u001a\u00020#2\b\u0010$\u001a\u0004\u0018\u00010%2\b\u0010\u001f\u001a\u0004\u0018\u00010 H\u0016J\u001a\u0010&\u001a\u00020\u001e2\u0006\u0010\'\u001a\u00020\b2\b\u0010\u001f\u001a\u0004\u0018\u00010 H\u0016J\u0010\u0010(\u001a\u00020\u001e2\u0006\u0010)\u001a\u00020\u0019H&R\u001a\u0010\u0007\u001a\u00020\bX\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u0010\u0010\r\u001a\u00028\u0000X\u0082.\u00a2\u0006\u0004\n\u0002\u0010\u000eR*\u0010\u0010\u001a\u0004\u0018\u00018\u00012\b\u0010\u000f\u001a\u0004\u0018\u00018\u0001@GX\u0086\u000e\u00a2\u0006\u0010\n\u0002\u0010\u0015\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014\u00a8\u0006*"}, d2 = {"Lcom/example/kotlindemo/notes_app/ui/base/BaseFragment;", "B", "Landroidx/databinding/ViewDataBinding;", "V", "Lcom/example/kotlindemo/notes_app/ui/base/BaseViewModel;", "Landroidx/fragment/app/Fragment;", "()V", "mRootView", "Landroid/view/View;", "getMRootView", "()Landroid/view/View;", "setMRootView", "(Landroid/view/View;)V", "mViewDataBinding", "Landroidx/databinding/ViewDataBinding;", "<set-?>", "mViewModel", "getMViewModel", "()Lcom/example/kotlindemo/notes_app/ui/base/BaseViewModel;", "setMViewModel", "(Lcom/example/kotlindemo/notes_app/ui/base/BaseViewModel;)V", "Lcom/example/kotlindemo/notes_app/ui/base/BaseViewModel;", "getBindingVariable", "", "getBuildComponent", "Lcom/example/kotlindemo/notes_app/di/component/FragmentComponent;", "getLayoutId", "getViewDataBinding", "()Landroidx/databinding/ViewDataBinding;", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "onCreateView", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "onViewCreated", "view", "performDependencyInjection", "buildComponent", "app_debug"})
public abstract class BaseFragment<B extends androidx.databinding.ViewDataBinding, V extends com.example.kotlindemo.notes_app.ui.base.BaseViewModel<?>> extends androidx.fragment.app.Fragment {
    private B mViewDataBinding;
    @org.jetbrains.annotations.Nullable
    private V mViewModel;
    public android.view.View mRootView;
    private java.util.HashMap _$_findViewCache;
    
    public BaseFragment() {
        super();
    }
    
    @org.jetbrains.annotations.Nullable
    public final V getMViewModel() {
        return null;
    }
    
    @javax.inject.Inject
    public final void setMViewModel(@org.jetbrains.annotations.Nullable
    V p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final android.view.View getMRootView() {
        return null;
    }
    
    public final void setMRootView(@org.jetbrains.annotations.NotNull
    android.view.View p0) {
    }
    
    @androidx.annotation.LayoutRes
    public abstract int getLayoutId();
    
    public abstract int getBindingVariable();
    
    @org.jetbrains.annotations.NotNull
    public final B getViewDataBinding() {
        return null;
    }
    
    @java.lang.Override
    public void onCreate(@org.jetbrains.annotations.Nullable
    android.os.Bundle savedInstanceState) {
    }
    
    @org.jetbrains.annotations.Nullable
    @java.lang.Override
    public android.view.View onCreateView(@org.jetbrains.annotations.NotNull
    android.view.LayoutInflater inflater, @org.jetbrains.annotations.Nullable
    android.view.ViewGroup container, @org.jetbrains.annotations.Nullable
    android.os.Bundle savedInstanceState) {
        return null;
    }
    
    @java.lang.Override
    public void onViewCreated(@org.jetbrains.annotations.NotNull
    android.view.View view, @org.jetbrains.annotations.Nullable
    android.os.Bundle savedInstanceState) {
    }
    
    public abstract void performDependencyInjection(@org.jetbrains.annotations.NotNull
    com.example.kotlindemo.notes_app.di.component.FragmentComponent buildComponent);
    
    private final com.example.kotlindemo.notes_app.di.component.FragmentComponent getBuildComponent() {
        return null;
    }
}