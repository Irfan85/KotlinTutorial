fun main(args: Array<String>) {
    // '!!' converts a nullable type to a non-nullable type. If readLine() returns a null value
    // a NullPointerException will be thrown instead of setting val age to null
    val age = readLine()!!.toInt()

    val message : String

    // ***** Method 1 *****
//    if(age < 18) {
//        message = "You're too young to vote"
//    } else if(age > 100) {
//        message = "Congratulations!"
//    } else {
//        message = "You're allowed to vote"
//    }

    // ***** Method 2 *****
//    message = if (age < 18) {
//        "You're too young to vote"
//    } else if (age > 100) {
//        "Congratulations!"
//    } else {
//        "You're allowed to vote"
//    }

    // ***** Method 3 *****
    message = when {
        (age < 18) -> "You're too young to vote"
        (age > 100) -> "Congratulations!"
        else -> "You're allowed to vote"
    }

    println(message)
}