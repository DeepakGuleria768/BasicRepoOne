package KotlinCorePracticeProblem

fun reverseNumber( number:Int):Int{
    var n = number
    var reversed = 0

    while(n>0){
        val digit = n%10
        reversed = reversed*10+digit
        n = n/10
    }
     return reversed
}

fun main() {
    println(reverseNumber(12345))
}