package com.github.jairrab.testapp.oop

class Animal {
    //class properties - top level variables
    private val byron: String = ""
    private val ron: String = ""

    //visibility modifiers - private, public, internal, protected

    //functions
    private fun eating(food: String, color:String) { //food- is a function parameter
        //function variable
        val jemboy :String = ""

        //2 types of variables : var and val
        val aaaa:Int = 2
        //aaaa = 3 //compiler error, cannot be reassigned

        var bbbb:Int = 3
        bbbb = 4
    }

    private fun main() {
        eating("banana", "red")
    }
}

class Dog {

}