package com.example.kotlindemo.roomdatabase;

import java.lang.System;

@androidx.room.Database(entities = {com.example.kotlindemo.roomdatabase.entity.Dog.class, com.example.kotlindemo.roomdatabase.entity.Owner.class}, version = 1, exportSchema = false)
@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\'\u0018\u0000 \u00052\u00020\u0001:\u0001\u0005B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H&\u00a8\u0006\u0006"}, d2 = {"Lcom/example/kotlindemo/roomdatabase/DogDatabase;", "Landroidx/room/RoomDatabase;", "()V", "dogDao", "Lcom/example/kotlindemo/roomdatabase/DogDao;", "Companion", "app_debug"})
public abstract class DogDatabase extends androidx.room.RoomDatabase {
    @org.jetbrains.annotations.NotNull
    public static final com.example.kotlindemo.roomdatabase.DogDatabase.Companion Companion = null;
    private static com.example.kotlindemo.roomdatabase.DogDatabase instance;
    
    public DogDatabase() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public abstract com.example.kotlindemo.roomdatabase.DogDao dogDao();
    
    @kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0007R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\b"}, d2 = {"Lcom/example/kotlindemo/roomdatabase/DogDatabase$Companion;", "", "()V", "instance", "Lcom/example/kotlindemo/roomdatabase/DogDatabase;", "getInstance", "ctx", "Landroid/content/Context;", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull
        @kotlin.jvm.Synchronized
        public final synchronized com.example.kotlindemo.roomdatabase.DogDatabase getInstance(@org.jetbrains.annotations.NotNull
        android.content.Context ctx) {
            return null;
        }
    }
}