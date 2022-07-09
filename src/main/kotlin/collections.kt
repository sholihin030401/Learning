fun main(){
    val mobil = listOf("Avanza","Xenia","Honda")

    println(mobil.filter { it.startsWith("A") })
    for (value in mobil){
        println(value)
    }
}