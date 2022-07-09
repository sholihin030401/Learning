//Functional SAM (Single Abstract Method)
fun interface Prediksi{
    fun values(i: Int)
}

val isValue = Prediksi { it * 2 }

fun main() {
    println("jika nilainya 3 maka ${isValue.values(3)}")
}