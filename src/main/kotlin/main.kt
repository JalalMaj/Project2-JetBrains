/**
 * fun is a keyword that shows that main() is a function. Just a regular function;
main is the function name. It is important to know that we cannot change it: if we change it, for example,
to Main(), the program will compile but not start;
and finally, the body of the function, as you well know, will be placed in curly braces.
In fact, there may still be input parameters — args — in the main() syntax; it’s a non-binding
part of the declaration of the main(), and we'll talk more about it later.

So, anything you can do with a usual function, instead of renaming, can be done with main().

Its main feature is that its existence is mandatory: without it, the program will not start.
But the main() can also be called on purpose. For example, it can be called by itself:
 */

fun main(args: Array<String>) {
    if (args.size <3) {
        println("first")
        println("second")
        println("third")
    } else {
        args.forEach {
            println(it)
        }
    }

    //a * 10.5 + b * 4.4 + (c + d) / 2.2

    val (a, b, c, d) = Array(4) { readln().toDouble() }
    val equation = a * 10.5 + b * 4.4 + (c + d) / 2.2
    println(equation)
}
//var decrease = 3
//
//fun main() {
//    if(decrease == 0)
//        return // will stop the program
//    decrease = decrease - 1
//    println(decrease)
//    main()
//}