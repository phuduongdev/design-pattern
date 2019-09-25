package ducks

import behavior.flies.FlyNoWay
import behavior.quacks.Quack

class ModelDuck : Duck {
    constructor() {
        flyBehavior = FlyNoWay()
        quackBehavior = Quack()
    }

    override fun display() {
        println("I'm a model duck")
    }

}