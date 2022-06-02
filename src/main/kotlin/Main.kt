// Lambdas are like anonymous functions. We can declare lambdas like this
val quadruple = { number: Int -> number * 4}

// We can also specify input and output type like this. If we do so, we don't hae to specify input
// type in the function body
val triplePower: (Int) -> Int = {number -> number * number * number}

// A higher order function is such a function that takes a lambda as one of its parameters
fun printStuff(foo: (Int) -> Int, input: Int, times: Int) {
    // "repeat" is one of the many loops available in Kotlin
    repeat(times) {
        println(foo(input))
    }
}
fun main(args: Array<String>) {
    println("Quadruple of 2 is: ${quadruple(2)}")
    println("Triple power of 4 is: ${triplePower(4)}")

    println("#########################")

    printStuff(quadruple, 5, 4)

    println("#########################")

    printStuff(triplePower, 5, 6)

}