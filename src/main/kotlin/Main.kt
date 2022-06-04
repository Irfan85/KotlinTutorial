open class Shape(open val width: Int, open val height: Int)

open class ColourfulShape(width: Int, height: Int, val color: String): Shape(width, height)

// 'in' keyword checks type safety for parameters that are only taken as input for any function
interface ShapePrinter<in T: Shape> {
    fun printShape(shape : T)
}

class MyShapePrinterImpl: ShapePrinter<ColourfulShape>{
    override fun printShape(shape: ColourfulShape) {
        println("Shape width: ${shape.width}")
        println("Shape height: ${shape.height}")
        println("Shape color: ${shape.color}")
    }
}


class ShapeBox<out T : Shape>(private vararg val shapes: T) {
    fun printShapes(printer: ShapePrinter<T>) {
        for (shape in shapes) {
            printer.printShape(shape)
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

    val myShapeBox = ShapeBox(colourfulShape1, colourfulShape2, colourfulShape3)

    val shapePrinter = MyShapePrinterImpl()
    myShapeBox.printShapes(shapePrinter)
}