/*
 * Complete the 'aVeryBigSum' function below.
 *
 * The function is expected to return a LONG_INTEGER.
 * The function accepts LONG_INTEGER_ARRAY ar as parameter.
 */

fun aVeryBigSum(ar: Array<Long>): Long {
    var result = 0L
    for (i in ar){
        result += i
        println(i)
    }
    return result
}

fun main(args: Array<String>) {
    val arCount = readLine()!!.trim().toInt()

    val ar = readLine()!!.trimEnd().split(" ").map { it.toLong() }.toTypedArray()

    val result = aVeryBigSum(ar)

    println(result)
}


/**
Input
5
1000000001 1000000002 1000000003 1000000004 1000000005

output
5000000015

link: https://www.hackerrank.com/challenges/a-very-big-sum/problem?isFullScreen=true
 */