package com.eduardo.exercicio4

import android.content.Intent
import android.os.Bundle
import android.text.InputType
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.eduardo.exercicio4.databinding.ActivityMain2Binding
import com.eduardo.exercicio4.databinding.ActivityMainBinding
import android.text.method.HideReturnsTransformationMethod
import android.text.method.PasswordTransformationMethod


class MainActivity2 : AppCompatActivity() {

    private lateinit var binding: ActivityMain2Binding
    private var senhaVisivel = false

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMain2Binding.inflate(layoutInflater)
        setContentView(binding.root)

        initListeners()
        mostrarOcultarSenha()

    }

    private fun initListeners() {
        binding.imageButtonVoltar.setOnClickListener {
            startActivity(Intent(this, MainActivity::class.java))
        }
        binding.buttonLogar.setOnClickListener {
            startActivity(Intent(this, MainActivity3::class.java))
        }
    }


    private fun mostrarOcultarSenha() {
        binding.ivToggleSenha.setOnClickListener {
            senhaVisivel = !senhaVisivel

            if (senhaVisivel) {
                // Mostrar senha
                binding.etSenha.inputType =
                    InputType.TYPE_CLASS_TEXT or InputType.TYPE_TEXT_VARIATION_VISIBLE_PASSWORD
                binding.ivToggleSenha.setImageResource(R.drawable.olhomostrar)
            } else {
                // Ocultar senha
                binding.etSenha.inputType =
                    InputType.TYPE_CLASS_TEXT or InputType.TYPE_TEXT_VARIATION_PASSWORD
                binding.ivToggleSenha.setImageResource(R.drawable.olhoocultar)
            }
        }
    }
}

