package factories.franchise.stores

import pizzas.*
import pizzas.factories.ingredients.ChicagoPizzaIngredientFactory
import stores.PizzaStore

class ChicagoStylePizzaStore() : PizzaStore() {
    override fun createPizza(pizzaType: String): Pizza? {
        var pizza: Pizza? = null
        var ingredientFactory = ChicagoPizzaIngredientFactory()
        when (pizzaType) {
            "cheese" -> {
                pizza = CheesePizza(ingredientFactory)
                pizza.name = "Chicago Style Cheese Pizza"
            }
            "clam" -> {
                pizza = ClamPizza(ingredientFactory)
                pizza.name = "Chicago Style Clam Pizza"
            }
            "pepperoni" -> {
                pizza = PepperoniPizza(ingredientFactory)
                pizza.name = "Chicago Style Pepperoni Pizza"
            }
            "veggie" -> {
                pizza = VeggiePizza(ingredientFactory)
                pizza.name = "Chicago Style Veggie Pizza"
            }
            else -> null
        }
        return pizza
    }

}