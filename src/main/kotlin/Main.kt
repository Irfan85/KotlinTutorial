open class Shape(open val width: Int, open val height: Int)

open class ColourfulShape(width: Int, height: Int, val color: String): Shape(width, height)

class ShapeBox<T : Shape>(vararg val shapes: T)

// 'out' and 'in' can be too restrictive. By using a generic function, we can avoid using 'out' keyword
// for type variable in generic class definition
// Methods can also be of generic type as well like java
fun <T: Shape> printShapeBox(shapeBox: ShapeBox<T>){
    for(shape in shapeBox.shapes){
        println(shape)
    }
}

// External Generic Function
// The Star projection operator (*) targets ShapeBox classes of all types for extension
// The below function is just for demonstration. It logically doesn't make much sense
// In Kotlin, functions are also objects. Inlining a function will actually place the logic of the function at
// the place where the function is called. This reduces some object creation overhead. Inlines are best
// suited for simple and frequently used functions
inline fun <reified T: Shape> ShapeBox<*>.countShapes(shapeBox: ShapeBox<T>): Int {
    var shapeCount = 0
    for(shape in shapes){
        // We don't be able to use the is operator and some other functions as generics are proessed at compile
        // time. In order to make generics available at runtime, we've to make generic type 'reified' and also
        // have to make the function inline
        if (shape !is T){
            println("The shapebox has incompatible shapes")
        }

        shapeCount++
    }

    return shapeCount
}

fun main(args: Array<String>) {
    val colourfulShape1 = ColourfulShape(500, 500, "Red")
    val colourfulShape2 = ColourfulShape(500, 500, "Blue")
    val colourfulShape3 = ColourfulShape(640, 480, "Green")

    val myShapeBox = ShapeBox(colourfulShape1, colourfulShape2, colourfulShape3)

    // We could also write printShapeBox<ColourfulShape>(myShapeBox). However, it's not required because of
    // Kotlin's automatic type inference
    printShapeBox(myShapeBox)

    // Yes it's wired but doing just for example
    println(myShapeBox.countShapes(myShapeBox))

}