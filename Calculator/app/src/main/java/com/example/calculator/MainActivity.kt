package com.example.calculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    private var tvInput: TextView? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        tvInput = findViewById(R.id.tvInput)
        val btn1 = findViewById<Button>(R.id.btn_one)
        val btn2 = findViewById<Button>(R.id.btn_two)
        val btn3 = findViewById<Button>(R.id.btn_three)
        val btnMinus = findViewById<Button>(R.id.btnSubtract)
        val btn4 = findViewById<Button>(R.id.btn_four)
        val btn5 = findViewById<Button>(R.id.btn_five)
        val btn6 = findViewById<Button>(R.id.btn_six)
        val btnMultiply = findViewById<Button>(R.id.btnMultiply)
        val btn7 = findViewById<Button>(R.id.btn_seven)
        val btn8 = findViewById<Button>(R.id.btn_eight)
        val btn9 = findViewById<Button>(R.id.btn_nine)
        val btnDivide = findViewById<Button>(R.id.btnDivide)
        val btn0 = findViewById<Button>(R.id.btn_zero)
        val btnClr = findViewById<Button>(R.id.btn_clr)
        val btnAdd = findViewById<Button>(R.id.btnAdd)
        val btnEnter = findViewById<Button>(R.id.btn_enter)

        onClick(btn1)
        onClick(btn2)
        onClick(btn3)
        onClick(btnMinus)
        onClick(btn4)
        onClick(btn5)
        onClick(btn6)
        onClick(btnMultiply)
        onClick(btn7)
        onClick(btn8)
        onClick(btn9)
        onClick(btnDivide)
        onClick(btn0)
        clr(btnClr)
        onClick(btnAdd)
        onClick(btnEnter)

    }

    private fun onClick(btn: Button) {
        btn.setOnClickListener{
            tvInput?.append("${btn.text}")
        }
    }

    private fun clr(btnClr: Button){
        btnClr.setOnClickListener{
            tvInput?.text = ""
        }

    }

}