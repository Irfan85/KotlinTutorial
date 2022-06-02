class User(var firstName: String, var lastName: String, var email: String) {}

// Extension functions allow us to define class functions outside the class
// body. We can sometime avoid creating subclasses and use these instead.
fun User.getFullName(): String {
    return "$firstName $lastName"
}

fun main(args: Array<String>) {
    val user1 = User("Akkas", "Ali", "akkasali@gmail.com")
    println(user1.getFullName())
}