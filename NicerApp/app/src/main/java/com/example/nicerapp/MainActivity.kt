package com.example.nicerapp

import android.content.Intent
import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.Switch

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val mySwitch = findViewById<Switch>(R.id.switchescuro)
        val imageViewB = findViewById<ImageView>(R.id.imageViewBranco)
        val imageViewP = findViewById<ImageView>(R.id.imageViewPreto)
        val corfundo = findViewById<androidx.constraintlayout.widget.ConstraintLayout>(R.id.corfundo)

        val buttonSeg: Button = findViewById(R.id.buttonsegredo)
        val buttonTest: Button = findViewById(R.id.buttonteste)

        buttonSeg.setOnClickListener {
            val intent = Intent(this, segredo::class.java)
            intent.putExtra("isSwitchChecked", mySwitch.isChecked)
            startActivity(intent)
        }

        buttonTest.setOnClickListener {
            val intent = Intent(this, pergunta1::class.java)
            intent.putExtra("isSwitchChecked", mySwitch.isChecked)
            startActivity(intent)
        }

        mySwitch.setOnCheckedChangeListener { _, isChecked ->
            if (isChecked) {
                imageViewB.visibility = ImageView.INVISIBLE
                imageViewP.visibility = ImageView.VISIBLE
                corfundo.setBackgroundColor(Color.parseColor("#000000"))
            } else {
                imageViewB.visibility = ImageView.VISIBLE
                imageViewP.visibility = ImageView.INVISIBLE
                corfundo.setBackgroundColor(Color.parseColor("#FFFFFF"))
            }
        }
    }
}
