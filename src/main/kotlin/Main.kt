// In Kotlin, private variables can't be accessed even after creating objects. Here, the concept of getter
// and setters work in a different way. If we want to make a property accessible outside the class, we make it
// public and define getters and setters for that property as "get()" as "set()" functions. These functions will
// be called automatically when we will assign or retrieve the value of that property
class User(private var firstName: String, private var lastName: String, private var email: String) {
    // Initialization is not necessary if we only have a setter method
    var designation = "Undefined"
        get() {
            // 'field' refers to the property
            return "Designation: $field"
        }
        set(value) {
            // In Kotlin '==' actually does the same job as java equals() function. for checking
            // referential equality, use '===' operator instead
            if(value.lowercase() != "undefined") {
                field = value
            }
        }
}

fun main(args: Array<String>) {
    val user1 = User("Akkas", "Ali", "akkasali@gmail.com")
    // This calls the setter method
    user1.designation = "Manager"
    // This calls the getter method
    println(user1.designation)
}