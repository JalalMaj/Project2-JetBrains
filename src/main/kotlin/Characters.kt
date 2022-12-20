fun main(args: Array<String>) {
    val at = '\u0040' // it represents '@'
    println(at) // @

    val a = 'a'
    println(a.code)   // 97
    val num = 97
    println(num.toChar()) // a

  //read char
    val char: Char = readln().first()

    val ch1 = 'b'
    val ch2 = ch1 + 1 // 'c'
    val ch3 = ch2 - 2 // 'a'

    var character = 'A'

    character += 10
    println(character)   // 'K'
    println(++character) // 'L'
    println(++character) // 'M'
    println(--character) // 'L'

    print('\t') // makes a tab
    print('a')  // prints 'a'
    print('\n') // goes to a new line
    print('c')  // prints 'c'


    println('a' < 'c')  // true
    println('x' >= 'z') // false

    println('D' == 'D') // true
    println('Q' != 'q') // true because capital and small letters are not the same

    println('A' < 'a')  // true because capital Latin letters are placed before small ones


    val character1 = readln().first()
    val isDigit = character1 >= '\u0030' && character1 <= '\u0039'

    println(isDigit)


    val one = '1'

    val isDigit1 = one.isDigit()   // true
    val isLetter = one.isLetter() // false

    val capital = 'A'
    val small = 'e'

    val isLetterOrDigit = capital.isLetterOrDigit() // true

    val isUpperCase = capital.isUpperCase() // true
    val isLowerCase = capital.isLowerCase() // false

    val capitalEString = small.uppercase() // "E"
    val capitalE = small.uppercaseChar()   // 'E'


    val a1 = readln().first().toLowerCase()
    val b = readln().first().toLowerCase()
}