package com.example.nicerapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val buttonSeg: Button = findViewById(R.id.buttonsegredo)
        buttonSeg.setOnClickListener {
            val intent = Intent(this, segredo::class.java)
            startActivity(intent)
        }

        val buttonTest: Button = findViewById(R.id.buttonteste)
        buttonTest.setOnClickListener {
            val intent = Intent(this, pergunta1::class.java)
            startActivity(intent)
        }
    }
}