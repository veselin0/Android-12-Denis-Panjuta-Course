package com.example.kotlinbasics

// Set is a type of collection that prevents duplication of data
// Map is a type of collection that holds data in the form of key - value pair

fun main(){

    //Sets
    val fruits = setOf("Orange", "Apple", "Mango", "Grapes", "Apple", "Orange")
    println(fruits.size)
    println(fruits.toSortedSet()) //It is not mutable

    // Create mutable set
    val newFruits = fruits.toMutableSet()
    newFruits.add("Water Melon")
    newFruits.add("Pear")
    println(newFruits)
    println(newFruits.elementAt(4))

    // Maps
    val daysOfTheWeek = mapOf(1 to "Monday", 2 to "Tuesday", 3 to "Wednesday")
    println(daysOfTheWeek[2])

    for (key in daysOfTheWeek.keys) {
        println("$key is to ${daysOfTheWeek[key]}")
    }

    val fruitsMap = mapOf("Favorite" to Fruto("Grapes", 5.89),
        "OK" to Fruto("Apple", 5.23))

    val newDaysOfTheWeek = daysOfTheWeek.toMutableMap()
    newDaysOfTheWeek[4] = "Thursday"
    newDaysOfTheWeek[5] = "Friday"

    println(newDaysOfTheWeek.toSortedMap())
}

data class Fruto(val name: String, val price: Double)