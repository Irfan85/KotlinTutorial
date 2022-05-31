fun main(args: Array<String>) {
    val akkas = Player("Akkas Ali")

    val redPotion = Loot("Red Potion", LootType.POTION, 7.50)
    val chestArmour = Loot("+3 Chest Armour", LootType.ARMOUR, 80.0)

    akkas.getLoot(redPotion)
    akkas.getLoot(chestArmour)
    akkas.showInventory()

    if(akkas.dropItem(redPotion)) {
        println("${redPotion.name} has been dropped")
        akkas.showInventory()
    } else {
        println("${redPotion.name} is not present in the inventory")
    }

    akkas.getLoot(redPotion)
    akkas.showInventory()

    if(akkas.dropItem("Red Potion")) {
        akkas.showInventory()
    } else {
        println("${redPotion.name} is not present in the inventory")
    }
}