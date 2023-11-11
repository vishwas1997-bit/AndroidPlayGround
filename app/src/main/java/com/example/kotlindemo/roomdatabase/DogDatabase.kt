package com.example.kotlindemo.roomdatabase

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import androidx.sqlite.db.SupportSQLiteDatabase
import com.example.kotlindemo.roomdatabase.entity.Dog
import com.example.kotlindemo.roomdatabase.entity.Owner
import kotlin.concurrent.thread

@Database(entities = [Dog::class, Owner::class], version = 1, exportSchema = false)
abstract class DogDatabase: RoomDatabase() {

    abstract fun dogDao(): DogDao

    companion object {
        private var instance: DogDatabase? = null
        @Synchronized
        fun getInstance(ctx: Context): DogDatabase {
            if(instance == null)
                instance = Room.databaseBuilder(ctx.applicationContext,
                    DogDatabase::class.java,
                    "dog_database")
                    .fallbackToDestructiveMigration()
                    .allowMainThreadQueries()
                    .build()

            return instance!!
        }
    }

}