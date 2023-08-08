package com.haroldx7.eje.ejercicios

class Introduccion {

}


fun main(){

    println("¿Agregar personas? (si/no)")
    val resp:String = readln()
    var resp2: String = "si"
    while (resp2 == "si"){
        if(resp == "si"){
            println("Ingrse documento")
            val doc: Int = readln().toInt() ?: 0
            println("Ingrese Nombre")
            val nom: String = readln()
            println("Ingrese Apellido")
            val ape: String = readln()
            println("Ingrese Serial pantalla")
            val serial_p: Int = readln().toInt()?: 0
            println("Ingrese Numero equipo")
            val num_e: Int = readln().toInt()?: 0
            println("Ingrese Serial torre")
            val serial_t: Int = readln().toInt()?: 0
            println("Ingrese Serial mause")
            val serial_m: Int = readln().toInt()?: 0
            println("Ingrese Observaciones")
            val obs: String = readln()

            print("Sus datos son: $doc \n $nom \n $ape \n $serial_p \n $num_e \n $serial_t \n $serial_m \n $obs \n")
            println("¿Volver a agregar personas? (si/no)")

            resp2 = readln()




        }else{

        }

    }


}