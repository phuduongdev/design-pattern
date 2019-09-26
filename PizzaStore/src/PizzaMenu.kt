enum class PizzaMenu {
    CHEESE, CLAM, PEPPERONI, VEGGIE;

    override fun toString(): String {
        return when (this) {
            CHEESE -> "cheese"
            CLAM -> "clam"
            PEPPERONI -> "pepperoni"
            VEGGIE -> "veggie"
            else -> ""
        }
    }

}