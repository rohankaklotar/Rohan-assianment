package Assignment_Topic_Decision_Making_and_Loop

fun main() {
    var line = "Hi, Am Rohan My Testing 123 Hello"
    var vowels = 0
    var consonants = 0
    var digits = 0
    var spaces = 0

    line = line.toLowerCase()
    for (i in 0..line.length - 1) {
        val ch = line[i]
        if (ch == 'a' || ch == 'e' || ch == 'i'
            || ch == 'o' || ch == 'u') {
            ++vowels
        } else if (ch in 'a'..'z') {
            ++consonants
        } else if (ch in '0'..'9') {
            ++digits
        } else if (ch == ' ') {
            ++spaces
        }
    }

    println("Vowels: $vowels")
    println("Consonants: $consonants")
    println("Digits: $digits")
    println("White spaces: $spaces")
}