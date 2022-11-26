package com.example.kotlinbasics

// 54. Classes And Initializers
fun main () {
    // Creating instances of clases
    var gocho = Person("Gocho", "Kochev")
    var john = Person()
    var dochev = Person(lastName = "Dochev")

}

class Person(firstName: String = "John", lastName: String = "Doe") {
    init {
        println("Created a new Person object with a firstName $firstName " +
                "and lastName $lastName")
    }
}