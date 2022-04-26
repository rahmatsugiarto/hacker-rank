fun printBinarySquare(number: Int) {
    for (x in 1..number) {
        if (x % 2 == 0) {
            for (y in 1..number) {
                if (y % 2 == 0) {
                    print(0)
                } else {
                    print(1)
                }
            }
        } else {
            for (z in 1..number) {
                if (z % 2 == 0) {
                    print(1)
                } else {
                    print(0)
                }
            }
        }
        println()
    }
}

fun main() {
    printBinarySquare(2)
}

/**
 *

> print_binary_square(2)
01
10

> print_binary_square(5)
01010
10101
01010
10101
01010

 */