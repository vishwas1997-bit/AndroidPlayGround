package com.example.kotlindemo.utils.rxJava;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\n\u0010\u0002\u001a\u0004\u0018\u00010\u0003H&J\n\u0010\u0004\u001a\u0004\u0018\u00010\u0003H&J\n\u0010\u0005\u001a\u0004\u0018\u00010\u0003H&\u00a8\u0006\u0006"}, d2 = {"Lcom/example/kotlindemo/utils/rxJava/SchedulerProvider;", "", "computation", "Lio/reactivex/Scheduler;", "io", "ui", "app_debug"})
public abstract interface SchedulerProvider {
    
    @org.jetbrains.annotations.Nullable
    public abstract io.reactivex.Scheduler computation();
    
    @org.jetbrains.annotations.Nullable
    public abstract io.reactivex.Scheduler io();
    
    @org.jetbrains.annotations.Nullable
    public abstract io.reactivex.Scheduler ui();
}