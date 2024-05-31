fun main() {
    println(specialArray(intArrayOf(3, 5)))
}

fun specialArray(nums: IntArray): Int {
    nums.sortDescending()

    for(i in nums.indices) {
        if (nums[i] >= i + 1) {
            if (i == nums.lastIndex || nums[i + 1] < i + 1) {
                return i + 1

            }
        }
    }
    return -1

}