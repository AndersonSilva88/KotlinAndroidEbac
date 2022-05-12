package com.example.aulas.orientacaoObjetos.heranca.polimorfismo

fun main() {
/*
    val ant = Ant()
    println(ant)
    ant.feed()
    ant.feed()
    ant.feed()
    println(ant)

    val lion = Lion()
    println(lion)
    lion.feed()
    lion.feed()
    lion.feed()
    println(lion)

    **/

    //val ant = Ant()
    //val lion = Lion()

    //val animalList: List<Animal>  = listOf(ant, lion)

    val factory = AnimalFactory()
    val animalList: MutableList<Animal> = mutableListOf()

    animalList.forEach {
            animal ->
            println(animal)
            animal.feed()
            println(animal)

        if (animal is Lion) {
            animal.roar()
        }
    }

    for(i in 1..100) {
        val animal = factory.createAnAnimal(i % 2, i)
        animalList.add(animal)
    }



}

