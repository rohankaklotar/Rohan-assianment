package Assignment_Topic_Decision_Making_and_Loop

fun main() {
    var count = 0
    var num = 1234567

    while (num != 0) {
        num /= 10
        ++count
    }

    println("Number of digits: $count")
}