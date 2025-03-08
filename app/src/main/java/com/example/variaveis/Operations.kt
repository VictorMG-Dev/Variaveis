package com.example.variaveis

class Operations {
}

fun main() {

    var teste = 1
    var converstion:Double = teste.toDouble()

    var a = 5
    var b = 2
    var resultado = a.toDouble() / b.toDouble()

    println(resultado)

    var texto = "5"
    var numero = 10
    var resultado2 = texto.toInt() - numero

    println(resultado2)

    val name = "Victor"
    val template = "Hello word $name. number of letters is ${name.length}"
    println(template)
    println("Hello" + " " + "world")
}
















