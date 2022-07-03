package com.example.kotlindemo.di.local;

import androidx.room.Database;
import androidx.room.RoomDatabase;

@Database(entities = DataEntity.class,version = 1)
abstract public class NoteDatabase extends RoomDatabase {

    public abstract DataDao getNoteDao();
}
