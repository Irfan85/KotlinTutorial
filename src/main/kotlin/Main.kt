fun main(args: Array<String>) {
    // HashMaps are like lists of pairs
    val myHashMap = hashMapOf<String, Int>("Red" to 1, "Blue" to 2, "Green" to 3)

    println(myHashMap["Blue"])
    println(myHashMap.getOrDefault("Purple", "Yellow is not available"))
}