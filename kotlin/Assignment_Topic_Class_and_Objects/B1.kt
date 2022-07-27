package Assignment_Topic_Class_and_Objects

    class data constructor(var name :String) {

        init {
            println(" name :  $name")

        }
        fun greet(){
            println(" good day Rohan !!")
        }

    }

    fun main() {
        var data=data("Rohan")
        data.greet()
    }
