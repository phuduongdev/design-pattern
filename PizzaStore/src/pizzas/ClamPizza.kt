package pizzas

import pizzas.factories.ingredients.PizzaIngredientFactory

class ClamPizza(var ingredientFactory: PizzaIngredientFactory) : Pizza() {
    override fun prepare() {
        println("Preparing $name")
        dough = ingredientFactory.createDough()
        sauce = ingredientFactory.createSauce()
        cheese = ingredientFactory.createCheese()
        clams = ingredientFactory.createClam()
    }
}