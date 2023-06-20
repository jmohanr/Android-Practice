package com.example.day3

import kotlin.math.min

fun main() {

   val l = Lamda()
    var a = AnonymousFunctions()
    val h = HigherOrderFunctions()
    l.lamdaExpresions()
     a.anony()
 h.hof {a:Int,b:Int -> a+b }
 h.hof2("Jagan"){a:Int,b:Int -> a+b }

h.filterMaxVlaues(3, listOf(2,9,6,7,4,8))

 practiceForLoops()
 higherOrderFunctions()
}

fun  practiceForLoops() {
 var pc = PracticeClass()
val persons = pc.getPersonDetails()
 //With index
 for (i in 0 until   (persons.person.size)) {
  println("Iteration with Index $i")
  println(persons.person[i].age)
 }
 //With indices
 for (i in persons.person.indices) {
  println("Iteration With  indices ${persons.person[i].name}")
 }
//Loop Through Objects
 for (value in persons.person) {
  println("Direct Object Iteration ${value.profession}")
 }
//Reversing the order of loop
 for (i in 6 downTo 1 ) {
  println("With DownTo $i")
 }

}

fun PracticeMaps() {
 var intialMap: MutableMap<String,Any> = mutableMapOf("name" to "Jagan", "age" to 29,
  "Profession" to "iOS Developer",
  "Qualifications" to listOf("Diploma","Engineering","iOS"),
  "same" to mapOf<String,Any>()
 )
 for ((key,value) in intialMap) {
  if (value is Int) {
  println("Value is Integer ")
  }
  println("key is $key and Value is ${value as? String}")
  println("------------------")
 }
val qualification = intialMap["Qualifications"] as List<Any>
 for (value in qualification) {
  println(value)
 }

}

fun  higherOrderFunctions() {
 var pc = PracticeClass()
 val persons = pc.getPersonDetails()
 val filter =  persons.person.filter { it.age > 3 }
 val  map = persons.person.map { General("Ja", listOf(it),30) }
 val  sort = persons.person.sortedBy { it.age < 3 }
 println(sort)
 for (v in filter){
  println("filter values ${v.age}")
 }
 for (v in sort){
  println("Map values ${v.age}")
 }

 var list2 = mutableListOf<String>("1","2","3","098","54678","reyt")
 println(list2.flatMap { it.toList() })


}