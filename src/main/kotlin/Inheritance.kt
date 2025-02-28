// parent class
open class EmployeeOne(val name: String, val id: Int) {
    fun work() {
        println("$name is working")
    }
}

// child class inherits the Employee
class Programmer(name: String, id: Int, val language: String) : EmployeeOne(name, id) {
    fun code() {
        println("$name coding in $language")
    }
}

// Single level inheritance
open class Animal() {
    fun eat() {
        println("Eating food")
    }
}

open class Dog() : Animal() {
    fun bark() {
        println("Barking")
    }
}

// multilevel Inheritance

class Puppy() : Dog() {
    fun weep() {
        println("Weeping")
    }
}

// hierarchical inheritance
class cat() : Animal() {
    fun mew() {
        println("mewwww....")
    }
}

class Cow() : Animal() {
    fun moo() {
        println("moooooo...")
    }
}

// main function
fun main() {
    val programmer = Programmer("Deepak", 101, "kotlin")
    programmer.work()
    programmer.code()

    // single level inheritance
    val dog = Dog()
    dog.bark()
    dog.eat()
    // multilevel inheritance
    val puppy_One = Puppy()
    puppy_One.eat()
    puppy_One.bark()
    puppy_One.weep()
    // hierarchical inheritance
    val cow = Cow()
    cow.eat()
    cow.moo()
    val cat = cat()
    cat.eat()
    cat.mew()

}