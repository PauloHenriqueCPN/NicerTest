package com.example.nicerapp

import android.content.Intent
import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import androidx.constraintlayout.widget.ConstraintLayout

class pergunta8 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_pergunta8)

        val corfundo = findViewById<androidx.constraintlayout.widget.ConstraintLayout>(R.id.corfundo)

        val isSwitchChecked = intent.getBooleanExtra("isSwitchChecked", false)
        setBackgroundColor(corfundo, isSwitchChecked)

        val resposta1 = intent.getIntExtra("resposta1", 0)
        val resposta2 = intent.getIntExtra("resposta2", 0)
        val resposta3 = intent.getIntExtra("resposta3", 0)
        val resposta4 = intent.getIntExtra("resposta4", 0)
        val resposta5 = intent.getIntExtra("resposta5", 0)
        val resposta6 = intent.getIntExtra("resposta6", 0)
        val resposta7 = intent.getIntExtra("resposta7", 0)

        val buttonSim: Button = findViewById(R.id.buttonS)
        buttonSim.setOnClickListener {
            val intent = Intent(this, pergunta9::class.java)
            intent.putExtra("resposta1", resposta1)
            intent.putExtra("resposta2", resposta2)
            intent.putExtra("resposta3", resposta3)
            intent.putExtra("resposta4", resposta4)
            intent.putExtra("resposta5", resposta5)
            intent.putExtra("resposta6", resposta6)
            intent.putExtra("resposta7", resposta7)
            intent.putExtra("resposta8", 0)
            intent.putExtra("isSwitchChecked", isSwitchChecked)
            startActivity(intent)
        }

        val buttonNao: Button = findViewById(R.id.buttonN)
        buttonNao.setOnClickListener {
            val intent = Intent(this, pergunta9::class.java)
            intent.putExtra("resposta1", resposta1)
            intent.putExtra("resposta2", resposta2)
            intent.putExtra("resposta3", resposta3)
            intent.putExtra("resposta4", resposta4)
            intent.putExtra("resposta5", resposta5)
            intent.putExtra("resposta6", resposta6)
            intent.putExtra("resposta7", resposta7)
            intent.putExtra("resposta8", 1)
            intent.putExtra("isSwitchChecked", isSwitchChecked)
            startActivity(intent)
        }
    }

    private fun setBackgroundColor(layout: ConstraintLayout, isChecked: Boolean) {
        val color = if (isChecked) {
            Color.parseColor("#000000")
        } else {
            Color.parseColor("#FFFFFF")
        }
        layout.setBackgroundColor(color)
    }
}