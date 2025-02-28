open class Employee(string: String, ID1: Int) {
    // properties of the class
    val name: String? = null
    val age: Int? = null
    val ID: Int? = null

    // behavior of the class
    fun doWork(){
     val myObjectOne = Employee("Deepak", 101) // reference variable go out of the scope
    } // --> out of this it is unreachable
}

fun main() {
//    var Deepak = Employee()
//    val toStringMethodResult = Deepak.age
//    println(toStringMethodResult

}