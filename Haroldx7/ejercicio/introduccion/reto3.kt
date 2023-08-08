package com.haroldx7.eje.ejercicios
import kotlin.math.sqrt
import java.lang.Math
class ejercicio4 {
    
}


fun main(){
    var num1: Int = 0
    var num2: Int = 0
    println("Ingrese el primer numero: ")
    num1 = readln().toInt()
    println("Ingrese el segundo numero")
    num2 = readln().toInt()
    
    println("La suma es: ${num1+num2}")
    println("La resta es: ${num1-num2}")
    println("La multiplicacion es: ${num1*num2}")
    println("La division es: ${num1/num2}")
    println("La raiz cuadrada del numero 1 es: ${sqrt(num1.toDouble())} y la raiz cuadrada del numero 2 es: ${sqrt(num2.toDouble())}")
    var res_p = Math.pow(num1.toDouble(), num2.toDouble())
    println("La potenciacion es: $res_p")
}



