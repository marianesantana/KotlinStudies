fun main(){
    twoSum(intArrayOf(2, 7, 11, 15), 9)

}

fun twoSum(nums: IntArray, target: Int): IntArray {
    var sumValue = intArrayOf()

    for (i in nums.indices) {
        println("i ${nums[i]}")
        for(x in i + 1 until nums.size) {
            println("x ${nums[x]}")
            if(nums[i] + nums[x] == target) {
                sumValue += i
                sumValue += x
            }
        }
        println("indices somaveis:${sumValue.joinToString(", ")}")

    }
    return sumValue

}

