package com.example.timerdemo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.CountDownTimer
import android.widget.TextView
import android.widget.Toast
import com.example.timerdemo.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    private lateinit var tvTimer: TextView

    //    Variable for the Timer, which will be initialized later.
    private var countDownTimer: CountDownTimer? = null

    //    The duration of the Timer in milliseconds
    private var timerDuration: Long = 60000

    //    pauseOffset = timerDuration - time left
    private var pauseOffset: Long = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        val tvTimer = binding.textView
        tvTimer.text = "${timerDuration / 1000}"

        val btnStart = binding.btnStart
        btnStart.setOnClickListener {
            startTimer(pauseOffset)
        }

        val btnPause = binding.btnPause
        btnPause.setOnClickListener {
            pauseTimer()
        }

        val btnReset = binding.btnReset
        btnReset.setOnClickListener {
            resetTimer()
        }
    }

    private fun startTimer(pauseOffsetL: Long) {
        countDownTimer = object : CountDownTimer(
            timerDuration - pauseOffsetL, 1000
        ) {
            override fun onTick(millisUntilFinished: Long) {
                pauseOffset = timerDuration - millisUntilFinished
                tvTimer =binding.textView
                tvTimer.text = (millisUntilFinished / 1000).toString()
            }

            override fun onFinish() {
                Toast.makeText(
                    this@MainActivity, "Timer is finished",
                    Toast.LENGTH_SHORT
                ).show()
            }
        }.start()
    }

    private fun pauseTimer() {
        if (countDownTimer != null) {
            countDownTimer!!.cancel()
        }
    }

    private fun resetTimer() {
        if (countDownTimer != null) {
            countDownTimer!!.cancel()
            tvTimer.text = (timerDuration / 1000).toString()
            countDownTimer = null
            pauseOffset = 0
        }
    }

}