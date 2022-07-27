package Assignment_Topic_Fundamental

fun main (){
    var sentence = "T    hi     s is     b    e t t          er . "
    println("Original sentence: $sentence")

    sentence = sentence.replace("\\s".toRegex(), "")
    println("After replacement: $sentence")

}