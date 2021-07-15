package RandomCode

fun main() {
    println(capitalizeSentence("flower"))
}


@OptIn(ExperimentalStdlibApi::class)
private fun capitalizeSentence(str: String): String {
    var words = str.split(" ")
    return words.joinToString(separator = " ") {word -> word.replaceFirstChar { it.uppercase() } }
}