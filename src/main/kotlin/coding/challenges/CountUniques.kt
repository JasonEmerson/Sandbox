package coding.challenges

fun main() {
    println(countUniqueValues(listOf(3, 1, 2, 2, 3, 3, 3)))
}

private fun countUniqueValues(list: List<Int>): Int {
    return list.toSet().size
}

private fun countUniqueValues2(list: List<Int>): Int {
    val map = mutableMapOf<Int, Int>()

    list.forEach {
        var value = map.getOrDefault(it, 0)
        value++
        map[it] = value
    }

    return map.count()
}