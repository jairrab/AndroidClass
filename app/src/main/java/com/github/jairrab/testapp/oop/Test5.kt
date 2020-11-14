package com.github.jairrab.testapp.oop

//APIE - abstraction, polymorphism, inheritance, encapsulation
abstract class Mammal(category: String) {

}

class Human(
    category: String,
    age: Int
) : Mammal(category) {

}

class Doggie(
    category: String,
    color: String
) : Mammal(category) {

}

fun main() {
    //I am creating an object of type Human and assigning it
    //to the variable john
    val john = Human("John", 23)
}