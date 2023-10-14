package com.example.kotlindemo.lauchmodedemo

import android.content.Intent
import android.os.Bundle
import android.os.PersistableBundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import com.example.kotlindemo.R
import com.example.kotlindemo.databinding.ActivityFirstBinding


class FirstActivity : AppCompatActivity() {

    private lateinit var binding: ActivityFirstBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_first)

        binding.btn.setOnClickListener {
            startActivity(Intent(this, SecondActivity::class.java))
            overridePendingTransition(R.anim.enter, R.anim.exit)
        }
        Log.i("TAG_VK", "onCreate of FirstActivity")
    }

    override fun onStart() {
        super.onStart()
        Log.i("TAG_VK", "onStart of FirstActivity")
    }

    override fun onResume() {
        super.onResume()
        Log.i("TAG_VK", "onResume of FirstActivity")
    }

    override fun onPause() {
        super.onPause()
        Log.i("TAG_VK", "onPause of FirstActivity")
    }

    override fun onRestart() {
        super.onRestart()
        Log.i("TAG_VK", "onRestart of FirstActivity")
    }

    override fun onStop() {
        super.onStop()
        Log.i("TAG_VK", "onStop of FirstActivity")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.i("TAG_VK", "onDestroy of FirstActivity")
    }
}