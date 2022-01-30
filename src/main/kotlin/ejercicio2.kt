fun main(args: Array<String>) {
    rellenarAleatorios()
    imprimirPares()
    ordenarArray()
    borrarImpares()

}


var miArray = arrayOf(0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)

fun rellenarAleatorios(): Array<Int> {
    println("Mi Array: ")
    var numeros = 0..99
    for (i in miArray.indices) {
        miArray[i] = numeros.random()
        println("${miArray[i]}")
    }
    return miArray
}


fun imprimirPares() {
    println("Numeros pares del array :")
    var a = miArray.forEach {
        if (it != null) {
            if (it % 2 == 0) println("$it")
        }
    }

}

fun ordenarArray() {
    println("Primer y último número del array ordenados numericamente")
    miArray.sort()
    println("${miArray.first()}")
    println("${miArray.last()}")
    println("Resultado de la suma de todos los elementos del array")
    println("${miArray.sum().toString()}")

}

//Los impares los igualo a 0 ya que en un array no podemos borrar elementos
fun borrarImpares() {
    println("Array sin los impares: ")
    for (i in miArray.indices) {
        if (miArray[i] % 2 != 0) miArray[i] = 0
        else println(" ${miArray[i]}")

    }
}
