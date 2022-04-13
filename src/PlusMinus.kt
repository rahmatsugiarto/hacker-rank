/*
 * Complete the 'plusMinus' function below.
 *
 * The function accepts INTEGER_ARRAY arr as parameter.
 */

fun plusMinus(n: Int, arr: Array<Int>): Unit {
    var plus = 0f
    var minus = 0f
    var zero = 0f
    for (i in arr.indices) {
        if (arr[i] > 0.0) {
            plus++
        } else if (arr[i] < 0.0) {
            minus++
        } else if (arr[i] == 0) {
            zero++
        }
    }

    println(plus / n)
    println(minus / n)
    println(zero / n)

}

fun main(args: Array<String>) {
    val n = readLine()!!.trim().toInt()

    val arr = readLine()!!.trimEnd().split(" ").map { it.toInt() }.toTypedArray()

    plusMinus(n, arr)
}

/**
Input

STDIN           Function
-----           --------
6               arr[] size n = 6
-4 3 -9 0 4 1   arr = [-4, 3, -9, 0, 4, 1]

output
0.500000
0.333333
0.166667

link: https://www.hackerrank.com/challenges/plus-minus/problem?isFullScreen=true
 */