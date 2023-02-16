package com.example.a7minutesworkout

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.FrameLayout
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val frameLayoutStartButton: FrameLayout = findViewById(R.id.frameLayoutStart)

        frameLayoutStartButton.setOnClickListener {
            Toast.makeText(
                this, "Here we willl start the exercise.",
                Toast.LENGTH_SHORT
            ).show()
        }


    }
}