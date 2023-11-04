package com.example.cw5_lists

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.Toast
import com.example.cw5_lists.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var bind:ActivityMainBinding;
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        bind = ActivityMainBinding.inflate(layoutInflater)
        setContentView(bind.root)
        val myTodos = arrayListOf<String>("Wstać rano","Umyć się","Zjeść");
        val listAdapter= ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,myTodos)
        bind.lvTodos.adapter = listAdapter
        bind.btnAdd.setOnClickListener {
            val item = bind.ed1.text.toString().trim();
            if(item.isEmpty()) return@setOnClickListener
            Toast.makeText(this@MainActivity," ilosc elementow: ${myTodos.count()}",Toast.LENGTH_SHORT).show()
        }

    }
}