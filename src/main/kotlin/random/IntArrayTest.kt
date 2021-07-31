package random

fun main() {
    var ints = intArrayOf(1, 2, 3, 4)
    var ints2 = ints.shuffle()
    for(i in ints) {
        println(i)
    }

}