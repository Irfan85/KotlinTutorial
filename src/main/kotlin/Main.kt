fun main(args: Array<String>) {
    println("Iterates from 0 to 10")

    for(i in 0..10){
        println("$i squared is ${i * i}")
    }

    println("Iterates from 0 to 9")

    for (i in 0 until 10) {
        println("$i squared is ${i * i}")
    }

    println("Iterates from 10 to 0")

    for (i in 10 downTo 0) {
        println("$i squared is ${i * i}")
    }

    println("Iterates from 10 to 0 with step of 2")

    for (i in 10 downTo 0 step 2) {
        println("$i squared is ${i * i}")
    }

}