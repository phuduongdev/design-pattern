package beverages.decorators

import beverages.Beverage

class Whip : CondimentDecorator {
    override var description: String

    var beverage: Beverage

    constructor(beverage: Beverage) {
        this.beverage = beverage
        description = beverage.description + ", Whip"
    }

    override fun cost(): Double {
        return .10 + beverage.cost()
    }
}