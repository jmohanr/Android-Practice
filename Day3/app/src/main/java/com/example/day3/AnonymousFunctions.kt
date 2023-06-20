package com.example.day3

import kotlin.math.min

class `AnonymousFunctions` {
    var MaxValue = fun(input:List<Int>) : Int {
        var max:Int = input[0]
        for (i in input.indices) {
            if (input[i] > max)
          max = input[i]
        }
        println("MaxValue is $max")
        return max
    }

    var add:(Int,Int) -> Int = fun(a,b):Int {
        println("Anonymous with inputs ${a + b}")
        return   a + b
    }
    val minus:(Double,Double) -> Unit = fun(a,b): Unit {
        println("With Params No Return ${a-b}")
        a - b
    }
    var multiply = fun (a:Float,b:Float): Float {
        println("with Inputs and return ${a * b}")
        return  a*b
    }
    // When sinle line of code we can call like this too
    val divide = fun(a:Double,b:Double):Double = a/b
    val onlyReturn = fun():String {return  "Only Return No params"}
    fun anony() {
        // We can call methods in two ways like with or without invoke
        add.invoke(2,3)
        minus(4.0,60.0)
        multiply.invoke(2F,4F)
        println("For single line code ${divide.invoke(3.0,2.0)}")
        MaxValue.invoke(listOf(2,6,9,10,30,2))
        println(onlyReturn.invoke())

    }
}