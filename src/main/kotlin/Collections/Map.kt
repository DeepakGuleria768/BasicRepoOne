package Collections

/*
* A collection that holds pairs of objects (keys and values) and supports efficiently retrieving the value corresponding to each key.
* Map keys are unique; the map holds only one value for each key. Methods in this interface support only read-only access to the map; read-write access
* is supported through the MutableMap interface.
Params:
K - the type of map keys. The map is invariant in its key type, as it can accept key as a parameter (of containsKey for example) and return it in keys set.
V - the type of map values. The map is covariant in its value type.
* */

fun main() {


    val StudentDetail: Map<Int, String> =
        mapOf<Int, String>(1 to "Deepak", 2 to "Karan", 3 to "Anamika", 4 to "Suresh", 5 to "Tarun", 6 to "Daman")

    //1. size
    println("we have total ${StudentDetail.size} Students")
    //2. isEmpty()
    println(StudentDetail.isEmpty()) // false

    //3. check that key or value exist or not
    println(StudentDetail.containsKey(2))  // true
    println(StudentDetail.containsValue("Karan")) // true

    // get(key) -> return the value to the corresponding key
    println(StudentDetail.get(2))

    //getOrDefault()
    //Returns the value corresponding to the given key, or defaultValue if such a key is not present in the map
    println(StudentDetail.getOrDefault(10, "No such key exist")) // no such key exist


    // Iterator()
    //Entry -> Represents a key/ value pair held by a Map.
    val myIteratorthree: Iterator<Map.Entry<Int, String>> = StudentDetail.iterator()
    while (myIteratorthree.hasNext()) {
        println(myIteratorthree.next())
    }

    //--------------------------------------------------------------------------------------------------------------------------------------------------------

    println()
    /*MUTABLE MAP*/

    val MutableMapExample: MutableMap<Int, String> = mutableMapOf<Int, String>()

    MutableMapExample.put(1, "Deepak") // take key with corresponding value
    MutableMapExample.put(2, "Karan")
    MutableMapExample.put(3, "Depak")
    MutableMapExample.put(4, "Kaan")
    MutableMapExample.put(5, "Dpak")
    MutableMapExample.put(6, "Kara")

    for (i in MutableMapExample) {
        println(i)
    }

    // remove take key to remove the entry from the map
    MutableMapExample.remove(6) // data with key 6 is removed

    for (i in MutableMapExample) {
        println(i)
    }

    // remove the key if it only mapped with the specific value
    MutableMapExample.remove(5, "Dpak")

    for (i in MutableMapExample) {
        println(i)
    }

    // clear() remove all elements from this map
    MutableMapExample.clear()

    for (i in MutableMapExample) {
        println(i)
    }
}