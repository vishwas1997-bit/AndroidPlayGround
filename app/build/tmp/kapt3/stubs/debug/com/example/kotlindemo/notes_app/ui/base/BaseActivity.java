package com.example.kotlindemo.notes_app.ui.base;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b&\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u0002*\b\b\u0001\u0010\u0003*\u00020\u00042\u00020\u0005B\u0005\u00a2\u0006\u0002\u0010\u0006J\b\u0010\u0013\u001a\u00020\u0014H&J\b\u0010\u0015\u001a\u00020\u0016H\u0002J\b\u0010\u0017\u001a\u00020\u0014H\'J\u000b\u0010\u0018\u001a\u00028\u0000\u00a2\u0006\u0002\u0010\tJ\u0012\u0010\u0019\u001a\u00020\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001cH\u0014J\b\u0010\u001d\u001a\u00020\u001aH\u0002J\u0010\u0010\u001e\u001a\u00020\u001a2\u0006\u0010\u001f\u001a\u00020\u0016H&R\u001c\u0010\u0007\u001a\u00028\u0000X\u0086.\u00a2\u0006\u0010\n\u0002\u0010\f\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u001e\u0010\r\u001a\u0004\u0018\u00018\u0001X\u0086\u000e\u00a2\u0006\u0010\n\u0002\u0010\u0012\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011\u00a8\u0006 "}, d2 = {"Lcom/example/kotlindemo/notes_app/ui/base/BaseActivity;", "T", "Landroidx/databinding/ViewDataBinding;", "V", "Lcom/example/kotlindemo/notes_app/ui/base/BaseViewModel;", "Landroidx/appcompat/app/AppCompatActivity;", "()V", "mViewDataBinding", "getMViewDataBinding", "()Landroidx/databinding/ViewDataBinding;", "setMViewDataBinding", "(Landroidx/databinding/ViewDataBinding;)V", "Landroidx/databinding/ViewDataBinding;", "mViewModel", "getMViewModel", "()Lcom/example/kotlindemo/notes_app/ui/base/BaseViewModel;", "setMViewModel", "(Lcom/example/kotlindemo/notes_app/ui/base/BaseViewModel;)V", "Lcom/example/kotlindemo/notes_app/ui/base/BaseViewModel;", "getBindingVariable", "", "getBuildComponent", "Lcom/example/kotlindemo/notes_app/di/component/ActivityComponent;", "getLayoutId", "getViewDataBinding", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "performDataBinding", "performDependencyInjection", "buildComponent", "app_debug"})
public abstract class BaseActivity<T extends androidx.databinding.ViewDataBinding, V extends com.example.kotlindemo.notes_app.ui.base.BaseViewModel> extends androidx.appcompat.app.AppCompatActivity {
    public T mViewDataBinding;
    @org.jetbrains.annotations.Nullable()
    private V mViewModel;
    private java.util.HashMap _$_findViewCache;
    
    public BaseActivity() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final T getMViewDataBinding() {
        return null;
    }
    
    public final void setMViewDataBinding(@org.jetbrains.annotations.NotNull()
    T p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final V getMViewModel() {
        return null;
    }
    
    public final void setMViewModel(@org.jetbrains.annotations.Nullable()
    V p0) {
    }
    
    @androidx.annotation.LayoutRes()
    public abstract int getLayoutId();
    
    public abstract int getBindingVariable();
    
    @org.jetbrains.annotations.NotNull()
    public final T getViewDataBinding() {
        return null;
    }
    
    @java.lang.Override()
    protected void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    private final com.example.kotlindemo.notes_app.di.component.ActivityComponent getBuildComponent() {
        return null;
    }
    
    public abstract void performDependencyInjection(@org.jetbrains.annotations.NotNull()
    com.example.kotlindemo.notes_app.di.component.ActivityComponent buildComponent);
    
    private final void performDataBinding() {
    }
}