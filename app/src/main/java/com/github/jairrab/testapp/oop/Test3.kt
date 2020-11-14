package com.github.jairrab.testapp.oop

//a class is closed by default
// unless specified to be open or abstract

//when a class is closed, it is final and cannot be "extended"

//Plant is a parent class of flower
//plant sub-classes flower
open class Plant {

}

//"sub-classing" or "extending a class" or "making a child class of"
//flower is a sub-class of plant
//flower extends class
//flower is a child class of plant
open class Flower : Plant() {

}

class Sampaguita : Flower(){

}

fun main() {
    val flower = Flower()
}