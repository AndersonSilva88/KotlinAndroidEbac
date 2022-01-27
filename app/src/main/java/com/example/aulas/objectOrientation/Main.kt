package com.example.aulas.objectOrientation

fun main() {


    val aluno = Person()
    var aluno2: Person = Person()
    val copiaAluno = aluno

    aluno.name = "Anderson"
    aluno.phone = "123999999"
    aluno.email = "aluno@ebac.com"
    aluno.printGreetings("Olá")

    aluno2.name = "Davi"
    aluno2.phone = "523999999"
    aluno2.email = "aluno2@ebac.com"
    aluno2.printGreetings("olá")

    copiaAluno.printGreetings("Olá")
    copiaAluno.name = "Cleberson"

    aluno.printGreetings("Olá")

    val brasil =  Team()
    brasil.name = "Brasil"
    brasil.players.add(aluno)
    brasil.players.add(aluno2)
    brasil.players.add(copiaAluno)
    brasil.printAllPlayersEmailAndPhone()

    println()

    var account = Account("Anderson")
    account.print()
    account.deposit(100.0)
    account.print()
    account.withDraw(50.0)
    account.print()
    account.withDraw(80.0)
    account.print()



}