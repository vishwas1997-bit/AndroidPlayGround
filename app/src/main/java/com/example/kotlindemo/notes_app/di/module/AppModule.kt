package com.example.kotlindemo.notes_app.di.module

import android.content.Context
import androidx.room.Room
import com.example.kotlindemo.notes_app.data.db.NoteDatabase
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
class AppModule {

    @Provides
    @Singleton
    fun provideNoteDb(mContext : Context) : NoteDatabase {
        return Room.databaseBuilder(mContext,NoteDatabase::class.java,"NotesDataBase")
            .fallbackToDestructiveMigration()
            .build()
    }
}