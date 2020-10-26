package com.github.jairrab.testapp.petexercise.jemboy

import com.github.jairrab.testapp.petexercise.Pet

class PetofJemboy : Pet() {
    private var status = ""

    override fun feed() {
        status = "Jemboy's pet is eating"
        println(status)
    }

    override fun play() {
        status = "Jemboy's pet is playing"
        println(status)
    }

    override fun sleep() {
        status = "Jemboy's pet is sleeping"
        println(status)
    }

    override fun getStatus(): String {
        return status
    }
}