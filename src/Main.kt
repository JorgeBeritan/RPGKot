fun main() {
    val player: Player =  Player("Jorge", 100f, 10f)
    var slime: Monstruo = Monstruo()

    while(true) {

        println("Que deseas hacer: ")
        println("1 - Batalla")
        println("2 - Descansar")
        println("0 - Cerrar")
        var decision = readln().toInt()
        if (decision == 1) {
            batalla(player, slime)
        } else if (decision == 2){
            println("Gracias por jugar")
            break
        }
    }
}