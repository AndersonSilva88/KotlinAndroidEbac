package com.example.aulas.data



enum class Season(val translate: String) {
    WINTER("inverno"){
        override fun hello() {
            println("olá inverno")
        }
    },
    SPRING("primavera") {
        override fun hello() {
            println("Olá primavera")
        }
    },
    SUMMER("verão"){
        override fun hello() {
            println("Olá verão")
        }
                     },
    FALL("outono"){
        override fun hello() {
            println("Olá outono")
        }
    };

    abstract fun hello()
}