package com.example.cw4

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.lifecycle.ReportFragment.Companion.reportFragment
import com.example.cw4.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var bind:ActivityMainBinding;
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        bind = ActivityMainBinding.inflate(layoutInflater)
        setContentView(bind.root)
        bind.btnInfo.setOnClickListener {
            val info = bind.edInfo.text.toString().trim()
            if(!info.isEmpty()){
                bind.tvInfo.setText(info)
            }else{
                Toast.makeText(this@MainActivity,"Brak danych",Toast.LENGTH_LONG).show()
            }
        }
        bind.btnFrag1.setOnClickListener { repalceFragment(FirstFragment()) }
        bind.btnFrag2.setOnClickListener { repalceFragment(SecondFragment()) }
    }
    private fun repalceFragment(fragment:Fragment){
        val fragmentManager = supportFragmentManager
        val fragTransaction = fragmentManager.beginTransaction()
        fragTransaction.replace(R.id.fragments,fragment)
        fragTransaction.commit()
    }
}