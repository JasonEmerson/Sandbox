package test_classes

import daily_algos.DailyDynamicList

fun main() {
    var array = DailyDynamicList()
    println("Initialized empty Dynamic Array: ")
    printList(array)
    println()

    addToList(array, 42)
    addToList(array, 92)
    addToList(array, 7)

    addAtToList(array, 0, 79)

    removeFromList(array)

    removeAtFromList(array, 0)
}

fun addToList(array: DailyDynamicList, n: Int) {
    println("add(data), $n, to list ")
    array.add(n)
    printList(array)
    println()
}

fun addAtToList(array: DailyDynamicList, index: Int, n: Int) {
    println("addAt(index, data), $index $n, to list ")
    array.addAt(index, n)
    printList(array)
    println()
}

fun removeFromList(array: DailyDynamicList) {
    println("remove()")
    array.remove()
    printList(array)
    println()
}

fun removeAtFromList(array: DailyDynamicList, index: Int) {
    println("removeAt(index), $index, from list")
    array.removeAt(index)
    printList(array)
    println()
}

fun printList(arr: DailyDynamicList) {
    print("Array Contents: ")
    for (item: Int in arr.arr) {
        print("$item ")
    }
    println()
}