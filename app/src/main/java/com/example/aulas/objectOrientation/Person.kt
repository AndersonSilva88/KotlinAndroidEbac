package com.example.aulas.objectOrientation

class Person {

    lateinit var name: String
    var age: Int = 0
    lateinit var email: String
    lateinit var phone: String

    fun getEmailAndPhone(): String {
        return "email: ${this.email} phone: ${this.phone}"
    }

    fun printGreetings(hello: String) {
        println("$hello ${this.name}")
    }

    fun isOlderThan(targetAge: Int): Boolean  {
        return this.age > targetAge
    }

}