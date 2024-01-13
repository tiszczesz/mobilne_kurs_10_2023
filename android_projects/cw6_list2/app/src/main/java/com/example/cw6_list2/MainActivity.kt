package com.example.cw6_list2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import com.example.cw6_list2.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var bind:ActivityMainBinding
    var pririty = arrayListOf<Priority>(
        Priority.LOW,
        Priority.MIDDLE,
        Priority.HIGH,
        Priority.ALERT
    )
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        bind = ActivityMainBinding.inflate(layoutInflater)
        setContentView(bind.root)
        val todos = arrayListOf<Todo>(Todo("ranne",Priority.ALERT), Todo("inne",Priority.LOW))
        val adapterSpin = ArrayAdapter<Priority>(
            this,
            android.R.layout.simple_spinner_dropdown_item,
            pririty)
        bind.spPriority.adapter = adapterSpin;
        val listAdapter = ArrayAdapter<Todo>(this,android.R.layout.simple_list_item_1,todos)
        bind.lvTodos.adapter = listAdapter;
        bind.btnAdd.setOnClickListener {
            val item = bind.edItem.text.toString().trim()
            val prior = bind.spPriority.selectedItem as Priority;
            if(item.isEmpty()) return@setOnClickListener
           // Toast.makeText(this@MainActivity,"wybrano $prior",Toast.LENGTH_LONG).show()
            val myTodo = Todo(item,prior)
            listAdapter.add(myTodo)
            listAdapter.notifyDataSetChanged()
            bind.edItem.setText("")
        }
        bind.lvTodos.setOnItemClickListener { parent, view, position, id ->
            todos.removeAt(id.toInt())
            listAdapter.notifyDataSetChanged()
        }
    }
}