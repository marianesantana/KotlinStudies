fun main () {
    Repository.startFetch()
    getResult(result = Repository.getCurrentState())
    Repository.finishFetch()
    getResult(result = Repository.getCurrentState())
    Repository.errorFetch()
    getResult(result = Repository.getCurrentState())
    Repository.customFailure()
    getResult(result = Repository.getCurrentState())
    Repository.anotherCustomFailure()
    getResult(result = Repository.getCurrentState())


}

fun getResult(result: Result) {
    return when(result){
        is Error -> println("Error! ${result.error}")
        is Success -> println("Success! UHU ${result.dataFetched?: "Ensure you start Fetching."}")
        is Loading -> println("Loading...")
        is NotLoading -> println("IDLE")
        is Failure.AnotherCustomFailure -> println("Another CustomFailure: ${result.dataFetched.toString()}")
        is Failure.CustomFailure -> println("CustomFailure: ${result.dataFetched.toString()}")


//        Result.SUCCESS -> println("Success! UHU")
//        Result.ERROR -> println("Error! :(")
//        Result.IDLE -> println("Nothing happens")
//        Result.LOADING -> println("Loading.....")

    }
}

sealed class Result
data class Success(val dataFetched: String?): Result()
data class Error(val error: Exception): Result()
object Loading: Result()
object NotLoading: Result()

sealed class Failure: Result() {
    data class CustomFailure(val dataFetched: String?): Failure()
    data class AnotherCustomFailure(val dataFetched: String?): Failure()
}


// enum class Result {
//     SUCCESS,
//     ERROR,
//     IDLE,
//     LOADING
//}

object Repository {
    private var loadState : Result = NotLoading
    private var dataFetched: String? = null

    fun startFetch(){
        loadState = Loading
        dataFetched = "data"
    }

    fun finishFetch() {
        loadState = Success(dataFetched)
        dataFetched = null
    }

    fun errorFetch() {
        loadState = Error(error = Exception("Exception"))

    }

    fun customFailure(){
        loadState = Failure.CustomFailure(dataFetched = "NullPointer Exception")
    }

    fun anotherCustomFailure(){
        loadState = Failure.AnotherCustomFailure(dataFetched = "IO Exception")
    }


    fun getCurrentState(): Result {
        return loadState
    }


}

