open class Hewan(val nama: String, umur: Int, panjang: Float){
    val jenis = "Anggora"
    val tumbuh = (umur + panjang) * 2
}

class Kucing(val name: String,val age:Int, val longs: Float):Hewan(name,age,longs){}

fun main() {
    val hewan = Hewan("Manis",12,3.5F)
    val binatang = Kucing("Unyil",10,5.9F)
    println("kucing jenis ${hewan.jenis} bernama ${hewan.nama} tumbuh ${hewan.tumbuh} cm")
    println(binatang.name)
}

/*Notes for inheritance:
* Mendeklarasikan 'val' pada attribut ketika dipanggil, jika tidak maka 'val' tidak digunakan
* class parent yg butuh open class
* class child wajib mendeklarasikan ulang attribut dari class parent
* dan ketika di extends pun class parent harus mendeklarasikan attribut dari class child*/