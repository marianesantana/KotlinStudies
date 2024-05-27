fun main(){
//    calculate(message = "is multiple of", multipleOf = 11)

    val catAge = calculateCatAge(3)
    if(checkAge(catAge))
        print(message = "This cat is old ($catAge)")
    else
        print(message = "This cat is young ($catAge)")


}

fun calculate(first: Int = 11, second: Int = 60, message: String, multipleOf: Int ){
    for (i in first..second){
        if(i%multipleOf == 0){
            println("$i $message $multipleOf")
        }
    }

}
val calculateCatAge: (Int) -> Int = { it * 7 }
val checkAge: (Int) -> Boolean = { it > 14 }

//fun calculateCatAge(age: Int): Int {
//    return age * 7
//}

//fun checkAge(catAge: Int): Boolean {
//    return catAge > 14
//}