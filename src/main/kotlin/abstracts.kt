
abstract class Animal(val name: String, val age:Int){
    //tidak bisa mendeklarasikan value/body jika properties/function abstract
    abstract val berat:Double
    abstract fun eat()
}

class Hewans(nama: String, umur: Int): Animal(nama,umur){
    //wajib dideklarasikan
    override val berat: Double = 12.3

    override fun eat() {
        println("ayo makan")
    }
}

fun main() {
    val cat = Hewans("Manis",12)
    println("ini ${cat.name} umurnya ${cat.age}, berat ${cat.berat}")
}

/*Note for abstract class:
 kelas abstract tidak bisa didefinisikan sebagai object*/