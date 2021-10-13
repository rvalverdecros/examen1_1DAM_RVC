import kotlin.system.exitProcess

fun main() {
    println("*********************************************************************************")
    println("PROGRAMA DE GENERACIÓN DE TABLAS: Rafael Valverde Cros")
    println("Buenas, ¿Que edad tiene el alumno? ")
    val edad = readLine()!!.toInt()
    if (edad > 12){
        println("Edad: $edad. No se cotempla esta edad.")
        println("*********************************************************************************")
        otra()
    }
    if (edad < 6){
        println("Edad: $edad. No se cotempla esta edad.")
        println("*********************************************************************************")
        otra()
    }
    println("¿En que mes nacio el alumno? ")
    val mes = readLine()!!.toInt()
    if (mes > 12){
        println("Mes: $mes. El mes es erroneo.")
        println("*********************************************************************************")
        otra()
    }
    if (mes == 0){
        println("Mes: $mes. El mes es erroneo.")
        println("*********************************************************************************")
        otra()
    }
    if (mes == 1) {
        if (edad in 6..8){
            println("Edad: $edad. El alumno está dentro del rango [6-8]")
            println("Mes: $mes. El mes es impar, corresponden las tablas siguientes: {1,3,5}")
            println("*********************************************************************************")
            println("Tabla de 1")
            println("***********")
            mul(1)
            println("***********")
            println("Tabla de 3")
            println("***********")
            mul(3)
            println("***********")
            println("Tabla de 5")
            println("***********")
            mul(5)
            println("*********************************************************************************")
            otra()
        }
        if (edad in 9..10){
            println("Edad: $edad. El alumno está dentro del rango [9-10]")
            println("Mes: $mes. El mes es impar, corresponden las tablas siguientes: {7,9}")
            println("*********************************************************************************")
            println("Tabla de 7")
            println("***********")
            mul(7)
            println("***********")
            println("Tabla de 9")
            println("***********")
            mul(9)
            println("*********************************************************************************")
            otra()
        }
    }
    if (mes % 2 == 1) {
        if (edad in 6..8){
            println("Edad: $edad. El alumno está dentro del rango [6-8]")
            println("Mes: $mes. El mes es impar, corresponden las tablas siguientes: {1,3,5}")
            println("*********************************************************************************")
            println("Tabla de 1")
            println("***********")
            mul(1)
            println("***********")
            println("Tabla de 3")
            println("***********")
            mul(3)
            println("***********")
            println("Tabla de 5")
            println("***********")
            mul(5)
            println("*********************************************************************************")
            otra()
        }
        if (edad in 9..10){
            println("Edad: $edad. El alumno está dentro del rango [9-10]")
            println("Mes: $mes. El mes es impar, corresponden las tablas siguientes: {7,9}")
            println("*********************************************************************************")
            println("Tabla de 7")
            println("***********")
            mul(7)
            println("***********")
            println("Tabla de 9")
            println("***********")
            mul(9)
            println("*********************************************************************************")
            otra()
        }
    }
    if (mes % 2 == 0) {
        if (edad in 6..8){
            println("Edad: $edad. El alumno está dentro del rango [6-8]")
            println("Mes: $mes. El mes es par, corresponden las tablas siguientes: {2,4}")
            println("*********************************************************************************")
            println("Tabla de 2")
            println("***********")
            mul(2)
            println("***********")
            println("Tabla de 4")
            println("***********")
            mul(4)
            println("*********************************************************************************")
            otra()
        }
        if (edad in 9..10){
            println("Edad: $edad. El alumno está dentro del rango [9-10]")
            println("Mes: $mes. El mes es par, corresponden las tablas siguientes: {6,8,10}")
            println("*********************************************************************************")
            println("Tabla de 6")
            println("***********")
            mul(6)
            println("***********")
            println("Tabla de 8")
            println("***********")
            mul(8)
            println("***********")
            println("Tabla de 10")
            println("***********")
            mul(10)
            println("*********************************************************************************")
            otra()
        }
    }
    if (edad in 11..12) {
        println("Edad: $edad. El alumno está dentro del rango [11-12]")
        println("Te corresponden las tablas del 11, 12 y 13")
        println("*********************************************************************************")
        println("Tabla de 11")
        println("***********")
        mul(11)
        println("***********")
        println("Tabla de 12")
        println("***********")
        mul(12)
        println("***********")
        println("Tabla de 13")
        println("***********")
        mul(13)
        println("*********************************************************************************")
        otra()
    }
    }


fun mul(num:Int){

    for (i in 1..10) {
        val product = num * i
        println("$num * $i = $product")
    }
}

fun otra() {
    var other: String
    do {
        println("¿Quieres hacer la de otro alumno? (S/N)")
        other = readLine()!!.toString().uppercase()
    } while (other != "S" && other != "N")
    if (other == "S") {
        main()
        println()
    }else{
        println("Adios!!!")
        exitProcess(-1)
    }
}