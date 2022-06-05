// Single Abstract Methods are commonly seen in many interfaces of Java API where an interface only contains
// One method. Runnable, Callable are common examples of this which has a run() and call() method respectively

// In Kotlin, we can create an instance of an object that implements an interface using "object:" keyword
// Thus we can avoid creating concrete implementation if we have no plan to use that object elsewhere
fun main(args: Array<String>) {
    val tempObject1 = object: Runnable{
        override fun run() {
            println("Hello World from tempObject1!")
        }
    }

    JavaRun.runNow(tempObject1)

    // However, as Runnable is a has a Single Abstract Method (SAM), the entire code for run() can be written
    // as a lambda in Kotlin
    val tempObject2 = Runnable {
        println("Hello World from tempObject2!")
    }

    JavaRun.runNow(tempObject2)
    
}