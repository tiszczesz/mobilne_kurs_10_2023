package com.example.cw3

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Log.d("CYCLE","OnCreate")
    }

    override fun onStart() {
        super.onStart()
        Log.d("CYCLE","OnStart")
    }

    override fun onResume() {
        super.onResume()
        Log.d("CYCLE","OnResume")
    }

    override fun onPause() {
        super.onPause()
        Log.d("CYCLE","OnPause")
    }

    override fun onStop() {
        super.onStop()
        Log.d("CYCLE","OnStop")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d("CYCLE","OnDestroy")
    }
}