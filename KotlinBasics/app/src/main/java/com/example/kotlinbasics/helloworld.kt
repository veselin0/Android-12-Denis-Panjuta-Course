package com.example.kotlinbasics

// 55. Exercise Classes and Objects
/*
Please create a class called MobilePhone. It should have three primary constructor variables, osName, brand and model.

Use the initializer to print those details.

Create three objects of that class in the Main function.

Examples of phones would be:
Samsung Galaxy S20 Ultra. Here the osName is Android, brand is Samsung, model is Galaxy S20 Ultra
 */
fun main () {
    var samsung = MobilePhone("Android 12", "Samsung", "Galaxy S20 Ultra")
    var umi = MobilePhone("Android 5.0", "Umi", "Umi Iron")
    var xiaomi = MobilePhone("Android 15", "Xiaomi", "Sup22")

}

class MobilePhone (osName: String, brand: String, model: String) {
    init {
        println("Created a new MobilePhone object with a osName $osName, " +
                "brand $brand and model $model")
    }
}