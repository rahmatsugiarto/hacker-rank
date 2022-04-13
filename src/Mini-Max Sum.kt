import java.util.*

/*
 * Complete the 'miniMaxSum' function below.
 *
 * The function accepts INTEGER_ARRAY arr as parameter.
 */

fun miniMaxSum(arr: Array<Int>): Unit {
    // Write your code here.
    val a = arr[1].toLong() + arr[2].toLong() + arr[3].toLong() + arr[4].toLong()
    val b = arr[0].toLong() + arr[2].toLong() + arr[3].toLong() + arr[4].toLong()
    val c = arr[0].toLong() + arr[1].toLong() + arr[3].toLong() + arr[4].toLong()
    val d = arr[0].toLong() + arr[1].toLong() + arr[2].toLong() + arr[4].toLong()
    val e = arr[0].toLong() + arr[1].toLong() + arr[2].toLong() + arr[3].toLong()
    val sum = arrayOf(a, b, c, d, e)
    val min = sum.minOrNull()
    val max = sum.maxOrNull()

    println(" $min $max ")
}


fun main(args: Array<String>) {

    val arr = arrayOf(1, 2, 3, 4, 5)

    miniMaxSum(arr)
}
