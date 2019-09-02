sealed class Result{
    data class Success(val data : Any) : Result()
    data class Error(val exception : String) : Result()
}

fun getResult(result: Result){
    when(result){
        is Result.Success -> println("This is success")
        is Result.Error ->  println("This is success")
    }
}

open class Mammal(val name: String)
class Cat(val catName: String) : Mammal(catName)
class Human(val humanName: String, val job: String) : Mammal(humanName)

fun greetMammal(mammal: Mammal): String {
    when (mammal) {
        is Human -> return "Hello ${mammal.name}; You're working as a ${mammal.job}"
        is Cat -> return "Hello ${mammal.name}"
        else -> return "Hello unknown"
    }
}

sealed class Mammall(val name: String)
class Humann(val humanName: String, val job: String) : Mammall(humanName)
class Catt(val catName: String) : Mammall(catName)
class Bird(val birdName : String): Mammall(birdName)



fun greetMammal(mammal: Mammall): String {
   return when (mammal) {
        is Humann ->  "Hello ${mammal.name}; You're working as a ${mammal.job}"
        is Catt ->  "Hello ${mammal.name}"
       is Bird -> "Hello ${mammal.birdName}"

        // `else` clause not required, all the cases covered
    }
}