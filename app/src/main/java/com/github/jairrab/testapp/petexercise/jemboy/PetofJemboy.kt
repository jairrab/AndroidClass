package com.github.jairrab.testapp.petexercise.jemboy

import com.github.jairrab.testapp.petexercise.Pet

class PetofJemboy : Pet() {
    override fun feed() {
        println("Jemboy's pet is eating")
    }

    override fun play() {
        println("Jemboy's pet is playing")
    }

    override fun sleep() {
        println("Jemboys's pet is sleeping")
    }
}