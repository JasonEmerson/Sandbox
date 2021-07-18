package coding.challenges

import kotlin.math.pow

fun main() {
    println(power(2,5))
}


//Given positive integer `base` and positive integer `exponent` implement a function which calculates power of base of
//exponent. This function should mimic functionality of `Math.pow`.
private fun power(base: Int, exponent: Int): Int {
    if (exponent == 1) {
        return base
    }
    return base * power(base, exponent - 1)
}

private fun power2(base: Int, exponent: Int): Int {
    return base.toDouble().pow(exponent).toInt()
}