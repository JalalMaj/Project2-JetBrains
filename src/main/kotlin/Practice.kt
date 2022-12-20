// write your function here

fun main(args: Array<String>) {
    val number1 = readLine()!!.toInt()
    val number2 = readLine()!!.toInt()
    val number3 = readLine()!!.toInt()
    val number4 = readLine()!!.toInt()

    println(isGreater(number1, number2, number3, number4))


    val kingCharlesTheEleventh = Human()
    val kingCarolusRex = Human()

    var king = kingCharlesTheEleventh
    king === kingCarolusRex

    val a = readln()
    val b = readln()

}

class Human {

}

fun isGreater(number1:Int , number2:Int , number3:Int , number4:Int) = ((number1+number2)>(number3+number4))


