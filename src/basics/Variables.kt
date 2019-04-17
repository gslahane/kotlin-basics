package basics

fun main(args: Array<String>) {

    // Mutable variables
    var greetings = "Hello"
    var streetName = "RS Road"

    println(greetings)
    println(streetName)

    // Immutable variables
    val chars = listOf('a', 'b', 'c', 'd', 'e')
    for (char in chars) {
        println(char)
    }
}