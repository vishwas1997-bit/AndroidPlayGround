package com.example.kotlindemo.notes_app

import android.app.Application
import com.example.kotlindemo.notes_app.di.component.AppComponent
import com.example.kotlindemo.notes_app.di.component.DaggerAppComponent
import com.example.kotlindemo.notes_app.di.module.AppModule

class App : Application() {

    lateinit var appComponent : AppComponent

    override fun onCreate() {
        super.onCreate()

        appComponent = DaggerAppComponent.builder()
            .appModule(AppModule()).build()

        appComponent.inject(this)
    }
}