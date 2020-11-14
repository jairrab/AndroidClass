package com.github.jairrab.testapp.oop

class DataTypes {

    fun test() {
        val o: Boolean = true //or false
        val o1 = true


        val a: Int = 100 //32 bit
        val a1 = 100

        val b: Long = 1292382932 //64bit
        val b1 = 1234343L

        val c: Float = 1.0f
        val c1 = 123232.343f

        val d: Double = 2.0
        val d1 = 2343.35354

        val e: Char = 'b'
        val e1 = 'd'

        val f: String = "any string"
        val f1 = "dsdsds"

        //Array<Int> is an Integer[] under the hood,
        // while IntArray is an int[]. That's it.

        val g: IntArray = intArrayOf(1, 2, 3)
        //val g: IntArray = intArrayOf(1, 2, 3, null) //cannot contain nulls
        val h: LongArray = longArrayOf(1, 2, 3)

        val g1: Array<Int> = arrayOf(1, 2, 3)
        val g1b: Array<Int?> = arrayOf(1, 2, 3, null)
        val g2: Array<Long> = arrayOf(2, 3, 4)
        val g3: Array<String> = arrayOf("aaa", "bbb", "aaaa")
        val g4: Array<Boolean> = arrayOf(true, false, true)
        val g5: Array<Char> = arrayOf('a', 'b', 'c')

        //Nullables
        var k: Int? = 3
        //? indicates that the variable can be assigned a null value
        k = null

        val l: String? = null
        val m: Boolean?




    }


}