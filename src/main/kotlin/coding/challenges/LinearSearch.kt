package coding.challenges

fun main() {
    println(getIndex(listOf("hello", "world"),"hello"))
}



//Given list of strings and a string, return index of the value in the list or `-1` if value was not found.
//Don't use any Kotlin build-in methods that are directly returning index of element like `indexOf` / `lastIndexOf` /

private fun getIndex(list: List<String>, str: String): Int {
    list.forEachIndexed { index, element ->
        if (element == str) {
            return index
        }
    }
    return -1
}