fun main(args: Array<String>) {

    val numbers = intArrayOf(1, 2, 3, 4, 5) // It stores 5 elements of the Int type
    println(numbers.joinToString()) // 1, 2, 3, 4, 5

    val characters = charArrayOf('K', 't', 'l') // It stores 3 elements of the Char type
    println(characters.joinToString()) // K, t, l

    val doubles = doubleArrayOf(1.25, 0.17, 0.4) // It stores 3 elements of the Double type
    println(doubles.joinToString()) // 1.15, 0.17, 0.4

    val numbers1 = IntArray(5) // an array of 5 integer numbers
    println(numbers1.joinToString())

    val doubles1 = DoubleArray(7) // an array of 7 doubles
    println(doubles1.joinToString())

    /**
     * To read an array of a certain size from the console, we first need to create an array of some type with a known size.
     * Inside the parentheses, we should place readln(), with the help of which we can read input from the console.
     * The readln() function returns a string, so don’t forget to convert the input string into the type of the created array.
     */

    val numbers2 = IntArray(5) { readln().toInt() } // on each line single numbers from 1 to 5
    println(numbers2.joinToString()) // 1, 2, 3, 4, 5

    /** If you want to read an array in a single line, use the following approach. You can read the array with the readln() function.
     *  You’ll get a string, which you should split.
     */
    // here we have an input string "1 2 3 4 5"

    val numbers3 = readln().split(" ").map { it.toInt() }.toTypedArray()
    println(numbers.joinToString()) // 1, 2, 3, 4, 5


    /**
     * There is also a way that allows you to ignore line breaks and extra spaces in the input string.
     * You can do this with the help of regular expressions, which are often used in text searching and editing.
     */
    val regex = "\\s+".toRegex()
    val str = "1 2\t\t3  4\t5  6"
    val nums = str.split(regex).map { it.toInt() }.toTypedArray()
    println(nums.joinToString()) // 1, 2, 3, 4, 5, 6
}