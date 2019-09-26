package beverages

class Espresso : Beverage {
    override var description: String = "Espresso"

    constructor()

    override fun cost(): Double {
        return 1.99
    }
}