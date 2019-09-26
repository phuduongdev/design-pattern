package beverages

class HouseBlend : Beverage {
    override var description: String = "House Blend"

    constructor()

    override fun cost(): Double {
        return .89
    }
}