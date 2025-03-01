package Collections

fun main() {


    /*factory methods                Interfaces                actual implementations
    ------------------          ----------------               -------------------------
* listOf(1, 2, 3)	              List<Int>	                ArrayList<Int>
mutableListOf(1, 2, 3)	         MutableList<Int>	        ArrayList<Int>
mapOf("A" to 1, "B" to 2)	     Map<String, Int>	        LinkedHashMap<String, Int>
mutableMapOf("X" to 10)	        MutableMap<String, Int>	    LinkedHashMap<String, Int>
setOf(1, 2, 3)	                Set<Int>	                LinkedHashSet<Int>
mutableSetOf(1, 2, 3)	        MutableSet<Int>	             LinkedHashSet<Int>*/


    // listOf() --> is a factory method (helper method)
    // return the instance of the List<T>
    // interface List<out T>:Collection<E>()
    val Teachers: List<String> = listOf("Tarun", "Ruhi", "Madhana", "Aushmita", "Urvashi", "Ruhi", "Ruhi")
    val Students = listOf("Deepak", "Ankita", "Karan", "Shubam", "sanjay")
    // return me the size of the list starting from 1 to n
    println(Students.size)
    // check weather the list is empty or not
    println(Students.isEmpty())
    // tell a specific element present in the collection or not
    println(Students.contains("Karan"))
    // check that one collection is being present in second or not
    println(Students.containsAll(Teachers))


    // Positional access functions
    // start from 0 to n get(index) function
    println(Teachers.get(1))

    // Search Operation
    // it will return me the index of the specific object in list if not exist return me -1
    println("The index is ${Teachers.indexOf("Ruhi")}")

    // lastIndexOf(object) return the last accurence of the object in the list if not exist then it return the -1
    println("The last accurence of the given element is ${Teachers.lastIndexOf("Ruhi")}")

    // subList(from , end) get the sub list form specific starting to end point of the list
    println(Teachers.subList(2, 7))

    // iterator() return me the object of the Iterator<> interface that allows the traverse through the element of list one by one
    // create the iterator object for the teachers know this iterator help you to iterate element one at a time
    // has next to check element existance or next() to retrive next element
    val myIterator = Teachers.iterator()

    while (myIterator.hasNext()) {
        println(myIterator.next())
    }

    //--------------------------------------------------------------------------------------------------------------------------------------------------------------------//

    /*MUTABLE LIST*/

    val numbersOne = mutableListOf<Int>(1, 2, 3, 4, 5)
    val numbers: MutableList<Int> = mutableListOf<Int>()

    // numebers.add(element:E) --> add elements in the list
    numbers.add(1)
    numbers.add(2)
    numbers.add(3)
    numbers.add(4)

//    // add collection of object
//    numbers.addAll(numbersOne)
//    println(numbers)


    // clear()--> used to clear a whole collection
    //   numbers.clear()

    // add at specific index --> index and value insert new value at the specific index
//    numbers.add(1, 9)
//
//    // take element that you want to remove
//    numbers.remove(3)
//    // remove all the element in the specific collection
//    numbers.removeAll(numbers)
//    // remove at the specific possition
//    numbers.removeAt(1)

    val listThree: MutableList<String> = mutableListOf("Deepak", "Karan", "Ankush")
    val result = listThree.set(2, "Ankush")
    println(result)


    // mutable list iterator
    val numbersTwo = mutableListOf(1, 2, 3, 4, 5) // Define mutable list
    val myMutableIterator: MutableIterator<Int> = numbersTwo.iterator()
    while (myMutableIterator.hasNext()) {
        // next method is inside the Iterator method
        val num = myMutableIterator.next()
        if (num % 2 == 0) {
            // remove() method is present in the MutableIterator interface
            myMutableIterator.remove() // remove even number saftly
        }
    }
    println(numbersTwo)

    //0ArrayList<>--> use arrayListOf() function and contain asll method of collection and list
}