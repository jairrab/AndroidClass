package com.github.jairrab.testapp.oop

interface MMM {
    fun driveCar1()
    fun changeGear1()
}

interface NNN {
    fun driveCar2()
    fun changeGear2()
}

abstract class OOO() {
    abstract fun cleanHouse()
}

class PPP : OOO() {
    override fun cleanHouse() {
        TODO("Not yet implemented")
    }
}

class QQQ : OOO(), MMM, NNN {
    override fun driveCar1() {
        TODO("Not yet implemented")
    }

    override fun changeGear1() {
        TODO("Not yet implemented")
    }

    override fun driveCar2() {
        TODO("Not yet implemented")
    }

    override fun changeGear2() {
        TODO("Not yet implemented")
    }

    override fun cleanHouse() {
        TODO("Not yet implemented")
    }
}

fun main() {
    //val abstratObj = OOO() //you cannot instantiate an abstract
    //val interfaceObj = MMM() //you cannot instantiate an abstract

    val qqq = QQQ()
    val ppp = PPP()
    aaaaa(qqq)
    //aaaaa(ppp)

    //anonymous objects
    val tree = object : NNN{
        override fun driveCar2() {
            TODO("Not yet implemented")
        }

        override fun changeGear2() {
            TODO("Not yet implemented")
        }
    }

    val plant = object : OOO(){
        override fun cleanHouse() {
            TODO("Not yet implemented")
        }
    }

    aaaaa(tree)
}

fun aaaaa(robot:NNN){ //you supply an object of type NNN

}