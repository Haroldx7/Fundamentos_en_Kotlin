package com.Haroldx7.ejercicio.introduccion.condicionales

import kotlin.math.sqrt

class ejercicio_when {
}
fun main(){
    println("Ingrese el primer numero")
    var n1 = readLine()!!.toInt()
    println("Ingrese el segundo numero")
    var n2 = readLine()!!.toInt()
    println("Ingrese la operacion que quiere hacer: ")
    var oper = readLine()!!.toString().lowercase()
    var sum: Int = 0
    var res: Int = 0
    var mul: Int = 0
    var div: Int = 0
    var rai: Int = 0
    var pot: Int = 0

    when(oper){
        "suma" -> {sum = ((n1 + n2).toDouble().toInt())
        println("La suma es: $sum")
        }
        "resta" -> {res = ((n1 - n2).toDouble().toInt())
            println("La resta es: $res")
        }
        "multiplicacion" -> {mul = ((n1 * n2).toDouble().toInt())
            println("La multiplicacion es: $mul")
        }
        "division" -> {div = ((n1 / n2).toDouble().toInt())
            println("La division es: $div")
        }

        "raiz cuadrada numero uno" -> {
            rai = sqrt(n1.toDouble()).toInt()
            println("La raiz cuadrada es: $rai")
        }
        "raiz cuadrada numero dos" -> {
            rai = sqrt(n2.toDouble()).toInt()
            println("La raiz cuadrada es: $rai")
        }

        "potenciacion" -> {
            pot = Math.pow(n1.toDouble(), n2.toDouble()).toInt()
            println("La potenciacion es: $pot")
        }

    }
}