open class FatherOne{
    // Function you want to override should also be open
    open fun drink(){
        println("OldMonk")
    }
}

class Son : FatherOne(){
    override fun drink() {
       println("Apple Juice")
    }
}

fun main() {
    val son = Son()
    son.drink()
}
// Rule
// 1. parent class should be open and the property that you want to override should also be open
// 2. fun name in parent and derrived class should be same
// 3. parameter should be same
