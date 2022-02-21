package dataclass

data class Recipe(val title: String,
                  val ingredient: String,
                  val isVegetarian: Boolean = false,
                  val difficulty: String = "Easy") {


    fun findRecipes(title: String = "",
                    ingredient: String = "",
                    isVegetarian: Boolean = false,
                    difficulty: String = "") : Array<Recipe>{

        return arrayOf(Recipe(title, ingredient, isVegetarian, difficulty))
    }



}
