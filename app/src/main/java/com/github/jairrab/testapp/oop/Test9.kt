package com.github.jairrab.testapp.oop

fun interface AA {
    fun onlyFunction()
}

fun interface BB1 {
    fun onlyFunction()
}

class BB : AA {
    override fun onlyFunction() {
        TODO("Not yet implemented")
    }
}

fun main() {
    samTester(object : AA {
        override fun onlyFunction() {
            //do whatever
        }
    })

    //lambda syntax
    samTester {
        //do whatever
    }

    samTester2(object : AA2 {
        override fun onlyFunction(intParameter: Int) {
            println("The number of apples is $intParameter")
        }
    })

    samTester2 { numApples ->
        println("The number of apples is $numApples")
    }

    samTester3(object : AA3 {
        override fun onlyFunction(intParameter: Int, stringParameter: String) {
            println("The number of apples is $intParameter of color $stringParameter")
        }
    })

    samTester3 { numApples, appleColor ->
        println("The number of apples is $numApples of color $appleColor")
    }
}

fun samTester(parameter: AA) {
    //does something
}

fun samTester2(parameter: AA2) {
    //does something
}

fun samTester3(parameter: AA3) {
    //does something
}

fun interface AA2 {
    fun onlyFunction(intParameter: Int)
}

fun interface AA3 {
    fun onlyFunction(intParameter: Int, stringParameter: String)
}