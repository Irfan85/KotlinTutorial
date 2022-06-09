fun sum(vararg integers: Int): Int{
    var result = 0;

    for(integer in integers){
    	    result += integer;
    }

    return result
}

fun main(args: Array<String>) {
        // Apart from passing a variable number of parameters
	// in a vararg taking function, we can also pass an entire
	// array to it. However we have to use the speading operator
	// (*) to send elements individually

	// The array has to be of a specific type
	val numbers = intArrayOf(1, 2, 3, 4, 5, 6, 7)

	var sumResult = sum(*numbers)

	println(sumResult)

	// If we have a list, we have to convert that to an array before
	// using it as vararg
	val numberList = listOf(10, 11, 12, 13, 14, 15)

	sumResult = sum(*numberList.toIntArray())

	println(sumResult)
}