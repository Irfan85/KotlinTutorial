fun main() {
    val bigString = """
	This is a big string.
	It has many lines. Let's talk about fruits.
	There are many fruits. For instance, apple, banana,
	jackfruit etc.
    """
	println(bigString)

	// In regex, W means non word characters for instance,
	// punctuations. + means one or of the type. Here, the
	// split function will use one or a sequence of non word
	// characters ",", ",," etc. as delimiter
	// Note: We need two backslashes to ignore escape characters.
	// However, if we use triple quoted strings, we don't have to
	// use double backslash. We could've used """\W+"""
	val stringList = bigString.trim().split(Regex("\\W+"))
	
	println(stringList)

	// Fetches first 5 items from the list
	println(stringList.take(5))

	// We can also fetch using a range
	println(stringList.slice(6..10))

	// It is also possible to define steps while fetching
	println(stringList.slice(1..10 step 2))

	// This function will fetch last 5 items
	println(stringList.takeLast(5))

	// This function will return a sorted version of the list
	println(stringList.sorted())

	// This function will fetch only the unique values from the list
	println(stringList.distinct())
	
}
