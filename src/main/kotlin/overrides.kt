open class Shape{
    open val radius: Int = 12
    open fun draw(){
        println("kita coba gambar lingkaran 8 cm")
    }

    fun fill():Double{ return 3.14*8 }
}

interface Polygon{
    fun draw(){
        println("testing dari interface polygon")
    }
}

class Circle:Shape(){
    override fun draw() {
        println("lingkaran")
    }
}

class Rectangle:Shape(){ override val radius: Int = 8 }

class Triangle:Shape(),Polygon{
    override fun draw() {
        super<Shape>.draw()
        super<Polygon>.draw()
    }
}

fun main() {
    val lingkaran = Circle()
    lingkaran.draw()
    println("Hasilnya : ${lingkaran.fill()}")

    val kotak = Rectangle()
    println(kotak.radius)

    val segitiga = Triangle()
    segitiga.draw()
}

/*override notes:
* harus mendeklarasikan override jika kelas yg isinya function itu di extend
* final digunakan untuk mere-override function dikelas turunannya*/
