package listandranges

fun main(args: Array<String>) {

    val numbers = 1..101
    for (number in numbers step 50) {
        println(number)
    }

    val alphabets = 'A'..'Z'
    for (char in alphabets){
        print(char)
    }

}