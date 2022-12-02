package com.example.calculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val btn7 = findViewById<Button>(R.id.btn_seven)
        val btn8 = findViewById<Button>(R.id.btn_eight)
        val btn9 = findViewById<Button>(R.id.btn_nine)
        val btnDivide = findViewById<Button>(R.id.btnDivide)


        onClick(btn7)
        onClick(btn8)
        onClick(btn9)
        onClick(btnDivide)

//        btn7.setOnClickListener(){
//            Toast.makeText(this, "Button 7 pressed!", Toast.LENGTH_SHORT).show()
//        }
//        btn8.setOnClickListener(){
//            Toast.makeText(this, "Button 8 pressed!", Toast.LENGTH_SHORT).show()
//        }
//        btn9.setOnClickListener(){
//            Toast.makeText(this, "Button 9 pressed!", Toast.LENGTH_SHORT).show()
//        }
//        btnDivide.setOnClickListener(){
//            Toast.makeText(this, "Button / pressed!", Toast.LENGTH_SHORT).show()
//        }
    }

    private fun onClick(btn: Button) {
        btn.setOnClickListener{
            Toast.makeText(this, "Button  pressed!", Toast.LENGTH_SHORT).show()
        }
    }

}