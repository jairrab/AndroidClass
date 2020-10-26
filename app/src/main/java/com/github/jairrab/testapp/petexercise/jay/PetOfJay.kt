package com.github.jairrab.testapp.petexercise.jay

import com.github.jairrab.testapp.petexercise.Pet

class PetOfJay : Pet() {
    override fun feed() {
        println("Jay's pet is eating")
    }

    override fun play() {
        println("Jay's pet is playing")
    }

    override fun sleep() {
        println("Jay's pet is sleeping")
    }
}