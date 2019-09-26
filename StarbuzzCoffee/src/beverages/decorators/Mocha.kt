package beverages.decorators

import beverages.Beverage

class Mocha : CondimentDecorator {
    override var description: String
    var beverage: Beverage

    constructor(beverage: Beverage) {
        this.beverage = beverage
        description = beverage.description + ", Mocha"
    }

    override fun cost(): Double {
        return .20 + beverage.cost()
    }
}