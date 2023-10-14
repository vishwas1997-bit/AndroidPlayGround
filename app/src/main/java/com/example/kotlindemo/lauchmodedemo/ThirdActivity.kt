package com.example.kotlindemo.lauchmodedemo

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.databinding.DataBindingUtil
import com.example.kotlindemo.R
import com.example.kotlindemo.databinding.ActivityThirdBinding

class ThirdActivity : AppCompatActivity() {

    private lateinit var binding: ActivityThirdBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this,R.layout.activity_third)

        binding.btn.setOnClickListener{
            val intent = Intent(this,SecondActivity::class.java)
//            intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK)
            startActivity(intent)
        }

        Log.i("TAG_VK", "onCreate of ThirdActivity")
    }

    override fun onStart() {
        super.onStart()
        Log.i("TAG_VK", "onStart of ThirdActivity")
    }

    override fun onResume() {
        super.onResume()
        Log.i("TAG_VK", "onResume of ThirdActivity")
    }

    override fun onPause() {
        super.onPause()
        Log.i("TAG_VK", "onPause of ThirdActivity")
    }

    override fun onRestart() {
        super.onRestart()
        Log.i("TAG_VK", "onRestart of ThirdActivity")
    }

    override fun onStop() {
        super.onStop()
        Log.i("TAG_VK", "onStop of ThirdActivity")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.i("TAG_VK", "onDestroy of ThirdActivity")
    }
}