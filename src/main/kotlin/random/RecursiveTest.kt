package random


fun main() {
    divideByTwo(100)
}

fun divideByTwo(num: Int): Int {
    println("divideByTwo: $num")
    if (num < 2) num else divideByTwo(num / 2)
    println("$num goes POP!")
    return num
}

fun countdown(n: Int) {
    if(n == 0) {
        println("Blastoff!")
    } else {
        println(n)
        countdown(n - 1)
    }
    println("Leaving...$n")
}

fun countdown2(n: Int) {
    if (n < 0) return
    println(" $n")
    countdown2(n - 1)
}

private fun product(list: List<Int>): Int {
    if (list.size == 1) {
        return list.first()
    }
    return list.first() * product(list.drop(1))
}

