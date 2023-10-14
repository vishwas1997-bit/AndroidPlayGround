package com.example.kotlindemo.notes_app;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u00022\u00020\u0003B%\u0012\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u0005\u0012\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u0007\u00a2\u0006\u0002\u0010\bJ%\u0010\t\u001a\u0002H\u0001\"\b\b\u0001\u0010\u0001*\u00020\u00022\f\u0010\n\u001a\b\u0012\u0004\u0012\u0002H\u00010\u0005H\u0016\u00a2\u0006\u0002\u0010\u000bR\u0016\u0010\u0004\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u0005X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0016\u0010\u0006\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u0007X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\f"}, d2 = {"Lcom/example/kotlindemo/notes_app/ViewModelProviderFactory;", "T", "Landroidx/lifecycle/ViewModel;", "Landroidx/lifecycle/ViewModelProvider$NewInstanceFactory;", "viewModelClass", "Ljava/lang/Class;", "viewModelSupplier", "Landroidx/core/util/Supplier;", "(Ljava/lang/Class;Landroidx/core/util/Supplier;)V", "create", "modelClass", "(Ljava/lang/Class;)Landroidx/lifecycle/ViewModel;", "app_debug"})
public final class ViewModelProviderFactory<T extends androidx.lifecycle.ViewModel> extends androidx.lifecycle.ViewModelProvider.NewInstanceFactory {
    private java.lang.Class<T> viewModelClass;
    private androidx.core.util.Supplier<T> viewModelSupplier;
    
    public ViewModelProviderFactory(@org.jetbrains.annotations.Nullable
    java.lang.Class<T> viewModelClass, @org.jetbrains.annotations.Nullable
    androidx.core.util.Supplier<T> viewModelSupplier) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    @java.lang.Override
    public <T extends androidx.lifecycle.ViewModel>T create(@org.jetbrains.annotations.NotNull
    java.lang.Class<T> modelClass) {
        return null;
    }
}