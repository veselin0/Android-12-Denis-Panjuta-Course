package com.example.kotlinbasics

//61. Data Classes

data class User (val id: Long, var name: String)

fun main () {
    val user1 = User (1, "Gocho")

    user1.name = "Bocho"
    val user2 = User (1, "Bocho")
    println (user1 == user2)

    println ("User Details: $user1")

    val updatedUser = user1.copy(name = "Docho Bochev")
    println (user1)
    println (updatedUser)

    println (updatedUser.component1())
    println (updatedUser.component2())

    val (id, name) = updatedUser
    println ("id is $id and name is $name")
}

