import java.util.*


data class Note(
    var id: String?,
    var title: String?,
    var desc: String?,
    var date: String?
)
//make sort dates in Descending order yyyy-MM-dd HH:mm:ss with parameter mutableList returned list
fun sortDates(notes: MutableList<Note>): MutableList<Note> {
    notes.sortByDescending { it.date }
    return notes
}
//fun sortDates(dates: MutableList<Note>): List<Note>{
//    Collections.sort(dates, object : Comparator<Note> {
//        override fun compare(o1: Note, o2: Note): Int {
//            return o1.date!!.compareTo(o2.date!!)
//        }
//    })
//    return dates
//}



