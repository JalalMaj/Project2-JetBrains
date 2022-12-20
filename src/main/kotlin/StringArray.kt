fun main(args: Array<String>) {
    val southernCross = arrayOf("Acrux", "Gacrux", "Imai", "Mimosa")
    println(southernCross.joinToString())   //  Acrux, Gacrux, Imai, Mimosa
   
    val stars = arrayOf("Ginan", "Mu Crucis")

    val newArray = southernCross + stars
    println(newArray.joinToString())    //  Acrux, Gacrux, Imai, Mimosa, Ginan, Mu Crucis

    val firstArray = arrayOf("result", "is", "true")
    val secondArray = arrayOf("result", "is", "true")
    val thirdArray = arrayOf("result")


    //You cannot use the operators == and != to compare arrays because they simply do not compare their contents.
    // With arrays, use the function contentEquals() instead:
    println(firstArray.contentEquals(secondArray))  //  true
    println(firstArray.contentEquals(thirdArray))   //  false

    /**Changing the array contents*/

    //o matter if you're using val or var, you can edit the values of the existing elements through their index:
    southernCross[1] = "star"
    stars[1] = "star"

    println(southernCross[1]) // star
    println(stars[1]) // star


    //However, there is a great difference between val and var when it comes to reassignment.
    // When you have a var array, you can change it by adding new elements to it.
    var southernCross1 = emptyArray<String>()
    southernCross1 += "Acrux"
    southernCross1 += "Gacrux"
    southernCross1 += "Imai"
    println(southernCross.joinToString())   // Acrux, Gacrux, Imai

    //Even if your array is not empty to begin with, you can still add elements in the same way:
    southernCross1 += "KKK" // not possible for val
}