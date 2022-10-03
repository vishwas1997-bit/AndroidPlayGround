package com.example.kotlindemo.lauchmodedemo

import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import android.content.IntentFilter
import android.location.LocationManager
import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import com.example.kotlindemo.R
import com.example.kotlindemo.databinding.ActivityFirstBinding


class FirstActivity : AppCompatActivity() {

    private lateinit var binding: ActivityFirstBinding
    private lateinit var receiver: BroadcastReceiver
    private val TAG = "FirstActivity"
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this,R.layout.activity_first)
        initReceiver()

        binding.btn.setOnClickListener {
            startActivity(Intent(this, SecondActivity::class.java))
            overridePendingTransition(R.anim.enter,R.anim.exit)
        }
    }

    override fun onStart() {
        super.onStart()
        registerReceiver(receiver,IntentFilter(LocationManager.PROVIDERS_CHANGED_ACTION))
    }

    override fun onDestroy() {
        super.onDestroy()
        unregisterReceiver(receiver)
    }

    private fun initReceiver(){
        receiver = object : BroadcastReceiver(){
            override fun onReceive(p0: Context?, p1: Intent?) {
                if (isInitialStickyBroadcast){
                    return
                }
                Log.i(TAG,"run")
            }
        }
    }
}