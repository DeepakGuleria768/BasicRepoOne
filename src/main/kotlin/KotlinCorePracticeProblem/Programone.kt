package KotlinCorePracticeProblem

import java.util.Scanner

fun calculator(num1: Int, num2: Int, operation: Char?) {
    when (operation) {
        '+' -> println("sum of two number is ${num1 + num2}")
        '-' -> println("sub of two number is ${num1 - num2}")
        '/' -> println("sum of two number is ${num1 / num2}")
        '%' -> println("sub of two number is ${num1 % num2}")
        else -> println("Please select the appropriate sign")
    }
}
fun main() {
    var read: Scanner = Scanner(System.`in`)
    println("Enter number One:")
    val numberOne = read.nextInt()
    println("Enter number Two:")
    val numberTwo = read.nextInt()
    println("Enter your choice")
    println("+ - / %  please enter any one operation that you want to perform")
    var choice: Char? = readLine()?.get(0)
    calculator(numberOne, numberTwo, choice)
}