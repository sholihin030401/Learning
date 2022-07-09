open class extensions
class shape:extensions()

fun extensions.getName() = "Rectangle"
fun shape.getRadius() = 3.14

fun printClassName(r: extensions){
    println(r.getName())
}

fun printRadius(s: shape){
    println(s.getRadius() * 7)
}

class Student(val nama: String, val umur: Int)

fun Student?.hallo(nama: String){
    if (this != null){
        println("hallo $nama, nama saya ${this.nama} dan umur ${this.umur}")
    } else {
        println("nulled")
    }
}

fun main(){

    val student = Student("Ichwan",20)
    student.hallo("null")

    //example for extensions statically

    printClassName(extensions())
    printRadius(shape())

    //example for extensions fun to overload member fun
    class Example{
        fun printFunType() {println("class method")}
    }

    fun Example.printFunType(i:Int) {println("Extensions function #$i")}

    Example().printFunType()
    Example().printFunType(1)
}