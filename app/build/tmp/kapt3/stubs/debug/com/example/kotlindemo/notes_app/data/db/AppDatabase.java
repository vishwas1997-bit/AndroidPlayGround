package com.example.kotlindemo.notes_app.data.db;

import java.lang.System;

@androidx.room.Database(entities = {com.example.kotlindemo.notes_app.data.model.NoteEntity.class}, version = 1, exportSchema = true)
@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\'\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\n\u0010\u0003\u001a\u0004\u0018\u00010\u0004H&\u00a8\u0006\u0005"}, d2 = {"Lcom/example/kotlindemo/notes_app/data/db/AppDatabase;", "Landroidx/room/RoomDatabase;", "()V", "getNoteDao", "Lcom/example/kotlindemo/notes_app/data/db/dao/NoteDao;", "app_debug"})
public abstract class AppDatabase extends androidx.room.RoomDatabase {
    
    public AppDatabase() {
        super();
    }
    
    @org.jetbrains.annotations.Nullable
    public abstract com.example.kotlindemo.notes_app.data.db.dao.NoteDao getNoteDao();
}