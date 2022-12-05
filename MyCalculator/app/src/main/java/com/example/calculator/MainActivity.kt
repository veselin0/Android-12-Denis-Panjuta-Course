package com.example.calculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView


class MainActivity : AppCompatActivity() {

    private var tvInput: TextView? = findViewById(R.id.tvInput)
    private val btn1 = findViewById<Button>(R.id.btn_one)
    private val btn2 = findViewById<Button>(R.id.btn_two)
    private val btn3 = findViewById<Button>(R.id.btn_three)
    private val btnMinus = findViewById<Button>(R.id.btnSubtract)
    private val btn4 = findViewById<Button>(R.id.btn_four)
    private val btn5 = findViewById<Button>(R.id.btn_five)
    private val btn6 = findViewById<Button>(R.id.btn_six)
    private val btnMultiply = findViewById<Button>(R.id.btnMultiply)
    private val btn7 = findViewById<Button>(R.id.btn_seven)
    private val btn8 = findViewById<Button>(R.id.btn_eight)
    private val btn9 = findViewById<Button>(R.id.btn_nine)
    private val btnDivide = findViewById<Button>(R.id.btnDivide)
    private val btn0 = findViewById<Button>(R.id.btn_zero)
    private val btnClr = findViewById<Button>(R.id.btn_clr)
    private val btnAdd = findViewById<Button>(R.id.btnAdd)
    private val btnEnter = findViewById<Button>(R.id.btn_enter)
    private val btnDot = findViewById<Button>(R.id.btn_dot)
    private var lastNumeric: Boolean = false
    private var lastDot: Boolean = false

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)






        onClick(btn1)
        onClick(btn2)
        onClick(btn3)
//        operatorClick(btnMinus)
        onClick(btn4)
        onClick(btn5)
        onClick(btn6)
//        operatorClick(btnMultiply)
        onClick(btn7)
        onClick(btn8)
        onClick(btn9)
//        operatorClick(btnDivide)
        onClick(btn0)
//        clr(btnClr)
//        operatorClick(btnAdd)
        onClick(btnEnter)
//        dot(btnDot)
    }

    private fun onClick(btn: Button) {

        btn.setOnClickListener{
                tvInput?.append("${btn.text}")
                lastNumeric = true
                lastDot = false
        }
    }

//    private fun clr(btnClr: Button){
//        btnClr.setOnClickListener{
//            tvInput?.text = ""
//        }
//    }

//    private fun dot(btnDot: Button) {
//        btnDot.setOnClickListener{
//            if (lastNumeric && !lastDot){
//                tvInput?.append(".")
//                lastNumeric = false
//                lastDot = true
//            }
//        }
//    }

//    private fun operatorClick(btn: Button){
//        btn.setOnClickListener{
//            if (btn == btnMinus
//                || btn == btnAdd
//                || btn == btnDivide
//                || btn == btnMultiply){
//                tvInput?.text?.let {
//                    if (lastNumeric && !isOperatorAdded(it.toString())){
//                        tvInput?.append(btn.text)
//                    }
//                }
//            }
//        }
//    }

//    private fun isOperatorAdded(value: String): Boolean {
//       return if (value.startsWith("-")){
//           false
//       } else {
//           value.contains("/")
//                   || value.contains("*")
//                   || value.contains("+")
//                   || value.contains("-")
//       }
//   }



}