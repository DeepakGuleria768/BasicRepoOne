package Collections

import java.awt.Image

fun main() {
    // In set duplication of data is not allowed
    // if you put bychance it remove automaticaly at run time one of that
    val myFirstSet: Set<Int> = setOf<Int>(1,23,4,5,5)
    println(myFirstSet)

//1. size
    println(myFirstSet.size)
    //2. isEmpty()
    println(myFirstSet.isEmpty())
    //3. contains(element)
    println(myFirstSet.contains(23))
    //4. Iterator()

    val mySecondIterator : Iterator<Int> = myFirstSet.iterator()
    while(mySecondIterator.hasNext()){
        println(mySecondIterator.next())
    }

    //---------------------------------------------------------------

    /*Set collection*/

    /* // Query Operations
    override fun iterator(): MutableIterator<E>

    // Modification Operations

    /**
     * Adds the specified element to the set.
     *
     * @return `true` if the element has been added, `false` if the element is already contained in the set.
     */
    override fun add(element: E): Boolean

    override fun remove(element: E): Boolean

    // Bulk Modification Operations

    override fun addAll(elements: Collection<E>): Boolean
    override fun removeAll(elements: Collection<E>): Boolean
    override fun retainAll(elements: Collection<E>): Boolean
    override fun clear(): Unit*/

}