data class  Store(val items : Int)

//defining a type alias
typealias ClickListener = (Store) -> Unit

//using the type alias
fun test(listener: ClickListener){

}


class TypeAliasTest{
    //another usage of type alias
    fun anotherTest(anotherListener: ClickListener){

    }
}
