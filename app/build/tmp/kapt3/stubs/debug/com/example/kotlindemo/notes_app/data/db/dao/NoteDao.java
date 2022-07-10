package com.example.kotlindemo.notes_app.data.db.dao;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\'J,\u0010\u0004\u001a\u0014\u0012\u000e\u0012\f\u0012\u0006\u0012\u0004\u0018\u00010\u0007\u0018\u00010\u0006\u0018\u00010\u00052\b\u0010\b\u001a\u0004\u0018\u00010\t2\u0006\u0010\n\u001a\u00020\u000bH\'J\u0012\u0010\f\u001a\u00020\u00032\b\u0010\r\u001a\u0004\u0018\u00010\u0007H\'\u00a8\u0006\u000e"}, d2 = {"Lcom/example/kotlindemo/notes_app/data/db/dao/NoteDao;", "", "deleteAllNotes", "", "getNotesList", "Landroidx/lifecycle/LiveData;", "", "Lcom/example/kotlindemo/notes_app/data/model/NoteEntity;", "userId", "", "flag", "", "insert", "notesEntity", "app_debug"})
public abstract interface NoteDao {
    
    @org.jetbrains.annotations.Nullable()
    @androidx.room.Query(value = "SELECT * FROM notes_table ORDER BY local_id DESC")
    public abstract androidx.lifecycle.LiveData<java.util.List<com.example.kotlindemo.notes_app.data.model.NoteEntity>> getNotesList(@org.jetbrains.annotations.Nullable()
    java.lang.String userId, int flag);
    
    @androidx.room.Insert(onConflict = androidx.room.OnConflictStrategy.REPLACE)
    public abstract void insert(@org.jetbrains.annotations.Nullable()
    com.example.kotlindemo.notes_app.data.model.NoteEntity notesEntity);
    
    @androidx.room.Query(value = "delete from notes_table")
    public abstract void deleteAllNotes();
}