package Assignment_Topic_Class_and_Objects

data class person(var name:String,var age:Int)

fun main() {
    var data=person("rohan", 20)
    println("name : ${data.name}")
    println("age :${data.age}")
}