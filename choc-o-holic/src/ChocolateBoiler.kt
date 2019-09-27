class ChocolateBoiler private constructor(
    private var empty: Boolean = true,
    private var boiled: Boolean = false
) {
    // begin - declare static property and method
    companion object {
        @Volatile
        @JvmStatic
        private var INSTANCE: ChocolateBoiler? = null

        @JvmStatic
        fun getInstance(): ChocolateBoiler {
            // double-check
            if (INSTANCE == null) {
                synchronized(this) {
                    if (INSTANCE == null) {
                        INSTANCE = ChocolateBoiler()
                    }
                }
            }
            return INSTANCE!!
        }
    }
    // end


    fun fill() {
        if (isEmpty()) {
            empty = false
            boiled = false
            //fill the boiler with a milk/chocolate mixture
        }
    }

    fun boil() {
        if (!isEmpty() && !isBoiled()) {
            //bring the contents to a boil
            boiled = true
        }
    }

    fun drain() {
        if (!isEmpty() && isBoiled()) {
            //drain the boiled milk and chocolate
            empty = true
        }
    }

    fun isEmpty(): Boolean {
        return empty
    }

    fun isBoiled(): Boolean {
        return boiled
    }
}