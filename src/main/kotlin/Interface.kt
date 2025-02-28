interface Rules{


    fun drink() // by default, abstract functions are open functions both the same
    fun eat()
    fun sleep()
    fun code()
    fun repeat()

    // default function
    fun makeSound(){
        println("wooooooooo....")
    }
}

class A : Rules{


    override fun drink() {
        println("drink OldMonk")
    }

    override fun eat() {
       println("Meat")
    }

    override fun sleep() {
        println("Snoaring")
    }

    override fun code() {
       println("Every day")
    }

    override fun repeat() {
       println("loop")
    }
}

fun main() {
    val a = A()
    a.makeSound() // I can use this method also default
    a.sleep()
    a.code()
    a.repeat()
}

