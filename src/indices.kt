fun main(args : Array<String>){

    val myArray = arrayOf("Steve", "Robin", "Kate", "Lucy")
    for (n in myArray.indices){
        println("myArray[$n]: ${myArray[n]}")
    }

    for (n in myArray){
        println("myArray[$n]: $myArray")
    }
}