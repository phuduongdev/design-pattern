package beverages

abstract class Beverage {
    var size: BeverageSize = BeverageSize.GRANDE

    abstract var description: String

    abstract fun cost(): Double
}