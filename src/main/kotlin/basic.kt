import kotlin.random.Random

fun printMessageWithPrefix(message: String, prefix: String = "info"){
    println("this is $message wiht $prefix")
}

fun sum(a: Int, b: Int){
    println("Hitung $a ditambah $b = ${a+b}")
}

//variabel global
val PI = 3.14  //val konstanta
var x = 0  //var bisa diubah

fun decrementX(){x -= 1}

fun maxValue(a:Int, b:Int) = if(a<b) a else b

fun main(){

//    decrementX()
//    println("nilai $PI dan $x")
//
//    println("Hello kotlin")
//
//    printMessageWithPrefix("Hello","Prefixs")
//    println(sum(3,5))
//
//    println(maxValue(11,12))

    val number = Random.nextInt(10)
    println(number.coerceIn(3..9))

    val ranges = CharRange('a','z')
    println(ranges.random())

    for(i in 4 downTo 1) println(i)

//    val nilai: Any = "Ichwan"
//
//    when(nilai){
//        "Ichwan" -> println("Eh ini antum")
//        1 -> println("Iya")
//        else -> println("Salah")
//    }

    val numbers = mutableListOf("satu","dua","tiga")
    numbers.also { println("hapus satu cak yakni $it") }.removeAt(2)
    println(numbers)

}