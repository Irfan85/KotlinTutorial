fun main(args: Array<String>) {
    val enemy1 = Enemy("Enemy 1", 10, 5)
    println(enemy1)
    enemy1.takeDamage(6)
    println(enemy1)

    println("**********")

    val troll1 = Troll("Troll1")
    println(troll1)
    troll1.takeDamage(10)
    println(troll1)

    println("**********")

    val vampire1 = Vampire("Vampire 1")
    println(vampire1)
    vampire1.takeDamage(10)
    println(vampire1)

    println("**********")

    val dracula = VampireKing("Dracula")
    println(dracula)
    dracula.takeDamage(50)
    println(dracula)
}