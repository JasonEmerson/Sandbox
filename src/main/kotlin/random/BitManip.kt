package random

fun main() {

    println(getBit(15, 4))
    //shiftLeft(212)
}


fun getBit(num: Int, i: Int): Int {
    // Return true if the bit is set.
    // Otherwise, return false.
    return num and (1 shl i) //!= 0
}

fun shiftLeft(num: Int) {
    println(num shl 1)
}