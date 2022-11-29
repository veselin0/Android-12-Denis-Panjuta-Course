package com.example.kotlinbasics

fun main () {
    addNum(5, 10)
//    println(sum(6, 11))
    sum(12, 90)
}

// Ordinary function addition of two numbers
fun addNum (a: Int, b: Int) {
    val res = a + b
    println(res)
}

// Lambda function addition of two numbers
//val sum: (Int, Int) -> Int = {a: Int, b: Int -> a + b}
//Shorter
val sum = {a: Int, b: Int -> println(a + b)}
