package com.example.variaveis.operations

class Operations {
}

fun main() {
    var test = 2
    var conversion: Double = test.toDouble() //casting
    println(conversion)

    var nota1 = 5
    var nota2 = 2
    var resultado = nota1/nota2
    println(resultado)

    val name = "Anderson"
    val template = "Welcome to"

    println("$template $name number of letters is ${name.length}")

}