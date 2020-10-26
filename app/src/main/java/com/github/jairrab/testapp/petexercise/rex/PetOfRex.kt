package com.github.jairrab.testapp.petexercise.rex

import com.github.jairrab.testapp.petexercise.Pet


class PetOfRex : Pet() {
    private var status = ""

    override fun feed() {
        status = "Rex's pet is eating"
        println(status)
    }

    override fun play() {
        status = "Rex's pet is playing"
        println(status)
    }

    override fun sleep() {
        status = "Rex's pet is sleeping"
        println(status)
    }

    override fun getStatus(): String {
        return status
    }
}