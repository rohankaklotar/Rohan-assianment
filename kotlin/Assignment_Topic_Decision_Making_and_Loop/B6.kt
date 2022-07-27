package Assignment_Topic_Decision_Making_and_Loop

fun main() {
    val year = 2021
    var leap = false

    if (year % 4 == 0) {
        if (year % 100 == 0) {
            leap = year % 400 == 0
        } else
            leap = true
    } else
        leap = false

    println(if (leap) "$year is a leap year." else "$year is not a leap year.")
}