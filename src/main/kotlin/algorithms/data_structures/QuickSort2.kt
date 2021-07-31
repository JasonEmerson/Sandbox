package algorithms.data_structures

fun main() {
//    val array = Array(5) { 0 + 1 }


    var array = Array(20, { 0 })
    for (i in array.indices)
        array[i] = 5 - i
    val arr2 = array.copyOf()

    quickSort2(array, 0, array.size - 1)
    for(i in arr2) print("$i, ")
    println("")
    for(i in array) print("$i, ")
}


fun quickSort2(A: Array<Int>, p: Int, r: Int) {
    if (p < r) {
        var q: Int = partition(A, p, r)
        quickSort2(A, p, q - 1)
        quickSort2(A, q + 1, r)
    }
}

fun partition(A: Array<Int>, p: Int, r: Int): Int {
    var x = A[r]
    var i = p - 1
    for (j in p until r) {
        if (A[j] <= x) {
            i++
            exchange(A, i, j)
        }
    }
    exchange(A, i + 1, r)
    return i + 1
}

fun exchange(A: Array<Int>, i: Int, j: Int) {
    var temp = A[i]
    A[i] = A[j]
    A[j] = temp
}