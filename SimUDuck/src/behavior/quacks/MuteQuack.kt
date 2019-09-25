package behavior.quacks

class MuteQuack : QuackBehavior {
    override fun quack() {
        println("< Silence >")
    }
}