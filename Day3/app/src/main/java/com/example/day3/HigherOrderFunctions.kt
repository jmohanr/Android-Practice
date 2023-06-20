package com.example.day3

class HigherOrderFunctions {


fun hof(addition:(Int,Int)->Int) {
    var result = addition(4,5)
    println(" Result is $result")
}
    fun hof2(name:String,addition:(Int,Int)->Int) {
        var result = addition(4,5)
        println(" Result is $name and  $result")
    }

    fun filterMaxVlaues(target:Int, input: List<Int>) {
        var value = input
        value = value.filter { it > target }
        println("Filet Max Values are $value")
        value = value.map { it * 2 }
        println("Map Max Values with 2 is  $value")

        }
}