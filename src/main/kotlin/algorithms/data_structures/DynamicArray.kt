package algorithms.data_structures

class DynamicArray {
    var arr = IntArray(2)
    var size = 2
    var count = 0

    fun add(data: Int) {
        if (size == count)
            increaseSize()
        arr[count++] = data
    }

    fun addAt(index: Int, data: Int) {
        if (count == size)
            increaseSize()
        for (i in count - 1 downTo index) {
            arr[i + 1] = arr[i]
        }
        arr[index] = data
        count++
    }

    fun remove() {
        if (count > 0) {
            arr[count - 1] = 0
            count--
        }
    }

    fun removeAt(index: Int) {
        if (count > 0) {
            for (i in index until count - 1) {
                arr[i] = arr[i + 1]
            }
            arr[count - 1] = 0
            count--
        }
    }

    private fun increaseSize() {
        println("---> Increasing size.")
        var temp = IntArray(size * 2)
        for (i in 0 until count)
            temp[i] = arr[i]
        size *= 2
        arr = temp
    }
}