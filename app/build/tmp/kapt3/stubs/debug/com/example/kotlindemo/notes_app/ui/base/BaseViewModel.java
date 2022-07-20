package com.example.kotlindemo.notes_app.ui.base;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0002\b\u0004\b&\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B\u0015\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\u0002\u0010\u0007J\n\u0010\f\u001a\u0004\u0018\u00010\tH\u0016J\b\u0010\r\u001a\u0004\u0018\u00010\u0004J\r\u0010\u000e\u001a\u0004\u0018\u00018\u0000\u00a2\u0006\u0002\u0010\u000fJ\u000f\u0010\u0010\u001a\u0004\u0018\u00010\u0006H\u0007\u00a2\u0006\u0002\b\u0011J\b\u0010\u0012\u001a\u00020\u0013H\u0014J\u0013\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0015\u001a\u00028\u0000\u00a2\u0006\u0002\u0010\u0016R\u000e\u0010\b\u001a\u00020\tX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\u000bX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0017"}, d2 = {"Lcom/example/kotlindemo/notes_app/ui/base/BaseViewModel;", "N", "Landroidx/lifecycle/ViewModel;", "dataManger", "Lcom/example/kotlindemo/notes_app/data/DataManger;", "schedulerProvider", "Lcom/example/kotlindemo/Utils/rxJava/SchedulerProvider;", "(Lcom/example/kotlindemo/notes_app/data/DataManger;Lcom/example/kotlindemo/Utils/rxJava/SchedulerProvider;)V", "compositeDisposable", "Lio/reactivex/disposables/CompositeDisposable;", "mNavigator", "Ljava/lang/ref/WeakReference;", "getCompositeDisposable", "getDataManager", "getNavigator", "()Ljava/lang/Object;", "getSchedulerProvider", "getSchedulerProvider1", "onCleared", "", "setNavigator", "navigator", "(Ljava/lang/Object;)V", "app_debug"})
public abstract class BaseViewModel<N extends java.lang.Object> extends androidx.lifecycle.ViewModel {
    private final com.example.kotlindemo.notes_app.data.DataManger dataManger = null;
    private final com.example.kotlindemo.Utils.rxJava.SchedulerProvider schedulerProvider = null;
    private io.reactivex.disposables.CompositeDisposable compositeDisposable;
    private java.lang.ref.WeakReference<N> mNavigator;
    
    public BaseViewModel(@org.jetbrains.annotations.NotNull()
    com.example.kotlindemo.notes_app.data.DataManger dataManger, @org.jetbrains.annotations.NotNull()
    com.example.kotlindemo.Utils.rxJava.SchedulerProvider schedulerProvider) {
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
    
    @org.jetbrains.annotations.Nullable()
    public io.reactivex.disposables.CompositeDisposable getCompositeDisposable() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.example.kotlindemo.notes_app.data.DataManger getDataManager() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @kotlin.jvm.JvmName(name = "getSchedulerProvider1")
    public final com.example.kotlindemo.Utils.rxJava.SchedulerProvider getSchedulerProvider1() {
        return null;
    }
}