import kotlin.random.Random

fun main() {
    var dinero = 0
    var otra = true
    var repetir = true
    while (otra) {
    println("Bienvenido a la ruleta. Elige un numero del 0 al 35")
    var numerojugador = readln().toInt()
    println("Elige un color \n 1.rojo 2.negro")
    var colorjugador = readln().toInt()

    var contador = 0
    while (contador < 6) {
        contador++
        var numeroRuleta = Random.nextInt(0, 36)
        var colorRuleta = Random.nextInt(1,3)
        if (numeroRuleta == numerojugador && colorRuleta == colorjugador) {
            dinero += 100
        } else if (numeroRuleta == numerojugador && colorRuleta != colorjugador) {
            dinero += 75
        } else if (numeroRuleta != numerojugador && colorRuleta == colorjugador) {
            dinero += 2
        } else {
            dinero -= 2
        }
        println("El resultado de la tirada es $numeroRuleta con el color $colorRuleta \n" +
                "tu saldo actual es $dinero")
    }

    if (contador>5) {
        repetir = false
    }

    println("¿Quieres jugar otra vez?")
    var continuar = readln().toString()
    if (continuar != "si") {
        otra = false

        }
    }
}