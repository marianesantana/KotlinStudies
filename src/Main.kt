fun main() {
    val result = romanToInt("LVIII")
    println("The number version is: $result")
}

fun romanToInt(s: String): Int {
    val helper = mapOf(
        'M' to 1000,
        'D' to 500,
        'C' to 100,
        'L' to 50,
        'X' to 10,
        'V' to 5,
        'I' to 1
    )
    var sumValue = 0

    for(i in s.indices){
        println(s.length)

        if(i + 1 < s.length && helper[s[i]]!! < helper[s[i+1]]!!){
            sumValue -= helper[s[i]]!!
        }
        else {
            println(s[i])
            // 0 = L[50]
            //50 += 5
            // 55 += 1 * 3

            sumValue += helper[s[i]]!!


        }

    }
    return sumValue
}



