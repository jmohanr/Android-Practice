# Android-Practice
#Day 1 Practice on Constraints
![alt text](https://github.com/jmohanr/Android-Practice/blob/main/Day4/demo.png)

**#Basic Interview and logical functions **



    fun divideValues(x:Double,y:Double) : Double {
        println("The Final Value is ${x/y} and divident Value ${x%y}")
        return  x/y
    }
    fun areaOfCircle(radius: Double) : Double {
        println("The Final Area of circlr is ${3.14159 * (radius * radius)}")

        return 3.14159 * (radius * radius)
    }

    fun swapTwoValues()  {
        var a = 9
        var b = 11
        var e = a * b

        a = e/a
        b = e/b
        println("a is $a and b is $b")
}

    fun findValues(input:String) {
        var letters = 0
        var spaces = 0
        var num = 0
        var others = 0
        var ch = input.toCharArray()

        for (c in ch) {
            if (c.isLetter()) {
                letters++
            } else if (c.isDigit()) {
                num++
            }else if (c.isWhitespace()) {
                spaces += 1
            } else {
                others += 1
            }
        }

        println("$letters  Letters and $spaces  Spaces and $num  Numbers and $others  other values")
    }

    fun reverseString(input:String) {
        var ch = input.toCharArray()
        var array = mutableListOf<Any>()

        var reverse = ""
        for (i in input.count() -1 downTo 0 ) {
          reverse += input[i]
        }
        for (c in ch) {

           array.add(0,c)
        }
        println(array.toString())
        println(reverse)
    }

    fun findOddandEvenNumbers(input: List<Int>) {
        var oddNum = 0
        var evenNum = 0

        for (i in input){
            if ((i%2) == 0) {
                evenNum += 1
            } else {
                oddNum += 1
            }
        }

        println("$evenNum Even Numbers \n and $oddNum Odd Numbers")
    }

    fun findMaxValue(input: List<Int>) {
        var index1 = input[0]
        var maxValue = index1
        var minValue = index1
        for (i in input) {
            if (i > maxValue) {
                maxValue = i
            }

            if (i < minValue) {
                minValue = i
            }
        }

        println("Max Value is $maxValue \n and Min Value is $minValue")
    }

