package com.example.kotlindemo.notes_app.di.component

import com.example.kotlindemo.notes_app.App
import com.example.kotlindemo.notes_app.di.module.AppModule
import dagger.Component

@Component(modules = [AppModule::class])
interface AppComponent {

    fun inject(app: App)
}