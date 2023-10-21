package com.example.cw4

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.cw4.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var bind:ActivityMainBinding;
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        bind = ActivityMainBinding.inflate(layoutInflater)
        setContentView(bind.root)
        bind.btnInfo.setOnClickListener {
            val info = bind.edInfo.text.toString().trim()
            if
        }
    }
}