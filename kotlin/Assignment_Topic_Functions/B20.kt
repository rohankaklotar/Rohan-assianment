package Assignment_Topic_Functions

import kotlin.properties.Delegates


fun main()
{
    var max: Int by Delegates.notNull()
    //max=10
    println(max)
}