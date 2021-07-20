package RandomCode

fun main() {


    val numbers = listOf(7, 4, 8, 4, 3, 22, 18, 11)

    //find primes
    val results = numbers.map { number ->
        (2 until number).map { number % it }
            .none { it == 0 }
    }

    val results2 = numbers
        .map { it + 1 }
        .map { it + 1 }

    val results3 = numbers
        .map { number -> (1..number).map { number } }


    println(results3)
    testStringMap()
}

fun testStringMap() {
    var str = "Testing!"
    str.map { println(it) }
}





