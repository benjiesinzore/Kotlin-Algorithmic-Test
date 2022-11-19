package fundamentals.functions

fun main(){

    println(countVowels("Benjamin Sinzore"))
}


fun countVowels(str: String?): Int {
    if (str == null || str.isEmpty()) {
        return 0
    }
    val first = str[0]

    val vowels = "aeiouAEIOU"
    var countFirstVowel = 0

    if (vowels.indexOf(first) >= 0) {
        countFirstVowel = 1
    }
    val remaining = str.substring(1)
    return countFirstVowel + countVowels(remaining)
}