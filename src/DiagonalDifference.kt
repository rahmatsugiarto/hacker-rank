import kotlin.math.absoluteValue

/*
 * Complete the 'diagonalDifference' function below.
 *
 * The function is expected to return an INTEGER.
 * The function accepts 2D_INTEGER_ARRAY arr as parameter.
 */

fun diagonalDifference(arr: Array<Array<Int>>): Int {
    var a = 0
    var b = 0
    for (i in arr.indices) {
        if (arr[i].size == arr.size) {
            a += arr[i][i]
        }
    }
    arr.reverse()
    for (i in arr.indices) {
        if (arr[i].size == arr.size) {
            b += arr[i][i]
        }
    }
    println(arr.size)
    return (a - b).absoluteValue
}

fun main(args: Array<String>) {
    val n = readLine()!!.trim().toInt()

    val arr = Array<Array<Int>>(n) { Array<Int>(n) { 0 } }

    for (i in 0 until n) {
        arr[i] = readLine()!!.trimEnd().split(" ").map { it.toInt() }.toTypedArray()
    }

    val result = diagonalDifference(arr)

    println(result)
}

/**
Input
3
11 2 4
4 5 6
10 8 -12

output
4 - 19 = 15

link: https://www.hackerrank.com/challenges/diagonal-difference/problem?isFullScreen=false
 */