package com.example.tappimad

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat


class TitleScreen : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_title_screen)



    val startButton = findViewById<Button>(R.id.startButton)
    startButton.setOnClickListener {

        val Intent = Intent(this, GameScreen::class.java)
        startActivity(Intent)
        }
    }
}


