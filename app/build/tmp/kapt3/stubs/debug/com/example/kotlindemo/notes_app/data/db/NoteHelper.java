package com.example.kotlindemo.notes_app.data.db;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0014\u0010\u0002\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0003H&J\u0016\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u00032\u0006\u0010\b\u001a\u00020\u0005H&\u00a8\u0006\t"}, d2 = {"Lcom/example/kotlindemo/notes_app/data/db/NoteHelper;", "", "getNoteList", "Lio/reactivex/Observable;", "", "Lcom/example/kotlindemo/notes_app/data/model/NoteEntity;", "insertNote", "", "noteEntity", "app_debug"})
public abstract interface NoteHelper {
    
    @org.jetbrains.annotations.NotNull()
    public abstract io.reactivex.Observable<java.util.List<com.example.kotlindemo.notes_app.data.model.NoteEntity>> getNoteList();
    
    @org.jetbrains.annotations.NotNull()
    public abstract io.reactivex.Observable<java.lang.Boolean> insertNote(@org.jetbrains.annotations.NotNull()
    com.example.kotlindemo.notes_app.data.model.NoteEntity noteEntity);
}