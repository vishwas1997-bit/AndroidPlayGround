package com.example.kotlindemo.rxjava.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.kotlindemo.R

class DataShowActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_data_show)
//
//        val apiInterface = ApiClient.getInstance().create(ApiInterface::class.java)
//        GlobalScope.launch {
//            val result = apiInterface.getQuotes()
//            val data = apiInterface.getData()
//            if (data != null){
//                Log.d("TAG_VK: ", GsonBuilder().setPrettyPrinting().create().toJson(data.body()))
//            }
//            if (result != null){
//                Log.d("TAG_VK: ", result.body().toString())
//            }
//        }
    }
}