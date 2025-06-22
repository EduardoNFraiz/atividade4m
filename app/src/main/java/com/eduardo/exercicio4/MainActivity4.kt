package com.eduardo.exercicio4

import android.animation.ObjectAnimator
import android.os.Bundle
import android.view.View
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.eduardo.exercicio4.databinding.ActivityMain4Binding

class MainActivity4 : AppCompatActivity() {

    private lateinit var binding: ActivityMain4Binding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMain4Binding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnCloset.post {
            val button = binding.btnCloset
            val indicator = binding.indicator

            // Calcula a posição central do botão "Usuários" menos metade da largura da barra
            val targetX = button.x + button.width / 2f - indicator.width / 2f

            // Define a posição inicial do indicador
            indicator.translationX = targetX
        }


        // Clique nos botões
        binding.btnCloset.setOnClickListener { moveIndicatorTo(it) }
        binding.btnCloset.setOnClickListener { moveIndicatorTo(it) }
    }

    private fun moveIndicatorTo(button: View) {
        val targetX = button.x + button.width / 2 - binding.indicator.width / 2
        val animator = ObjectAnimator.ofFloat(binding.indicator, "translationX", targetX)
        animator.duration = 200
        animator.start()
    }
}