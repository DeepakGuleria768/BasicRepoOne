class Student {
    var name: String? = null
    var age: Int? = null
    var rollNumber: Int? = null
    var cource: String? = null
    var enrolled: Boolean? = null

    init{
        println("Hello students")
    }
    // Secondary constructor
    constructor(name: String) {
        this.name = name
    }

    constructor(name: String, age: Int) {
        this.name = name
        this.age = 23
    }

    constructor(name: String, age: Int, cource: String, enrolled: Boolean) {
        this.name = name
        this.age = age
        this.rollNumber = rollNumber
        this.enrolled = enrolled
    }

    fun Display(): Unit {
        println(
            "The name of the Student is $name and age is $age ,rollNumber is $rollNumber, cource is $cource" +
                    ",Studnet is enrolled $enrolled"
        )
    }
}

fun main() {
    val Deepak = Student("Deepak")
    Deepak.Display()
    val Karan = Student("Karan", 22)
    val Daman = Student("Daman", 23, "CSE", true)

    println(Karan.Display())
    println(Daman.Display())

}