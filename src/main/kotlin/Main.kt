// Data typed classes are used for holding some from of data like a model. These classes provide some
// ready-made implementations of certain functions like component, copy, toString etc.
data class User(var firstName: String, var lastName: String, var email: String)

class Animal(var name: String, var age: Int) {
    operator fun component1(): Any {
        return name
    }

    operator fun component2(): Any {
        return age
    }

}

fun main(args: Array<String>) {
    // Default lists are immutable in Kotlin. We have to explicitly make MutableList if we want to modify
    // it. List and arrays can also be created easily using built-in functions rather than
    // constructing them explicitly
    val users = mutableListOf<User>(
        User("Akkas", "Ali", "akkasali@gmail.com"),
        User("Abdul", "Kuddus", "abdulkuddus@gmail.com"),
        User("Motin", "Ali", "motinali@gmail.com")
    )

    // We can directly destructure each item right in the foreach loop. data typed classes can be
    // destructured directly
    for((firstName, lastName, email) in users) {
        println("**********")
        println("Name: $firstName $lastName")
        println("Email: $email")
        println("**********")
    }

    println("########################################")

    // This is an immutable list
    val animals = listOf<Animal>(
        Animal("Tom", 10),
        Animal("Jerry", 5),
        Animal("Jerry", 15)
    )

    // To destructure non 'data' types classes, we have to define component functions ourselves in
    // the class. Also, we can give any names to the parameters
    for((a, b) in animals) {
        println("**********")
        println("Animal name: $a")
        println("Animal age: $b")
        println("**********")
    }

    println("########################################")

    // Let's look at a difference between data and non-data class
    val user1 = User("Akkas", "Ali", "akkasali@gmail.com")
    user1.firstName = "Motin"
    // Data class already has an implementation of toString() function apart from some other functions
    println(user1)

    val animal1 = Animal("Tom", 10)
    // Regular classes don't have such implementations. So it prints the hashcode just like java
    // classes by default
    println(animal1)
}