package com.example.day3

class PracticeClass {
   fun getPersonDetails() : General {
       var persons: MutableList<Person> = arrayListOf()
       for(i in 1..5) {
           persons.add(Person("Name is  $i",i,"Profession is  $i"))
       }

       return General("Jagan",persons,20)
   }
}

class Person(var name: String,var age:Int,var profession:String) {

}
class General(var name: String,var person:List<Person>,var age:Int)