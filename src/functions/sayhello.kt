package functions

fun sayHello(name: String): String {

    val message = "Hello, $name"

    return message
}

fun main(args: Array<String>) {

    println(sayHello("xyz"))

}