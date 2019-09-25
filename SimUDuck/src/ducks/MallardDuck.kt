package ducks

import behavior.flies.FlyWithWings
import behavior.quacks.Quack

class MallardDuck : Duck {
    constructor() {
        quackBehavior = Quack()
        flyBehavior = FlyWithWings()
    }

    override fun display() {
        println("I'm a real Mallard duck")
    }
}