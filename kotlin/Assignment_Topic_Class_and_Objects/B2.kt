package Assignment_Topic_Class_and_Objects

data class data1 (var name:String,var age:Int ) {
}
fun getdata1():data1{
    return  data1("Rohan kaklotar ",18)
}
fun main() {

    var (name, age) = getdata1()
    println("name is $name")
    println("name is $age")
}