fun main () {

    val myListOfNames = listOf("Mariane", "Marinho", "Livia", "Wanda", "Mel", "Lady")
    for(i in  myListOfNames){
        println("Name =  $i")
    }
    val filteredList = myListOfNames.filter {
        it.startsWith("l", true)
    }
    println(filteredList)

    val myListOfNumber = mutableListOf(1, 2, 5)
    for(i in  0..10){
        myListOfNumber.add(i)
        println("Number: $i")
    }
    print(myListOfNumber)

    val myListOfAnimals = mapOf("Coruja" to 1, "Vaca" to 2, "Elefante" to 3)
    if("Gato" in myListOfAnimals){
        println("Yes is in!")
    }
    else {
        println("IS NOT")

    }

    println(myListOfAnimals.values)

    //Unique value, never duplicates
    //no order is defined

    val mySetOfStates = setOf("AC", "SP", "RJ", "DF")
    for(i in mySetOfStates){
        println(i)
    }

    val myMutableSetOfStates = mutableSetOf("AC", "SP", "RJ", "DF")
    myMutableSetOfStates.add("AC")
    for(i in mySetOfStates){
        println(i)
    }




}

