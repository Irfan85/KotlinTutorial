open class Shape(open val width: Int, open val height: Int) {
    companion object {
        // Constants are determined at compile time whereas vals are determined at runtime.
        // So, we can't assign a const to the return value of a function.
        // cons can only exist in static or global space
        const val VERSION=1.0
    }
}

open class ColourfulShape(width: Int, height: Int, color: String): Shape(width, height)

// It is possible to add extension properties apart from extension variables
// Both extension methods/properties only have access to the public components of the class
val ColourfulShape.borderWidth: Int
    get() = 5

// Experiment with extension methods
fun Shape.printInfo() = println("I'm a shape")

fun ColourfulShape.printInfo() = println("I'm a colourful shape")

fun main(args: Array<String>) {
    // Let's test the extension functions
    val shape1 = Shape(500, 500)
    // Calls the printInfo() of the Shape class
    shape1.printInfo()

    val colourfulShape1 = ColourfulShape(500, 500, "Blue")
    // Calls the printInfo() of the ColourfulShape class
    colourfulShape1.printInfo()

    // Now let's try it with polymorphism
    val shape2: Shape = ColourfulShape(640, 480, "Green")
    // This will call the printInto() of Shape class as the reference is of type Shape
    shape2.printInfo()
}