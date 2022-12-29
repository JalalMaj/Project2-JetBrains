import java.util.*
const val SORT_INTEGERS = "-sortIntegers"
fun main(args: Array<String>) {
    //args[0] = readLine()!!.toString()
    if (SORT_INTEGERS in args) {
        SortingTool.readInputsLong()
        SortingTool.printResultLongSorted()
    } else {
        if ("word" in args){
            SortingTool.readInputsWord()
            SortingTool.printResultWord()
        } else if ("long" in args) {
            SortingTool.readInputsLong()
            SortingTool.printResultLong()
        } else {
            SortingTool.readInputsLine()
            SortingTool.printResultLine()
        }
    }

}

object SortingTool {

    private val numbersList = mutableListOf<Int>()
    private val numbersListLine = mutableListOf<String>()
    private val numbersListWord = mutableListOf<String>()


    fun readInputsLong() {
        val scanner = Scanner(System.`in`)
        while (scanner.hasNext()) {
            val input = scanner.nextLine()

            if (input == "/exit") break
            if (input.isBlank()) continue
            parseLong(input)
        }
    }

    fun readInputsWord() {
        val scanner = Scanner(System.`in`)
        while (scanner.hasNext()) {
            val input = scanner.nextLine()

            if (input == "/exit") break
            if (input.isBlank()) continue
            parseWord(input)
        }
    }

    fun readInputsLine() {
        val scanner = Scanner(System.`in`)
        while (scanner.hasNext()) {
            val input = scanner.nextLine()
            if (input == "/exit") break
            numbersListLine.add(input)
        }
    }
    fun printResultLine() {
        val greatestNumber = numbersListLine.groupBy { it.length }.map {it
        }.sortedBy { it.key }.last().value.first()
        val greatestNumberOccurrences = numbersListLine.count { it == greatestNumber }
        val percentage = greatestNumberOccurrences.toDouble() / numbersListLine.size.toDouble() * 100
        println("Total numbers: ${numbersListLine.size}.\n" +
                "The greatest number: $greatestNumber ($greatestNumberOccurrences time(s), " +
                "$percentage%).")
    }


    fun printResultLong() {
        val greatestNumber = numbersList.maxOrNull() ?: return
        val greatestNumberOccurrences = numbersList.count { it == greatestNumber }
        val percentage = greatestNumberOccurrences.toDouble() / numbersList.size.toDouble() * 100
        println("Total numbers: ${numbersList.size}.\n" +
                "The greatest number: $greatestNumber ($greatestNumberOccurrences time(s), " +
                "$percentage%).")
    }

    fun printResultLongSorted() {
        val sortedList = numbersList.sorted()
        println("Total numbers: ${numbersList.size}.\n" +
                "Sorted data: ${sortedList.joinToString (" ")}")
    }
    fun printResultWord() {
        val greatestNumber = numbersListWord.groupBy { it.length }.map {it
        }.sortedBy { it.key }.last().value
        val greatestNumberOccurrences = greatestNumber.size
        val percentage = greatestNumberOccurrences.toDouble() /  numbersListWord.size.toDouble() *100
        println("Total words: ${numbersListWord.size}.\n" +
                "The longest word: ${greatestNumber[0]} ($greatestNumberOccurrences time(s), " +
                "$percentage%).")
    }

    private fun parseLong(str: String) {
        val list = str.trim().split("\\s+".toRegex()).map {
            it.toIntOrNull() ?: throw IllegalArgumentException("$it is not a number")
        }
        numbersList.addAll(list)
    }

    private fun parseWord(str: String) {
        val list = str.trim().split("\\s+".toRegex()).map {
            it.toString() ?: throw IllegalArgumentException("$it is not a number")
        }
        numbersListWord.addAll(list)
    }
}