package com.example.kotlindemo.notes_app.data.db

import androidx.room.Database
import com.example.kotlindemo.notes_app.data.db.dao.NoteDao
import com.example.kotlindemo.notes_app.data.model.NoteEntity

@Database(entities = [NoteEntity::class], version = 1)
abstract class NoteDatabase {

    abstract fun NoteDao(): NoteDao?
}