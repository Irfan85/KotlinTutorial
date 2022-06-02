class Student (var name: String, var id: String) {
    // init block is called while creating an object. All the necessary codes that we want to
    // run in the primary constructor goes inside the init block
    init {
        println("Init has been called")
    }

    // All the static variables and static methods goes inside the "companion object" block. Everyting
    // inside the block belongs to the class itself
    companion object {
        val department = "CSE"
    }
}

fun main(args: Array<String>) {
    println(Student.department)
    
    val student1 = Student("Akkas Ali", "12345")
}