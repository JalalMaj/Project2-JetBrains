fun main(args: Array<String>) {
    var array = Array<Char>(4) { readln().first()}
        .map { it }.toCharArray().forEach {
            println(it -1)
        }

}