package com.github.jairrab.testapp.petexercise.jay

import com.github.jairrab.testapp.petexercise.Pet

class PetOfJay : Pet() {
    private var status = ""

    override fun feed() {
        status = "Jay's pet is eating"
        println(status)
    }

    override fun play() {
        status = "Jay's pet is playing"
        println(status)
    }

    override fun sleep() {
        status = "Jay's pet is sleeping"
        println(status)
    }

    override fun getStatus(): String {
        return status
    }
}