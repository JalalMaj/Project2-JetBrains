import sorting.buildTimesPart
import sorting.process
import java.util.*
import kotlin.system.exitProcess

enum class DataType(val value : String) {
    // Introduce the possible values for parameter value in class object
    LONG ("long"),
    LINE ("line"),
    WORD ("word");

    // Make a method to return the first value
    companion object {
        fun findByValue(value : String) : DataType? {
            return values().first() { it.value == value }
        }
    }
}


const val DATA_TYPE_OPTION = "-dataType"

//Compute maximum times of occurances of the input and the percentage of occurrences regardless the type
fun buildTimesPar(input : List<String> , result : Any) : String {
    val numberOfOccurrences = input.count() { it == result }
    val percentageOfOccurrences = numberOfOccurrences * 100 / input.size
    return "($numberOfOccurrences time(s), $percentageOfOccurrences%)."
}

//Remove white spaces from the input string method
fun itemsByWhitespaces(input: List<String>) = input
    .joinToString (" ") // remove white spaces
    .trim() // trim leading and tailing white spaces
    .replace(Regex("\\s+") , " ")
    .split(" ")

//Process the input and output the result
fun process (dataType: DataType , input: List<String>) {
    if (input.isEmpty()) {
        println("Nothing to process")
        exitProcess(1)
    }
    // loop through Data Type
    when (dataType) {
        DataType.LONG -> {
            val numbers = itemsByWhitespaces(input)
                .map { it.toLong() }
            val maximumNumber = numbers.maxOrNull()!!
            println("Total numbers: ${numbers.size}.")
            println("The greatest number: $maximumNumber ${buildTimesPart(numbers, maximumNumber)}")
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
    // java SortingTool -dataType long => get index of data type which is 2
    val dataTypeIndex = args.indexOf(DATA_TYPE_OPTION) // get index of dataType
    // Initiate dataType to null value
    var dataType : DataType? = null

    //condition of the index value to get the option word,line or long
    if (dataTypeIndex != -1) {
        dataType = DataType.findByValue(args[dataTypeIndex+1])
    }
    if (dataType == null) {
        dataType = DataType.WORD
    }
    // Input the values in different line for the objective of the problem
    val scanner = Scanner(System.`in`)
    val input = mutableListOf<String>()
    while (scanner.hasNextLine()) {
        input.add(scanner.nextLine())
    }
    // Process the input to get the solution
    process(dataType, input)
}