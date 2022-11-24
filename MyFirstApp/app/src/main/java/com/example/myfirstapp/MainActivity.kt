package com.example.myfirstapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val btnUp = findViewById<Button>(R.id.mybuttonUp)
        val btnDown = findViewById<Button>(R.id.mybuttonDown)
        val txtGotcha = findViewById<TextView>(R.id.textView)
        var counter = 0

        btnUp.setOnClickListener {
            counter += 1
            txtGotcha.text = counter.toString()
            Toast.makeText(this, "Hey, I am a Toast!", Toast.LENGTH_LONG).show()
        }
        btnDown.setOnClickListener {
            counter -= 1
            txtGotcha.text = counter.toString()
        }

    }
}