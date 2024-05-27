fun main() {
    val result = romanToInt("LVIII")
    println("The number version is: $result")
}

fun romanToInt(s: String): Int {
    val helperString = mutableMapOf<Char,Int>()
    helper(helperString)
    var sumValue = 0

    for(i in s.indices){
        print(i + 1)

        //se 1 < 7 && L[1000] < L[500+100]
        if(i + 1 < s.length && helperString[s[i]]!! < helperString[s[i+1]]!!){
            sumValue -= helperString[s[i]]!!
        }
        else {
            print(s[i])
            // 0 = L[50]
            //50 += 5
            // 55 += 1 * 3

            sumValue += helperString[s[i]]!!


        }

    }
    return sumValue
}

fun helper(helper: MutableMap<Char, Int>){
    helper['M'] = 1000
    helper['D'] = 500
    helper['C'] = 100
    helper['L'] = 50
    helper['X'] = 10
    helper['V'] = 5
    helper['I'] = 1
}

