package pizzas.factories.ingredients

import pizzas.factories.ingredients.cheeses.Cheese
import pizzas.factories.ingredients.cheeses.MozzarellaCheese
import pizzas.factories.ingredients.clams.Clams
import pizzas.factories.ingredients.clams.FrozenClams
import pizzas.factories.ingredients.doughes.Dough
import pizzas.factories.ingredients.doughes.ThickCrusDough
import pizzas.factories.ingredients.pepperonies.Pepperoni
import pizzas.factories.ingredients.pepperonies.SlicedPepperoni
import pizzas.factories.ingredients.sauces.PlumTomatoSauce
import pizzas.factories.ingredients.sauces.Sauce
import pizzas.factories.ingredients.veggies.BlackOlives
import pizzas.factories.ingredients.veggies.EggPlant
import pizzas.factories.ingredients.veggies.Spinach
import pizzas.factories.ingredients.veggies.Veggies

class ChicagoPizzaIngredientFactory : PizzaIngredientFactory {
    override fun createDough(): Dough {
        return ThickCrusDough()
    }

    override fun createSauce(): Sauce {
        return PlumTomatoSauce()
    }

    override fun createCheese(): Cheese {
        return MozzarellaCheese()
    }

    override fun createVeggies(): Array<Veggies> {
        return arrayOf(Spinach(), EggPlant(), BlackOlives())
    }

    override fun createPepperoni(): Pepperoni {
        return SlicedPepperoni()
    }

    override fun createClam(): Clams {
        return FrozenClams()
    }
}