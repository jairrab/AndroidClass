package com.github.jairrab.testapp.petexercise.byrone

import com.github.jairrab.testapp.petexercise.Pet

class PetOfByrone : Pet() {
    override fun feed() {
        println("Byrone's pet is eating")
    }

    override fun play() {
        println("Byrone's pet is playing")
    }

    override fun sleep() {
        println("Byrone's pet is sleeping")
    }
}