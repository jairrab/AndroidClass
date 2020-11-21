package com.github.jairrab.testapp.oop

//Abstraction example

interface Calculator {
    fun plus(num1: Int, num2: Int): Int
    fun multiply(num1: Int, num2: Int): Int
}

class WeatherAnalyzer(private val calculator: Calculator) {

    fun analyze() {
        val a = 2
        val b = 3

        val result: Int = calculator.plus(a, b)

        println("Displaying result = $result")
    }
}

class MainClass {
    fun main() {
        val jemboysCalc = JemboysMillionDollarCalculator()
        val weatherAnalyzer = WeatherAnalyzer(jemboysCalc)

        weatherAnalyzer.analyze()
    }
}

class JemboysMillionDollarCalculator : Calculator {
    override fun plus(num1: Int, num2: Int): Int {
        //100000000 lines of code that adds two numbers
        return 5
    }

    override fun multiply(num1: Int, num2: Int): Int {
        //100000000 lines of code that adds two numbers
        return 5
    }
}