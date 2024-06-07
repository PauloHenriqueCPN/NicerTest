package com.example.nicerapp

import android.content.Intent
import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import androidx.constraintlayout.widget.ConstraintLayout

class pergunta1 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_pergunta1)

        val corfundo = findViewById<androidx.constraintlayout.widget.ConstraintLayout>(R.id.corfundo)

        val isSwitchChecked = intent.getBooleanExtra("isSwitchChecked", false)
        setBackgroundColor(corfundo, isSwitchChecked)

        val buttonSim: Button = findViewById(R.id.buttonS)
        buttonSim.setOnClickListener {
            val intent = Intent(this, pergunta2::class.java)
            intent.putExtra("resposta1", 1)
            intent.putExtra("isSwitchChecked", isSwitchChecked)
            startActivity(intent)
        }

        val buttonNao: Button = findViewById(R.id.buttonN)
        buttonNao.setOnClickListener {
            val intent = Intent(this, pergunta2::class.java)
            intent.putExtra("resposta1", 0)
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