
data class Person(val name : String,var age : Int= 0,var city : String = "")

fun main(){
    // also
    val numbers = mutableListOf("one", "two", "three")
    numbers
        .also { println("The list elements before adding new one: $it") }
        .add("four")

    //apply
    val adam = Person("Adam").apply {
        age = 32
        city = "London"
    }

    //run
    val hello = "Hello"
    // this
    hello.run {
        println("The receiver string length: $length")
        //println("The receiver string length: ${this.length}") // does the same
    }

    //with
    val numbersList = mutableListOf("one", "two", "three")
    val firstAndLast = with(numbersList) {
        "The first element is ${first()}," +
                " the last element is ${last()}"
    }
    println(firstAndLast)

    //let
    val str: String? = "Hello"
    //processNonNullString(str)       // compilation error: str can be null
    val length = str?.let {
        println("let() called on $it")
        processNonNullString(it)      // OK: 'it' is not null inside '?.let { }'
        it.length
    }
}

fun processNonNullString(str: String) {}