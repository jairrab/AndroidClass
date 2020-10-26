package com.github.jairrab.testapp.petexercise.ron

import com.github.jairrab.testapp.petexercise.Pet

class PetOfRon : Pet() {
    private var status = ""

    override fun feed() {
        status = "Ron's pet is eating"
        println(status)
    }

    override fun play() {
        status = "Ron's pet is playing"
        println(status)
    }

    override fun sleep() {
        status = "Ron's pet is sleeping"
        println(status)
    }

    override fun getStatus(): String {
        return status
    }
}