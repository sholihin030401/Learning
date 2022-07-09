fun parseInt(str: String): Int? {
    return str.toIntOrNull()
}

fun printNumber(arg1: String, arg2: String){
    val x = parseInt(arg1)
    val y = parseInt(arg2)

//    if (x != null && y != null){
//        //x dan y otomatis dilempar ke tipe non-nullable/tidak error
//        //setelah null check
//        println(x*y)
//    } else {
//        println("$arg1 atau $arg2 bukanlah integer")
//    }
    if (x == null){
        println("format $arg1 bukan number")
        return
    }
    if (y == null){
        println("format $arg2 bukan number")
        return
    }

    println(x*y)
}

fun main() {

    var a: String? = null
    //println(a!!.length) //menyebabkan exception/force close
    val l = a?.length ?: -1
    println(l)

    printNumber("1","2")
    printNumber("a","2")

    val listDenganNull = listOf("Kotlin",null)
    for (items in listDenganNull){
        items?.let { println(it) }
        //println(items)
    }

    val nullableList = listOf(1,2,null,3)
    println(nullableList.filterNotNull())
}
//page 327