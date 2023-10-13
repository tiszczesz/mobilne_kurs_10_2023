package com.example.cw1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    private var _counter:Int = 0;
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val button = findViewById<Button>(R.id.button3)
        val info = findViewById<TextView>(R.id.textView2)
        val counterView = findViewById<TextView>(R.id.tvCounter)
        button.setOnClickListener {
            _counter = (_counter+1)%10;
          counterView.text = _counter.toString()
        }
    }
}