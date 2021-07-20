package coding.challenges


fun main() {
    println(decapitalizeConst("FOO_BAR_"))
}

//Given a string representing constant name (upper case words
//separated by underscore eg `FOO_BAR`) implement a function which
//converts it into variable name (eg. `fooBar`):
//- convert first word to lowercase
//- convert next words to lowercase, but first character is still uppercase
//- remove all underscore characters

private fun decapitalizeConst(str: String): String {
    val subsStringsList = str.split("_").map { it.toLowerCase().capitalize() }
    return subsStringsList.joinToString("").decapitalize()
}

private fun decapitalizeConst2(str: String): String? {
    val words = str.split("_").filter { it.isNotEmpty() }

    if (words.size <= 1) return null

    return words.mapIndexed { index, word ->
        if (index == 0) {
            word.toLowerCase()
        } else {
            word.first().toUpperCase() + word.drop(1).toLowerCase()
        }
    }.joinToString(separator = "")
}