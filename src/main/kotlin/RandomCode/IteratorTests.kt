package RandomCode

fun main() {
    testIterator("Testing")
}


fun testIterator(str: String) {
    str.forEachIndexed { index, c ->
        var lastIndex = str.lastIndex - index
        println("$c <> $lastIndex str.lastIndex == ${str.lastIndex}")
    }
}