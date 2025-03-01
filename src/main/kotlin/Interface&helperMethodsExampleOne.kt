import java.awt.Shape

interface shape{
    fun draw()
}

class Circle : shape{
    override fun draw() {
        println("Drawing a circle")
    }

}

class Rectangle : shape{
    override fun draw() {
      println("Drawing a Rectangle")
    }

}

// create a factory function
fun shapeOf(type:String):shape{
    return when(type){
        "Circle"->Circle()
        "Rectangle"->Rectangle()
        else-> throw IllegalArgumentException("Unknown shape")
    }
}
//We cannot create a Shape object directly (Shape() ❌).
//But we can use shapeOf("Circle"), which returns an object of a class that implements Shape.

fun main() {
    val myShape:shape = shapeOf("Circle")
    myShape.draw()
}


/*factory methods                Interfaces                actual implementations
* listOf(1, 2, 3)	              List<Int>	                ArrayList<Int>
mutableListOf(1, 2, 3)	         MutableList<Int>	        ArrayList<Int>
mapOf("A" to 1, "B" to 2)	     Map<String, Int>	        LinkedHashMap<String, Int>
mutableMapOf("X" to 10)	        MutableMap<String, Int>	    LinkedHashMap<String, Int>
setOf(1, 2, 3)	                Set<Int>	                LinkedHashSet<Int>
mutableSetOf(1, 2, 3)	        MutableSet<Int>	             LinkedHashSet<Int>*/