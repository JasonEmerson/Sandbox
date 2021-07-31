fun main() {
    val numbers = listOf(7, 4, 8, 4, 3, 22, 18, 11)
    val bigNumbers = List(1000) { it + 1 }

    val begin = System.nanoTime()
    val primes = bigNumbers.filter { number ->
        (2 until number).map { number % it}
            .none {it == 0}
        }
    val end = System.nanoTime()
    val elapsedTime = end - begin
    val elapsedTimeInSeconds = elapsedTime / 1_000_000_000

    println("Elapsed time: $elapsedTimeInSeconds")
    println(primes.size)
    println(primes)
}