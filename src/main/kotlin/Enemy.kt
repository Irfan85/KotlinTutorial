// In Kotlin, classes are 'final' by default which means they can't be extended. In order to make a class
// extendable, we have to mark it as 'open'
open class Enemy(val name : String, var hitPoints : Int, var lives : Int) {
    private val hitPointResetValue = hitPoints

    open fun takeDamage(damage : Int) {
        val remainingHitPoints = hitPoints - damage

        if(remainingHitPoints > 0) {
            hitPoints = remainingHitPoints
            println("$name took $damage damage points and has $hitPoints hit points left.")
        } else {
            lives -= 1

            if (lives > 0) {
                hitPoints = hitPointResetValue
                println("$name has lost a life and has $lives life/lives left.")
            } else {
                println("No lives left. $name has been terminated.")
            }
        }
    }

    override fun toString(): String {
        return "Enemy(name='$name', hitPoints=$hitPoints, lives=$lives, hitPointResetValue=$hitPointResetValue)"
    }

}