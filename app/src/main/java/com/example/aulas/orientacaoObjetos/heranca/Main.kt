package com.example.aulas.orientacaoObjetos.heranca

class Main {

}

fun main() {
    var person = Person()
    person.name = "anderson"
    person.email = "anderson@gmail.com"

    var player = Player()
    player.name = "Jogado"
    player.email = "jogado@email.com"
    player.number = 9

    println(person)
    println(player)

    if (player is Person) {
        println("É uma pessoa")
    }

    var copyPerson: Person = player
    println(copyPerson)
}