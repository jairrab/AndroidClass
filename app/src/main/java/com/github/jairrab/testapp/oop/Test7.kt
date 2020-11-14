package com.github.jairrab.testapp.oop

open class AAA {
    open val ccc = "45"

    //a function is final by default
    //which means it cannot be overriden
    fun aaa() {

    }
}

class BBB : AAA() {
    override val ccc = "25"

    fun aaaa() {
    }
}

class CCC : AAA() {
    fun aaaa() {
    }
}

fun main() {
    val aaa = AAA()
    val bbb = BBB()
    val ccc = CCC()
    println(aaa.ccc) //prints 45
    println(bbb.ccc) //prints 25
    println(ccc.ccc) //prints 45
}