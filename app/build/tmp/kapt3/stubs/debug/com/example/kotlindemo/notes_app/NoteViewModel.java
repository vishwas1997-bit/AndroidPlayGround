package com.example.kotlindemo.notes_app;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0015\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\u0002\u0010\u0007J\u0006\u0010\b\u001a\u00020\t\u00a8\u0006\n"}, d2 = {"Lcom/example/kotlindemo/notes_app/NoteViewModel;", "Lcom/example/kotlindemo/notes_app/ui/base/BaseViewModel;", "Lcom/example/kotlindemo/notes_app/ui/NoteNavigator;", "dataManger", "Lcom/example/kotlindemo/notes_app/data/DataManger;", "schedulerProvider", "Lcom/example/kotlindemo/Utils/rxJava/SchedulerProvider;", "(Lcom/example/kotlindemo/notes_app/data/DataManger;Lcom/example/kotlindemo/Utils/rxJava/SchedulerProvider;)V", "addNote", "", "app_debug"})
public final class NoteViewModel extends com.example.kotlindemo.notes_app.ui.base.BaseViewModel<com.example.kotlindemo.notes_app.ui.NoteNavigator> {
    
    public NoteViewModel(@org.jetbrains.annotations.NotNull()
    com.example.kotlindemo.notes_app.data.DataManger dataManger, @org.jetbrains.annotations.NotNull()
    com.example.kotlindemo.Utils.rxJava.SchedulerProvider schedulerProvider) {
        super(null, null);
    }
    
    public final void addNote() {
    }
}