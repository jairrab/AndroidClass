package com.github.jairrab.testapp.petexercise.ron

import com.github.jairrab.testapp.petexercise.Pet

class PetOfRon : Pet() {
    override fun feed() {
        println("Ron's pet is eating")
    }

    override fun play() {
        println("Ron's pet is playing")
    }

    override fun sleep() {
        println("Ron's pet is sleeping")
    }
}