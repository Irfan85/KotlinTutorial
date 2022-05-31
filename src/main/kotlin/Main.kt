fun main(args: Array<String>) {
    val akkas = Player("Akkas Ali")
    println(akkas)
    akkas.showWeaponInfo()

    val kuddus = Player("Abdul Kuddus", 5, 10)
    val newWeapon : Weapon = Weapon("Axe", 12)
    kuddus.weapon = newWeapon
    println(kuddus)
    kuddus.showWeaponInfo()

    println("**********")

    val redPotion = Loot("Red Potion", LootType.POTION, 7.50)
    val chestArmour = Loot("+3 Chest Armour", LootType.ARMOUR, 80.0)

    akkas.inventory.add(redPotion)
    akkas.inventory.add(chestArmour)
    akkas.showInventory()

}