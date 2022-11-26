package com.example.kotlinbasics

import java.util.*

// 48. Nullables - Elvis Operator - Not Null Assertion
fun main () {
    var nullableName: String? = "Gocho"
    // nullableName = null

    // Elvis Operator ?:
    val name = nullableName ?: "Guest"
    println("name is $name")

    // Not Null Assertion !!
    println(nullableName!!.lowercase(Locale.getDefault()))
}

