package random

fun main() {
    testIterator("testing")
    var array = intArrayOf(3, 3)
    println(twoSum(array, 6).toList())
}


fun testIterator(str: String) {
    str.forEachIndexed { index, c ->
        var lastIndex = str.lastIndex - index
        println("<$c>---<$lastIndex>")
    }
}

fun twoSum(nums: IntArray, target: Int): IntArray {
    var arr = IntArray(2)
    for(i in nums.indices)
        for (j in nums.indices) if (i != j && nums[i] + nums[j] == target) {
            arr[0] = nums[i]
            arr[1] = nums[j]
        }
    return arr
}