import java.util.Scanner

fun main() {
    var read: Scanner = Scanner(System.`in`)
    println("Enter First Name :")
    var firstName: String = read.nextLine()
    println("Enter Second Name :")
    var secondName: String = read.nextLine()

    println("Your name is ${firstName + secondName}")

    println("Enter First Number :")
    val numberOne = read.nextInt()
    println("Enter Second Number :")
    val numberTwo = read.nextInt()
    val sum = numberOne + numberTwo
    println("The sum of two number is $sum")

}
