package coding.challenges



fun main() {
    println(getAllPairs(5))
}

//Given positive Int `n` implement a function which returns a list of containing pairs with all combinations of numbers
//from `0` to `n`.

private fun getAllPairs(n: Int): List<Pair<Int, Int>> {
    var pairs = mutableListOf<Pair<Int, Int>>()
    (0..n).forEach {
        for (i in 0..n) {
            pairs.add(Pair(it, i))
        }
    }
    return pairs
}

//private object Solution1 {
//    private fun getAllPairs(n: Int): List<Pair<Int, Int>> {
//        val result = mutableListOf<Pair<Int, Int>>()
//
//        (0..n).forEach { i ->
//            (0..n).forEach { j ->
//                result.add(i to j)
//            }
//        }
//
//        return result
//    }
//}
//
//private object Solution2 {
//    private fun getAllPairs(n: Int): List<Pair<Int, Int>> {
//        return (0..n).map { i ->
//            (0..n).map { j ->
//                i to j
//            }
//        }.flatten()
//    }
//}