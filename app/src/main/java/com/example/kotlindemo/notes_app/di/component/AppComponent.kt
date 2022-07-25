package com.example.kotlindemo.notes_app.di.component

import android.app.Application
import com.example.kotlindemo.utils.rxJava.SchedulerProvider
import com.example.kotlindemo.notes_app.App
import com.example.kotlindemo.notes_app.data.DataManger
import com.example.kotlindemo.notes_app.di.module.AppModule
import dagger.BindsInstance
import dagger.Component
import javax.inject.Singleton

@Singleton
@Component(modules = [AppModule::class])
interface AppComponent {

    fun inject(app: App)

    fun getDataManager() : DataManger

    fun getSchedulerProvider() : SchedulerProvider

    @Component.Builder
    interface Builder {
        @BindsInstance
        fun application(application: Application): Builder

        fun build(): AppComponent
    }
}