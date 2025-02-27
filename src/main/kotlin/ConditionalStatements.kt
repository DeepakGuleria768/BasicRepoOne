fun main() {
    val price: Float = 2000f

    if (price < 1000) {  // true
        println("i will buy this")
    } else {
        println("i will not buy this")
    }


    val data = 101
    val AuthResult = if (data == 101) {
        "You are authenticated User"
    } else {
        "Some thing went wrong !"
    }

    println(AuthResult)


    // if else if
    var result_one = if (data == 101) {
        "good"
    } else if (data == 102) {
        "You are not good"
    } else {
        "error"
    }
    println(result_one)


    // When Expression
    val condition:Int = 4
    when(condition){
        1 -> println("this is number one")
        2 -> println("this is number two")
        3 -> println("this is number Three")
        4 -> println("this is number four")
        else->println("Please enter integer value as Condition")
    }
    // this can also be stored inside a variable
    val whenResult =  when(condition){
        1 -> "this is number one"
        2 -> "this is number two"
        3 -> "this is number Three"
        4 -> "this is number four"
        else->"Please enter integer value as Condition"
    }
    println("the result of when is $whenResult")


    // 2nd case of When expression
 val whenResultOne =   when(condition){
        1,2,3 -> "this is number one"
            4 -> "this is number four"
    //    5..9 -> "" you can also give range

        else->"Please enter integer value as Condition"
    }

    println(whenResultOne)
}