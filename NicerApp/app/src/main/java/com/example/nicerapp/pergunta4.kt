package com.example.nicerapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class pergunta4 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_pergunta4)

        val resposta1 = intent.getIntExtra("resposta1", 0)
        val resposta2 = intent.getIntExtra("resposta2", 0)
        val resposta3 = intent.getIntExtra("resposta3", 0)

        val buttonSim: Button = findViewById(R.id.buttonS)
        buttonSim.setOnClickListener {
            val intent = Intent(this, pergunta5::class.java)
            intent.putExtra("resposta1", resposta1)
            intent.putExtra("resposta2", resposta2)
            intent.putExtra("resposta3", resposta3)
            intent.putExtra("resposta4", 0)
            startActivity(intent)
        }

        val buttonNao: Button = findViewById(R.id.buttonN)
        buttonNao.setOnClickListener {
            val intent = Intent(this, pergunta5::class.java)
            intent.putExtra("resposta1", resposta1)
            intent.putExtra("resposta2", resposta2)
            intent.putExtra("resposta3", resposta3)
            intent.putExtra("resposta4", 1)
            startActivity(intent)
        }
    }
}