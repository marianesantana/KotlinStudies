class Car(
    var color: String = "Blue",
    var model: String = "SUV"
) {
    init {
        color = "Yellow"
        model = "SUV"
    }
    fun drive(){
        println("Vruuummmmm")
    }
    fun speed(minSpeed: Int, maxSpeed: Int){
        println("Min speed is $minSpeed & the max speed is $maxSpeed")
    }
}

    fun main() {
        var car = Car("Red", "Sedan")
        println("Carro: ${car.color}, ${car.model}")
        var secondCar = Car()
        println("Segundo Carro: ${secondCar.color}, ${secondCar.model}")

        car.speed(20, 100)

        car.drive()




    }

