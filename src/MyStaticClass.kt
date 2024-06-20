fun main() {

    val myClass = MyStaticClass.create("hello")
    println(myClass)
}

class MyStaticClass private constructor(val data: String) {
    companion object Factory {
        fun create(data: String): MyStaticClass {
            return MyStaticClass(data)
        }
    }

}