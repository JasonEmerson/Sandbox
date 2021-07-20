package coding.challenges


fun main() {
    println(longestWord("We went to the!%#@beach."))
}



//Given a string implement a function which returns longest word in that string. If there are two or more words that have
//the same length, return the first longest word from the string. Ignore punctuation. Input string can't be empty or blank
//sering.
private fun longestWord(str: String): String {
    return str.map { if (it.isLetter()) it else ' ' }   //return list<Char>, replace punctuation with whitespace
        .joinToString("")                   //return String
        .split(" ")                           //return list<String>, parse words, punctuation is gone
        .filterNot { it.isBlank() }                    //return list<String>, filter out empty strings and whitespace
        .maxByOrNull { it.length }                     //returns largest value of all strings in list
        ?: ""                                          //returns "" if null
}