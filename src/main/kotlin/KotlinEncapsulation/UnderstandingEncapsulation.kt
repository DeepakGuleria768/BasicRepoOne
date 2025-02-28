package KotlinEncapsulation

// We have 4 visibility modifier to achieve the encapsulation in kotlin

// public , private , internal , protected

// private data -> access with in same class or file
 class ClassOne{
    private val age = 34
    fun getAge(){
        println("My age is $age") // accessible inside the class
    }
}

// protected -> accessible with in the class or subclass
open class ClassTwo {
    protected var age: String = "This is protected data"
}
    class ClassThree : ClassTwo() {
        fun getMessage() {
            println(age)
        }
    }

    fun main() {
        val classone = ClassOne()
        //  println("My age is ${classone.age}") // can't able to access it outside the class
        classone.getAge()


        // protected
        val classthree = ClassThree()
        // classthree.age // not accessible only inside the class or in subclass
        classthree.getMessage()
    }
