
fun main() {
    val myListOfPets = listOf("Lady", "Mel", "Simba", "Freddie")
    val myListOfAges = listOf(123, 24, 35, 67)

    val myGenericFinder = MyGenerics(myListOfPets)
    myGenericFinder.findItem("Simbas") {
        println("Founded $it")
    }
    val myAgeFinder = MyGenerics(myListOfAges)
    myAgeFinder.findItem(67) {
        println("Founded $it")
    }
}

class MyGenerics<T>(private val list: List<T>) {
    fun findItem(element: T, foundItem: (element: T?) -> Unit){
        val newList = list.filter {
            it == element
        }
        if(newList.isNullOrEmpty()) foundItem(null) else foundItem(element)
    }

}
