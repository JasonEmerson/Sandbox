package random

import kotlin.random.Random

fun main() {
    //var list = IntArray(1000) { Random.nextInt(0, 1000) }.asList()
    //var sortedList = sortInts(list)



    var arr: ArrayList<Int> = arrayListOf(5, 3, 6, 2, 10)
    var newArr: ArrayList<Int> = arrayListOf()
    println(":::$newArr::::")

    for (i in arr.indices) {
        var smallest = findSmallest(arr)
        newArr.add(arr[smallest])
        arr.remove(smallest)
    }

    println("ORIGINAL***: $arr")
    println("SORTED****: $newArr")
}

fun findSmallest(arr: ArrayList<Int>): Int {
    var smallest = arr[0]
    var smallestIndex = 0

    for (i in 0 until arr.size) {
        if (arr[i] < smallest) {
            smallest = arr[i]
            smallestIndex = i
        }
    }
    return smallestIndex
}


//fun sortInts(list: List<Int>): List<Int> {
//    var unsorted = list.toMutableList()
//    var sorted = mutableListOf<Int>()
//
//    while(unsorted.isNotEmpty()) {
//        var smallest = 1001
//        for (i in unsorted.indices) if (unsorted[i] < smallest) smallest = unsorted[i]
//        println("---Removing $smallest from UNSORTED")
//        unsorted.remove(smallest)
//        println("-----Adding $smallest to SORTED")
//        sorted.add(smallest)
//    }
//    return sorted
//}

