import ducks.MallardDuck
import ducks.ModelDuck
import behavior.flies.FlyRocketPowerd

fun main(args: Array<String>) {
    val mallard = MallardDuck()
    mallard.performQuack()
    mallard.performFly()

    val model = ModelDuck()
    model.performFly()
    model.flyBehavior = FlyRocketPowerd()
    model.performFly()
}