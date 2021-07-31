package random

fun main() {
    println(testStringFunc("Testing this string!"))
}

fun testStringFunc(str: String) {
    var strings: List<String> = str.split(" ")
    strings.filterNot { it.isBlank() }
}

private fun testSubString(str: String): String {
    return str.substring(1 until str.lastIndex)
}
