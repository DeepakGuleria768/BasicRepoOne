interface AnimalOne{
    fun sound()
}

class DogOne():AnimalOne{
    override fun sound() {
        println("woof woof ..")
    }

}

fun main() {
    // method one
   val dog  =  DogOne()
    dog.sound()
    // method two
    // by factory or helper method to return and object

    //Instead of directly creating an object of Dog,
    // we create a helper method that returns an object of Animal (but actually gives us Dog).
    fun getAnimal():AnimalOne{
        return DogOne()
    }

    val myAnimalSound:AnimalOne = getAnimal() // getting object with help of helper method

}


//val myList: List<Int> = listOf(1, 2, 3, 4, 5)
//Here:
//
//List is an interface (it only defines the behavior of lists but doesn't implement them).
//listOf() is a helper method (factory method) that returns an object of a class that implements List.

//Internally, listOf() gives you an ArrayList (or some other concrete implementation) that behaves like a List.
//You only know listOf() returns List, but internally it could be an ArrayList