package com.example.kotlindemo.notes_app.data.db.dao;

import java.lang.System;

@androidx.room.Dao()
@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\bg\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\'J\u0014\u0010\u0004\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u00060\u0005H\'J\u0012\u0010\b\u001a\u00020\u00032\b\u0010\t\u001a\u0004\u0018\u00010\u0007H\'\u00a8\u0006\n"}, d2 = {"Lcom/example/kotlindemo/notes_app/data/db/dao/NoteDao;", "", "deleteAllNotes", "", "getNotesList", "Lio/reactivex/Observable;", "", "Lcom/example/kotlindemo/notes_app/data/model/NoteEntity;", "insert", "notesEntity", "app_debug"})
public abstract interface NoteDao {
    
    @org.jetbrains.annotations.NotNull()
    @androidx.room.Query(value = "SELECT * FROM notes_table ORDER BY local_id DESC")
    public abstract io.reactivex.Observable<java.util.List<com.example.kotlindemo.notes_app.data.model.NoteEntity>> getNotesList();
    
    @androidx.room.Insert(onConflict = androidx.room.OnConflictStrategy.REPLACE)
    public abstract void insert(@org.jetbrains.annotations.Nullable()
    com.example.kotlindemo.notes_app.data.model.NoteEntity notesEntity);
    
    @androidx.room.Query(value = "delete from notes_table")
    public abstract void deleteAllNotes();
}