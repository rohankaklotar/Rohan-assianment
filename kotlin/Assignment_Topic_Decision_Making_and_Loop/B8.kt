package Assignment_Topic_Decision_Making_and_Loop

fun main() {
    val c = '*'

    if (c in 'a'..'z' || c in 'A'..'Z')
        println("$c is an alphabet.")
    else
        println("$c is not an alphabet.")
}