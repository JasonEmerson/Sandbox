package RandomCode


fun main() {
    var numsZeros = Numbers(0, 0)
    var numsOnes = Numbers(1,1)

    var newNum = numsZeros + numsOnes
    var newNum2 = newNum + numsOnes

    //println("$newNum2")

    var date1 = MyDate(1900, 1, 1)
    var date2 = MyDate(1900, 2, 2)

    test(date2, date1)


}

fun test(date1: MyDate, date2: MyDate) {
    println(date1 < date2)
}

data class Numbers(var num1: Int, var num2: Int) {
    operator fun plus(other: Numbers) = Numbers(num1 + other.num1, num2 + other.num2)
}

data class MyDate(val year: Int, val month: Int, val dayOfMonth: Int) : Comparable<MyDate> {
    override fun compareTo(other: MyDate) = when {
        year != other.year -> {
            println("Testing YEAR")
            year - other.year}
        month != other.month -> {
            println("Testing MONTH")
            month - other.month }
        else -> {
            println("Testing DAYOFMONTH")
            dayOfMonth - other.dayOfMonth
        }
    }
}

