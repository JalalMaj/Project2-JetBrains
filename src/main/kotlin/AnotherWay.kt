package sorting

import java.util.*
import kotlin.system.exitProcess

enum class DataType(val value: String) {
    LONG("long"),
    LINE("line"),
    WORD("word");

    companion object {
        fun findByValue(value: String): DataType? {
            return values().first { it.value == value }
        }
    }
}

const val DATA_TYPE_OPTION = "-dataType"

fun buildTimesPart(input: List<Any>, result: Any): String {
    val timesAppeared = input.count { it == result }
    val percentage = timesAppeared * 100 / input.size
    return "($timesAppeared time(s), $percentage%)."
}

fun itemsByWhitespaces(input: List<String>) = input
    .joinToString(" ")
    .trim()
    .replace(Regex("\\s+"), " ")
    .split(" ")

fun process(dataType: DataType, input: List<String>) {
    if (input.isEmpty()) {
        println("Nothing to process!")
        exitProcess(1)
    }
    when (dataType) {
        DataType.LONG -> {
            val numbers = itemsByWhitespaces(input)
                .map { it.toLong() }
            val maxNumber = numbers.maxOrNull()!!
            println("Total numbers: ${numbers.size}.")
            println("The greatest number: $maxNumber ${buildTimesPart(numbers, maxNumber)}")
        }
        DataType.LINE -> {
            val longestLine = input.maxByOrNull { it.length }!!
            println("Total lines: ${input.size}.")
            println("The longest line:")
            println(longestLine)
            println(buildTimesPart(input, longestLine))
        }
        DataType.WORD -> {
            val words = itemsByWhitespaces(input)
            val longestWord = words.maxByOrNull { it.length }!!
            println("Total words: ${words.size}.")
            println("The longest word: $longestWord ${buildTimesPart(words, longestWord)}")
        }
    }
}

fun main(args: Array<String>) {
    val dataTypeIndex = args.indexOf(DATA_TYPE_OPTION)
    var dataType: DataType? = null
    if (dataTypeIndex != -1) {
        dataType = DataType.findByValue(args[dataTypeIndex + 1])
    }
    if (dataType == null) {
        dataType = DataType.WORD
    }
    val scanner = Scanner(System.`in`)
    val input = mutableListOf<String>()
    while (scanner.hasNextLine()) {
        input.add(scanner.nextLine())
    }
    process(dataType, input)
}
