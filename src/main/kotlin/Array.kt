fun main() {
    val students:Array<String> = arrayOf("Deepak","Karan","Daman","Danish")
    for(i in 0..students.size-1){
        println(students[i])
    }
    val Numbers:Array<Int> = arrayOf(1,2,3,4,5,6,7,8,9,10)
    for(i in 0..Numbers.size-1){
        println(Numbers[i])
    }

    val newArray:Array<Int>  = Array(10){it-> (it*2) } // create array through array constructor

    val newArrayOne = intArrayOf(1,2,4)
    val newArrayTwo = floatArrayOf(1.1f,1.2f,1.3f,1.4f)
    val newArrayThree = booleanArrayOf(true,true,true,false,false,false)
    println(newArrayThree.get(3))
    newArrayThree.set(2,false)
    println(newArrayThree.get(2))

    // check that specific element is present in the array or not we are using in operator
    if(1 in newArray){
        println("yes")
    }else{
        println("no")
    }
}