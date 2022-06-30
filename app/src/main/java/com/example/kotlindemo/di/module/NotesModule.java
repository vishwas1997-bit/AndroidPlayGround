package com.example.kotlindemo.di.module;

import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;

import androidx.room.Room;

import com.example.kotlindemo.di.local.NoteDatabase;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

@Module
public class NotesModule {
    private final Context context;

    public NotesModule(Context context) {
        this.context = context;
    }

    @Singleton
    @Provides
    public Context provideContext() {
        return context;
    }

    @Singleton
    @Provides
    public SharedPreferences provideSharedPreferences(Context context) {
        return PreferenceManager.getDefaultSharedPreferences(context);
    }

    @Singleton
    @Provides
    public NoteDatabase getNotesDb( ){
        return Room.databaseBuilder(context,NoteDatabase.class,"NoteDatabase")
                .fallbackToDestructiveMigration()
                .allowMainThreadQueries()
                .build();
    }
}
