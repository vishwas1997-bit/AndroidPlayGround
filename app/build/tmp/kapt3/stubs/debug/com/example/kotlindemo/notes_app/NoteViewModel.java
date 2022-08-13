package com.example.kotlindemo.notes_app;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0015\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\u0002\u0010\u0007J\b\u0010\u0010\u001a\u00020\u0011H\u0002J\u0012\u0010\u0012\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\n0\u0013J\u0016\u0010\u0014\u001a\u00020\u00112\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0016J\u0006\u0010\u0018\u001a\u00020\u0011J\u0016\u0010\u0019\u001a\u00020\u00112\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0016R&\u0010\b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\n0\tX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000f\u00a8\u0006\u001a"}, d2 = {"Lcom/example/kotlindemo/notes_app/NoteViewModel;", "Lcom/example/kotlindemo/notes_app/ui/base/BaseViewModel;", "Lcom/example/kotlindemo/notes_app/ui/NoteNavigator;", "dataManger", "Lcom/example/kotlindemo/notes_app/data/DataManger;", "schedulerProvider", "Lcom/example/kotlindemo/utils/rxJava/SchedulerProvider;", "(Lcom/example/kotlindemo/notes_app/data/DataManger;Lcom/example/kotlindemo/utils/rxJava/SchedulerProvider;)V", "noteListLiveData", "Landroidx/lifecycle/MutableLiveData;", "", "Lcom/example/kotlindemo/notes_app/data/model/NoteEntity;", "getNoteListLiveData", "()Landroidx/lifecycle/MutableLiveData;", "setNoteListLiveData", "(Landroidx/lifecycle/MutableLiveData;)V", "getNoteData", "", "getNoteLiveData", "Landroidx/lifecycle/LiveData;", "insertNote", "title", "", "desc", "onAddNoteClick", "updateNote", "app_debug"})
public final class NoteViewModel extends com.example.kotlindemo.notes_app.ui.base.BaseViewModel<com.example.kotlindemo.notes_app.ui.NoteNavigator> {
    @org.jetbrains.annotations.NotNull()
    private androidx.lifecycle.MutableLiveData<java.util.List<com.example.kotlindemo.notes_app.data.model.NoteEntity>> noteListLiveData;
    
    public NoteViewModel(@org.jetbrains.annotations.NotNull()
    com.example.kotlindemo.notes_app.data.DataManger dataManger, @org.jetbrains.annotations.NotNull()
    com.example.kotlindemo.utils.rxJava.SchedulerProvider schedulerProvider) {
        super(null, null);
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.util.List<com.example.kotlindemo.notes_app.data.model.NoteEntity>> getNoteListLiveData() {
        return null;
    }
    
    public final void setNoteListLiveData(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.MutableLiveData<java.util.List<com.example.kotlindemo.notes_app.data.model.NoteEntity>> p0) {
    }
    
    public final void onAddNoteClick() {
    }
    
    public final void insertNote(@org.jetbrains.annotations.NotNull()
    java.lang.String title, @org.jetbrains.annotations.NotNull()
    java.lang.String desc) {
    }
    
    private final void getNoteData() {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.util.List<com.example.kotlindemo.notes_app.data.model.NoteEntity>> getNoteLiveData() {
        return null;
    }
    
    public final void updateNote(@org.jetbrains.annotations.NotNull()
    java.lang.String title, @org.jetbrains.annotations.NotNull()
    java.lang.String desc) {
    }
}