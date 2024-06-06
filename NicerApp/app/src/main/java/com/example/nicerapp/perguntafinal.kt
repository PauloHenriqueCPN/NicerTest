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
        val resposta6 = intent.getIntExtra("resposta6", 0)
        val resposta7 = intent.getIntExtra("resposta7", 0)
        val resposta8 = intent.getIntExtra("resposta8", 0)
        val resposta9 = intent.getIntExtra("resposta9", 0)

        val somaRespostas = 1 + resposta1 + resposta2 + resposta3 + resposta4 + resposta5 + resposta6 + resposta7 + resposta8 + resposta9

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