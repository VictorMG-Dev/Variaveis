package com.example.variaveis

class Collections {
}

fun main() {

   var array: Array<String> = Array(10) {""}
    var array2: DoubleArray = DoubleArray (2) {i -> 1.0 * 1}

    array2[0] = 5.0
    array2.set(1,15.0)

    println(array2[0])
    println(array2.get(1))


    var mutableList : MutableList<Int> = mutableListOf()
    var lista: List<String> = listOf("valor1","valor2")

    mutableList.add(5)
    mutableList.add(0)
    println(mutableList.size)
    mutableList.remove(0)
    mutableList[0] = 1
    mutableList.set(0,7)
    println(mutableList[0])
    println(lista.get(0))

    var mutableMap: MutableMap<String,String> = mutableMapOf()
    var map: Map<Int,Int> = mapOf(Pair (5,10))
    println(mutableMap.contains("Eduardo"))
    mutableMap["Victor"] = "Desenvolvedor"
    println(mutableMap.contains("Victor"))
    mutableMap.put("Victor","Desenvolvedor Mobile")
    println(mutableMap.get("Victor"))
    println(mutableMap["João"])
}