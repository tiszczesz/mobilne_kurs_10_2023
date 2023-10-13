package com.example.cw2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import java.lang.NumberFormatException

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val edA = findViewById<EditText>(R.id.etA)
        val edB = findViewById<EditText>(R.id.etB)
        val result = findViewById<TextView>(R.id.tvResult)
        val btnAdd = findViewById<Button>(R.id.btnAdd)
        val btnDivided = findViewById<Button>(R.id.btnDivided)


        btnAdd.setOnClickListener {
            try {
                val a:Double = edA.text.toString().toDouble()
                val b:Double = edB.text.toString().toDouble()
                result.text = "$a + $b = ${a+b}"
            }catch (ex:NumberFormatException){
                result.text = "ERROR!!!!"
            }
        }
        btnDivided.setOnClickListener {
            try {
                val a:Double = edA.text.toString().toDouble()
                val b:Double = edB.text.toString().toDouble()
                val divided = if(b.toInt()==0) "Error ZERO" else (a/b).toString()
                result.text = "$a / $b = ${divided}"
            }catch (ex:NumberFormatException){
                result.text = "ERROR!!!!"
            }
        }

    }
}