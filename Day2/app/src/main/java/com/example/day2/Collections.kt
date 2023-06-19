package com.example.day2

import android.os.Build
import androidx.annotation.RequiresApi

@RequiresApi(Build.VERSION_CODES.N)
fun main() {

// lists()
//    sets()
//    maps()
    Tasks()
}

fun Tasks() {
    var task = CodingTasks()
    task.divideValues(3.0,4.0)
    task.areaOfCircle(3.0)
    task.swapTwoValues()
    task.findValues("Hello World 12 contains $")
    task.reverseString("Hello World")
    task.findAddandEvenNumbers(listOf(5,7,2,4,9,10))
    task.findMaxValue(listOf(5,17,-2,14,2,10))
}

@RequiresApi(Build.VERSION_CODES.N)
fun lists() {
    //Immutable-> we can't override
var list = listOf<Any>(1,2,"Jagan","Reddy")
//    println(list[1])// print Specific index
    for (item in list) {
//        println(item)
    }
  list = list.drop(1)//It will remove value  at index
    list = list.dropLast(2) //It will remove value till given index
    var list2 = listOf("1","2","3")
    for (item in list2) {
//        println(item)
    }

    //Mutable -> we can override
    val list3 = mutableListOf<Any>(1,2.0,3.0F,"Jagan")
    list3[0] = "Hello Andriod"
    list3.add(1,"good")
    list3.add(4)
    for (i in list3) {

        println(i)
    }
}

fun sets() {

//Sets won't allow duplicates
    // We can't insert at value at perticular index
    //It will keep index properly i.e it won't allow to shuffle the index
    var set1 = setOf<Any>(2.0,3.0,4.0,2.0,"3.0")

var set2 = mutableSetOf<Any>(2,3,"J","J","j","K")
    set2.drop(2)

    for (item in set2) {
        println(item)
    }

}

fun maps() {
    // its Key value pair i.e it dictonary
    var map = mapOf("1" to "jagan",2 to "Mohan",3 to listOf<Any>(2,3,4,5),
        "names" to listOf(mapOf(1 to "jagan"))
    )
    println(map.values)
var map2 = mutableMapOf<String,String>("1" to "2")
    map2["1"] = "hello"

    println(map2)
    for (item in map.keys) {
        println(item)
    }
    for (item in map.values) {
        println(item)
    }
    for (item in map) {
        println(item)
    }
}