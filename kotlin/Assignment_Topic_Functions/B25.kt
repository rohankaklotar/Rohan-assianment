package Assignment_Topic_Functions

fun ispalindromestring(inputstr:String) :Boolean
{
    val str=StringBuilder(inputstr)
    val reverse_str=str.reverse().toString()
    return inputstr.equals(reverse_str,ignoreCase = true)
}
fun main()
{
    if(ispalindromestring("wow"))
    {
        println("Given string is palindrome")
    }else{
        println("Given string is not palindrome")
    }

}