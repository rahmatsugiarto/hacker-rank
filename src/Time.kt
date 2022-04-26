fun formatDuration(duration: Int): String {
    var result = ""
    if (duration <= 359999) {
        val hours = duration / 3600
        val minutes = duration % 3600 / 60
        val seconds = duration % 60
        result = String.format("%02d:%02d:%02d", hours, minutes, seconds)
    } else {
        println("Max input 359999")
    }
    return result
}



fun main() {
    val time = formatDuration(3601)
    println(time)
    val a = 2 + 3 * 1
  println(a)
}