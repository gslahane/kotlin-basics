package conditionals

import java.util.Scanner

fun main(args: Array<String>) {

    // Creating scanner object and accepting value
    val scannerObj =  Scanner(System.`in`)
    val number: Int = scannerObj.nextInt()

    // if as a conditional
    if (number % 2 == 0) {
        println("Even")
    } else {
        println("Odd");
    }

}