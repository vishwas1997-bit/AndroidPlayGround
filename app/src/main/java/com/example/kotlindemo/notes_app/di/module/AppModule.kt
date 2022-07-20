package com.example.kotlindemo.notes_app.di.module

import android.app.Application
import android.content.Context
import androidx.annotation.Nullable
import androidx.room.Room
import com.example.kotlindemo.Utils.rxJava.AppSchedulerProvider
import com.example.kotlindemo.Utils.rxJava.SchedulerProvider
import com.example.kotlindemo.notes_app.data.AppDataManger
import com.example.kotlindemo.notes_app.data.DataManger
import com.example.kotlindemo.notes_app.data.db.AppDatabase
import com.example.kotlindemo.notes_app.data.db.AppDbHelper
import com.example.kotlindemo.notes_app.data.db.DbHelper
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
class AppModule {

    @Provides
    @Singleton
    fun provideNoteDb(mContext : Context) : AppDatabase {
        return Room.databaseBuilder(mContext,AppDatabase::class.java,"NotesDataBase")
            .fallbackToDestructiveMigration()
            .build()
    }

    @Provides
    fun provideContext(application: Application) : Context{
        return application
    }

    @Provides
    fun provideDbHelper(appDbHelper: AppDbHelper): DbHelper {
        return appDbHelper
    }

    @Singleton
    @Provides
    fun provideDataManger(appDataManger: AppDataManger) : DataManger{
        return appDataManger
    }

    @Provides
    fun provideScheduler(): SchedulerProvider {
        return AppSchedulerProvider()
    }
}