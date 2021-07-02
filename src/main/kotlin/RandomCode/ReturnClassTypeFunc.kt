package RandomCode

data class ReturnMe(val string: String)

fun main() {

    fun testClass(): ReturnMe = ReturnMe("test")

    var returnMe: ReturnMe = testClass()

    print(returnMe.string)
}