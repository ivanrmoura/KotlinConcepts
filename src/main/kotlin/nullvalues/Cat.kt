package nullvalues

class Cat (var name: String? = null) {

    fun Meow(){
        println("Meow!")
    }

}

fun main() {
    var myCats = arrayOf(Cat("Misty"),
                            null,
                            Cat("Scocks"))

    for(cat in myCats){
        println("${cat?.name}")
        cat?.Meow()
    }


}
