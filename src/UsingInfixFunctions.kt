fun main() {
    val a = Number(15)
    val b = Number(56)
    println(a add b)

    val group = Group(listOf("Lady", "Mel", "Simba", "Freddie"))
    println(group hasMember "Lady")
    println(group hasMember "Bob")


    val firstName = MyString("Mariane ")
    val lastName = MyString("Santana")

    println(firstName concatenate lastName)

    val configuration = MyConfiguration()

    configuration setHost "localhost"
    configuration setPort 8080

    println("Host: ${configuration.personalHost}, Port: ${configuration.personalPort}")



}

//example  1:

class Number(val value: Int){
    infix fun add(other: Number): Number {
        return Number(this.value + other.value)
    }

    override fun toString(): String {
        return """
            Result = ${this.value } 
        """.trimIndent()

    }
}

//example 2:

class Group(val members: List<String>) {
    infix fun hasMember(name: String): Boolean {
        return members.contains(name)
    }



}

//example 3:


class MyString(val content: String) {
    infix fun concatenate(other: MyString): MyString{
        return MyString(this.content + other.content)
    }
    override fun toString(): String {
        return """
            $content
        """.trimIndent()
    }
}

// example 4:

class MyConfiguration {
    var personalHost: String = ""
    var personalPort: Int = 0

    infix fun setHost(host: String) {
        this.personalHost = host
    }

    infix fun setPort(port: Int) {
        this.personalPort = port
    }
}