package com.example.aulas.orientacaoObjetos.heranca.polimorfismo

abstract class Animal(val id: Int) {

    var energy: Int =0
   abstract var minEnergy: Int

    abstract fun feed()
    abstract fun play()
    fun isHungry() : Boolean = energy < minEnergy

    override fun toString() = "id: $id energy: $energy isHungry: ${isHungry()}"
}

class Ant(id: Int): Animal(id) {
    override  var minEnergy = 2

    override fun feed() {
        this.energy++
    }

    override fun play() {
        this.energy--
    }
}

class Lion(id: Int): Animal(id) {
    override  var minEnergy = 120

    override fun feed() {
        this.energy = energy + 70
    }

    override fun play() {
        this.energy = energy - 50
    }

    fun roar() = println("Rooooooaaaaarrrrr")
}

class AnimalFactory{
    fun createAnAnimal(type: Int, id: Int) : Animal{
        return when(type) {
            1 -> Ant(id)
            else -> Lion(id)
        }
    }
}