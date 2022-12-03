package com.example.deniscalculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    private var tvInput: TextView? = null
//    private var btnOne: Button? = null
    var lastNum: Boolean = false
    var lastDot: Boolean = false

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        tvInput = findViewById(R.id.tvInput)
//        btnOne = findViewById(R.id.btnOne)
//        btnOne?.setOnClickListener{
//            tvInput?.append((btnOne as Button).text)
//        }
    }

    fun onDigit(view: View){
        tvInput?.append((view as Button).text)
        lastNum = true
        lastDot = false
    }

    fun onClr(view: View){
        tvInput?.text = ""
    }

    fun onDot(view: View){
        if (lastNum && !lastDot){
            tvInput?.append(".")
            lastNum = false
            lastDot = true
        }
    }

    fun onOperator (view: View) {
        tvInput?.text?.let {
            if (lastNum && !isOperatorAdded(it.toString())) {
                tvInput?.append((view as Button).text)
                lastNum = false
                lastDot = false
            }
        }
    }

    // Helper function for onOperator method
    private fun isOperatorAdded(value: String): Boolean {
        return if (value.startsWith("-")) {
            false
        } else {
            value.contains("/")
                    || value.contains("*")
                    || value.contains("-")
                    || value.contains("+")
        }
    }

}