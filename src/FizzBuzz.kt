fun fizzBuzz(x: Int) {
    for (i in 1..x) {
        var isfizzBuzz = false
        if (i % 3 == 0) {
            print("Fizz")
            isfizzBuzz = true
        }
        if (i % 5 == 0) {
            print("Buzz")
            isfizzBuzz = true
        }
        if (!isfizzBuzz) {
            print(i)
        }
        println()
    }
}

fun main() {
    val x = readLine()!!.trim().toInt()
    fizzBuzz(x)
}
/**
 * input
 * 15
 *
 * output
 * 1
 * 2
 * Fizz
 * 4
 * Buzz
 * Fizz
 * 7
 * 8
 * Fizz
 * Buzz
 * 11
 * Fizz
 * 13
 * 14
 * FizzBuzz
 *
 * */