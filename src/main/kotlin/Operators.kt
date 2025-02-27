fun main() {

    val dataOne: Int = 10
    val dataTwo: Int = 4

    // Arithmetic Operator + , _ , / , % , *  --> binary operators
    println(dataOne + dataTwo)
    println(dataOne / dataTwo)
    println(dataTwo - dataOne)
    println(dataOne * dataTwo)
    println(dataOne % dataTwo)


    // Relational Operator
    println(dataOne > dataTwo)
    println(dataOne < dataTwo)
    println(dataTwo >= dataOne)
    println(dataOne <= dataTwo)
    println(dataOne != dataTwo)
    println(dataOne == dataTwo)

    // Assignment Operator(+=,-=,*=,/=,%=)
    var numberOne = 2
    numberOne = numberOne + 1
    numberOne += 1

    println(numberOne)

    // Unary operators (perform operations on single operands)
    var numberTwo = 10
    numberTwo++
    println(numberTwo)

    val flagdataone = true
    println(!flagdataone)

    // Logical operators(&& , || , !)
    val age: Int = 23
    if (age > 24 || !(age == 23)) {
        println("Perfect")
    } else {
        println("no perfect")
    }
    println("Thanx to use")

}