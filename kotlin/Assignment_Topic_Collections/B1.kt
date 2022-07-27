package Assignment_Topic_Collections

fun main() {

    fun main() {
        var gujrat= hashMapOf<Int,String>(
            1 to "surat",
            2 to "jamnagar",
            3 to "rajkot",
            4 to "baroda"
        )
        var jambukasmir= hashMapOf<Int,String>(
            1 to "kasmir",
            2 to "manali",
            3 to "jambu"
        )
        var uttarpardesh= hashMapOf<Int,String>(
            1 to "dehli",
            2 to "agra"
        )

        var stat= hashMapOf<Int,String>(
            1 to "gujrat",
            2 to "jambu-kasmir",
            3 to "uttar-pardesh"
        )
        for ( i in stat.values){

            if(i=="punjab"){
                println("$i---${gujrat.values}")
            }
            else if(i=="jambu-kasmir"){
                println("$i---${jambukasmir.values}")
            }
            else{
                println("$i---${uttarpardesh.values}")
            }
        }
}
}