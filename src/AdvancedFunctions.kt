fun main() {
    println(properties(124.0, 46.0))

    val clownFish = Fish()
    clownFish.makeSound()

    val orangeCat = Cat()
    orangeCat.makeSound()
    orangeCat.move("left")

    //inline function

    communicate(message = {
        println("Hello from the deep sea")
    }, time = { 10000L })

    //infix function

    clownFish cross orangeCat

    //anonymous func

    val calculate = fun(a: Int, b: Int) = a + b
    println(calculate(24, 65))

    val randNumbers= listOf(34, 54, -2, 53, 67)
    val number = randNumbers.find(fun(num) = num < 0)
    println("The negative number is $number")

}
//local functions
fun properties(length: Double, width: Double): Pair<Double, Double> {
    fun area(): Double = length * width
    fun perimeter(): Double = (length + width) * 2
    return Pair(area(), perimeter())
}

abstract class Animal(val name: String) {
    abstract val limbs: Int
    abstract val isColdBlooded: Boolean
    abstract val sound: String?
    abstract val gestation: Double

    //behavior

    fun makeSound(){
        fun customSound(): String {
            return if(sound.isNullOrBlank()) "The $name does not emit sound" else "The $name is $sound"
        }
        println(customSound())
    }

    fun move(direction: String) {
        println(
            """
                My $name is heading towards $direction
             """.trimIndent()
            
            )
            

    }
    infix fun cross(breed: Animal){
        fun result(): Double {
            return if(breed.name.lowercase() == name.lowercase())
                breed.gestation
            else
                breed.gestation + gestation

        }
        println("""
                The ${breed.name} and $name will give an offspring after ${result()} months!!!
               """.trimIndent())
    }


}

class Fish: Animal("Nemo") {
    override val limbs: Int = 0
    override val isColdBlooded: Boolean = true
    override val sound: String? = null
    override val gestation: Double = 3.0


}

class Cat: Animal("Simba") {
    override val limbs: Int = 4
    override val isColdBlooded: Boolean = false
    override val sound: String? = "Meow!"
    override val gestation: Double = 9.0
}

class Mammal: Animal("Magali"){
    override val limbs: Int = 4
    override val isColdBlooded: Boolean = false
    override val sound: String? = "Mooo!"
    override val gestation: Double = 9.0


}
//lambda as parameter
inline fun communicate(message: () -> Unit, noinline time: () -> Long) {
    println("Incoming message...")
    message()
    println("Message processed in ${time()} milliseconds...")


}


