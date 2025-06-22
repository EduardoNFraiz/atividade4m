package com.eduardo.exercicio4

import android.content.Intent
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.eduardo.exercicio4.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        initListeners()

    }

    private fun initListeners(){
        binding.buttonLogin.setOnClickListener {
            startActivity(Intent(this,MainActivity2::class.java))
        }
        binding.buttonCadastro.setOnClickListener {
            startActivity(Intent(this,MainActivity2::class.java))
        }
    }
}