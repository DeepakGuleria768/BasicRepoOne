interface father{
    fun drink()
}

interface mother{
    fun drink()
}

class child : father,mother{
    override fun drink() { // must override to remove the conflict
        println("I drink water ")
    }

}

fun main() {
    val ch = child()
    ch.drink()
}