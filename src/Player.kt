class Player(private var name: String, private var life: Float, private var damage: Float, private var curas: Int = 3) {

    fun getName(): String{
        return this.name
    }

    fun setName(name: String){
        this.name = name
    }

    fun getLife(): Float{
        return this.life
    }

    fun setLife(life: Float){
        this.life = life
    }

    fun getDamage(): Float{
        return this.damage
    }

    fun setDamage(damage: Float){
        this.damage = damage
    }

    fun atacar(enemigo: Monstruo){
        println("${getName()} ataca a ${enemigo.getName()} con un ataque de ${getDamage()}")
        enemigo.recibirDamage(damage)
    }

    fun recibirDamage(damage: Float){
        this.life -= damage
        if( life <= 0){
            println("${getName()} ha sido derrotado")
        } else {
            println("${getName()} tiene ${getLife()}")
        }
    }

    fun curar(){
        if (this.curas >= 0){
            this.life += 10
            this.curas -= 1
            println("Has recuperado 10 de vida")
            println("Te quedan ${this.curas}")
        } else {
            println("No te quedan curas")
        }
    }

    fun recuperarCuras(){
        this.curas = 3
        println("Tus curas se han restablecido tienes ${this.curas}")
    }

    fun verEstadisticas(){
        println("${getName()} tus estadisticas son las siguientes: ")
        println("Vida - ${getLife()}")
        println("Damage - ${getDamage()}")
        println("Curas - ${this.curas}")
    }
}