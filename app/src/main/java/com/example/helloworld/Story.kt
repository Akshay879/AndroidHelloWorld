package com.example.helloworld

object Story {
    @JvmStatic
    fun main(args: Array<String>) {
        val employee1: Contractor = Contractor("John", 123, "Contractor")
        val employee2: Intern = Intern("Smith", 456, "Intern")
        val employee3: FullTime = FullTime("Rogers", 789, "FullTime")
        println(employee1)
        println(employee2)
        println(employee3)
    }
}

internal open class Employee(var employeeName: String, var employeeID: Int, var employeeType: String) {
    override fun toString(): String {
        return "Employee Name: $employeeName\nEmployee ID: $employeeID\nEmployee Type: $employeeType"
    }
}

internal class Contractor(employeeName: String, employeeID: Int, employeeType: String) :
    Employee(employeeName, employeeID, employeeType) {
    var salary = "$100,000"
    override fun toString(): String {
        return """
            ${super.toString()}
            Salary:$salary
            """.trimIndent()
    }
}

internal class Intern(employeeName: String, employeeID: Int, employeeType: String) :
    Employee(employeeName, employeeID, employeeType) {
    var salary = "$50,000"
    override fun toString(): String {
        return """
            ${super.toString()}
            Salary:$salary
            """.trimIndent()
    }
}

internal class FullTime(employeeName: String, employeeID: Int, employeeType: String) :
    Employee(employeeName, employeeID, employeeType) {
    var salary = "$75,000"
    override fun toString(): String {
        return """
            ${super.toString()}
            Salary:$salary
            """.trimIndent()
    }
}


