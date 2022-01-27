package com.example.aulas.conditionaisLoop

class Loop {
}

fun main() {
    var array: IntArray = IntArray(20)

    var i = 0
    while (i <= array.size - 1) {
        println(array[i])
        i++
    }

    for (j in array.indices) {
         array[j] = j * 2
        println(array[j])
    }

    var resultado = 0.0
    for (j in 0..array.size -1) {
        resultado = resultado + array[j] / 3.0
       println(resultado)
    }

    var k = 0
    var result = 0.0
    while (k < array.size) {
        result = result + array[k] / 3.0
        k++
    }

    println("Valor do ultimo resultado = $resultado")
    println("Valor do ultimo result = $result")
}