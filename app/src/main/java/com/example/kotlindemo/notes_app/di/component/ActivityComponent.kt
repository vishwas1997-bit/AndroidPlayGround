package com.example.kotlindemo.notes_app.di.component

import com.example.kotlindemo.notes_app.di.module.ActivityModule
import com.example.kotlindemo.notes_app.di.scope.ActivityScope
import dagger.Component

@ActivityScope
@Component(modules = [ActivityModule::class], dependencies = [AppComponent::class])
interface ActivityComponent {
}