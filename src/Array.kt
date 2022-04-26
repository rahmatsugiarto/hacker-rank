fun main() {
    val array = arrayOf(10, 33, 13, 72, 44, 51, 17)
    for (i in array.indices) {
        if(array[i] == 17){
            break
        }
        else if (i % 2 == 0) {
            array[i] = array[i] + array[i + 1]
        } else {
            array[i] = array[i] - array[i + 1]
        }
    }
    println(array.copyOfRange(0, array.size - 1).joinToString(separator = ","))
}
//input 10, 33, 13, 72, 44, 51, 17 output 43, 20, 85, 28, 95, 34
//
//43, 20, 85, 28, 95, 34