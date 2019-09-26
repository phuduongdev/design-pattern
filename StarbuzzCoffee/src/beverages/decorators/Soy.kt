package beverages.decorators

import beverages.Beverage
import beverages.BeverageSize

class Soy : CondimentDecorator {
    override var description: String
    var beverage: Beverage

    constructor(beverage: Beverage) {
        this.beverage = beverage
        description = beverage.description + ", Soy"
    }

    override fun cost(): Double {
        if (beverage.size == BeverageSize.TALL) {
            return .10 + beverage.cost()
        } else if (beverage.size == BeverageSize.VENTI) {
            return .20 + beverage.cost()
        }
        return .15 + beverage.cost()
    }
}