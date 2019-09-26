package pizzas.factories.ingredients

import pizzas.factories.ingredients.cheeses.Cheese
import pizzas.factories.ingredients.cheeses.ReggianoCheese
import pizzas.factories.ingredients.clams.Clams
import pizzas.factories.ingredients.clams.FreshClams
import pizzas.factories.ingredients.doughes.Dough
import pizzas.factories.ingredients.doughes.ThinCrustDough
import pizzas.factories.ingredients.pepperonies.Pepperoni
import pizzas.factories.ingredients.pepperonies.SlicedPepperoni
import pizzas.factories.ingredients.sauces.MarinaraSauce
import pizzas.factories.ingredients.sauces.Sauce
import pizzas.factories.ingredients.veggies.*

class NYPizzaIngredientFactory : PizzaIngredientFactory {
    override fun createDough(): Dough {
        return ThinCrustDough()
    }

    override fun createSauce(): Sauce {
        return MarinaraSauce()
    }

    override fun createCheese(): Cheese {
        return ReggianoCheese()
    }

    override fun createVeggies(): Array<Veggies> {
        return arrayOf(Garlic(), Onion(), Mushroom(), RedPepper())
    }

    override fun createPepperoni(): Pepperoni {
        return SlicedPepperoni()
    }

    override fun createClam(): Clams {
        return FreshClams()
    }
}