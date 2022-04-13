fun main() {
    solution(5)
}

fun solution(input: Int) {
    for (i in 0 until input) {
        for (j in 0..i) {
            print(" ")
        }
        for (k in 0 until input) {
            print("*")
        }
        println()
    }
}

