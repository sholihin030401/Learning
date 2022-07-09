fun getStringLength(objects: Any): Int?{

    if(objects !is String || objects.length <= 0) return null

    return objects.length
}

fun main() {
    fun printLength(obj: Any){
        println("mendapatkan nilai panjang dari $obj = ${getStringLength(obj) ?: "Error: The objects is not a string"}")
    }

    printLength("Accedentesiast")
    printLength("")
    printLength(1100)
    printLength(listOf(Any()))
}