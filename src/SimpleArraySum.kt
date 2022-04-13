/*
* Complete the 'simpleArraySum' function below.
*
* The function is expected to return an INTEGER.
* The function accepts INTEGER_ARRAY ar as parameter.
*/

fun simpleArraySum(ar: Array<Int>): Int {
    var sum = 0
    for (i in ar){
        sum += i
    }
    return sum
}

fun main(args: Array<String>) {
    val arCount = readLine()!!.trim().toInt()

    val ar = readLine()!!.trimEnd().split(" ").map { it.toInt() }.toTypedArray()

    val result = simpleArraySum(ar)

    println(result)
}
/**
Input
6
1 2 3 4 10 11

output
31
 */