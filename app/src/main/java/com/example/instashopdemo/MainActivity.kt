package com.example.instashopdemo

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)


        val secondActButton = findViewById<Button>(R.id.second_act_Btn)
        secondActButton.setOnClickListener {
            val Intent = Intent(this, secondactivity::class.java)
            startActivity(Intent)
        }
        val thirdActButton = findViewById<Button>(R.id.third_act_Btn)
        thirdActButton.setOnClickListener {
            val Intent = Intent(this, thirdactivity::class.java)
            startActivity(Intent)


        }
    }
}