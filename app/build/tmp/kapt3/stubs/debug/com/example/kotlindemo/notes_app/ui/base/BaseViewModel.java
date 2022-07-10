package com.example.kotlindemo.notes_app.ui.base;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0004\b&\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B\u0005\u00a2\u0006\u0002\u0010\u0003J\r\u0010\b\u001a\u0004\u0018\u00018\u0000\u00a2\u0006\u0002\u0010\tJ\b\u0010\n\u001a\u00020\u000bH\u0014J\u0013\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00028\u0000\u00a2\u0006\u0002\u0010\u000eR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082.\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0007X\u0082.\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000f"}, d2 = {"Lcom/example/kotlindemo/notes_app/ui/base/BaseViewModel;", "N", "Landroidx/lifecycle/ViewModel;", "()V", "compositeDisposable", "Lio/reactivex/disposables/CompositeDisposable;", "mNavigator", "Ljava/lang/ref/WeakReference;", "getNavigator", "()Ljava/lang/Object;", "onCleared", "", "setNavigator", "navigator", "(Ljava/lang/Object;)V", "app_debug"})
public abstract class BaseViewModel<N extends java.lang.Object> extends androidx.lifecycle.ViewModel {
    private io.reactivex.disposables.CompositeDisposable compositeDisposable;
    private java.lang.ref.WeakReference<N> mNavigator;
    
    public BaseViewModel() {
        super();
    }
    
    @java.lang.Override()
    protected void onCleared() {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final N getNavigator() {
        return null;
    }
    
    public final void setNavigator(N navigator) {
    }
}