package com.blessednafula.recyclerviews

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.blessednafula.recyclerviews.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding:ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding=ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        displayNames()

    }
    fun  displayNames(){
        val nameList= listOf("Respah","Joyce","Lilian","Lucy","Sharon","Aminah","Zuenah","Naomi","Sarah")
      binding.rvNames.layoutManager=LinearLayoutManager(this)
        val namesAdapter=namesRecyclerViewAdapter(nameList)
        binding.rvNames.adapter = namesAdapter
    }


    }
