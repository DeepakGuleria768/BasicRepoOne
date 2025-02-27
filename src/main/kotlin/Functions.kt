import kotlin.math.ln

// Functions in Kotlin

// user defined function
fun sum(a: Int, b: Int): Int {
    return a + b
}

// recursive functions in kotlin
fun fact(number: Int): Int {
    if (number == 1 || number == 0)
        return 1

    return number * fact(number - 1)
}

// Default and Named Argument

fun default(name: String = "Deepak", age: Int = 33) {
    println("Your name is $name and your age is $age")
}

fun named(name: String, age: Int) {
    println("Your name is $name and your age is $age")
}

// Lambda functions

fun lambdaExampleOne() {
    // lambda function with no parameters
    val lambdaFunction: () -> Unit = { println("hello i am lambda function") }
    lambdaFunction()

    // lambda function with parameters
    val lambdaFunctionOne: (String) -> String =
        { "Hello my name is $it" } // it refer the sinle parameter in lambda function
    println(lambdaFunctionOne("Deepak"))

    // sum of two number using lambda
    val sumOftwoNumber: (Int, Int) -> Int = { a: Int, b: Int -> a + b }
    println(sumOftwoNumber(1, 1))


}


fun main() {
    val data: Int = 10
    val data1: Int = 1
    println(ln(data.toDouble())) // Predefined functions

    // calling the sum function in the main method
    println(sum(1, 1))
    println(fact(5))

    // default argument
    default()
    // named arguments
    named(age = 23, name = "Deepak")

    lambdaExampleOne()
}