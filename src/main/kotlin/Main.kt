fun main(args: Array<String>) {
    // We can provide types
    var name : String = "Akkas Ali"
    println(name)

    // Providing type is not mandatory
    var anything = 12
    println(anything)

    // However, providing type is required for deferred assignment
    var anotherName : String
    anotherName = "Abdul Kuddus"
    print(anotherName)

    // Constant
    val a : Char = 'a'
    println(a)

    // String interpolation
    var b : Double = 50.0
    println("The value of b is $b and half of b is ${b/2}")
    var c : Double = 100.0
    println("The amount is $$c")
    println("We can also print \$a")
}