class Demo{
    val name : String by lazy {
        println("Init")
        "KotlinEveryWhereNairobi"
    }

}
fun  main(){
    val d = Demo()
    println(d.name)
    println(d.name)
}
