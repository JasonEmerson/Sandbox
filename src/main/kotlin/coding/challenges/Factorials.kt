package coding.challenges


fun main() {
    println(displayBinary(23))
}


//Given positive integer `n` implement a function, which returns a [factorial](https://en.wikipedia.org/wiki/Factorial) of
//that integer. Factorial (of positive integer) is number that is created by multiplying all numbers from 1 to `n` eg.
//factorial of `3` (`3!`) is equal to `6` (`3 * 2 * 1`)
private fun factorial(n: Int): Int {
    if (n <= 1) return 1
    return n *(factorial(n - 1))
}

fun displayBinary(value: Int) {
    if (value > 0) {
        displayBinary(value / 2)
        print(value % 2)
    }
}

