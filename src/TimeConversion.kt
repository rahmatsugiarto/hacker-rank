/*
 * Complete the 'timeConversion' function below.
 *
 * The function is expected to return a STRING.
 * The function accepts STRING s as parameter.
 */

fun timeConversion(s: String): String {
    // Write your code here
    val time = s.substring(0, 8)
    val ampm = s.substring(8, 10)
    var hour = time.substring(0, 2).toInt()
    val minute = time.substring(3, 5).toInt()
    val second = time.substring(6, 8).toInt()

    if (ampm == "AM") {
        if (hour == 12) {
            hour = 0
        }
    } else {
        if (hour != 12) {
            hour += 12
        }
    }
    return String.format("%02d:%02d:%02d", hour, minute, second)
}


fun main(args: Array<String>) {
    val s = readLine()!!

    val result = timeConversion(s)

    println(result)
}

/**
 * Input
 * 07:05:45PM
 *
 * output
 * 19:05:45
 * */