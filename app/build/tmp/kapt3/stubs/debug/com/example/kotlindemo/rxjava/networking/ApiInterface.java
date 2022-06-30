package com.example.kotlindemo.rxjava.networking;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0014\u0010\u0002\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0003H\'J\u000e\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007H\'J\u000e\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0003H\'\u00a8\u0006\n"}, d2 = {"Lcom/example/kotlindemo/rxjava/networking/ApiInterface;", "", "getData", "Lio/reactivex/Observable;", "", "Lcom/example/kotlindemo/rxjava/data/UserModel;", "getDataSingle", "Lio/reactivex/Single;", "Lcom/example/kotlindemo/rxjava/data/QuoteList;", "getQuotes", "app_debug"})
public abstract interface ApiInterface {
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.GET(value = "v1/5dc5f3e2-86b9-4bac-ac17-62a433824aca")
    public abstract io.reactivex.Observable<java.util.List<com.example.kotlindemo.rxjava.data.UserModel>> getData();
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.GET(value = "/quotes")
    public abstract io.reactivex.Observable<com.example.kotlindemo.rxjava.data.QuoteList> getQuotes();
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.GET(value = "/quotes")
    public abstract io.reactivex.Single<com.example.kotlindemo.rxjava.data.QuoteList> getDataSingle();
}