class InitTest(name: String, tall: Double){
    val firstProperty = "First property : $tall".also(::println)

    init {
        println("first initializer block that prints $tall")
    }

    val secondProperty = "Second property : $name".also(::println)

    init {
        println("second initializer block prints ${name.length}")
    }
}

class Constructors{
    init {
        println("init blocks")
    }
    constructor(i: Int){
        println("constructor $i")
    }
}

fun main() {
    InitTest("Ichwan",23.4)
    Constructors(12)
}