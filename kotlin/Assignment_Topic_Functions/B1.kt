package Assignment_Topic_Functions

fun maxvalue()
{
    var x = intArrayOf(12,52,41,23)
    var max = x[0]
    for (i in x)
    {
        if (max<i)
        {
            max=i
        }
    }
    println("max number is : $max")
}
fun main()
{
    maxvalue()
}