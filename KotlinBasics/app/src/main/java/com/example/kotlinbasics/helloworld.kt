package com.example.kotlinbasics
// 47. Nullables In Kotlin
fun main () {
    var name: String = "Gotcha"
    // name = null -> Compilation ERROR
    var len = name.length
    println(name)
    println(len)
    var nullableName: String? = "Gotcha"
    // nullableName = null
    var len2 = nullableName?.length
    println(nullableName)
    println(len2)
    // println(nullableName?.toLowerCase())
    // use safe call operator with let
    nullableName?.let { println(it.length) }
}

