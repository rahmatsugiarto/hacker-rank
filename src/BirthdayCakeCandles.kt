/*
 * Complete the 'birthdayCakeCandles' function below.
 *
 * The function is expected to return an INTEGER.
 * The function accepts INTEGER_ARRAY candles as parameter.
 */

fun birthdayCakeCandles(candles: Array<Int>): Int {
    val highest = candles.maxOrNull()
    return candles.count { it == highest }

    //Time limit exceeded
//    for (i in candles.indices) {
//        if (candles[i] == highest) {
//           result++
//        }
//    }

}

fun main(args: Array<String>) {
    val candlesCount = readLine()!!.trim().toInt()

    val candles = readLine()!!.trimEnd().split(" ").map { it.toInt() }.toTypedArray()

    val result = birthdayCakeCandles(candles)

    println(result)
}

/**
 * Input
 * 4
 * 3 2 1 3
 *
 * output
 * 2
 * */