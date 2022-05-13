package com.example.aulas.data

fun main() {

    val person = Person("Anderson", "000.000.000-00", "anderson@gmail")
    person.age = 30
    val person2 = Person("Willie", "456.896.256-45", "willie@gmail")
    println(person.equals(person2))
    println(person)

    val (name, cpf, email) = person2
    println(name)
    println(cpf)
    println(email)
    println(person.age)



}

data class Person(var name: String, val cpf: String, var email: String) {
    var age: Int = 0
}
