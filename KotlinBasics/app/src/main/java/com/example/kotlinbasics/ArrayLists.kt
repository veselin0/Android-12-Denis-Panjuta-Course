package com.example.kotlinbasics

// They are used to create dynamic arrays

fun main(){
    // Create an empty ArrayList
    val arrayList = ArrayList<String>()
    println(arrayList)
    // Add an object to an arraylist
    arrayList.add("One")
    arrayList.add("Two")
    println(".....print ArrayList......")
    for (i in arrayList) {
        println(i)
    }

    // ArrayList using collections
    val arrLi: ArrayList<String> = ArrayList<String>(5)
    var list: MutableList<String> = mutableListOf<String>()

    list.add("Gocho")
    list.add("Bocho")

    arrLi.addAll(list)

    println("...print ArrayList...")
    println(arrLi)

    // Fill elements in ArrayList using collections
    val itr = arrayList.iterator()

    while(itr.hasNext()){
        println(itr.next())
    }
    println("size of arrayList = ${arrayList.size}")

    // ArrayList - get()
    println("...arrayList.get(1)")
//    println(arrayList.get(1))
    println(arrayList[1])
}