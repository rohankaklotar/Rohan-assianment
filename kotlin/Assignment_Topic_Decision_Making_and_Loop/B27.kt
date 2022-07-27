package Assignment_Topic_Decision_Making_and_Loop

fun main() {
    val words = arrayOf("Kotlin","PHP", "C", "Dart", "Java")

    for (i in 0..2) {
        for (j in i + 1..3) {
            if (words[i].compareTo(words[j]) > 0) {

                // swap words[i] with words[j[
                val temp = words[i]
                words[i] = words[j]
                words[j] = temp
            }
        }
    }

    println("In lexicographical order:")
    for (i in 0..3) {
        println(words[i])
    }
}