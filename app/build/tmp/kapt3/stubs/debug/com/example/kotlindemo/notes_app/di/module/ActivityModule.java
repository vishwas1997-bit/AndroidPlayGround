package com.example.kotlindemo.notes_app.di.module;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0015\u0012\u000e\u0010\u0002\u001a\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u0003\u00a2\u0006\u0002\u0010\u0004J\u0018\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH\u0007R\"\u0010\u0002\u001a\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\u0004\u00a8\u0006\u000e"}, d2 = {"Lcom/example/kotlindemo/notes_app/di/module/ActivityModule;", "", "activity", "Lcom/example/kotlindemo/notes_app/ui/base/BaseActivity;", "(Lcom/example/kotlindemo/notes_app/ui/base/BaseActivity;)V", "getActivity", "()Lcom/example/kotlindemo/notes_app/ui/base/BaseActivity;", "setActivity", "provideNoteViewModel", "Lcom/example/kotlindemo/notes_app/NoteViewModel;", "dataManger", "Lcom/example/kotlindemo/notes_app/data/DataManger;", "schedulerProvider", "Lcom/example/kotlindemo/Utils/rxJava/SchedulerProvider;", "app_debug"})
@dagger.Module()
public final class ActivityModule {
    @org.jetbrains.annotations.NotNull()
    private com.example.kotlindemo.notes_app.ui.base.BaseActivity<?, ?> activity;
    
    public ActivityModule(@org.jetbrains.annotations.NotNull()
    com.example.kotlindemo.notes_app.ui.base.BaseActivity<?, ?> activity) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.example.kotlindemo.notes_app.ui.base.BaseActivity<?, ?> getActivity() {
        return null;
    }
    
    public final void setActivity(@org.jetbrains.annotations.NotNull()
    com.example.kotlindemo.notes_app.ui.base.BaseActivity<?, ?> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Provides()
    public final com.example.kotlindemo.notes_app.NoteViewModel provideNoteViewModel(@org.jetbrains.annotations.NotNull()
    com.example.kotlindemo.notes_app.data.DataManger dataManger, @org.jetbrains.annotations.NotNull()
    com.example.kotlindemo.Utils.rxJava.SchedulerProvider schedulerProvider) {
        return null;
    }
}