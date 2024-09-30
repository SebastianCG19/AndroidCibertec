package com.example.myapplication

import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.myapplication.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var  binding: ActivityMainBinding


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        enableEdgeToEdge()
        setContentView(binding.root)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        //Comunicacion con el boton
        binding.btnAction.setOnClickListener {

            val textToShow = "${binding.etNombre.text} : ${binding.editTextNumber.text}"

            Toast.makeText(this, textToShow, Toast.LENGTH_LONG).show()

            val newview = Intent(this, Destino::class.java)

            newview.putExtra("nombre" ,"${binding.etNombre.text}")
            newview.putExtra("ep1" ,"${binding.editTextNumber.text}")




        }



    }
}