package com.example.aulas.objectOrientation

import kotlin.random.Random


class Account(name: String) {

    private var balance: Double = 0.0
    lateinit var name: String
    private lateinit var id: String
    private lateinit var address: String

    init {
        this.name = name
        this.balance = 0.0
        this.address = ""
        this.id = Random.nextInt(0,16000).toString()
    }

    fun withDraw(amount: Double): Double{
        balance = balance - amount
        if (balance < 0)
            balance = 0.0
        return balance
    }

    fun deposit(amount: Double) {
        balance = balance + amount
    }

    fun getBalance() = this.balance

    fun print() {
        println("saldo: $balance, name: $name, id: $id")
    }

}