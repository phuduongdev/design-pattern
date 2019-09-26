package stores

import pizzas.*
import pizzas.factories.SimplePizzaFactory

abstract class PizzaStore {
    fun orderPizza(pizzaType: String): Pizza? {
        var pizza = createPizza(pizzaType)
        pizza?.prepare()
        pizza?.bake()
        pizza?.cut()
        pizza?.box()
        return pizza
    }

    //factory method
    abstract fun createPizza(pizzaType: String): Pizza?
}