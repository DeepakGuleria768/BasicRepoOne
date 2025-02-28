// used to add new function in the existing class without actually updating that class code

// fun class_name. your own fun name (){

//}

fun String.MyStringFunction(): String {
    return "hello peoples"
}

val data: String = "hello"

// here you are adding your own function without actually change the class String code
val result = data.MyStringFunction()
fun main() {
    println(result)
}