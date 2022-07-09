fun parseToInt(s: String): Int {
    return s.toInt()
}

fun main(){
    //throw Exception("Hallo error!")

    val a = "z"

    try {
        parseToInt(a)
        println("hasilnya $a")
    } catch (e: NumberFormatException){
        //throw Exception("Error cak")
    } finally {
        println("selesai")
    }

}