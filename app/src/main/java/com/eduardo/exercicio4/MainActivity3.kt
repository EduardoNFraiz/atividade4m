package com.eduardo.exercicio4

import android.animation.ObjectAnimator
import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.eduardo.exercicio4.databinding.ActivityMain3Binding

class MainActivity3 : AppCompatActivity() {

    private lateinit var binding: ActivityMain3Binding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMain3Binding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnUsuarios.post {
            val button = binding.btnUsuarios
            val indicator = binding.indicator

            // Calcula a posição central do botão "Usuários" menos metade da largura da barra
            val targetX = button.x + button.width / 2f - indicator.width / 2f

            // Define a posição inicial do indicador
            indicator.translationX = targetX

            initListeners()
        }


        // Clique nos botões
        binding.btnUsuarios.setOnClickListener { moveIndicatorTo(it) }
        binding.btnBrechos.setOnClickListener { moveIndicatorTo(it) }
        binding.btnVendas.setOnClickListener { moveIndicatorTo(it) }
    }

    private fun moveIndicatorTo(button: View) {
        val targetX = button.x + button.width / 2 - binding.indicator.width / 2
        val animator = ObjectAnimator.ofFloat(binding.indicator, "translationX", targetX)
        animator.duration = 200
        animator.start()
    }

    private fun initListeners(){
        binding.cardView1.setOnClickListener {
            startActivity(Intent(this,MainActivity2::class.java))
        }
        binding.cardView2.setOnClickListener {
            startActivity(Intent(this,MainActivity2::class.java))
        }
        binding.cardView3.setOnClickListener {
            startActivity(Intent(this,MainActivity2::class.java))
        }
        binding.cardView4.setOnClickListener {
            startActivity(Intent(this,MainActivity2::class.java))
        }
        binding.cardView5.setOnClickListener {
            startActivity(Intent(this,MainActivity2::class.java))
        }
        binding.cardView6.setOnClickListener {
            startActivity(Intent(this,MainActivity2::class.java))
        }
    }
}