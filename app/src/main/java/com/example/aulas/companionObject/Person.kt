package com.example.aulas.companionObject

class Person private constructor(){
    var name = ""
    var email = ""

    fun getTotalPerson(): Int = counter

    companion object Manager {
        var counter = 0

        fun createPerson(): Person{
            counter++
            return Person()
        }

        /*
        fun incrementCounter() {
            counter++
        }
         **/
    }
}