package com.example.kotlinbasics

import kotlin.math.floor

fun main() {
    val stringList: List<String> = listOf("Gocho", "Bocho", "Docho", "Kocho")
    val mixedTypeList: List<Any> = listOf("Gocho", 31, 5, "Bocho", 70.5, "kg")
    /*
    for (value in mixedTypeList) {
        if (value is Int) {
            println("Integer: $value")
        } else if (value is Double) {
            println("Double: $value")
        } else if (value is String) {
            println("String: $value of length ${value.length}")
        } else {
            println("Unknown Type")
        }
    }
     */

    for (value in mixedTypeList) {
        when (value) {
            is Int -> {
                println("Integer: $value")
            }
            is Double -> {
                println("Double: $value with Floor value ${floor(value)}")
            }
            is String -> {
                println("String: $value of length ${value.length}")
            }
            else -> {
                println("Unknown Type")
            }
        }
    }

    // SMART CAST
    val obj1: Any = "I have a dream"
    if (obj1 !is String) {
        println("Not a String")
    } else {
        // obj is automatically cast to String in this scope
        println("Found a String of length ${obj1.length}")
    }

    // Explicit (unsafe) Casting using the "as" keyword - can go wrong
    val str1: String = obj1 as String
    println(str1.length)

    val obj2: Any = "1337"
    val str2: String = obj2 as String
    println(str2)

    // Explicit (safe) casting using "as?" keyword
    val obj3: Any = 1337
    val str3: String? = obj3 as? String
    println(str3) // Prints null
}