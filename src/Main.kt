fun main() {
    val player: Player =  Player("Jorge", 100f, 10f)
    var slime: Monstruo = Monstruo()

    println("Que deseas hacer: ")
    println("1 - Batalla")
    var decision = readln().toInt()
    if (decision == 1){
        batalla(player, slime)
    }
}