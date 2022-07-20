package com.example.kotlindemo.notes_app.data.db

import androidx.room.Database
import androidx.room.RoomDatabase
import com.example.kotlindemo.notes_app.data.db.dao.NoteDao
import com.example.kotlindemo.notes_app.data.model.NoteEntity

@Database(entities = [NoteEntity::class], version = 1, exportSchema = true)
abstract class AppDatabase : RoomDatabase() {

    abstract fun getNoteDao(): NoteDao?
}