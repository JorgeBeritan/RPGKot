fun batalla(player: Player, monstruo: Monstruo){
    println("Te has encontrado con un enemigo: ${monstruo.getName()}")

    while(monstruo.getLife() >= 0 && player.getLife() >= 0){
        println("Elige un opcion: ")
        println("1 - Atacar")
        println("2 - Curar")
        println("0 - Huir")
        val decision: Int = readln().toInt()
        if(decision == 1){
            player.atacar(monstruo)
            if (monstruo.getLife() <= 0) break
            monstruo.atacar(player)
            if (player.getLife() <= 0)break
        } else if (decision == 0){
            println("Has huido de la batalla")
            break
        } else if(decision == 2){
            player.curar()
        }
    }
    println("La batalla ha culminado")
    player.addExp(monstruo.getDropExp())
    println("Has obtenido: ${monstruo.getDropExp()} puntos de exp. Ahora tienes: ${player.getExp()}")
    monstruo.renacer_monstruo()
}

fun descansar(player: Player){
    println("Has ido a descansar")
    player.curarTotal()
    player.recuperarCuras()
}