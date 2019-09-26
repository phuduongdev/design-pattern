import stores.NYStylePizzaStore
import stores.PizzaStore

fun main(args: Array<String>) {
    val goToNYStylePizzaStore: PizzaStore = NYStylePizzaStore()
    goToNYStylePizzaStore.orderPizza(PizzaMenu.CHEESE.toString())
    goToNYStylePizzaStore.orderPizza(PizzaMenu.PEPPERONI.toString())
}