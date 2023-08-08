package com.haroldx7.eje.ejercicios

import kotlin.math.sqrt

class ejercicio4_0 {

}
fun main(){
    var num1:Int = 0
    var num2:Int = 0
    var resp: String = ""
    println("primer numero:")
    num1 = readln().toInt()
    println("Segundo numero:")
    num2 = readln().toInt()

    println("¿Sumar?")
    resp = readln()
    if (resp == "si"){
        println("La suma es: ${num1+num2}")
    }else {
        println("¿restar?")
        resp = readln()
        if(resp == "si"){
            println("La resta es: ${num1-num2}")
        }else{
            println("¿multiplicar?")
            resp = readln()
            if(resp == "si"){
                println("La multiplicacion es: ${num1*num2}")
            }else{
                println("¿Dividir?")
                resp = readln()
                if(resp == "si"){
                    println("La division es: ${num1/num2}")
            }else{
                    println("¿Raiz cuadrada?")
                    resp = readln()
                    if(resp == "si") {
                        println("La raiz cuadrada del numero 1 es: ${sqrt(num1.toDouble())} y la raiz cuadrada del numero 2 es: ${sqrt(num2.toDouble())}")

                    }else{
                        println("¿Potenciacion?")
                        resp = readln()
                        if(resp == "si"){
                            var res_p = Math.pow(num1.toDouble(), num2.toDouble())
                            println("La potenciacion es: $res_p")
                        }else {
                            println("No hay operacion para hacer")
                        }
                    }
            }
        }
    }
}
}