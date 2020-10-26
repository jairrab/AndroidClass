package com.github.jairrab.testapp.petexercise.coleen

import com.github.jairrab.testapp.petexercise.Pet

class PetOfColeen : Pet() {
    private var status = ""

    override fun feed() {
        status = "Coleen's pet is eating"
        println(status)
    }

    override fun play() {
        status = "Coleen's pet is playing"
        println(status)
    }

    override fun sleep() {
        status = "Coleen's pet is sleeping"
        println(status)
    }

    override fun getStatus(): String {
        return status
    }
}