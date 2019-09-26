import beverages.Beverage
import beverages.BeverageSize
import beverages.DarkRoast
import beverages.Espresso
import beverages.decorators.Mocha
import beverages.decorators.Soy
import beverages.decorators.Whip

fun main(args: Array<String>) {
    val espresso: Beverage = Espresso()
    println("${espresso.description} $${espresso.cost()}")

    var darkRoast: Beverage = DarkRoast()
    darkRoast.size = BeverageSize.TALL
    darkRoast = Mocha(Mocha(darkRoast))
    darkRoast = Whip(darkRoast)
    darkRoast = Soy(darkRoast)
    println("${darkRoast.description} \$${darkRoast.cost()}")
}