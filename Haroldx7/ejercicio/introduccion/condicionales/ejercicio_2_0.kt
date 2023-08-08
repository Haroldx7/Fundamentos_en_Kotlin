package com.haroldx7.eje.ejercicios

import kotlin.math.roundToInt

class ejercicio_2_0 {

}
fun main(){
    println("La formula es: °c(°f-32)1.8")
    var c:Int = 0
    var f:Int = 0
    println("Escriba el valor de Fahrenheit")
    f = readln().toInt()
    c = ((f-32)*1.8).roundToInt()
    println(c)
    if(c >= 0 && c <= 500){
        println("El horno esta frio")
    }else if(c >= 500 && c <= 1000){
        println("El horno esta caliente")
    }else if(c >= 1000){
        println("El horno se esta quemando")
    }else{
        println("El valro no se reconoce")
    }
}