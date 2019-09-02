import kotlin.properties.Delegates

class Employee {
    var salary: Float by Delegates.observable(0.0F) {
            prop, old, new ->
        logSalary(new)
    }

    private fun logSalary(newSalary: Float) {
        println("New Salary entered: $newSalary")
    }

}

fun main(){
    val employee = Employee()
    employee.salary = 100000F
    println(employee.salary)
}