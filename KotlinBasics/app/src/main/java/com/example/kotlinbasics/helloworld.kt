package com.example.kotlinbasics

//62. Challenge Classes

/*Please extend our example of the MobilePhone class with

class MobilePhone(osName: String, brand: String, model: String){
    init {
        println("The phone $model from $brand uses $osName as its Operating System")
    }
}
Add a member to it, which indicates how much battery is left (call it "battery". Initialize this value with a number between 0 and 50.

Then add a function
"chargeBattery"
Which needs details about how much was charged.

It should print out how much battery the phone had before, how much was charged and how much it has now.
Create an Object of the class and call this function. Charge the battery by 30.*/

fun main () {
    var phone = MobilePhone("Android", "Samsung", "Galaxy")
    var charge = phone.chargeBat()
}



class MobilePhone(osName: String, brand: String, model: String){
    var battery: Int = 20
    var chargeBy: Int = 30
    var stateOfChargeNow: Int = battery + chargeBy

    init {
        println("The phone $model from $brand uses $osName as its Operating System")
    }

    fun chargeBat () {
        println("Previous Battery Charge was ${this.battery}%")
        println("Than is was charged by ${this.chargeBy}%")
        println("Now it is charged to ${this.stateOfChargeNow}%")
    }
}