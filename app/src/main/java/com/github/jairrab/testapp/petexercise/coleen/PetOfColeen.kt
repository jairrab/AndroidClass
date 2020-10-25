package com.github.jairrab.testapp.petexercise.coleen

import com.github.jairrab.testapp.petexercise.Pet

class PetOfColeen : Pet() {
    override fun feed() {
        println("Coleen's pet is eating")
    }

    override fun play() {
        println("Coleen's pet is playing")
    }

    override fun sleep() {
        println("Coleen's pet is sleeping")
    }
}