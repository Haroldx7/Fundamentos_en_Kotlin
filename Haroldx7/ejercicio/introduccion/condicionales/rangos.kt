package com.Haroldx7.ejercicio.introduccion.condicionales

class rangos {
}
fun main(){
    val num = 7
    if(num in 1..500){
        println(num)
    }
    when(num){
        7 -> println("Coincide")
        in 1..50 -> println("esta bien")
        else -> println("yuca")
    }
}
