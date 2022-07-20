package com.example.kotlindemo.notes_app.di.module;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0015\u0012\u000e\u0010\u0002\u001a\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u0003\u00a2\u0006\u0002\u0010\u0004J\b\u0010\u0007\u001a\u00020\bH\u0007J\u0018\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0007R\u0019\u0010\u0002\u001a\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u000f"}, d2 = {"Lcom/example/kotlindemo/notes_app/di/module/FragmentModule;", "", "fragment", "Lcom/example/kotlindemo/notes_app/ui/base/BaseFragment;", "(Lcom/example/kotlindemo/notes_app/ui/base/BaseFragment;)V", "getFragment", "()Lcom/example/kotlindemo/notes_app/ui/base/BaseFragment;", "provideLinearLayoutManager", "Landroidx/recyclerview/widget/LinearLayoutManager;", "provideNoteViewModel", "Lcom/example/kotlindemo/notes_app/NoteViewModel;", "dataManger", "Lcom/example/kotlindemo/notes_app/data/DataManger;", "schedulerProvider", "Lcom/example/kotlindemo/Utils/rxJava/SchedulerProvider;", "app_debug"})
@dagger.Module()
public final class FragmentModule {
    @org.jetbrains.annotations.NotNull()
    private final com.example.kotlindemo.notes_app.ui.base.BaseFragment<?, ?> fragment = null;
    
    public FragmentModule(@org.jetbrains.annotations.NotNull()
    com.example.kotlindemo.notes_app.ui.base.BaseFragment<?, ?> fragment) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.example.kotlindemo.notes_app.ui.base.BaseFragment<?, ?> getFragment() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Provides()
    public final com.example.kotlindemo.notes_app.NoteViewModel provideNoteViewModel(@org.jetbrains.annotations.NotNull()
    com.example.kotlindemo.notes_app.data.DataManger dataManger, @org.jetbrains.annotations.NotNull()
    com.example.kotlindemo.Utils.rxJava.SchedulerProvider schedulerProvider) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Provides()
    public final androidx.recyclerview.widget.LinearLayoutManager provideLinearLayoutManager() {
        return null;
    }
}