fun main(){

    println(factorial(5, 1))
    printer(6)

    val ball = Coordinates(12, 43, 1)
    println("Ball $ball")
    println("-Ball ${-ball}")

    School()


}

// tail recursion improves the memory because the recursion is just called as a last resource on the function and the compiler can run as an iterator

tailrec fun factorial(num: Long, total: Long): Long {
    val tmp = num * total
    return if(num <= 1) tmp else factorial(num - 1, tmp)
}

fun printer(n: Int){
    if(n<0)
        return
    println("Number: $n")
    printer(n -1)
}


/*
Unary Operators:
    - unaryMinus
    - unaryPlus
    - not
    - inc()
    - desc()
 */

data class Coordinates(val x: Long, val y: Long, val z: Long) {
    operator fun unaryMinus() = Coordinates(-x, -y, -z)
}

//invoke concept

object School {
    operator fun invoke(){
        println("School days")
    }
}