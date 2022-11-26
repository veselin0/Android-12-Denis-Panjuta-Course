package com.example.kotlinbasics
// Functioins
fun main () {
    var avg = avg(2.0,3.0)
    println(avg)
    var add = add(5,6)
    println(add)
}

fun myFunction () {
    println ("Gotcha is here again!")
}

fun add (a: Int, b: Int): Int {
    return a + b
}

fun avg (num1: Double, num2: Double): Double{
    return (num1 + num2) / 2
}