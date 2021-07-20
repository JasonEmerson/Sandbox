package RandomCode

fun main() {
    println(capitalizeSentence("flower"))
}


@OptIn(ExperimentalStdlibApi::class)
private fun capitalizeSentence(str: String): String {
    var words = str.split(" ")
    return words.joinToString(separator = " ") {word -> word.replaceFirstChar { it.uppercase() } }
}

private fun longestWord(str: String): String {
    var strings = str.split(" ")
    var longestString = ""
    for(s in strings) {
        if(s.length > longestString.length) {
            longestString = s
        }
    }
    return longestString
}