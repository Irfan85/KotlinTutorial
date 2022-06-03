// Abstract classes are open
abstract class Person(var firstName: String, var lastName: String)

interface Printable {
    fun printInfo()

    // Interfaces can also have concrete methods
    fun foo() {
        println("Foo!")
    }
}
class Student(fistName: String, lastName: String, var age: Int): Person(fistName, lastName), Printable {
    override fun printInfo() {
        println("Name: $firstName $lastName, Age: $age")
    }
}

fun main(args: Array<String>) {
    val student1 = Student("Akkas","Ali", 20)

    student1.printInfo()
    student1.foo()
}