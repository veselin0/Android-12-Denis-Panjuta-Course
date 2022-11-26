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

    // If Statements Part 1

    var heightPerson1 = 170
    var heightPerson2 = 189

    if(heightPerson1 > heightPerson2) {
            println("use raw force")
        }else if (heightPerson1 == heightPerson2) {
            println("use your power technique 1337")
        } else {
            println("use technique")
        }

    val ofAge = 16

    if (ofAge in 16..20) {
        println("You can drive, but you can't drink")
    } else if (ofAge >= 21){
        println("You can drive and you can drink")
    }

    // If Statements Part 2
    var name = "Gocho"

    if (name == "Gocho") {
        println("Welcome home, Gocho")
    } else {
        println("Who are you?")
    }

    var isRainy = true
    if (isRainy) println("I is rainy")

    var season = 3
    when (season) {
        1 -> println("Spring")
        2 -> println("Summer")
        3 -> {
            println("Fall")
            println("Autumn")
        }
        4 -> println("Winter")
        else -> {
            println("Invalid Season")
        }
    }

    var month = 3
    when (month) {
        in 3..5 -> println("Spring")
        in 6..8 -> println("Summer")
        in 9..11 -> println("Fall")
        // in 12 downTo 2 -> println("Winter")
        12, 1, 2 -> println("Winter")
        else -> println("Invalid Season")
    }

    var aged = 19
    when (aged) {
        16,17 -> println("You can drive now, but you can't vote and you can't drink")
        in 18..20 -> println("You can drive and vote now, but you can't drink " )
        !in 0..20 -> println("You can do whatever you want, it's up to you")
        else -> println("You are to young")
    }

    var x: Any = 13.37F
    when (x) {
        is Int -> println("$x is an Int")
        !is Double -> println("$x is not a Double")
        is String -> println("$x is a String")
        else -> println("$x is none of the above")
    }

    // While Loop

    var num = 1
    while (num <= 10) {
        print(num)
        num++
    }
    println("\nWhile loop done")

    num = 100
    while (num >= 0) {
        println(num)
        num--
    }
    println("While loop done")

    var feltTemp = "cold"
    var roomTemp = 10
    while (feltTemp == "cold") {
        roomTemp++
        if (roomTemp >= 20) {
            feltTemp = "comfy"
            println("It's comfy now")
        }
    }

    // Do While Loop

    x = 15
    do {
        println("$x")
        x++
    }while (x <= 10)
    println("Do While Loop done")
}





