// 'object's are singleton. Only one instance is allowed. Objects don't have constructors
object Screen {
    val width = 1920
    val height = 1080

    fun getResolution(): String {
        return "$width x $height"
    }
}

fun main(args: Array<String>) {
    // Note that we don't call any constructors while instantiating objects because there isn't any
    val screen = Screen;

    println(screen.getResolution())
}