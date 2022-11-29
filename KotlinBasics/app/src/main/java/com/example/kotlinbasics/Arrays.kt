package com.example.kotlinbasics

fun main() {
    val numbers: IntArray = intArrayOf(2, 4 , 6, 8, 10)
//    val numbers1 = intArrayOf(2, 4 , 6, 8, 10)
//    val numbers2 = arrayOf(2, 4 , 6, 8, 10)

//    println(numbers.contentToString())

//    for (element in numbers) {
//        print(element)
//    }

//    for (element in numbers) {
//        print(" ${element + 3}")
//    }

    // numbers array is not modified:
//    for (element in numbers) {
//        print(element)
//    }

//    println(numbers[0])
//    println(numbers[3])

//  Modify Array
//    println("The initial value of the array 'numbers' is ${numbers.contentToString()}")
//    numbers[0] = 1
//    numbers[1] = 60
//    println("The current (modified) value of the array 'numbers' is ${numbers.contentToString()}")

//    Array of doubles
//    val numbersD = arrayOf(1.0, 2.0, 3.0, 4.0, 5.0)
//    println(numbersD.contentToString())

//    Array of strings
//    val myStrings = arrayOf("Gocho", "Kocho", "Bocho")
//    println(myStrings.contentToString())

//    An object inside of an array

    val fruits = arrayOf(Fruit("Apple", 2.56 ), Fruit("Banana", 3.67),
        Fruit("Mango", 9.23)
    )
//    print(fruits.contentToString())

//    print(fruits[0].name)

//    for (index in fruits.indices)
//        println("${fruits[index].name} is in index $index")

//    for (fruit in fruits) {
//        println(fruit.name)
//    }

//    Mixed Arrays
    val mix = arrayOf(1, 2.0, "Gocho", Fruit("Apple", 2.45))
    print(mix.contentToString())
}

data class Fruit (val name: String, val price: Double)