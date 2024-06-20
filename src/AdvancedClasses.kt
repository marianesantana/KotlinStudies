fun main() {
    val crane = Bird(
        age = 9,
        weight = 12.3,
        name = "Piupiu"
    )
    println("Original Crane: ${crane.homeReared}")
    crane.homeReared = false
    crane.breed("3")
    println("Crane gestation period: ${crane.gestation}")

    val falcon = Falcon
    falcon.breed("4")
    println("Falcon: $falcon")

    val croc = Reptile.crate()
    println("$croc")

    val turtle = Reptile()
    turtle.name = "Turtle"
    turtle.lifespan = 100

    println("$turtle")


}

data class Bird(
    val age: Int,
    val weight: Double,
    var name: String
) {
    var homeReared: Boolean = true
        get() = if(field) age < 10 else field
        set(value) {
            field = if(value) age < 10 else field
        }

    lateinit var gestation: String

    fun breed(period: String){
        gestation = period
    }
}

data object Falcon {
    val age: Int = 10
    lateinit var gestation: String
    fun breed(period: String){
        gestation = period
    }

    override fun toString(): String {
        return """
            Age: $age,
            Gestation: $gestation
        """.trimIndent()
    }
}

class Reptile {
    var name: String = ""
    var lifespan: Int = 0

    override fun toString(): String {
        return """
            Name: $name,
            Lifespan: $lifespan
        """.trimIndent()
    }

    companion object Factory {
        val croc = Reptile()
        fun crate(): Reptile {
            croc.name = "Crocodile"
            croc.lifespan = 60
            return croc
        }
    }
}