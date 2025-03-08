package com.example.variaveis

class Condicionais {
}

fun main() {

    var numero = 10 * 2
    var parImpar: String

    if (numero < 4) {
        println("menor que 4")
    } else if (numero == 4) {
        println("igual a 4")
    } else {
        println("maior que 4")
    }

    when {
        numero < 4 -> println("menor que 4")
        numero == 4 -> println("igual a 4")
        else -> println("maior que 4")
    }

    parImpar = when {
        numero % 2 == 0 -> "par"
        else -> "impar"
    }

    println(parImpar)

    var numero1 = 5
    var numero2 = 10
    var numero3 = 20

    if (numero1 > numero2 && numero1 > numero3){
        println("maior numero")

    }else if (numero1 > numero2){
        println("Maior que numero 2 e menor que numero 3")

    }else if (numero1 > numero3){
        "Maior que numero 2 e menor que numero 3"

    }else println("Menor numero")

    val resultado = when{

        numero1 > numero2 && numero1 > numero3 -> "maior numero"
        numero1 > numero2 -> "Maior que numero 2 e menor que numero 3"
        numero1 > numero3 -> "Maior que numero 3 e menor que numero 2"
        else -> "Menor numero"
    }

println(resultado)

}