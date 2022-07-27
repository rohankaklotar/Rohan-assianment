package Assignment_Topic_Functions


fun main() {
    var run = intArrayOf(1, 1, 1, 2, 2)

    var count1 = 0
    var count2 = 0
    for (i in run) {
        if (run[i] == i)
        {
            count1++

        } else {
            count2++
        }

    }
    println("${run[0].toInt()} Total Run of $count1")
    println("${run[3].toInt()} Total Run of $count2")
}

