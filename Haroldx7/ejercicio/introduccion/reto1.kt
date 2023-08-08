package com.haroldx7.eje.ejercicios

class ejercicio2{

}
fun main(){
    var formula:String = "°c(°f-32)1.8"
    println("La formula es: $formula")
    println("¿Cambiar la formula? (si/no)")
    var resp: String = readln()
    if (resp == "si"){
        println("Escribir nueva formula: ")
        formula = readln()
        println("La nueva formula es: $formula")
    }

}