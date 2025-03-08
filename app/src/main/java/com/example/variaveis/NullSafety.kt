package com.example.variaveis

class NullSafety {
}

fun main() {
    var inteiro : Int? = null
    var inteiro2 = 5
    var resultado = (inteiro ?: 0) + inteiro2 //Modo 1


    val inteiro3 : Int? = null
    if (inteiro3 != null){
        resultado = inteiro3 + inteiro2  //modo 2
    }

    var texto: String? = "meu texto"
    var tamanho: Int? = texto?.length //modo 3
}