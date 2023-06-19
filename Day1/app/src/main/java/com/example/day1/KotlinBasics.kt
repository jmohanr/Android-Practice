package com.example.day1

fun main() {
    /*
    println("Hello Kotlin")
    println("Welcome Jagan " + (2+3))
    println("message \n" + (3+3) )
   println( variables(names = "Welocme "))
    val printValue = printValue(4.0,7.0)
    println(printValue)
    numbers()
    decimals()
    woolens()
      oops()
    */

    checkInheritence()
val c = Visibility()
   c.printV()

}
fun printValue(x: Double, y: Double): Double {
    return x / y
}
fun oops() {
    //Creating object of car calss
    var car = Car("Skoda",2023,"Red")
    var car2 = Car("Benz",2024,"Black")
    println(car.brand)
    println(car2.brand)
    car.brand = car2.brand
    car.driver()
    println(car.brand)
    val  second = SecondCalss()
    println(second.addTwoValues())

}

fun  checkInheritence() {
    val child1 = Child1("Jhon Wick","30")
    val child2 = Child2("Iran Man","60")
    child1.printDetails()
    child2.printDetails()
}

fun  variables(names:String): String {
    var firstName: String
    var name = "Jagan "
    val lastName = "Reddy "
    firstName = "kudumala "
    return names + name + lastName + firstName
}

fun numbers() {
    //Bytes: -128 to 127
    var a: Byte = 120
    println(a)

    //Short -32786 to 32767
    var b: Short = 23
    println(b)

    //Integers
    var c: Int
    c = 75465
    println(c)

    //Long
    var d: Long = 678907674863L
    println(d)
}

fun decimals() {
    //Float
    var a: Float = 3.23F
    //Double
    var b: Double = 5.0

    println("Adding Decimals "+ (a + b))
}

fun woolens() {
    //Boolean
    var b: Double = 5.0
    val  isKotlin: Boolean = true
    if (b > 9.0) {
        print(message = "Yes")
    } else {
        print(message = "NO")

    }

}