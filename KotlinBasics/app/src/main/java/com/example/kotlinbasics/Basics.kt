package com.example.kotlinbasics

fun main(){
    // immutable variable
    // TODO: Add new functionality
    /*
    This
    is a multiline
    comment
     */

    val myName = "Doc"

    // print("Hello $myName")
    var myAge = 61
    val myByte: Byte = 14
    val myShort: Short = 125
    val myINt: Int = 12
    val myLong: Long = 12_345_67_89

    val myFloat: Float = 14.98F
    myFloat
    val myDouble: Double = 0.12345678977897434
    myDouble

    var isSunny: Boolean = true
    isSunny = false

    val letterChar = 'A'
    letterChar
    val digitChar = '$'
    digitChar

    val myStr = "Hello World"
    var firstCharInStr = myStr[0]
    var lastCharInStr = myStr[myStr.length - 1]
    
    // print("First character $firstCharInStr")
    print("Last Character $lastCharInStr")
}