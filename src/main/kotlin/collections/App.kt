package collections


fun main() {
    val shopping: List<String>

    shopping = listOf("eggs", "tea", "milk")

    val mShopping = mutableListOf<String>("tea", "eggs")

    mShopping.set(0, "coffe")

}
