package ducks

import behavior.flies.FlyBehavior
import behavior.quacks.QuackBehavior

abstract class Duck() {
    var flyBehavior: FlyBehavior? = null
    var quackBehavior: QuackBehavior? = null

    fun performFly() {
        flyBehavior?.fly()
    }

    fun performQuack() {
        quackBehavior?.quack()
    }

    fun swim() {
        println("All ducks float, even decoys")
    }


    abstract fun display()
}