fun main(args: Array<String>) {
    // Pairs can be created using the 'to' keyword
    val a = "Red" to "Blue"
    println(a)
    println("First: ${a.first}, Second: ${a.second}")

    // Kotlin also provides triples
    val b = Triple("Red", "Blue", "Green")
    println(b)

    var numbers = listOf<Int>(1, 2, 3, 4, 5, 6, 7)

    // The partition function will divide the map based on the provided boolean predicate
    var dividedLists = numbers.partition { it > 4 }
    println(dividedLists.first)
    println(dividedLists.second)

    // Lists also have a filter function to fetch certain items
    var filteredList = numbers.filter { it > 4 }
    println(filteredList)

}