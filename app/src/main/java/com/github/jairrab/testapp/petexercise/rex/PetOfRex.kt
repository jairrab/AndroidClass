package com.github.jairrab.testapp.petexercise.rex

import com.github.jairrab.testapp.petexercise.Pet


class PetOfRex : Pet() {
    override fun feed() {
        println("Rex's pet is eating")
    }

    override fun play() {
        println("Rex's pet is playing")
    }

    override fun sleep() {
        println("Rex's pet is sleeping")
    }
}