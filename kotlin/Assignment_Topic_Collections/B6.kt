package Assignment_Topic_Collections

import java.util.*
import kotlin.collections.HashSet

fun main() {

    val array = arrayOf("a", "b", "c")
    val set = HashSet(Arrays.asList(*array))

    println("Set: $set")
}