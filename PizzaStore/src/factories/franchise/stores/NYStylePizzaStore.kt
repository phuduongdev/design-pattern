package stores

import pizzas.*
import pizzas.factories.ingredients.NYPizzaIngredientFactory

class NYStylePizzaStore : PizzaStore() {
    override fun createPizza(pizzaType: String): Pizza? {
        var pizza: Pizza? = null
        var ingredientFactory = NYPizzaIngredientFactory()
        when (pizzaType) {
            "cheese" -> {
                pizza = CheesePizza(ingredientFactory)
                pizza.name = "New York Style Cheese Pizza"
            }
            "clam" -> {
                pizza = ClamPizza(ingredientFactory)
                pizza.name = "New York Style Clam Pizza"
            }
            "pepperoni" -> {
                pizza = PepperoniPizza(ingredientFactory)
                pizza.name = "New York Style Pepperoni Pizza"
            }
            "veggie" -> {
                pizza = VeggiePizza(ingredientFactory)
                pizza.name = "New York Style Veggie Pizza"
            }
            else -> null
        }
        return pizza
    }
}