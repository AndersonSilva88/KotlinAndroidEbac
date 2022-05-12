package com.example.aulas.orientacaoObjetos.heranca.interfaces

fun main() {
    var player = GoalKeeper()
    player.name = "guga"
    player.number = 1
    player.goalsCenced = 10

    println(player.rating())
    println(player.isAGoodplayer())

}

interface Player {
    val name: String
    get() = "teste"
    var number: Int

    fun rating(): Int

    fun isAGoodplayer(): Boolean {
        return rating() > 5
    }

}

class GoalKeeper : Player {
    override var name = ""
    override var number = 0
    var goalsCenced = 0

    override fun rating() = 5
    override fun toString() = "name: $name number: $number goals: $goalsCenced"
}