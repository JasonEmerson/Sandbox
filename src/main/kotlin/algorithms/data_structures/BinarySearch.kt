package algorithms.data_structures

import kotlin.random.Random

fun main() {
    var list = List(10) { Random.nextInt(0, 100)}
    var sortedList = list.sortedBy { it }

    val index = binarySearchIterative(42, sortedList)
    println("EXIT-> $index")
}

fun binarySearchIterative(num: Int, list: List<Int>): Int {
    var low = 0
    var high = list.size - 1

    while (low <= high) {
        println("WHILE START")

        var mid = (low + high) / 2
        println("mid = low + high divby 2 : $mid = $low + $high divby 2")
        println("")
        println("check if num == list[mid] : $num == ${list[mid]}")
        if (num == list[mid]) {
            println("***FOUND***, returning ${list[mid]}")
            return list[mid]
        }
        if (low == high - 1) {
            println("***NOT FOUND***, returning -1")
            return -1
        }
        println("")
        println("check if num < list[mid] : $num < ${list[mid]}")
        if (num < list[mid]) {
            println("   ---NUM is < list[mid] :: $num < ${list[mid]}")
            print("   ---high = mid : $high = $mid ---> ")
            high = mid
            println("$high = $mid")
        } else {
            println("   ---Num is > list[mid] : $num > ${list[mid]}")
            print("   ---low = mid : $low = $mid --->")
            low = mid
            println("$low = $mid")
        }
        println("BOTTOM REACHED, BACK TO TOP WITH LOW:$low  HIGH:$high")
        println("")
        println("")
    }
    return -1
}






fun binarySearchRec(num: Int, list: List<Int>): Int {
    val middleIndex = list.size / 2

    println("----------New func started---$num---")
    println("LIST SIZE::${list.size}::")
    println("middle index [$middleIndex] = ${list[list.size / 2]}")
    println("Checking base cases...")
    if(num == list[middleIndex]) {
        println("***FOUND***::BASE::***$num == ${list[middleIndex]}***")
        return -42
    }
    if(list.size == 1) {
        println("***NOT FOUND:***::BASE::***")
        return -43
    }
    println("Dividing list...")

    var newList = mutableListOf<Int>()
    if(num < list[list.size / 2])
        for(i in 0 until list.size / 2) newList.add(list[i]) else
            for(i in middleIndex until list.size) newList.add(list[i])

    println("New list finished...")
    println("ENTERING RECURSIVE CALL")
    var result = binarySearchRec(num, newList)
    println("LEAVING RECURSIVE CALL with result [$result]")

    return result
}

