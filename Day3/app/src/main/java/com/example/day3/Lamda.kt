package com.example.day3

class Lamda {

    fun lamdaExpresions() {
        name.invoke()
        addTwo(3,5)
        minus(1.0,5.0)
        multiply.invoke(3F,4F)
        onlyMethod.invoke()

    }
    //Lamda Expressions
    //without return types
    var name: () -> String = {
        println("Only Return Expression")
        "Lamda Expression"

    }
    //with parameters
    var addTwo:(Int,Int) -> Int = { x, y ->
        println("with parameters Return Expression ${x + y}")


        x+y
    }
    //without input
    val minus = {a:Double,b:Double ->
        var c= a
        c += 6
        println("with parameters Return Expression ${c-b}")
        c - b
    }
    //With parms No return type
//Unit is Void func no need return anything
    var multiply:(Float,Float) -> Unit = { a , b ->

        println("No return method with params ${a * b}")
    }

    var onlyMethod:() -> Unit  = {
        println("onlyMethod")
    }

}