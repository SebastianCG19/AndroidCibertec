package com.example.myapplication

import android.content.Intent
import android.os.Bundle
import android.util.Log
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.myapplication.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityMainBinding.inflate(layoutInflater)
        enableEdgeToEdge()
        setContentView(binding.root)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        Log.d("ejercicioKT", "onCreate")

        /* evento click KTL*/
        binding.btnMove.setOnClickListener {
            val intent = Intent(this, Destino::class.java)
            startActivity(intent)
        }
        binding.txtVi.text = "Soy nuevo en KTL uwu"
    }

    override fun onResume() {
        super.onResume()
        Log.d("ejercicioKT", "onResume")
    }

    override fun onPause() {
        super.onPause()
        Log.d("ejercicioKT", "onPause")
    }

    override fun onStart() {
        super.onStart()
        Log.d("ejercicioKT", "onStart")
    }

    override fun onStop() {
        super.onStop()
        Log.d("ejercicioKT", "onStop")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d("ejercicioKT", "onDestroy")
    }



}