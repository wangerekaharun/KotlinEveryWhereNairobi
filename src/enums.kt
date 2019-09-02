//enum class declaration
enum class Months(val month :String){
    January("Jan"),
    February("Feb"),
    March("March")
}


fun main(){
    //accessing values of enums
    val month = Months.January.month
}