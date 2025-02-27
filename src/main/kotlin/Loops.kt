fun main() {
//    println("Enter your name :")
//    val my_name = readln()
//    val data : Int = 1
//    val myRange : IntRange  = data.rangeTo(10)

//    for(name in myRange){
//        println("My name is $my_name")
//    }
//    for(i in 10..1){
//        println(i)
//    }

    for(i in 10 downTo 2){  // from 10 to 2 only
        println(i)
    }


    for( i in 1..10 step 2){ // 1 3 5---9
        println(i)
    }


    // While loop
    var condition = 1
    while(condition<=10){
        println("Deepak")
        condition++
    }
// do while loop
    var conditionOne = 2
    do {
        println("Deepak")
        conditionOne++
    }while (conditionOne<10);
}