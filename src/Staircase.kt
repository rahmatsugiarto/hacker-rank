/*
 * Complete the 'staircase' function below.
 *
 * The function accepts INTEGER n as parameter.
 */

fun staircase(n: Int): Unit {
    for (x in 1..n) {
        for (y in 1..n) {
            if (x < y){
                print(" ")
            }else{
                print("*")
            }
        }
        println()
    }
}


fun main(args: Array<String>) {
    val n = readLine()!!.trim().toInt()
    staircase(n)
}

/**
Input
6

output
#
##
###
####
#####
######

link: https://www.hackerrank.com/challenges/staircase/problem?isFullScreen=true
 */