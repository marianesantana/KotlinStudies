fun main() {
    val toad = Vertebrate.Amphibian(lifeSpan = 10)
    val trout = Vertebrate.Fish(lifeSpan = 5, freshWater = true)

    println(toad cross trout)

    val cow = Vertebrate.Mammal(lifeSpan = 40, eggLaying = false)
    val bird = Vertebrate.Bird(lifeSpan = 20)

    println(cow cross bird)

}

sealed class Vertebrate(private val isColdBlooded: Boolean, private  val lifeSpan: Int){
    class Mammal(eggLaying: Boolean, lifeSpan: Int): Vertebrate(isColdBlooded = false, lifeSpan = lifeSpan)
    class Fish(freshWater: Boolean, lifeSpan: Int): Vertebrate(isColdBlooded = true, lifeSpan = lifeSpan)
    class Reptile(lifeSpan: Int): Vertebrate(isColdBlooded = false, lifeSpan = lifeSpan)
    class Bird(lifeSpan: Int): Vertebrate(isColdBlooded = false, lifeSpan = lifeSpan)
    class Amphibian(lifeSpan: Int): Vertebrate(isColdBlooded = true, lifeSpan = lifeSpan)

    private class GenericVertebrate(
        private val isColdBlooded: Boolean,
        private val lifeSpan: Int,
        private val name: String
    ): Vertebrate(isColdBlooded, lifeSpan) {
        override fun toString(): String {
            return """
                Animal: $name
                Lifespan: $lifeSpan
                WarmBlooded: ${if(isColdBlooded) "No" else "Yes"}
            """.trimIndent()
        }
    }

    infix fun cross(vertebrate: Vertebrate): Vertebrate {
        return GenericVertebrate(
            name = "Generic ${this.javaClass.name}/ ${vertebrate.javaClass.name}".replace("Vertebrate$", ""),
            lifeSpan = this.lifeSpan + vertebrate.lifeSpan,
            isColdBlooded = !(!this.isColdBlooded && !vertebrate.isColdBlooded)
        )
    }
}