import kotlin.properties.Delegates

class Employee2 {
    var salary: Float by Delegates.vetoable(70000.0F) {
            prop, old, new ->
        logSalary(new)
        new >= 70000
    }

    private fun logSalary(newSalary: Float) {
        println("New Salary entered: $newSalary")
    }
}

fun main(){
    val employee = Employee2()
    println(employee.salary)
    employee.salary = 0F
    println(employee.salary)
    employee.salary = 100000F
    println(employee.salary)
}