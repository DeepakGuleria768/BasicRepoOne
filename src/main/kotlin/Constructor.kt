class ConstructorExample(firstName: String, secondName: String) {
    // primary constructor
    // compulsory to fill firstName and secondName then we use primary constructor
    val firstName = firstName
    val secondName = secondName
}

fun main() {
 val objectOne = ConstructorExample("Deepak","Guleria")
    println("Your first name is ${objectOne.firstName}")
    println("Your second name is ${objectOne.secondName}")
}