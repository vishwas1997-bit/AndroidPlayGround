package com.example.kotlindemo;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\t\u001a\u00020\nH\u0016J\b\u0010\u000b\u001a\u00020\nH\u0002R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\b\u00a8\u0006\f"}, d2 = {"Lcom/example/kotlindemo/App;", "Landroid/app/Application;", "()V", "appComponent", "Lcom/example/kotlindemo/notes_app/di/component/AppComponent;", "getAppComponent", "()Lcom/example/kotlindemo/notes_app/di/component/AppComponent;", "setAppComponent", "(Lcom/example/kotlindemo/notes_app/di/component/AppComponent;)V", "onCreate", "", "populateDatabase", "app_debug"})
public final class App extends android.app.Application {
    public com.example.kotlindemo.notes_app.di.component.AppComponent appComponent;
    
    public App() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.example.kotlindemo.notes_app.di.component.AppComponent getAppComponent() {
        return null;
    }
    
    public final void setAppComponent(@org.jetbrains.annotations.NotNull
    com.example.kotlindemo.notes_app.di.component.AppComponent p0) {
    }
    
    @java.lang.Override
    public void onCreate() {
    }
    
    private final void populateDatabase() {
    }
}