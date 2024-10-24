fun main() {
    val listOfPets = listOf("Freddie", "Mel", "Lady", "Simba")
    val finder = Finder(listOfPets)

    finder.findItem("") {
        println("Founded $it")
    }

}

class Finder(private val list: List<String>){
    fun findItem(element: String, foundItem: (element: String?) -> Unit){
        val itemFoundList = list.filter {
            it == element
        }
        if(itemFoundList.isNullOrEmpty()) foundItem(null) else foundItem(itemFoundList.first())
    }
}