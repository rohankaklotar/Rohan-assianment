package Assignment_Topic_Functions


fun Start():String
{
    print("enter the name :")
    var name = readLine()!!
    println("name : $name")
    return name
}

fun main()
{
    Start()
}