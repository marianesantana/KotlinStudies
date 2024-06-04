fun main () {
    val input = Result.SUCCESS
    getResult(input)

}

fun getResult(result: Result) {
    return when(result){
        Result.SUCCESS -> println("Success! UHU")
        Result.ERROR -> println("Error! :(")
        Result.FAILURE -> println("Failure....")
    }
}

 enum class Result {
    SUCCESS,
    ERROR,
    FAILURE
}

