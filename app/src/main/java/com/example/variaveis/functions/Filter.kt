package com.example.variaveis.functions

class filter {
}

fun main() {
    val listNumber = listOf(1,2,3,4,5,6,7,8,9)
    val filtered = listNumber.filter{ it % 2 == 0}
    val filteredNot = listNumber.filterNot { it % 2 == 0 }
    val biggerThan4 = listNumber.filter { it > 4 }

    println(filtered)
    println(filteredNot)
    println(biggerThan4)

    val div = listNumber.map { it / 2 }
    println(div)

    val citiesList = listOf("Porto Alegre", "São Paulo", "Belo Horizonte")
    val modifiedCities = citiesList.map { "Olá $it" }
    println(modifiedCities)

    val statesList = listOf("Rio Grande do Sul", "são Paulo", "Minas Gerais" )
    val cityState = citiesList.zip(statesList){city,state -> "$city é a capital do estado $state"}
    println(cityState)

    val mapCities = citiesList.associateWith { it.length }
    val mapLength = citiesList.associateBy { it.length }

    println(mapCities)
    println(mapLength)

    citiesList.filter { it.length > 6
    }.map {
        "Olá $it"
    }.forEach {
        println(it)
    }
}