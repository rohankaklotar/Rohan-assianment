package Assignment_Topic_Decision_Making_and_Loop

fun main() {
    val ch = 'i'

    val vowelConsonant = if (!(ch != 'a' && ch != 'e' && ch != 'i' && ch != 'o' && ch != 'u')) {
        "vowel"
    } else {
        "consonant"
    }

    println("$ch is $vowelConsonant")
}