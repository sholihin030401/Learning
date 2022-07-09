interface MyInterface{
    //properties ini wajib dideklarasikan disetiap class turunannya
    val animal: String

    //di interface tidak bisa langsung mendeklarasikan nilai
    val ageAnimal: Int
    get() = 12

    fun foo(nameAnim: String){
        println("hallo $nameAnim, my name is ${this.animal} and age ${this.ageAnimal}")
    }
}

//interface extend interface lain
interface Inter2:MyInterface

open class Manusia

//class yg extend nya ke interface gk bisa dibuat object (like as abstract)
//class turunan dari interface bisa meng-extend interface lebih dari 1, namun untuk class hanya boleh meng-extend 1 class
class Child(override val animal: String = "Manis") :Manusia(), MyInterface, Inter2

class Child2: MyInterface{
    override val animal: String
        get() = "Kucing"
}

fun main() {
    val child = Child()
    child.foo("Unyil")

    val child2 = Child2()
    println(child2.animal)
}