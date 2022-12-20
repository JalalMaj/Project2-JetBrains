fun main(args: Array<String>) {
    val numbers = readLine()!!.split(' ').map { it.toInt() }.toIntArray()
    // Do not touch lines above
    // Write only exchange actions here.
    val temp =  numbers[0]
    numbers[0] = numbers.last()
    numbers[numbers.lastIndex] = temp

    // or
    numbers[0] = numbers[numbers.lastIndex].also { numbers[numbers.lastIndex] = numbers[0] }

    //or

    numbers.apply {
        this[lastIndex] = first().also { this[0] = last() }
    }
    // Do not touch lines below
    println(numbers.joinToString(separator = " "))
}