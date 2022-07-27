package Assignment_Topic_Functions

fun main() {
    fun getPattern()="""\d{2}.\d{2}.\d{4}"""
    println("06.10.2002".matches(getPattern().toRegex()))

    val month="(JAN||FEB||MAR||APR||MAY||JUN||JUL||AUG||SEP||OCT||NOV||DEC)"
    fun getPattern1()="""\d{2}\ ${month}\ \d{4}"""
    println("06 OCT 2002".matches(getPattern1().toRegex()))
}