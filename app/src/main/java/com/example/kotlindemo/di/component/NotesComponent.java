package com.example.kotlindemo.di.component;

import com.example.kotlindemo.di.InsertDataActivity;
import com.example.kotlindemo.di.module.NotesModule;

import javax.inject.Singleton;

import dagger.Component;

@Singleton
@Component(modules = {NotesModule.class})
public interface NotesComponent {
    void inject(InsertDataActivity activity);
}
