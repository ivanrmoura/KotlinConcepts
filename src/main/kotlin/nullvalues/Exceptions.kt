package nullvalues

import java.lang.NumberFormatException

fun myFunction(str: String){
    try {
        val x = str.toInt()
        println(x)
    }catch (e: NumberFormatException){
        println("Brummer")
        println(e.printStackTrace())
    }finally {
        println("clear code")
    }


    println("MyFunction has ended")
}

fun main() {
    myFunction("5")
}
