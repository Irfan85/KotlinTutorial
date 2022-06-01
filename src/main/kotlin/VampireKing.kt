class VampireKing(name : String) : Vampire(name){
    // This block gets executed when an object is created
    init {
        hitPoints = 150
    }

    // Overall damage will be divided by 4 as vampire class will divide it by 2 again
    override fun takeDamage(damage: Int) {
        super.takeDamage(damage / 2)
    }
}