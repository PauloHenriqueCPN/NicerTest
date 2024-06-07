package com.example.nicerapp

import android.content.Intent
import android.graphics.Color
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton
import androidx.constraintlayout.widget.ConstraintLayout

class segredo : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_segredo)

        val corfundo = findViewById<androidx.constraintlayout.widget.ConstraintLayout>(R.id.corfundo)

        val isSwitchChecked = intent.getBooleanExtra("isSwitchChecked", false)
        setBackgroundColor(corfundo, isSwitchChecked)

        val imageButton: ImageButton = findViewById(R.id.imageButton)
        imageButton.setOnClickListener {
            val url = "https://picpay.me/paulo.henrique23819"
            val intent = Intent(Intent.ACTION_VIEW)
            intent.data = Uri.parse(url)
            startActivity(intent)
        }

        val button: Button = findViewById(R.id.buttonvoltarmenu)
        button.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
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