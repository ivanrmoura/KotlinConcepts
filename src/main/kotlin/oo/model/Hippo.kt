package oo.model

open class Hippo : Animal() {

    override val food = "grass"
    override val habitat = "water"
    override val image = "hippo.jpg"

    override fun makeNoise() {
        println("Grunt!, Grunt!")
    }

    override fun eat() {
        println("The hippo is eating ${food}")
    }




}
