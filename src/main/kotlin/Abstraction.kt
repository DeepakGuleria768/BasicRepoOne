abstract class Fan {
   open val x = 0 // final but not abstract
   abstract fun switchOn()
   abstract fun switchOff()
 //  it contains concrete as well as abstract methods
    fun hello(){
        println("Usha fans")
    }
}

 class User() : Fan(){
// every time called when an object is created
     init {
         hello()
     }
     override fun switchOn() {
         // here we provide the functionality
        println("Fan is On")
     }

     override fun switchOff() {
         // here we provide the functionality
         println("Fan is Off")
     }

 }

fun main() {
    val deepak = User()
    deepak.switchOff()

    val karan = User()
    karan.switchOn()
}