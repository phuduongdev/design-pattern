package beverages

class Decaf : Beverage {
    override var description: String = "Decaf"

    constructor()

    override fun cost(): Double {
        return 1.05
    }
}