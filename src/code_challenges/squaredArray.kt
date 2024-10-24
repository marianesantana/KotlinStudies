package code_challenges

fun main() {
    println(sortedSquaredArray(listOf(0, 2, 3, 5, 6, 8, 9)))

}

fun sortedSquaredArray(array: List<Int>): List<Int> {
    var squaredArray = listOf<Int>()
    for(i in array.indices) {
        squaredArray += array[i] * array[i]
    }
    return squaredArray.sorted()
}


fun tournamentWinner(competitions: List<List<String>>, results: List<Int>): String {
    val helperC = mapOf(
        "Python" to 6,
        "C#" to 2,
        "HTML" to 0
    )
    var winners = mapOf<String, String>()
    for(i in competitions.indices) {
        if(competitions[i] == helperC.keys)
        winners.entries

    }

    return ""
}
