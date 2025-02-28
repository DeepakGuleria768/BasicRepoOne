package KotlinCorePracticeProblem

import java.util.Scanner

fun checkEvenOrOdd(number:Int):Boolean{
  val result =  if(number%2==0){
        true
    }else{
        false
    }
    return result
}

fun main() {
    var read: Scanner = Scanner(System.`in`)
    println("Enter the number :")
    val number = read.nextInt()
   val result = checkEvenOrOdd(number)
    if(result){
        println("Number is Even")
    }else{
        println("Number is Odd")
    }
}