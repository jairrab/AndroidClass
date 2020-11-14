package com.github.jairrab.testapp.oop

class Plane {
    var engineCount = 2 //property variable

    fun fly() {
        println("The $engineCount engine plane is now flying")
    }
}

//Constructors
class Fruit(val shape: String) { //constructor variable
    fun printShape() {
        println("The color of this fruit is $shape")
    }
}

class Fruit2(shape: String) { //constructor variable
    init { //is a initialization routine that gets executed during object creation
        println("The Fruit2 of shape $shape is now constructed")
    }
}

fun main() {
    /*val rexPlane = Plane() //rexplane is an object variable of data type Plane
    val patPlane = Plane() //rexplane is an object variable of data type Plane

    rexPlane.fly()
    patPlane.fly()

    val ronFruit = Fruit("circle")
    println(ronFruit.shape)*/

    //I'm creating an object of type Fruit2
    // and assigning to ronFruit2
    //this is called an "instantiation" or "creating an instance"
    //creating an object or "object creation"
    val ronFruit2 = Fruit2("circle")

    val a:Int = 2 //a variable of type int

}