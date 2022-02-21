package oo.model

class Wolf : Canine() {

    override val image = "wolf.jpg"

    override val food = "meat"

    override val habitat = "florest"

    override fun makeNoise() {
        println("Haoooooooooowl!")
    }

    override fun eat() {
        println("The wolf is eating $food")
    }



}
