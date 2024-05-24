fun main(){
    calculate(message = "is multiple of", multipleOf = 11)

}

fun calculate(first: Int = 11, second: Int = 60, message: String, multipleOf: Int ){
    for (i in first..second){
        if(i%multipleOf == 0){
            println("$i $message $multipleOf")
        }
    }

}