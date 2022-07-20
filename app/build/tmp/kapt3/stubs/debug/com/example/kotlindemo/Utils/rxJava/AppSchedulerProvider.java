package com.example.kotlindemo.Utils.rxJava;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\n\u0010\u0003\u001a\u0004\u0018\u00010\u0004H\u0016J\n\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016J\n\u0010\u0006\u001a\u0004\u0018\u00010\u0004H\u0016\u00a8\u0006\u0007"}, d2 = {"Lcom/example/kotlindemo/Utils/rxJava/AppSchedulerProvider;", "Lcom/example/kotlindemo/Utils/rxJava/SchedulerProvider;", "()V", "computation", "Lio/reactivex/Scheduler;", "io", "ui", "app_debug"})
public final class AppSchedulerProvider implements com.example.kotlindemo.Utils.rxJava.SchedulerProvider {
    
    public AppSchedulerProvider() {
        super();
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public io.reactivex.Scheduler computation() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public io.reactivex.Scheduler io() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public io.reactivex.Scheduler ui() {
        return null;
    }
}