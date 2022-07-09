fun foo(){
    listOf(1,2,3,4,5).forEach {
        if (it == 3) return@forEach
        println(it)
    }
    println("done with explicit label")
}

fun main() {
    foo()
    for(i in 1..20){
        if(i == 4) break
        print("$i ")
    }
}

/*notes:
* tanpa label '@' loop hanya berhenti sampai statement if
* dengan label '@' loop terus berlanjut*/