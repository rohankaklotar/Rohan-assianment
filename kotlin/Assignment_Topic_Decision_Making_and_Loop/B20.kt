package Assignment_Topic_Decision_Making_and_Loop

fun main() {
    val num = 29
    var flag = false
    for (i in 2..num / 2) {
        if (num % i == 0) {
            flag = true
            break
        }
    }

    if (!flag)
        println("$num is a prime number.")
    else
        println("$num is not a prime number.")
}