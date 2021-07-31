package algorithms.data_structures

import kotlin.random.Random

fun main() {

    val array = IntArray(20) { Random.nextInt(0, 100) }
    //val array = intArrayOf(5, 4, 3, 2, 1)
    val arr2 = array.copyOf()
    println("BEGIN")
    quickSort(array, 0, array.size - 1)
    for(i in arr2) print("$i, ")
    println("")
    for(i in array) print("$i, ")
}

fun quickSort(array: IntArray, left: Int, right: Int) {
    println("")
    println("*****************quickSort()******************")

    val index = partition(array, left, right)
    if (left < index - 1) {
        //println(">>>Entering quickSort(): LEFT:  L:$left < i:${index - 1}")
        enterLeft(array, left, index - 1)
        quickSort(array, left, index - 1)
    }
    if (right > index) {
        //println(">>>Entering quickSort(): RIGHT: R:$right > i:${index}")
        enterRight(array, index, right)
        quickSort(array, index, right)
    }
    println("****************leaving quickSort()***************")
}

fun partition(array: IntArray, l: Int, r: Int): Int {
    println("")
    println(">>>>>>>>>>>>>>>>>partition()>>>>>>>>>>>>>>>>>>>")
    var left = l
    var right = r
    val pivot = array[(left + right)/2]
    println("Pivot: $pivot")
    while( left <= right ) {
        //println("MAIN WHILE-----$left <= $right")
        while (array[left] < pivot) left++

        while (array[right] > pivot) right--

        if (left <= right) {
            swapArray(array, left, right)
            left++
            right--
        }
        if (left > right) println("BASE CASE? left:$left > right:$right")

    }
    println("<<<<<<<<<<<<<Leaving partition(), return $left to index in quickSort()<<<<<<<<<<<<<<<<")
    return left
}

fun swapArray(arr: IntArray, a: Int, b: Int) {
    println("${arr.toList()} Swap: ${arr[a]} <-> ${arr[b]}")
    val temp = arr[a]
    arr[a] = arr[b]
    arr[b] = temp
    println("${arr.toList()} Swapped.")
    println("")
}

fun enterLeft(arr: IntArray, l: Int, r: Int) {
    print("Next check left: ")
    for(i in l..r) {
        print("${arr[i]} ")
    }
}

fun enterRight(arr: IntArray, l: Int, r: Int) {
    print("Next check right: ")
    for(i in l..r) {
        print("${arr[i]} ")
    }
}

