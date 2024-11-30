/*Дан массив nums, содержащий n различных чисел в диапазоне [0, n]. Вернуть единственное число в диапазоне, отсутствующее в массиве.*/

import kotlin.system.measureTimeMillis

fun missingNumber(nums: IntArray): Int {
    val expectSum = nums.size*(nums.size+1)/2
    val actualSum = nums.sum()
    return expectSum - actualSum
}

fun readInt(): IntArray {
    return readLine()?.split(Regex("[,\\s]+"))?.map { it.toInt() }?.toIntArray() ?: intArrayOf()
}

fun main() {
    print("Массив чисел: ")
    val nums = readInt()

    testMissingNumber(nums)
}

fun testMissingNumber(nums: IntArray) {
    val startTime = System.currentTimeMillis()
    val result = missingNumber(nums)
    val endTime = System.currentTimeMillis()
    val time = endTime - startTime
    println("Вывод: $result, Время: $time мс")

    println("Пояснение Отсутствующее число в диапазоне [0, ${nums.size}]")
}