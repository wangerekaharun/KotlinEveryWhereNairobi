class User{
    private val userName :String = "userName"

    class NestedUser{

        fun name() = "John Doe"

    }
}

fun main(){
    val demo = User.NestedUser().name().toString()
    println(demo)
}

fun add(x : Int): Int{
    return 2
}