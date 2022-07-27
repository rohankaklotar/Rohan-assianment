package Assignment_Topic_Array

fun main() {
    val numArray = doubleArrayOf(13.4, 44.5, 50.0, 70.5, 102.5, 43.7, 5.7, -66.5)
    var largest = numArray[0]

    for (num in numArray) {
        if (largest < num)
            largest = num
    }

    println("Largest element = %.2f".format(largest))

}