package com.example.aulas.objectOrientation

class Team {
    var players: MutableList<Person> = mutableListOf()
    var name: String  = ""

    fun getAllPlayerWithNameBiggerThan(size: Int): List<Person> {
        return this.players.filter { person ->  person.name.length > size }
    }

    fun printAllPlayersEmailAndPhone(): Unit {
        this.players.forEach {
            player -> println(player.getEmailAndPhone())
        }
    }
}