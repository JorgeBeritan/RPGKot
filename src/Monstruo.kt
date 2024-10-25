class Monstruo {
    private var name: String = "Slime"
    private var life: Float = 50f
    private var damage: Float = 5f

    fun getName(): String {
        return this.name
    }

    fun setName(name: String){
        this.name = name
    }

    fun getLife(): Float {
        return this.life
    }

    fun setLife(life : Float){
        this.life = life
    }

    fun getDamage(): Float{
        return this.damage
    }

    fun setDamage(damage: Float){
        this.damage = damage
    }

    fun atacar(player: Player){
        println("${getName()} ataca a ${player.getName()} con un ataque de ${getDamage()}")
        player.recibirDamage(getDamage())
    }

    fun recibirDamage(damage: Float){
        this.life -= damage
        if (life <= 0){
            println("${getName()} ha sido derrotado")
        } else {
            println("${getName()} tiene ${getLife()}")
        }
    }

    fun renacer_monstruo(){
        this.life =  50f
    }

}