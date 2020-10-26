package com.github.jairrab.testapp.petexercise

/**
 * Base class for Pet
 */
abstract class Pet {
    abstract fun feed()
    abstract fun play()
    abstract fun sleep()
    abstract fun getStatus(): String
}