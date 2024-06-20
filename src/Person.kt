fun main() {
    val personOne = Person()
    println(personOne)

    val personTwo = Person(name = "Wanda", age = 61, height = 164.0)
    println(personTwo)

    val personThree = Person(name = "Livia", age = 10, height = 150.0)
    println(personThree)

}


class Person(
    var name: String = "Mariane",
    var age: Int = 25
) {

    private var heightInCm: Double = 0.0

    constructor(name: String, age: Int, height: Double): this(name, age){
        heightInCm = height

    }


    override fun toString(): String {
        return """
            Name: $name,
            Age: $age
            is Old Enough: ${age >= 21}
            Height: $heightInCm
            -------
        """.trimIndent()
    }
}