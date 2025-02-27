// The function that accepts the other functions as its parameter and fun who are its parameter is called
// callback functions

fun myFun(
    organization: String,
    portal: String,
    secondFunction: (String, String) -> String
): Unit {
    val result = secondFunction(organization, portal)
    println("The result is $result")
}

fun mySelf(
    name: (String) -> String,
    age: Int,
    Id: Int
): Unit {
    val result = name("Deepak Guleria")
    println(result)
}


// Lets Understand Higher order Function in depth program

fun calculate(a: Int, b: Int, operation: (Int, Int) -> Int): Int {
    return operation(a, b)
}

fun main() {
    // here it is lambda expression
    val secondFunction: (String, String) -> String = { org, portal -> "$org develop this $portal" }
    myFun("sit.org", "dguleria@gmail.com", secondFunction)
    val myName: (String) -> String = { name: String -> "My name is $name" }
    mySelf(age = 23, Id = 101, name = myName)



    // fo Subtraction
    val sub: (Int, Int) -> Int = { a: Int, b: Int -> a - b }
    // fo Multiplication
    val multiplication: (Int, Int) -> Int = { a: Int, b: Int -> a * b }
    // fo Division
    val division: (Int, Int) -> Int = { a: Int, b: Int -> a / b }
    // fo Modulus
    val modulus: (Int, Int) -> Int = { a: Int, b: Int -> a % b }

    val sum_result = calculate(1, 1){a:Int,b:Int -> a+b} // because it is trailing lambda
    val sub_result = calculate(1, 1, sub)
    val multiplicationResult = calculate(1, 1, multiplication)
    val divisionResult = calculate(1, 1, division)
    val modulusResult = calculate(1, 1, modulus)


    println("$sum_result   $sub_result  $multiplicationResult   $divisionResult   $modulusResult")
}