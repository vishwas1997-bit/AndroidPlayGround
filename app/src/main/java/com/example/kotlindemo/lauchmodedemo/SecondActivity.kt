package com.example.kotlindemo.lauchmodedemo

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.databinding.DataBindingUtil
import com.example.kotlindemo.R
import com.example.kotlindemo.databinding.ActivitySecondBinding

class SecondActivity : AppCompatActivity() {

    private lateinit var binding: ActivitySecondBinding
    
    
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this,R.layout.activity_second)

        binding.btn.setOnClickListener{
            startActivity(Intent(this,ThirdActivity::class.java))
        }

        Log.i("TAG_VK", "onCreate of SecondActivity")
    }

    override fun onBackPressed() {
        super.onBackPressed()
        overridePendingTransition(R.anim.left_to_right,R.anim.right_to_left)
    }

    override fun onStart() {
        super.onStart()
        Log.i("TAG_VK", "onStart of SecondActivity")
    }

    override fun onResume() {
        super.onResume()
        Log.i("TAG_VK", "onResume of SecondActivity")
    }

    override fun onPause() {
        super.onPause()
        Log.i("TAG_VK", "onPause of SecondActivity")
    }

    override fun onRestart() {
        super.onRestart()
        Log.i("TAG_VK", "onRestart of SecondActivity")
    }

    override fun onStop() {
        super.onStop()
        Log.i("TAG_VK", "onStop of SecondActivity")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.i("TAG_VK", "onDestroy of SecondActivity")
    }
}