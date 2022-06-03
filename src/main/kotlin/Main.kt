interface Colourful {
    var color: String
}

// Delegates are singleton objects that contain some implementation of an interface that may be
// frequently used
object blueColored: Colourful {
    override var color = "Blue"
}

// The 'by' keyword attaches a delegate to an interface. Here, we are delegating 'blueColored' implementation
// by default. Also, we're giving the user to pass a custom implementation of Colourful interface if they want
class Shape(var width: Double, var height: Double, colorType: Colourful = blueColored): Colourful by colorType

fun main(args: Array<String>) {
    val shape1 = Shape(500.0, 500.0)

    println(shape1.color)
}