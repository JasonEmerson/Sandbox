class Player {
    var name = "SEFtest"
        get() = field.capitalize()
        set(value) {
            field = value.trim()
        }

    fun testSEF() = "WTF is going on?"

    fun testSEF2() : String {
        return "WTF is going on, part two?"
    }
}