package com.haroldx7.eje.ejercicios

class ejercicio3 {

}
fun main(){
    var edad: Int = 0
    var pesobebe: Int = 0
    var mesesbebe: Int = 0
    println("Cuantos año tiene el bebe?: ")
    edad = readln().toInt()
    if (edad <= 0){
        var dosisvacuna: Int = 0
        println("Cuanto pesa el bebe?: ")
        pesobebe = readln().toInt()
        println("Cuantos meses tiene?: ")
        mesesbebe = readln().toInt()
        dosisvacuna = (pesobebe+10/mesesbebe*10)*8
        println("La dosis de la vacuna es: $dosisvacuna")
    }else{

    }
}