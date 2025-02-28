//1. it automatically generates the getter and setters for the all properties
//2. Auto generate toString() method if i pring the reference variable, then i get the result not the address of the object in heap
//3. Auto generated equals() and hashcode() method
//4. copy method automatically generated

data class Users(val name: String, val age: Int)
data class Person(val name:String,val salary:Float) // use this class to understand copy

fun main() {
    //1. it automatically generates the getter and setters for the all properties
    val user = Users("deepak", 23)
    println(user.name + " " + user.age)
//2. Auto generate toString() method if i pring the reference variable, then I get the result not the address of the object in heap
    println(user)

    //3. Auto generated equals() and hashcode() method
    val userOne = Users("Karan", 23)
    val userTwo = Users("Karan", 23) // case-sensitive is also
    println(userOne == userTwo) // true

    //4. copy method automatically generated
    val userThree = Users("Ankush", 24)
    val UserFour = userThree.copy(age = 25)
    println(UserFour)

    //Without data class, you need to manually override toString(), equals(), hashCode(), and write getters/setters.

    //Rules for Data class
    // atleast one primary constructor with one parameter atleast
    // Data class not be open , abstract , inner or sealed but they are by default final

    val person = Person("Deepak Guleria",40000.0f)
    val person2 = person.copy() // Deepak Guleria 40000.0
    val person3 = person.copy(name = "Karan")
    val person4 = person.copy(name = "Daman")
    println(person4)
}