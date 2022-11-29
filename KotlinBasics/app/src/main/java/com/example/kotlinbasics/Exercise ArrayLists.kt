package com.example.kotlinbasics

/*
    Please write a program that adds five Numbers (Double) to an arrayList and
    then calculates the average of those numbers. Please use a for (in) loop
    in this exercise.
Good luck :)
 */

fun main () {
    val numbers = arrayListOf<Double>()
    val nums = listOf<Double>(1.11, 2.22, 3.33, 4.44, 5.55)
    numbers.addAll(nums)
//    println(numbers)
    var sumElem = numbers.sum()
    var avgSumElem = sumElem / numbers.size
//    println(sumElem)
    println("The Average of the 'numbers' array list's elements is: ")
    println(avgSumElem)

}