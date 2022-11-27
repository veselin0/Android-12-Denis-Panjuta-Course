package com.example.kotlinbasics

// 58. Member Variables - Functions And Constructors

fun main () {
    var gotcha = Person("Gotcha", "Koch", 62)
    gotcha.age = 61
    println("Gotcha's age is ${gotcha.age}")
    gotcha.hobby = "Horse Raises"
    gotcha.stateHobby()
    var john = Person()
    john.hobby = "Play Chess"
    john.stateHobby()
}

class Person (firstName: String = "John", lastName: String = "Doe") {
    // Member Variables = Properties
    var age: Int? = null
    var hobby: String = "watching HBO"
    var name: String? = null

    // Initializer Block
    init {
        this.name = firstName
        println("Initialized a new person with a name $firstName and a last name $lastName")
    }

    // Member Secondary Constructor

    constructor(firstName: String, lastName: String, age: Int): this(firstName, lastName) {
        this.age = age
        println("Initialized a new person with a name $firstName, a last name $lastName and an age of $age")
    }

    // Member Functions = Methods
    fun stateHobby() {
        println("$name\'s hobby is $hobby")
    }
}