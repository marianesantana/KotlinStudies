fun main() {
    println("Hello, ".append("Marie"))
    println("HelloGoodbye".removeFirstAndLastChar())


}

fun String.append(toAppend: String): String = this.plus(toAppend)

fun String.removeFirstAndLastChar(): String = this.substring(1, this.length -1)
