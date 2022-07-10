package com.example.kotlindemo.notes_app.di.component

import com.example.kotlindemo.notes_app.di.module.FragmentModule
import com.example.kotlindemo.notes_app.di.scope.FragmentScope
import com.example.kotlindemo.notes_app.ui.fragment.NoteAddFragment
import com.example.kotlindemo.notes_app.ui.fragment.NoteListFragment
import com.example.kotlindemo.notes_app.ui.fragment.NoteUpdateFragment
import dagger.Component


@FragmentScope
@Component(modules = [FragmentModule::class], dependencies = [AppComponent::class])
interface FragmentComponent {

    fun inject(fragment : NoteListFragment)

    fun inject(fragment: NoteAddFragment)

    fun inject(fragment: NoteUpdateFragment)

}