/*
 * Complete the 'compareTriplets' function below.
 *
 * The function is expected to return an INTEGER_ARRAY.
 * The function accepts following parameters:
 *  1. INTEGER_ARRAY a
 *  2. INTEGER_ARRAY b
 */

fun compareTriplets(a: Array<Int>, b: Array<Int>): Array<Int> {
    var result = arrayOf<Int>()
    var alice = 0
    var bob = 0

    for (i in a.indices) {
        if (a[i] > b[i]) {
            alice++
        } else if (a[i] < b[i]) {
            bob++
        }
    }

    result += alice
    result += bob

    return result

}


fun main(args: Array<String>) {

    val a = readLine()!!.trimEnd().split(" ").map { it.toInt() }.toTypedArray()

    val b = readLine()!!.trimEnd().split(" ").map { it.toInt() }.toTypedArray()

    val result = compareTriplets(a, b)

    println(result.joinToString(" "))
}

/**
Input
17 28 30
99 16 8

output
2 1

link: https://www.hackerrank.com/challenges/compare-the-triplets/problem?isFullScreen=true
 */