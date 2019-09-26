package pizzas.factories.ingredients

import pizzas.factories.ingredients.cheeses.Cheese
import pizzas.factories.ingredients.clams.Clams
import pizzas.factories.ingredients.doughes.Dough
import pizzas.factories.ingredients.pepperonies.Pepperoni
import pizzas.factories.ingredients.sauces.Sauce
import pizzas.factories.ingredients.veggies.Veggies

interface PizzaIngredientFactory {
    fun createDough(): Dough
    fun createSauce(): Sauce
    fun createCheese(): Cheese
    fun createVeggies(): Array<Veggies>
    fun createPepperoni(): Pepperoni
    fun createClam(): Clams
}