package com.example.kotlindemo.notes_app.di.component

import com.example.kotlindemo.notes_app.di.module.FragmentModule
import com.example.kotlindemo.notes_app.di.scope.FragmentScope
import dagger.Component


@FragmentScope
@Component(modules = [FragmentModule::class], dependencies = [AppComponent::class])
interface FragmentComponent {
}