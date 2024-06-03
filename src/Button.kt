fun main() {
    val button = Button(label = "Button")
    button.onClick("This is an interface example")

}

class Button(val label: String): MyEvent {
    override fun onClick(message: String) {
        println("Label is a $label and here's a message: $message")
    }

}

interface MyEvent {
    fun onClick(message: String)
}