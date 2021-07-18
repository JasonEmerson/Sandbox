package coding.challenges

fun main() {
    //println(printNumber2(10, 1))
    //paramTest("TEST", 42)
    addLists()
}


//Given positive integer `n` implement a function which returns a list containing all steps from `n` to `0`.
private fun countDown(n: Int): List<Int> {
    return (n downTo 0).toList()
}

private fun countUpAndDown(n: Int): List<Int> {
    return (0..n).toList().plus(n - 1 downTo 0)
}

//solution #2
private fun countUpAndDown2(n: Int): List<Int> {
    return (0 until n) + (n downTo 0)
}


//Given positive integer `n` implement a function which returns a list representing all numbers from `n` to `1`. If `n`
//value is zero then empty list should be returned.
private fun printNumber(n: Int): List<Int> {
    return if (n > 0) (n downTo 1).toList() else emptyList()
}

private fun printNumber2(n: Int): List<Int> {
    return (n downTo 1).toList()
}


//Given positive integer `n` and integer `step` implement a function which returns a list representing all numbers from
//`n` to `1` taking `step` into consideration. If `n` value is zero then empty list should be returned.


private fun printNumber(n: Int, step: Int = 1): List<Int> {
    return (n downTo 1 step step).toList()
}

private fun printNumber2(n: Int, step: Int = 1): List<Int> {
    fun printNumberRec(n: Int): List<Int> =
        when {
            n <= 0 -> emptyList()
            else -> listOf(n) + printNumberRec(n - step)
        }
    return printNumberRec(n)
}

fun paramTest(str: String, num: Int) {
    println("$str outside/before function")

    fun paramTest2(str: String) {
        println("$str inside function $num")
    }

    println("$str outside/after function")
    paramTest2(str)
}

fun addLists() {
    println(listOf(1, 2) + listOf(3, 4))
}