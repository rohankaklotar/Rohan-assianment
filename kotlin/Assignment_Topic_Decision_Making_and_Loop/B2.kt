@file:Suppress("IMPLICIT_CAST_TO_ANY")

package Assignment_Topic_Decision_Making_and_Loop

fun main(){
    println( """
       enter the choice:
        1) EN
        2) FR
        3) It
      """)
    print("Enter choice : ")
    val result = when(readLine()!!.toInt()){
        1-> println(" hello")
        2-> println("salut")
        3-> println("Ciao")
        else ->("invalid input")
    }
    println("result :${result}")
}