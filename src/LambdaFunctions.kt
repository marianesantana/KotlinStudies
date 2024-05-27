fun main(){
//    println(sum(10, 56))

    enhancedMessage("Hello there, "){
        sum(50, 45)
    }

}
//val lambdaName: Type = { parameters -> codeBody }
val sum: (Int, Int) -> Int = { x, y -> x + y }

fun enhancedMessage(message: String, functionAsParameter: () -> Int) {
    println("$message ${functionAsParameter()}")
}