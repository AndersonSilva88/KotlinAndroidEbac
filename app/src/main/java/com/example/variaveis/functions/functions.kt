package com.example.variaveis.functions

class functions {
}

fun main() {
    var Anderson = "Anderson"
    myFistFunction(Anderson, "da Silva", 33)
    myFistFunction("Anderson", "da Silva", 21)
    val resultado = resto(10,6)
    println(resultado)
    firstHighOrderFunction("Hello ", "Anderson", ::concatString)
    firstHighOrderFunction("Another", "text", ::printStringNumberOfLetter)
    val concat: (String,String) -> Unit = {a1, a2 -> println(a1+a2)}
    val numberOfLetters = {a1: String, a2: String -> println("$a1 has ${a1.length} letters and $a2 has ${a2.length} letters ")}

    val div: (Int) -> Int = {it / 2}

    println(div(5))

    firstHighOrderFunction("novo ", "texto",concat)
    firstHighOrderFunction("Aluno", "Anderson", numberOfLetters)

    firstHighOrderFunction("novo ", "texto", {a1: String, a2: String -> println(a1+a2)})
    firstHighOrderFunction("Aluno ", "Anderson", {
        a1: String, a2: String ->
        println(a1)
        println(a2)
        println("Hello World")
    })

    val operation = {
        number1: Int, number2: Int ->

        var result = number1 * 2
        result = result / number2
        result = result + number1 + number2
        result
    }
    println(operation(4 ,2))

}

fun resto(val1: Int, val2: Int) : Int {
    return val1 % val2
}

fun myFistFunction(nome: String, sobrenome: String, idade: Int) {
    println("Olá me chamo $nome $sobrenome, tenho $idade anos")
    when {
        idade < 25 -> println("Você é adolescente")
        else -> println("Você é adulto")

    }
}

fun firstHighOrderFunction(text1: String, text2: String, operation: (String, String) -> Unit) {
    operation(text1, text2)
}

fun concatString(n1: String, n2: String ) = println(n1+n2)

fun printStringNumberOfLetter(n1: String, n2: String) = println("$n1 has ${n1.length} letters and $n2 has ${n2.length} letters ")

