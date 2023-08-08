package com.Haroldx7.ejercicio.introduccion.condicionales

class ejercicio1 {

}
fun main(){
    println("CAul es ala edad?")
    /*
    var edad = readln()!!.toInt()
    if (edad>=18) {
        println("Bienvenido a la discoteca")

    }else{
        println("No puede ingresar")
    }*/
    var edad = readln()!!.toInt()
    if (edad>=18) {
        println("Bienvenido a la discoteca")
    }else if (edad > 0 && edad >18) {
        println("No puede entrar")
    }

}