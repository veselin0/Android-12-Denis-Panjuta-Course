package com.example.a7minutesworkout

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.a7minutesworkout.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

//        val frameLayoutStartButton: FrameLayout = findViewById(R.id.frameLayoutStart)

        val frameLayoutStartButton = binding.frameLayoutStart

        frameLayoutStartButton.setOnClickListener {
            Toast.makeText(
                this, "Here we will start the exercise.",
                Toast.LENGTH_SHORT
            ).show()
        }

    }

}