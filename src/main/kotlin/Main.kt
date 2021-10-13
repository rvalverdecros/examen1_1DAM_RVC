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
            println("Te corresponden las tablas del 1, 3 y 5")
            println("*********************************************************************************")
            println("Tabla de 1")
            println("***********")
            prim()
            println("***********")
            println("Tabla de 3")
            println("***********")
            ter()
            println("***********")
            println("Tabla de 5")
            println("***********")
            quin()
            println("*********************************************************************************")
            otra()
        }
        if (edad in 9..10){
            println("Te corresponden las tablas del 7 y 9")
            println("*********************************************************************************")
            println("Tabla de 7")
            println("***********")
            sep()
            println("***********")
            println("Tabla de 9")
            println("***********")
            nov()
            println("*********************************************************************************")
            otra()
        }
    }
    if (mes % 2 == 1) {
        if (edad in 6..8){
            println("Te corresponden las tablas del 1, 3 y 5")
            println("*********************************************************************************")
            println("Tabla de 1")
            println("***********")
            prim()
            println("***********")
            println("Tabla de 3")
            println("***********")
            ter()
            println("***********")
            println("Tabla de 5")
            println("***********")
            quin()
            println("*********************************************************************************")
            otra()
        }
        if (edad in 9..10){
            println("Te corresponden las tablas del 7 y 9")
            println("*********************************************************************************")
            println("Tabla de 7")
            println("***********")
            sep()
            println("***********")
            println("Tabla de 9")
            println("***********")
            nov()
            println("*********************************************************************************")
            otra()
        }
    }
    if (mes % 2 == 0) {
        if (edad in 6..8){
            println("Te corresponden las tablas del 2 y 4")
            println("*********************************************************************************")
            println("Tabla de 2")
            println("***********")
            sec()
            println("***********")
            println("Tabla de 4")
            println("***********")
            cuar()
            println("*********************************************************************************")
            otra()
        }
        if (edad in 9..10){
            println("Te corresponden las tablas del 6, 8 y 10")
            println("*********************************************************************************")
            println("Tabla de 6")
            println("***********")
            se()
            println("***********")
            println("Tabla de 8")
            println("***********")
            oct()
            println("***********")
            println("Tabla de 10")
            println("***********")
            dec()
            println("*********************************************************************************")
            otra()
        }
    }
    if (edad in 11..12) {
        println("Te corresponden las tablas del 11, 12 y 13")
        println("*********************************************************************************")
        println("Tabla de 11")
        println("***********")
        und()
        println("***********")
        println("Tabla de 12")
        println("***********")
        duo()
        println("***********")
        println("Tabla de 13")
        println("***********")
        deter()
        println("*********************************************************************************")
        otra()
    }
    }


fun prim(){
    val uno = 1

    for (i in 1..10) {
        val product = uno * i
        println("$uno * $i = $product")
    }
}
fun sec(){
    val dos = 2

    for (i in 1..10) {
        val product = dos * i
        println("$dos * $i = $product")
    }
}
fun ter(){
    val tres = 3

    for (i in 1..10) {
        val product = tres * i
        println("$tres * $i = $product")
    }
}
fun cuar(){
    val cua = 4

    for (i in 1..10) {
        val product = cua * i
        println("$cua * $i = $product")
    }
}
fun quin(){
    val cin = 5

    for (i in 1..10) {
        val product = cin * i
        println("$cin * $i = $product")
    }
}
fun se(){
    val sei = 6

    for (i in 1..10) {
        val product = sei * i
        println("$sei * $i = $product")
    }
}
fun sep(){
    val sie = 7

    for (i in 1..10) {
        val product = sie * i
        println("$sie * $i = $product")
    }
}
fun oct(){
    val och = 8

    for (i in 1..10) {
        val product = och * i
        println("$och * $i = $product")
    }
}
fun nov(){
    val nue = 9

    for (i in 1..10) {
        val product = nue * i
        println("$nue * $i = $product")
    }
}
fun dec(){
    val die = 10

    for (i in 1..10) {
        val product = die * i
        println("$die * $i = $product")
    }
}
fun und(){
    val on = 11

    for (i in 1..10) {
        val product = on * i
        println("$on * $i = $product")
    }
}
fun duo(){
    val doc = 12

    for (i in 1..10) {
        val product = doc * i
        println("$doc * $i = $product")
    }
}
fun deter(){
    val trec = 13

    for (i in 1..10) {
        val product = trec * i
        println("$trec * $i = $product")
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