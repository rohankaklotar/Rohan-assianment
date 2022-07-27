package Assignment_Topic_Decision_Making_and_Loop

fun main() {
    val n1 = -74.5
    val n2 = 3.9
    val n3 = 45.5

    if (n1 >= n2 && n1 >= n3)
        println("$n1 is the largest number.")
    else if (n2 >= n1 && n2 >= n3)
        println("$n2 is the largest number.")
    else
        println("$n3 is the largest number.")
}