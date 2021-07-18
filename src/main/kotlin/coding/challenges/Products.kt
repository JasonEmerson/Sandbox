package coding.challenges


fun main() {
    println(product(listOf(1, 2, 3, 4, 5)))
}





//Given a list of integers implement a function which returns the product of all numbers in the list.
private fun product(list: List<Int>): Int {
    if (list.size == 1) {
        return list.first()
    }
    return list.first() * product(list.drop(1))
}

private fun product2(list: List<Int>): Int {
    return list.reduce { accumulated, current -> accumulated * current }
}