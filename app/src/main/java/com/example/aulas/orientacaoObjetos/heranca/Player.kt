package com.example.aulas.orientacaoObjetos.heranca

class Player : Person(){
    var number: Int =0

    override fun toString(): String = super.toString() + "numero: ${this.number}"


}