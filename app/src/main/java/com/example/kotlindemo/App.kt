package com.example.kotlindemo

import android.app.Application
import com.example.kotlindemo.notes_app.di.component.AppComponent
import com.example.kotlindemo.notes_app.di.component.DaggerAppComponent
import com.example.kotlindemo.roomdatabase.DogDatabase
import com.example.kotlindemo.roomdatabase.entity.Dog
import com.example.kotlindemo.roomdatabase.entity.Owner

class App : Application() {

    lateinit var appComponent : AppComponent

    override fun onCreate() {
        super.onCreate()

        appComponent = DaggerAppComponent.builder()
            .application(this)
            .build()

        appComponent.inject(this)

        populateDatabase()
    }

    private fun populateDatabase() {
        val dogDao = DogDatabase.getInstance(this).dogDao()
        dogDao.insertDog(Dog(dogId = 537, dogOwnerId = 12, name = "1"))
        dogDao.insertDog(Dog(131, 13, "2"))
        dogDao.insertDog(Dog(0,14, "3"))

        dogDao.insertOwner(Owner(12,"1"))
        dogDao.insertOwner(Owner(13,"2"))
        dogDao.insertOwner(Owner(14,"3"))
    }
}