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

    println("Hello $myName")
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
    
    println("First character $firstCharInStr")
    println("Last Character $lastCharInStr")

    // Exercise Variables And Datatype

    var courseTitle: String = "Android Masterclass"
    var floatNum: Float = 13.37F
    var doublePi: Double = 3.14159265358979
    var age: Byte = 25
    // var intNum: Short = 25
    var year: Short = 2020
    // var shortNum: Int = 2020
    var longNum: Long = 18881234567
    var myBool: Boolean = true
    var myChar: Char = 'a'

    // Comparison operators
    val isEqual = 5==3
    println("isEqual is $isEqual")

    val isNotEqual = 5!=5
    println("isNotEqual is $isNotEqual")

    println("is -5 greater than 3? ${-5 > 3}")
    println("is 5 LowerEqual to 3? ${5 <= 3}")

    // Assignment Operators ( +=, -=, *=, /=, %=)
    var myNum = 5
    myNum +=3
    println("myNum is $myNum")
    myNum *= 4
    println("myNum is $myNum")

    // Increment and Decrement Operators ( ++, -- )
    myNum++
    println("myNum is $myNum")
    println("myNum is ${myNum++}")
    println("myNum is $myNum")
    println("myNum is ${++myNum}")
    println("myNum is ${--myNum}")
}



