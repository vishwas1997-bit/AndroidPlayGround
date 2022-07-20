package com.example.kotlindemo.notes_app.di.component;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001:\u0001\nJ\b\u0010\u0002\u001a\u00020\u0003H&J\b\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH&\u00a8\u0006\u000b"}, d2 = {"Lcom/example/kotlindemo/notes_app/di/component/AppComponent;", "", "getDataManager", "Lcom/example/kotlindemo/notes_app/data/DataManger;", "getSchedulerProvider", "Lcom/example/kotlindemo/Utils/rxJava/SchedulerProvider;", "inject", "", "app", "Lcom/example/kotlindemo/notes_app/App;", "Builder", "app_debug"})
@dagger.Component(modules = {com.example.kotlindemo.notes_app.di.module.AppModule.class})
@javax.inject.Singleton()
public abstract interface AppComponent {
    
    public abstract void inject(@org.jetbrains.annotations.NotNull()
    com.example.kotlindemo.notes_app.App app);
    
    @org.jetbrains.annotations.NotNull()
    public abstract com.example.kotlindemo.notes_app.data.DataManger getDataManager();
    
    @org.jetbrains.annotations.NotNull()
    public abstract com.example.kotlindemo.Utils.rxJava.SchedulerProvider getSchedulerProvider();
    
    @kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bg\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0003H\'J\b\u0010\u0004\u001a\u00020\u0005H&\u00a8\u0006\u0006"}, d2 = {"Lcom/example/kotlindemo/notes_app/di/component/AppComponent$Builder;", "", "application", "Landroid/app/Application;", "build", "Lcom/example/kotlindemo/notes_app/di/component/AppComponent;", "app_debug"})
    @dagger.Component.Builder()
    public static abstract interface Builder {
        
        @org.jetbrains.annotations.NotNull()
        @dagger.BindsInstance()
        public abstract com.example.kotlindemo.notes_app.di.component.AppComponent.Builder application(@org.jetbrains.annotations.NotNull()
        android.app.Application application);
        
        @org.jetbrains.annotations.NotNull()
        public abstract com.example.kotlindemo.notes_app.di.component.AppComponent build();
    }
}