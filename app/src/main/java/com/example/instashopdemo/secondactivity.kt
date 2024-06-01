package com.example.instashopdemo

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class secondactivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_second)

        val Lback = findViewById<Button>(R.id.Lback)
        Lback.setOnClickListener {
            val Intent = Intent(this, MainActivity::class.java)
            startActivity(Intent)
        }

        val continueL = findViewById<Button>(R.id.continue_L)
        continueL.setOnClickListener {
            val Intent = Intent(this, afterpage::class.java)
            startActivity(Intent)
        }

    }
}