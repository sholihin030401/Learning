//property yg ada di primary constructor (name) otomatis dibuatkan fun hashCode, toString, copy dll
data class Person(val name: String){
    //value harus dideklarasikan
    var age: Int = 1
}

fun main() {
    val person = Person("Ujang")
    person.age = 2

    val person2 = person.copy(name = "Abdul")

    println("si $person berumur ${person.age} tahun")
    println("si $person2 berumur ${person.age} tahun")
}