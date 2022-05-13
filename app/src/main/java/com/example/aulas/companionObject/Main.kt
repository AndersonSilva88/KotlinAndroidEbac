package com.example.aulas.companionObject

fun main() {

    val person = Person.Manager.createPerson()
    person.name = "Vitoria"
    println(Person.counter)
    println(person.getTotalPerson())
    person.helloPerson()

    Person.Manager.decrementCounter()
    println(Person.counter)

    val string = "Jose"
    println(string.myConcat())
}

fun String.myConcat(): String {
    return "Olá " + this
}

fun Person.helloPerson() {
    println("Olá ${this.name}")
}

fun Person.Manager.decrementCounter() {
    counter--
}