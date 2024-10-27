import java.sql.Array

class Player(private var name: String,
             private var life: Float = 100f,
             private var damage: Float = 10f,
             private var curas: Int = 3,
             private var exp: Int = 0,
             private var lvl: Int = 1) {

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

    fun getExp():Int{
        return this.exp
    }

    fun setExp(exp: Int){
        this.exp = exp
    }

    fun getLvl(): Int {
        return this.lvl
    }

    fun setLvl(lvl: Int){
        this.lvl = lvl
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
        if (this.curas > 0){
            this.life += 20
            this.curas -= 1
            println("Has recuperado 20 de vida")
            println("Te quedan ${this.curas}")
        } else {
            println("No te quedan curas tienes")
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
        println("Nivel - ${getLvl()}")
        println("Exp - ${getExp()} necesitas: ${expNextLvl()}")
        println("Curas - ${this.curas}")
    }

    private fun expNextLvl(): Int{
        return (getLvl() * 100) + ((getLvl() - 1) * 50)
    }

    fun addExp(cantidad_exp: Int){
        exp += cantidad_exp
        checkLvlUp()
    }

    private fun checkLvlUp(){
        while(getExp() >= expNextLvl()){
            this.exp -= expNextLvl()
            lvl += 1
            println("¡Subiste de a nivel: ${getLvl()}. Exp restante: ${getExp()}")
        }
    }

    fun curarTotal(){
        this.life = 100f
    }
}

