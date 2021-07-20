package coding.challenges


fun main() {
    println(capitalizeFirst2(listOf("testing", "one", "two", "three")))
}


//Given list of strings implement a **recursive** function
//which will capitalize first letter of each string in the list.
private fun capitalizeFirst2(list: List<String>): List<String> =
    if (list.isEmpty()) emptyList()
    else listOf(list.first().capitalize()) + capitalizeFirst(list.drop(1))



// Kotlin idiomatic solution
private fun capitalizeFirst(list: List<String>): List<String> =
    list.map { it.capitalize() }

