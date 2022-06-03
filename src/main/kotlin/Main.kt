data class User(var firstName: String, var lastName: String, var email: String)

fun main(args: Array<String>) {
    val user1 = User("Akkas", "Ali", "akkasali@gmail.com")

    // While destucturing, if a variable is not needed, an underscore ('-') can be placed in the
    // place of that variable to skip it
    val (a, _, c) = user1

    println(a)
    println(c)
}