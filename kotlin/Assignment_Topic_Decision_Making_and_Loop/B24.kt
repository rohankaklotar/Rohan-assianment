package Assignment_Topic_Decision_Making_and_Loop

fun main() {
    val number = 60

    print("Factors of $number are: ")
    for (i in 1..number) {
        if (number % i == 0) {
            print("$i ")
        }
    }
}