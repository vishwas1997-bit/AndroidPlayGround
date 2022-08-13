package com.example.kotlindemo.notes_app.data.db;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0014\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u0006H\u0016J\u0016\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u00062\u0006\u0010\u000b\u001a\u00020\bH\u0016J\u0019\u0010\f\u001a\u00020\r2\u0006\u0010\u000b\u001a\u00020\bH\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u000eR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u000f"}, d2 = {"Lcom/example/kotlindemo/notes_app/data/db/AppDbHelper;", "Lcom/example/kotlindemo/notes_app/data/db/DbHelper;", "mDatabase", "Lcom/example/kotlindemo/notes_app/data/db/AppDatabase;", "(Lcom/example/kotlindemo/notes_app/data/db/AppDatabase;)V", "getNoteList", "Lio/reactivex/Observable;", "", "Lcom/example/kotlindemo/notes_app/data/model/NoteEntity;", "insertNote", "", "noteEntity", "updateNote", "", "(Lcom/example/kotlindemo/notes_app/data/model/NoteEntity;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_debug"})
public final class AppDbHelper implements com.example.kotlindemo.notes_app.data.db.DbHelper {
    private final com.example.kotlindemo.notes_app.data.db.AppDatabase mDatabase = null;
    
    @javax.inject.Inject()
    public AppDbHelper(@org.jetbrains.annotations.NotNull()
    com.example.kotlindemo.notes_app.data.db.AppDatabase mDatabase) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public io.reactivex.Observable<java.util.List<com.example.kotlindemo.notes_app.data.model.NoteEntity>> getNoteList() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public io.reactivex.Observable<java.lang.Boolean> insertNote(@org.jetbrains.annotations.NotNull()
    com.example.kotlindemo.notes_app.data.model.NoteEntity noteEntity) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.Object updateNote(@org.jetbrains.annotations.NotNull()
    com.example.kotlindemo.notes_app.data.model.NoteEntity noteEntity, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return null;
    }
}