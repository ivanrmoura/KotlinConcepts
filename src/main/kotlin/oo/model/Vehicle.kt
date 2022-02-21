package oo.model

import oo.`interface`.Roamable

class Vehicle : Roamable {


    override fun roam() {
        println("The vehicle is roaming")
    }
}
