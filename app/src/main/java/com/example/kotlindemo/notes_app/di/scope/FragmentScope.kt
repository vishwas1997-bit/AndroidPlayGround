package com.example.kotlindemo.notes_app.di.scope

import javax.inject.Qualifier

@Qualifier
@kotlin.annotation.Retention(AnnotationRetention.RUNTIME)
annotation class FragmentScope()
