package random

import kotlin.random.Random


//when passing an object to a method the reference to the object is passed
//in this case the value of the array can be changed from the function
//which receives the copied reference

fun main() {


    //print("Initial array: ")
    //for (el in array) print("$el ")

    //swapArray(array, 0, 4)

    //print("After swap: ")
    //for (el in array) print("$el ")
    val array = intArrayOf(5, 6, 7, 8, 4)
    arrayBoundaryTest(array)
}

fun arrayBoundaryTest(array: IntArray) {
    var left = 0
    var right = array.size - 1
    var pivot = array[4]

    while(left <= right) {

        while (array[left] > pivot) {
            println("Looping...")
            println("${array[left]} > $pivot")
            left++
            println("left ++ = $left.  Array = ${array.toList()}")
        }

        left++

    }
    println("EXIT WHILE LOOP")
}

fun swapArray(a: IntArray, b: Int, c: Int) {
    val temp = a[b]
    a[b] = a[c]
    a[c] = temp
}