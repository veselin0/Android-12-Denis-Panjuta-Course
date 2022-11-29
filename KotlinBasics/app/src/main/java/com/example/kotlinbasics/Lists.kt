package com.example.kotlinbasics

fun main () {
    val months = listOf("January", "February", "March" )
    val anyTypes = listOf(1, 2, 3, true, false, "String")
//    println(anyTypes.size)
//    println(months[1])

//    for (month in months) {
//        println(month)
//    }

    val addMonths = months.toMutableList()
    val newMonths = arrayOf("April", "May", "June")
    addMonths.addAll(newMonths)
    println(addMonths)
    addMonths.add("July")
    println(addMonths)

    // Create a mutable list of a particular type
    val days = mutableListOf<String>("Monday", "Tuesday", "Wednesday")
    days.add("Thursday")
    println(days)

    // Override items in a list
    days[0] = "Sunday"
    println(days)

    // Remove an item
//    days.removeAt(1)
//    println(days)

    // Remove various items
//    val removeList = mutableListOf<String>("Monday", "Tuesday")
//    days.removeAll(removeList)
//    println(days)

    // Remove all items
    days.removeAll(days)
    println(days)
}