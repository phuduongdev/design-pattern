package beverages

class DarkRoast : Beverage {
    override var description: String = "Dark Roast"

    constructor()

    override fun cost(): Double {
        return .99
    }
}