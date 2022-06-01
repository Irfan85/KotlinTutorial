open class Vampire(name : String) : Enemy(name, 50, 3) {
    override fun takeDamage(damage: Int) {
        super.takeDamage(damage/2)
    }
}