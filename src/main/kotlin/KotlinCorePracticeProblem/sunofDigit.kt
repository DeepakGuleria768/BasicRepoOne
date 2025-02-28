package KotlinCorePracticeProblem

fun sumOfDigit(number:Int):Int{
    var number = number
    var sum = 0

    while(number!=0){
        var digit = number%10
        sum +=digit
        number/=10
    }
    return sum
}

fun main() {
    val result = sumOfDigit(1234)
    println(result)
}