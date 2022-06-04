open class Shape(open val width: Int, open val height: Int)

open class ColourfulShape(width: Int, height: Int, color: String): Shape(width, height)

// By default, the type of generic will be <T: Any?> if we don't explicitly provide any type. The code would
// look like this
// class ShapeBox<T>(vararg val shape: T)

// The vararg parameter will be treated as an array of type T

// The out type check is necessary if we want to check the type of variables that can be returned
class ShapeBox<out T : Shape>(private vararg val shapes: T) {
    fun printShapes() {
        for (shape in shapes){
            // This check function is provided by kotlin for assertion. If the boolean parameter is true, the
            // assertion is valid and exception won't be thrown
            check(!(shape.width == 0 || shape.height == 0)) {"ERROR: Invalid shape detected"}

            println("Found: $shape")
        }
    }
}

// Dummy function for demonstration. Doesn't actualy add anything
fun addItemTo(shapeBox: ShapeBox<Shape>){
    println("Added!")
}

fun main(args: Array<String>) {
    val colourfulShape1 = ColourfulShape(500, 500, "Red")
    val colourfulShape2 = ColourfulShape(500, 500, "Blue")
    val colourfulShape3 = ColourfulShape(640, 480, "Green")

    // We could also write ShapeBox<ColourfulShape> on the right  side. But it's not necessary in kotlin
    // because of automatic type inference
    val myShapeBox = ShapeBox(colourfulShape1, colourfulShape2, colourfulShape3)

    myShapeBox.printShapes()

    println("#########################")

    // If we didn't add the out keyword in the generic declaration, this would throw error
    addItemTo(myShapeBox)
}