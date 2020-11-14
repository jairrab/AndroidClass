package com.github.jairrab.testapp.oop

abstract class Vehicle {
    abstract fun accelerate()
    abstract fun brake()
    abstract fun slowdown()

    fun someFunction() {

    }
}

class Car : Vehicle() {
    override fun accelerate() {
    }

    override fun brake() {
        println("Car is breaking")
    }

    override fun slowdown() {
    }
}

class Boat : Vehicle() {
    override fun accelerate() {
    }

    override fun brake() {
    }

    override fun slowdown() {
    }

}

class Driver {
    fun applyBreak(car: Car) {
        car.brake()
    }
}

fun main() {
    val driver = Driver()
    val someCar = Car()
    driver.applyBreak(someCar)
}