fun main() {
    val player: Player =  Player("Jorge", 100f, 10f)
    val slime: Monstruo = Monstruo()

    while(true) {

        println("Que deseas hacer: ")
        println("1 - Batalla")
        println("2 - Descansar")
        println("3 - Ver estadisticas")
        println("0 - Cerrar")
        var decision = readln().toInt()
        if (decision == 1) {
            batalla(player, slime)
        } else if (decision == 0){
            println("Gracias por jugar")
            break
        } else if (decision == 2){
            descansar(player)
        } else if (decision == 3){
            player.verEstadisticas()
        }
    }
}