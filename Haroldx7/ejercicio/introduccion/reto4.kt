package com.haroldx7.eje.ejercicios
import kotlin.random.Random
class ejercicio5 {

}
fun main(){
    var resp: String = "si"
    println("¿Jugar?")
    resp = readln()
    if (resp == "si") {
        println("Tienes que hacer que el numero coincida, de 0 a 10")
        var num: Int = 0
        var continuar = "si"
        while (continuar == "si"){
            println("Escribir numero: ")
            num = readln().toInt()
            val num_r: Int = Random.nextInt(10)
            if (num == num_r){
                println("Le has atinado al numero, numero es: $num_r")
                println("¿Volver a jugar?")
                var resp1: String = "si"
                resp1 = readln()
                if (resp1 == "si"){
                    continuar = "si"

                }else{
                    continuar = "no"
                }
            }else{
                println("No le has atinado, numero es: $num_r")
                println("¿Volver a jugar?")
                var resp1: String = "si"
                resp1 = readln()
                if (resp1 == "si"){
                    continuar = "si"

                }else{
                    continuar = "no"
                }

            }
        }

    }



}