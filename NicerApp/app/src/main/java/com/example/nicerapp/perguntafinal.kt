package com.example.nicerapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class perguntafinal : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_perguntafinal)

        val resposta1 = intent.getIntExtra("resposta1", 0)
        val resposta2 = intent.getIntExtra("resposta2", 0)
        val resposta3 = intent.getIntExtra("resposta3", 0)
        val resposta4 = intent.getIntExtra("resposta4", 0)
        val resposta5 = intent.getIntExtra("resposta5", 0)

        val somaRespostas = resposta1 + resposta2 + resposta3 + resposta4 + resposta5 + 1

        val buttonSim: Button = findViewById(R.id.buttonS)
        buttonSim.setOnClickListener {
            val intent = Intent(this, pessoanaolegal::class.java)
            startActivity(intent)
        }

        if (somaRespostas > 3) {

            val buttonNao: Button = findViewById(R.id.buttonN)
            buttonNao.setOnClickListener {
                val intent = Intent(this, pessoalegal::class.java)
                startActivity(intent)
            }
        } else {val buttonNao: Button = findViewById(R.id.buttonN)
            buttonNao.setOnClickListener {
                val intent = Intent(this, pessoanaolegal::class.java)
                startActivity(intent)
            }
        }
    }
}