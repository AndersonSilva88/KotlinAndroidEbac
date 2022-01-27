package com.example.variaveis.functions

class Extends {
}

fun main() {

    val number = 5
    println(number.isEven())

    val baseText = "Exemplo"
    baseText.myConcat(" of extension")

    val result = 5.0 mySum 10.0
    println(result)
}

infix fun  Double.mySum(number2: Double): Double {
    return this + number2
}

fun String.myConcat(text: String) {
    println(this+text)
}

fun Int.isEven(): Boolean {
    return this % 2 == 0
}