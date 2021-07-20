package coding.challenges


fun main() {
    println(isTolerantPalindrome("abbcbba"))
}

//Given a string, return true if the string is a palindrome or false if it is not. Palindromes are strings that form the
//same word if it is reversed. Include spaces and punctuation in determining if the string is a palindrome.

//idiomatic solution
private fun isPalindrome(str: String): Boolean {
    return str.reversed() == str
}

private fun isPalindrome2(str: String): Boolean {
    str.forEachIndexed { index, char ->
        val rightIndex = str.lastIndex - index
        if (char != str[rightIndex])
            return false

        if (index > rightIndex)
            return true
    }
    return true
}

//recursive solution
private fun isPalindrome3(str: String): Boolean {
    return if (str.isEmpty() || str.length == 1) {
        true
    } else {
        if (str.first() == str.last()) {
            isPalindrome3(str.substring(1 until str.lastIndex))
        } else {
            false
        }
    }
}


//Given a string, return true if the string is a palindrome or false if it is not. Palindromes are strings that form the
//same word if it is reversed. Include spaces and punctuation in determining if the string is a palindrome. In this
//exercise we will allows one bad character. Our string will be (tolerant) palindrome if after removing one character
//string is a palindrome.
private fun isTolerantPalindrome(str: String): Boolean {
    var characterRemoved = false

    str.forEachIndexed { index, c ->
        var lastIndex = str.lastIndex - index

        if (characterRemoved) {
            lastIndex--
        }

        if (index >= lastIndex) {
            return true
        }

        if (c != str[lastIndex]) {
            if (characterRemoved) {
                return false
            } else {
                characterRemoved = true
            }
        }
    }

    return false
}
