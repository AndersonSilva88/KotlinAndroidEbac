package com.example.aulas.orientacaoObjetos.heranca.classesAbstrata

fun main() {
    var player = GoalKeeper()
    player.name = "Guga"
    player.number = 1
    player.goalsConceded = 10

    println(player.rating())
    println(player.isAGoodPlayer())
}

abstract class Player{
    abstract var name: String
    abstract var number: Int

    abstract fun rating() : Int

    fun isAGoodPlayer(): Boolean{
        return rating() > 5
    }
}

class GoalKeeper : Player() {
    override var name = ""
    override var number = 0
    var goalsConceded = 0

    override fun rating(): Int {
        return when {
            goalsConceded < 15 -> 10
            goalsConceded < 30 -> 5
            else -> 0
        }
    }
}