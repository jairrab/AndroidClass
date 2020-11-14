package com.github.jairrab.testapp.oop

//a class is closed by default
//unless specified to be open or abstract
//when a class is closed, it is final and cannot be "extended"

//Plant is a parent class of flower
//plant sub-classes flower
abstract class Plant2 {

}

//"sub-classing" or "extending a class" or "making a child class of"
//flower is a sub-class of plant
//flower extends class
//flower is a child class of plant
abstract class Flower2 : Plant2() {

}

class Sampaguita2 : Flower2(){

}

fun main() {
    //val flower2 = Flower2()
}

//class is closed by default and cannot be extended
//an open class can be extended and can be instantiated
//an abstract class can be extended and cannot be instantiated