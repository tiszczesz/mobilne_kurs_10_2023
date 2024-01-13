package com.example.cw5_lists

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.Toast
import com.example.cw5_lists.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var bind: ActivityMainBinding;
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        bind = ActivityMainBinding.inflate(layoutInflater)
        setContentView(bind.root)
        val myTodos = arrayListOf<String>("Wstać rano", "Umyć się", "Zjeść");
        val listAdapter = ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, myTodos)
        bind.lvTodos.adapter = listAdapter
        bind.btnAdd.setOnClickListener {
            val item = bind.ed1.text.toString().trim();
            if (item.isEmpty()) return@setOnClickListener
            //Toast.makeText(this@MainActivity," ilosc elementow: ${myTodos.count()}",Toast.LENGTH_SHORT).show()
            myTodos.add(item)
            listAdapter.notifyDataSetChanged()
            bind.ed1.setText("")
            Toast.makeText(
                this@MainActivity,
                " ilosc elementow: ${myTodos.count()}",
                Toast.LENGTH_SHORT
            ).show()
        }
//        bind.lvTodos.onItemClickListener =
//            AdapterView.OnItemClickListener { adapterView, view, position, id ->
//                val selectedItem = adapterView.getItemAtPosition(position) as String
//                val itemPos = adapterView.getItemIdAtPosition(position)
//                Toast.makeText(
//                    this@MainActivity,
//                    "element klikniety na pozycji: $itemPos wartosc: $selectedItem",
//                    Toast.LENGTH_LONG
//                ).show()
//                myTodos.removeAt(id.toInt())
//                listAdapter.notifyDataSetChanged()
//            }
        bind.lvTodos.setOnItemClickListener { parent, view, position, id ->
            val selectedItem = parent.getItemAtPosition(position) as String
            val itemPos = parent.getItemIdAtPosition(position)
            Toast.makeText(
                this@MainActivity, "element klikniety na pozycji: $itemPos wartosc: $selectedItem",
                Toast.LENGTH_LONG
            ).show()
            myTodos.removeAt(id.toInt())
            listAdapter.notifyDataSetChanged()
        }

    }
}