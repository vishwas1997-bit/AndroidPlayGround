package com.example.kotlindemo.rxjava.networking

import com.example.kotlindemo.rxjava.data.QuoteList
import com.example.kotlindemo.rxjava.data.UserModel
import io.reactivex.Observable
import io.reactivex.Single
import retrofit2.http.GET

interface ApiInterface {

    @GET("v1/5dc5f3e2-86b9-4bac-ac17-62a433824aca")
    fun getData() : Observable<List<UserModel>>

    @GET("/quotes")
    fun getQuotes() : Observable<QuoteList>

    @GET("/quotes")
    fun getDataSingle() : Single<QuoteList>
}