package com.example.cw3

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btn1 = findViewById<Button>(R.id.btn1)
        val btn2 = findViewById<Button>(R.id.btn2)
        Log.d("CYCLE","OnCreate")

        btn1.setOnClickListener {
            //Toast.makeText(this@MainActivity,"do drugiej",Toast.LENGTH_SHORT).show()
            val intent = Intent(this,SecondActivity::class.java)
            startActivity(intent)
        }
        btn2.setOnClickListener {
           // Toast.makeText(this@MainActivity,"do trzeciej",Toast.LENGTH_SHORT).show()
            val intent = Intent(this,ThirdActivity::class.java)
            startActivity(intent)
        }
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