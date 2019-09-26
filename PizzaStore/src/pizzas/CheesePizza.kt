package pizzas

import pizzas.factories.ingredients.PizzaIngredientFactory

class CheesePizza : Pizza {
    var ingredientFactory: PizzaIngredientFactory

    constructor(ingredientFactory: PizzaIngredientFactory) {
        this.ingredientFactory = ingredientFactory
    }

    override fun prepare() {
        println("Preparing $name")
        dough = ingredientFactory.createDough()
        sauce = ingredientFactory.createSauce()
        cheese = ingredientFactory.createCheese()
    }
}