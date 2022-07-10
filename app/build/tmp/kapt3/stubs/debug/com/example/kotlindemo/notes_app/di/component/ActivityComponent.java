package com.example.kotlindemo.notes_app.di.component;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bg\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&\u00a8\u0006\u0006"}, d2 = {"Lcom/example/kotlindemo/notes_app/di/component/ActivityComponent;", "", "inject", "", "activity", "Lcom/example/kotlindemo/notes_app/NoteActivity;", "app_debug"})
@dagger.Component(modules = {com.example.kotlindemo.notes_app.di.module.ActivityModule.class}, dependencies = {com.example.kotlindemo.notes_app.di.component.AppComponent.class})
@com.example.kotlindemo.notes_app.di.scope.ActivityScope()
public abstract interface ActivityComponent {
    
    public abstract void inject(@org.jetbrains.annotations.NotNull()
    com.example.kotlindemo.notes_app.NoteActivity activity);
}