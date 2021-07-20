package RandomCode


fun main() {
    println(countdown2(10))
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

