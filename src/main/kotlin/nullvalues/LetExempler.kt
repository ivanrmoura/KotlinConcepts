package nullvalues

import oo.model.Wolf

fun main() {
    val array = arrayOf("Hi", "Hello", null)

    for (item in array){
        item?.let {
            println(it)
        }
    }

    getAlphaWolf()?.let {
        println(it.food)
        it.eat() }

    val t = getAlphaWolf() ?: -1

//    val i = getAlphaWolf()!!.food
}

fun getAlphaWolf() : Wolf? {
    return Wolf()
}
