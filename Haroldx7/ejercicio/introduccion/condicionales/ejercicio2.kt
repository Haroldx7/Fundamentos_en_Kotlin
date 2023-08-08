package com.Haroldx7.ejercicio.introduccion.condicionales

class ejercicio2 {

}
fun main(){
    var mes: Int = 0
    var dia: Int = 0

    println("Mostrar tu signo del zodiaco segun tu cumpleaños")
    println("Digite el mes de nacimiento:")
    mes = readln().toInt()
    println("Digite el dia de nacimiento :")
    dia = readln().toInt()

    val signo = when(mes){
        1 -> if(dia<= 19){
            println("Tu signo es: Capricornio")
        }else{
            println("Tu signo es: Acuario")
        }
        2 -> if(dia<= 18){
            println("Tu signo es: Acuario")
        }else{
            println("Tu signo es: Picis")
        }
        3 -> if(dia<= 20){
            println("Tu signo es: picis")
        }else{
            println("Tu signo es: Aries")
        }
        4 -> if(dia<= 19){
            println("Tu signo es: Aries")
        }else{
            println("Tu signo es: Tauro")
        }
        5 -> if(dia<= 20){
            println("Tu signo es: Tauro")
        }else{
            println("Tu signo es: Geminis")
        }
        6 -> if(dia<= 20){
            println("Tu signo es: Geminis")
        }else{
            println("Tu signo es: Cáncer")
        }
        7 -> if(dia<= 22){
            println("Tu signo es: Cáncer")
        }else{
            println("Tu signo es: Leo")
        }
        8 -> if(dia<= 22){
            println("Tu signo es: leo")
        }else{
            println("Tu signo es: Virgo")
        }
        9 -> if(dia<= 22){
            println("Tu signo es: Virgo")
        }else{
            println("Tu signo es: Libra")
        }
        10 -> if(dia<= 22){
            println("Tu signo es: Libra")
        }else{
            println("Tu signo es: Escropio")
        }
        11 -> if(dia<= 21){
            println("Tu signo es: Escorpio")
        }else{
            println("Tu signo es: Sagitario")
        }
        12 -> if(dia<= 21){
            println("Tu signo es: Sagitario")
        }else{
            println("Tu signo es: Capricornio")
        }
        else ->{

        }

    }
    println(signo)


}

