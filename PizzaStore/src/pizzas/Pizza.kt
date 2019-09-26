package pizzas

import pizzas.factories.ingredients.cheeses.Cheese
import pizzas.factories.ingredients.clams.Clams
import pizzas.factories.ingredients.doughes.Dough
import pizzas.factories.ingredients.pepperonies.Pepperoni
import pizzas.factories.ingredients.sauces.Sauce
import pizzas.factories.ingredients.veggies.Veggies

abstract class Pizza {
    lateinit var name: String
    lateinit var dough: Dough
    lateinit var sauce: Sauce
    lateinit var veggies: Array<Veggies>
    lateinit var cheese: Cheese
    lateinit var pepperoni: Pepperoni
    lateinit var clams: Clams

    abstract fun prepare()

    fun bake() {
        println("baking...")
    }

    fun cut() {
        println("cutting...")
    }

    fun box() {
        println("Boxed")
    }
}