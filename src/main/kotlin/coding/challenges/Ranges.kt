package coding.challenges

fun main() {
    println(containsRange(1..10, 3..5))
}

// Given two ranges implement a function which checks if range1 contains range2.
private fun containsRange(range1: IntRange, range2: IntRange) =
    range2.first >= range1.first && range2.last <= range1.last