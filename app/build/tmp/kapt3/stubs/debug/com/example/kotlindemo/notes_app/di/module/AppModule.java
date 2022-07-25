package com.example.kotlindemo.notes_app.di.module;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0007J\u0010\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0007J\u0010\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0004H\u0007J\b\u0010\u0012\u001a\u00020\u0013H\u0007\u00a8\u0006\u0014"}, d2 = {"Lcom/example/kotlindemo/notes_app/di/module/AppModule;", "", "()V", "provideContext", "Landroid/content/Context;", "application", "Landroid/app/Application;", "provideDataManger", "Lcom/example/kotlindemo/notes_app/data/DataManger;", "appDataManger", "Lcom/example/kotlindemo/notes_app/data/AppDataManger;", "provideDbHelper", "Lcom/example/kotlindemo/notes_app/data/db/DbHelper;", "appDbHelper", "Lcom/example/kotlindemo/notes_app/data/db/AppDbHelper;", "provideNoteDb", "Lcom/example/kotlindemo/notes_app/data/db/AppDatabase;", "mContext", "provideScheduler", "Lcom/example/kotlindemo/utils/rxJava/SchedulerProvider;", "app_debug"})
@dagger.Module()
public final class AppModule {
    
    public AppModule() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Singleton()
    @dagger.Provides()
    public final com.example.kotlindemo.notes_app.data.db.AppDatabase provideNoteDb(@org.jetbrains.annotations.NotNull()
    android.content.Context mContext) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Provides()
    public final android.content.Context provideContext(@org.jetbrains.annotations.NotNull()
    android.app.Application application) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Provides()
    public final com.example.kotlindemo.notes_app.data.db.DbHelper provideDbHelper(@org.jetbrains.annotations.NotNull()
    com.example.kotlindemo.notes_app.data.db.AppDbHelper appDbHelper) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Provides()
    @javax.inject.Singleton()
    public final com.example.kotlindemo.notes_app.data.DataManger provideDataManger(@org.jetbrains.annotations.NotNull()
    com.example.kotlindemo.notes_app.data.AppDataManger appDataManger) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Provides()
    public final com.example.kotlindemo.utils.rxJava.SchedulerProvider provideScheduler() {
        return null;
    }
}