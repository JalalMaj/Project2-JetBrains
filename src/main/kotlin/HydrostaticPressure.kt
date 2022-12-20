import java.util.*

const val GRAVITY_CONSTANT = 9.8

fun main(args: Array<String>) {
//    val liquidDensity = readln().toDouble()
//    val heightColumn = readln().toDouble()
//    val liquidPressure = liquidDensity * heightColumn * GRAVITY_CONSTANT
//    println(liquidPressure)

    val numbersListLine= arrayListOf<String>()
    val scanner = Scanner(System.`in`)
    while (scanner.hasNext()) {
        val input = scanner.nextLine()
        if (input == "/exit") break
        numbersListLine.add(input)
    }

    val greatestNumber = numbersListLine.groupBy { it.length }.map {it
    }.sortedBy { it.key }.last().value
    val greatestNumber1 = numbersListLine.maxBy { it.length }
    println(greatestNumber)
    println(greatestNumber1)
    val greatestNumberOccurrences = greatestNumber.size
    val percentage = greatestNumberOccurrences.toDouble() /  numbersListLine.size.toDouble() *100
    println("Total numbers: ${numbersListLine.size}.\n" +
            "The greatest number: ${greatestNumber[0]} ($greatestNumberOccurrences time(s), " +
            "$percentage%).")
}