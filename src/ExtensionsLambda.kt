fun main() {
    messenger("Hello =)"){
        println("You are nice!")
    }
    toReplaceText
}

fun messenger(message: String, action: ()-> Unit){
    println(message)
    action()
}

fun <T> T.replace(text: T.() -> Unit): T {
    text(this)
    return this
}

val toReplaceText = "MarianeSantana".replace {
    println(replace("MarianeSantana", "Banana"))
}