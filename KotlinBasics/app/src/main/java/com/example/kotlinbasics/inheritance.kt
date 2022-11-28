package com.example.kotlinbasics

import kotlin.io.path.createTempDirectory

// The class that inherits the features from another
// class is called the Sub class or Child class or
// Derived class and the class which features are
// inherited is called the Super class or Parent class
// or Base class.

/*
// Super, Parent, Base class
open class  Vehicle {
    // properties
    // methods
}
*/


// Sub, Child, Derived class of Vehicle
// Super, Parent, Base class of EleCar
open class Car (val name: String, val brand: String) {
   open var range: Double = 0.0

   fun extendRange (amount: Double) {
       if (amount > 0) {
           range += amount
       }
   }

   open fun drive (distance: Double) {
       println("Drove $distance km")
   }
}

//  Sub, Child, Derived class of Car
class EleCar(name: String, brand: String, batteryLife: Double): Car (name, brand) {

    var chargerType = "Type1"

    override var range = batteryLife * 6

    override fun drive (distance: Double) {
        println("Drove $distance km on electricity")
    }

    fun drive(){
        println("Drove $range km on electricity")
    }
}

fun main () {
    var audiA3 = Car ("A3", "Audi")
    var teslaS = EleCar ("S-model", "Tesla", 85.0)

    teslaS.chargerType = "Type2"

    teslaS.extendRange(200.0)

    teslaS.drive()

    // Polymorphism
    audiA3.drive(200.0)
    teslaS.drive(200.0)
}