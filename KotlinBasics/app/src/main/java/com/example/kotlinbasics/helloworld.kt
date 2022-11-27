package com.example.kotlinbasics

import java.lang.IllegalArgumentException
import java.util.*

// 59. Lateinit Plus Setters And Getters

fun main () {
    var myCar = Car ()
    println ("My car's brand is ${myCar.myBrand}")
    myCar.maxSpeed = 240
    println ("My car's max speed is ${myCar.maxSpeed}")
    println ("My car's model is ${myCar.myModel}")
}

class Car () {
    lateinit var owner: String

    val myBrand = "BMW"
        get() {
        return field.lowercase(Locale.getDefault())
    }

    var maxSpeed: Int = 250
        // get() = field
        set(value) {
            field = if (value > 0) value else
                throw IllegalArgumentException("The speed must be a positive number")
        }

    var myModel: String = "M5"
        private set

    init {
        this.myModel = "M3"
        this.owner = "Gocho"
    }
}