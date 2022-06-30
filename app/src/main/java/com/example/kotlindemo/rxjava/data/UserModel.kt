package com.example.kotlindemo.rxjava.data

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

data class UserModel(
    @Expose
    @SerializedName("name")
    var name : String,
    @Expose
    @SerializedName("city")
    var city : String
    )
