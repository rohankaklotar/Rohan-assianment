package Assignment_Topic_Decision_Making_and_Loop

fun main() {
    var low = 20
    val high = 50

    while (low < high) {
        var flag = false

        for (i in 2..low / 2) {
            // condition for nonprime number
            if (low % i == 0) {
                flag = true
                break
            }
        }

        if (!flag)
            print("$low ")

        ++low
    }
}