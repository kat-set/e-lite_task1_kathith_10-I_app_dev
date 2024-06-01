package com.example.instashopdemo

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class thirdactivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_third)

        val Rback = findViewById<Button>(R.id.Rback)
        Rback.setOnClickListener {
            val Intent = Intent(this, MainActivity::class.java)
            startActivity(Intent)
        }
            val continueR = findViewById<Button>(R.id.continue_R)
            continueR.setOnClickListener {
                val Intent = Intent(this, afterpage::class.java)
                startActivity(Intent)

        }

    }
}
