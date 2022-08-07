package com.example.kotlindemo

import android.Manifest.permission.*
import android.content.Intent
import android.content.pm.PackageManager
import android.os.Build
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.ContextCompat
import androidx.databinding.DataBindingUtil
import com.example.kotlindemo.alarm_manager.AlarmActivity
import com.example.kotlindemo.databinding.ActivityMainBinding
import com.example.kotlindemo.lauchmodedemo.FirstActivity
import com.example.kotlindemo.notes_app.NoteActivity
import com.example.kotlindemo.workmanager.WorkManagerActivity

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private val REQUESTCODE = 1603

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)
        checkForPermission()

        binding.btnDataFetch.setOnClickListener {
            startActivity(Intent(this@MainActivity, FirstActivity::class.java))
        }

        binding.noteApp.setOnClickListener {
            startActivity(Intent(this@MainActivity, NoteActivity::class.java))
        }

        binding.alarmApp.setOnClickListener {
            startActivity(Intent(this@MainActivity, AlarmActivity::class.java))
        }

        binding.workManagerApp.setOnClickListener {
            startActivity(Intent(this@MainActivity, WorkManagerActivity::class.java))
        }
    }

    private fun checkForPermission() {
        val permission = ContextCompat.checkSelfPermission(this, ACCESS_FINE_LOCATION)
        val permission1 = ContextCompat.checkSelfPermission(this, ACCESS_COARSE_LOCATION)
        val permission2 = ContextCompat.checkSelfPermission(this, CAMERA)
        if (permission != PackageManager.PERMISSION_GRANTED || permission1 != PackageManager.PERMISSION_GRANTED
            || permission2 != PackageManager.PERMISSION_GRANTED
        ) {
            if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M) {
                requestPermissions(
                    arrayOf(ACCESS_FINE_LOCATION, ACCESS_COARSE_LOCATION, CAMERA),
                    REQUESTCODE
                )
            }
        }
    }

    override fun onRequestPermissionsResult(
        requestCode: Int,
        permissions: Array<out String>,
        grantResults: IntArray
    ) {
        super.onRequestPermissionsResult(requestCode, permissions, grantResults)
        if (requestCode == REQUESTCODE) {
            for (i in permissions.indices) {
                when (permissions[i]) {
                    ACCESS_FINE_LOCATION, ACCESS_COARSE_LOCATION ->
                        if (grantResults[i] != PackageManager.PERMISSION_GRANTED) {
                            if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M) {
                                requestPermissions(
                                    arrayOf(ACCESS_FINE_LOCATION),
                                    REQUESTCODE
                                )
                            }
                        }
                    CAMERA ->
                        if (grantResults[i] != PackageManager.PERMISSION_GRANTED) {
                            if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M) {
                                requestPermissions(
                                    arrayOf(CAMERA),
                                    REQUESTCODE
                                )
                            }
                        }
                }

            }
        }
    }
}