package com.example.day1
//Constructor
class Car(var brand: String, var year: Int,var color: String) {
    //Attributes - properties (variables of class)

init {
    year = 2023
}
    //Functions- behaviour of class
    fun driver() {

        println("Driver name.... " + color)
    }
    fun breakes() {
        print("Break name....")
    }
}
  open class  FirstCalss(var name: String) {

     open fun  age1(): Int {
         return  3
     }

    open  fun age2(): Int {
        return  5
    }


}

  class  SecondCalss: FirstCalss("Jagan") {

     fun addTwoValues(): String {
        return  "Final Value is  ${age2()} and Name is $name"
    }
}

class Child1(name: String, age: String): Parent(name,age) {

}
class  Child2(name: String,age: String): Parent(name,age) {}

open class  Parent(var name: String,var age: String) {


    fun  printDetails() {
        println("My Name  is $name ")
        println("My Age is $age")
    }
}

open class  VisibilityProperties {
  internal var name: String = "Jagan"
    public var age: String = "28"
    protected open var dob: String = "1995"
    private var place: String = "Vemula"
    open  var gender: String = "Male"
/*
Visibility Modifiers
Open: Visible and override on every where
Public :- Visible on every where but can't override
Prvivate :- visbile inside the containing the decleration
Protected :- Not for packages only for subclass
Internal :- Visible the same module as set of kotlin files compaile together

Public by default for Packages


 */

}
class Visibility: VisibilityProperties() {
    override var gender: String = "Female"
    override var dob: String = "1994"

    fun  printV() {
        println(name)
        println(age)
        println(gender)
        println(dob)
    }
}