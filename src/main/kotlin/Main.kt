fun main(args: Array<String>) {
    val akkas = Player("Akkas Ali")
    println(akkas)
    akkas.showWeaponInfo()

    val kuddus = Player("Abdul Kuddus", 5, 10)
    val newWeapon : Weapon = Weapon("Axe", 12)
    kuddus.weapon = newWeapon
    println(kuddus)
    kuddus.showWeaponInfo()

}