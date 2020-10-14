package com.github.jairrab.mathutils

import kotlin.math.pow
import kotlin.math.roundToInt

fun Double.isWholeNumber(): Boolean {
    return this % 1.0 == 0.0
}

fun Double.decimalPart(): Double {
    return this % 1.0
}

fun Double.isMultipleOfFiftyCents(): Boolean {
    return this % 0.5 == 0.0
}

fun Double.roundToNextFiftyCents(): Double {
    val a = (this / 0.5).toInt() + 1
    return a * 0.5
}

fun Double.roundToPreviousFiftyCents(): Double {
    val a = (this / 0.5).toInt()
    return a * 0.5
}

fun Double.trimDecimal(number: Int): Double {
    val base = 10.0.pow(number.toDouble())
    return (this * base).roundToInt() / base
}